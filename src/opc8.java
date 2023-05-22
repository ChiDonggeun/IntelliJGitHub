import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel {
    public NorthPanel() {
        setBackground((Color.LIGHT_GRAY));
        setLayout(new FlowLayout());
        add(new JButton("Open"));
        add(new JButton("Read"));
        add(new JButton("Close"));
    }
}
class CenterPanel extends JPanel {
    public CenterPanel() {
        setLayout(null);
        JLabel la = new JLabel("Hello Java!");
        la.setBounds(100, 50, 100, 20);
        add(la);
    }
}

public class opc8 extends JFrame {
    public opc8(){
        setTitle("Open Challenge 8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new NorthPanel(), BorderLayout.NORTH);
        add(new CenterPanel(), BorderLayout.CENTER);

        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new opc8();
    }
}

