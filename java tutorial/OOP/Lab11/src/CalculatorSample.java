import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.*;
public class CalculatorSample extends JFrame implements ActionListener{
    
    private JPanel p;
    private JTextField t1;
    private JButton b7, b8, b9, bplus, b4, b5, b6, bminus, b1, b2, b3, bx, b0, bc, bequal, bdivi;
    private int i;
    private int n;
    private int t;
    private int ii;
    public CalculatorSample() {
        
        p = new JPanel();
        p.setLayout(new GridLayout(4,4));
        
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bplus = new JButton("+");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        bminus = new JButton("-");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        bx = new JButton("x");
        b0 = new JButton("0");
        bc = new JButton("c");
        bequal = new JButton("=");
        bdivi = new JButton("/");
        
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(bplus);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bminus);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bx);
        p.add(b0);
        p.add(bc);
        p.add(bequal);
        p.add(bdivi);
        
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bplus.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        bminus.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        bx.addActionListener(this);
        b0.addActionListener(this);
        bc.addActionListener(this);
        bequal.addActionListener(this);
        bdivi.addActionListener(this);
        
        this.setLayout(new BorderLayout());
        this.setTitle("My Calculator");
        t1 = new JTextField();
        this.add(t1, BorderLayout.NORTH);
        this.add(p, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }

    public static void main(String[] args) {
        new CalculatorSample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s;
        if (e.getSource() == bplus) {
            t = 0;
            i = Integer.parseInt(t1.getText());
            t1.setText("");
        } else if (e.getSource() == bminus) {
            t = 1;
            i = Integer.parseInt(t1.getText());
            t1.setText("");
        } else if (e.getSource() == bx) {
            t = 2;
            i = Integer.parseInt(t1.getText());
            t1.setText("");
        } else if (e.getSource() == bdivi){
            t = 3;
            i = Integer.parseInt(t1.getText());
            t1.setText("");
        } else if(e.getSource() == bc) {
            t1.setText("");
        } else if(e.getSource() == bequal){
            n = Integer.parseInt(t1.getText());
            if (t == 0) {
                ii = (i + n);
                s = ii + "";
                t1.setText(s);
            } else if (t == 1) {
                ii = (i - n);
                s = ii + "";
                t1.setText(s);
            } else if (t == 2) {
                ii = (i*n);
                s = ii + "";
                t1.setText(s);
            } else if (t == 3) {
                ii = (i/n);
                s = ii + "";
                t1.setText(s);
            }
        } else{
            s = ((JButton) e.getSource()).getText();
            t1.setText(t1.getText() + s);
        }
    }
}

