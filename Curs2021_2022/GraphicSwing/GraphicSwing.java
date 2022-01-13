import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Button;
import javax.swing.JFrame;

public class GraphicSwing {

    public static void main(String[] args) {
        JFrame f = new JFrame("titol");
        f.setLayout(null);
        Button b = new Button("boto");
        f.add(b);
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setBounds(50, 50, b.getPreferredSize().width, b.getPreferredSize().height);
    }

}