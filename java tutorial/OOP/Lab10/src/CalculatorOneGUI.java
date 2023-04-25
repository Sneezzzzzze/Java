import javax.swing.*;
import java.awt.*;
public class CalculatorOneGUI extends JFrame{
    private JPanel p1;
    private JButton b1, b2, b3, b4;
    public CalculatorOneGUI() {

        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        
        Font thaiFont = new Font("Tahoma", Font.BOLD, 14);
        
        b1 = new JButton("บวก");
        b2 = new JButton("ลบ");
        b3 = new JButton("คูณ");
        b4 = new JButton("หาร");
        
        b1.setFont(thaiFont);
        b2.setFont(thaiFont);
        b3.setFont(thaiFont);
        b4.setFont(thaiFont);
        
        p1.add(b1);    p1.add(b2);
        p1.add(b3);    p1.add(b4);
        
        this.setFont(thaiFont);
        this.setLayout(new GridLayout(4, 0));
        this.add(new JTextField());
        this.add(new JTextField());
        this.add(p1);
        this.add(new JTextField());
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("เครื่องคิดเลข");
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new CalculatorOneGUI();
    }
}
