import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphic extends Frame implements ActionListener {
    Button b, bb;
    TextField t = new TextField(20);

    public static void main(String[] args) {
        new Graphic();
    }

    Graphic() { // constructor
        super("finestra");
        // per definir quin constructor utilitzes pel frame
        // Frame f = new Frame("windows ");
        /* f. */this.setLayout(new FlowLayout());// f.setLayout = this.setLayout=setLayout
        // button b;
        // button bb;
        // per poder utilitzar la var b a actionPerformed cal ferla global
        b = new Button("boto");
        bb = new Button("boto2");
        this.add(b);
        /* f. */add(bb);
        add(t);
        setVisible(true);
        setSize(700, 700);
        b.addActionListener(this);
        bb.addActionListener(this);
        t.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {

            System.out.println("boto1 clicat");
        }
        if (e.getSource() == bb) {
            System.out.println("boto2 clicat");
        }
        if (e.getSource() == t) {
            System.out.println(t.getText());
        }

    }

}