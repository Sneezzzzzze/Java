import javax.swing.*;
import java.awt.*;

public class TellerGUI extends JFrame {
    private JPanel p, p1, p2, p3;
    public TellerGUI() {
        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        
        p.setLayout(new GridLayout(1,0));
        p.add(new JLabel("  Balance"));
        p.add(new JLabel("6000"));
        
        p3.setLayout(new GridLayout(1, 0));
        p3.add(new JLabel("  Amount"));
        p3.add(new JTextField());
        
        p1.setLayout(new FlowLayout());
        p1.add(new JButton("Deposite"));
        p1.add(new JButton("Withdraw"));
        p1.add(new JButton("Exit"));

        p2.setLayout(new GridLayout(2, 0));
        p2.add(p);
        p2.add(p3);
        
        

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
}
