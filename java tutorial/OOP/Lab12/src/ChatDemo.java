import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;
import javax.swing.*;

public class ChatDemo extends JFrame implements ActionListener {
    public JTextArea t;
    public JTextField u;
    public JButton submit, reset;
    public JPanel p1, p2, p3;
    
    public ChatDemo() {
        p2 = new JPanel(new BorderLayout());
        t = new JTextArea(20, 45);
        p2.add(t, BorderLayout.NORTH);
        
        u = new JTextField(45);
        p2.add(u, BorderLayout.CENTER);
        
        p3 = new JPanel(new FlowLayout());
        submit = new JButton("Submit");
        reset = new JButton("Reset");
        p3.add(submit);
        p3.add(reset);
        
        submit.addActionListener(this);
        reset.addActionListener(this);
        
        File f = new File("ChatDemo.dat");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try (FileOutputStream fout = new FileOutputStream(f);
                DataOutputStream dout = new DataOutputStream(fout)) {
                    dout.writeUTF(t.getText());
                } catch (IOException ex) {
                    System.out.println(ex.toString());
                }
            }
        });
        
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream(f);
            DataInputStream din = new DataInputStream(fin)) {
                String out = din.readUTF();
                t.setText(t.getText() + out);
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
        }
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(p2, BorderLayout.NORTH);
        this.add(p3, BorderLayout.CENTER);
        this.pack();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String line1 = dtf.format(LocalDateTime.now()) + " : " + u.getText();
            if (t.getText() == null) {
                t.setText("");
            } else {
                t.setText(t.getText() + "\n" + line1);
            }
        }
        if (e.getSource() == reset) {
            t.setText("");
        }
    }
    
    public static void main(String[] args) {
        new ChatDemo();
    }
}
