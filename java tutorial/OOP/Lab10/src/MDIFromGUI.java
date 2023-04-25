import java.awt.BorderLayout;
import javax.swing.*;
public class MDIFromGUI extends JFrame{
    private JMenuBar mb;
    private JMenu m1, m2, m3, m4;
    private JMenuItem mi2, mi3, mi4, mii1, mii2;
    private JDesktopPane desktopPane;
    private JInternalFrame ap1, ap2, ap3;
    public MDIFromGUI(){
        
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        
        m4 = new JMenu("New");
        
        mb.add(m1);     mb.add(m2);     mb.add(m3);
        
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        
        m1.add(m4);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);
        
        mii1 = new JMenuItem("Window");
        mii2 = new JMenuItem("Message");
        
        m4.add(mii1);
        m4.add(mii2);
        
        // //
        
        desktopPane = new JDesktopPane();
        
        ap1 = new JInternalFrame("Application01", true, true, true, true);
        ap2 = new JInternalFrame("Application02", true, true, true, true);
        ap3 = new JInternalFrame("Application03", true, true, true, true);
        
        ap1.getContentPane().add(new JLabel(" "));
        ap1.setSize(200, 900);
        ap1.setVisible(true);
        
        ap2.getContentPane();
        ap2.setSize(600, 200);
        ap2.setVisible(true);
        
        ap3.getContentPane();
        ap3.setSize(200, 900);
        ap3.setVisible(true);
        
        int x2 = ap1.getX() + ap1.getWidth() + 10;
        int y2 = ap1.getY();
        ap2.setLocation(x2, y2);
        
        int x3 = ap2.getX() + ap2.getWidth() + 10;
        int y3 = ap2.getY();
        ap3.setLocation(x3, y3);
        
        desktopPane.add(ap1);
        desktopPane.add(ap2);
        desktopPane.add(ap3);
        
        this.add(desktopPane, BorderLayout.CENTER);
        this.setJMenuBar(mb);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SubMenuItem Demo");
        this.pack();
        this.setVisible(true);
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> { new MDIFromGUI(); });
    }
}
