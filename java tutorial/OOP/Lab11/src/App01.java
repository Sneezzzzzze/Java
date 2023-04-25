import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class App01 implements ActionListener {
    private JFrame fr;
    private JPanel p1,p2;
    private JTextField txt1, txt2, txt3;
    private JButton btn1, btn2, btn3, btn4;
    private double d;
    public App01(){
        
        Font thaiFont = new Font("Tahoma", Font.BOLD, 14);
        
        fr = new JFrame("เครื่องคิดเลข");
        p1 = new JPanel();
        p2 = new JPanel();
        
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        
        btn1 = new JButton("บวก");
        btn2 = new JButton("ลบ");
        btn3 = new JButton("คูณ");
        btn4 = new JButton("หาร");

        // Add Listener
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        
        btn1.setFont(thaiFont);
        btn2.setFont(thaiFont);
        btn3.setFont(thaiFont);
        btn4.setFont(thaiFont);
        
        // Set Layout
        p1.setLayout(new GridLayout(4,1));
        p1.add(txt1);
        p1.add(txt2);
        p1.add(p2);
        p1.add(txt3);
        
        p2.setLayout(new FlowLayout());
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        p2.add(btn4);
        
        fr. getContentPane().add(p1);
        
        
        // Set JFrame Property
        fr.setFont(new Font("TimesRoman",Font.BOLD,60));
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
        }
    
        public static void main(String[] args) {
            new App01();
        }
        @Override
        public void actionPerformed(ActionEvent ae) {
            String s;
            if(ae.getSource() == btn1){
                d = Integer.parseInt(txt1.getText()) + Integer.parseInt(txt2.getText());
                s = (int) d + "";
                txt3.setText(s);
            } else if(ae.getSource() == btn2){
                d = Integer.parseInt(txt1.getText()) - Integer.parseInt(txt2.getText());
                s = (int) d + "";
                txt3.setText(s);
            } else if(ae.getSource() == btn3){
                d = Integer.parseInt(txt1.getText()) * Integer.parseInt(txt2.getText());
                s = (int) d + "";
                txt3.setText(s);
            } else if(ae.getSource() == btn4){
                d = Integer.parseInt(txt1.getText()) / Integer.parseInt(txt2.getText());
                s = (int) d + "";
                txt3.setText(s);
            }
    }
}