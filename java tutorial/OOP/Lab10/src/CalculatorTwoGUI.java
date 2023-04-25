import javax.swing.*;
import java.awt.*;

public class CalculatorTwoGUI extends JFrame {
    private JPanel p;
    public CalculatorTwoGUI() {
        p = new JPanel();
        p.setLayout(new GridLayout(4,4));
        p.add(new JButton("7"));
        p.add(new JButton("8"));
        p.add(new JButton("9"));
        p.add(new JButton("+"));
        p.add(new JButton("4"));
        p.add(new JButton("5"));
        p.add(new JButton("6"));
        p.add(new JButton("-"));
        p.add(new JButton("1"));
        p.add(new JButton("2"));
        p.add(new JButton("3"));
        p.add(new JButton("x"));
        p.add(new JButton("0"));
        p.add(new JButton("c"));
        p.add(new JButton("="));
        p.add(new JButton("/"));

        this.setLayout(new BorderLayout());
        this.setTitle("My Calculator");
        this.add(new JTextField(), BorderLayout.NORTH);
        this.add(p, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.pack();
    }

    public static void main(String[] args) {
        new CalculatorTwoGUI();
    }
}
