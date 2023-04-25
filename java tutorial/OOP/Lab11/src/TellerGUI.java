import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TellerGUI extends JFrame implements ActionListener{
    private JPanel p, p1, p2, p3;
    private JButton b1, b2, b3;
    private JTextField t;
    private JLabel l;
    private Account a = new Account(6000);
    private String s;
    public TellerGUI() {
        
        
        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        
        p.setLayout(new GridLayout(1,0));
        p.add(new JLabel("  Balance"));
        s = (int) (a.getBalance()) + "";
        l = new JLabel(s);
        p.add(l);
        
        p3.setLayout(new GridLayout(1, 0));
        p3.add(new JLabel("  Amount"));
        t = new JTextField();
        p3.add(t);
        
        p1.setLayout(new FlowLayout());
        b1 = new JButton("Deposite");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);

        p2.setLayout(new GridLayout(2, 0));
        p2.add(p);
        p2.add(p3);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        this.setLayout(new GridLayout(4, 0));
        this.add(p);
        this.add(p3);
        this.add(p1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Teller GUI");
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TellerGUI();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b3) {
            System.exit(0);
        } else if(e.getSource() == b1) {
            a.deposit(Double.parseDouble(t.getText()));
            s = (int) (a.getBalance()) + "";
            l.setText(s);
        } else if (e.getSource() == b2) {
            a.withdraw(Double.parseDouble(t.getText()));
            s = (int) (a.getBalance()) + "";
            l.setText(s);
            a.showAccount();
        }
    }
}
