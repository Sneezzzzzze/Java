import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class StudentView extends JFrame implements ActionListener {
    public JPanel p1, p2, p3, p4, p5, p6;
    public JTextField t1, t2, t3;
    public JButton deposite, withdraw;
    public JLabel l;
    public static Student s = new Student("", -1, 0);

    public StudentView() {
        p1 = new JPanel(new GridLayout(1, 0));
        t1 = new JTextField();
        p1.add(new JLabel("  ID:"));
        p1.add(t1);

        p2 = new JPanel(new GridLayout(1, 0));
        t2 = new JTextField();
        p2.add(new JLabel("  Name:"));
        p2.add(t2);

        p3 = new JPanel(new GridLayout(1, 0));
        p3.add(new JLabel("  Money:"));
        l = new JLabel();
        l.setText(s.getMoney() + "");
        p3.add(l);

        p4 = new JPanel(new FlowLayout());
        deposite = new JButton("Deposite");
        withdraw = new JButton("Withdraw");
        p4.add(deposite);
        p4.add(withdraw);

        p5 = new JPanel(new GridLayout(4, 0));
        p5.add(p1);
        p5.add(p2);
        p5.add(p3);
        p5.add(p4);

        deposite.addActionListener(this);
        withdraw.addActionListener(this);

        
        File f = new File("StudentM.dat");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try (FileOutputStream fout = new FileOutputStream(f);
                ObjectOutputStream obj = new ObjectOutputStream(fout)) {
                    if (t1.getText().isEmpty()) {
                        s.setID(-1);
                    }else {
                        s.setID(Integer.parseInt(t1.getText()));    
                    }
                    s.setName(t2.getText()); s.setMoney(s.getMoney());
                    obj.writeObject(s);
                } catch (IOException ex) {
                    System.out.println(ex.toString());
                }
            }
        });
        
        if (f.exists()) {
            try (FileInputStream fine = new FileInputStream(f);
            ObjectInputStream objin = new ObjectInputStream(fine)) {
                s = (Student) objin.readObject();
                if (s.getID() == -1) {
                    t1.setText("");
                } else {
                    t1.setText(s.getID() + ""); 
                }
                t2.setText(s.getName()); l.setText(s.getMoney() + "");
            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex.toString());
            }
        }
        
        this.add(p5);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == deposite) {
            s.setMoney(s.getMoney() + 100);
            l.setText(String.valueOf(s.getMoney()));
        }
        if (e.getSource() == withdraw) {
            if (s.getMoney() - 100  < 0) {
                l.setText("0");
            } else{
                s.setMoney(s.getMoney() - 100);
                l.setText(String.valueOf(s.getMoney()));
            }
        }
    }

    public static void main(String[] args) {
        new StudentView();
        System.out.println(s.getID());
    }
}

