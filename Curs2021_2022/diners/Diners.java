import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Diners extends Frame implements ActionListener, KeyListener, WindowListener{

    Button b, bb;
    TextField t1 = new TextField("", 20);
    TextField t2 = new TextField("", 20);

    public static void main(String[] args) {
        new Diners();
    }

    Diners() { // constructor
        super("finestra");
        this.setLayout(new FlowLayout());// f.setLayout = this.setLayout=setLayout
        add(t1);
        b = new Button("€->$");
        bb = new Button("€<-$");
        add(b);
        add(bb);
        add(t2);
        setVisible(true);
        setSize(700, 700);
        b.addActionListener(this);
        bb.addActionListener(this);
        t2.addKeyListener(this);
        t1.addKeyListener(this);
        addWindowListener(this);

    }
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            double t = Double.parseDouble(t1.getText());
            String a = Double.toString(t * 1.2);
            t2.setText(a);
        }
        if (e.getSource() == bb) {
            double t = Double.parseDouble(t2.getText());
            String a = Double.toString(t / 1.2);
            t1.setText(a);

        }
        if (e.getSource() == t1) {
            double t = Double.parseDouble(t1.getText());
            String a = Double.toString(t * 1.2);
            t2.setText(a);
        }
        if (e.getSource() == t2) {
            double t = Double.parseDouble(t2.getText());
            String a = Double.toString(t / 1.2);
            t1.setText(a);

        }

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // System.exit(0); tencar tot
        dispose(); // tencar una finestra

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        String text = t1.getText();
        if (text == null) {
            text = "0";

        }
        try {
            if (e.getSource() == t1) {
                double t = Double.parseDouble(t1.getText());
                String a = Double.toString(t * 1.2);
                t2.setText(a);
            }
            if (e.getSource() == t2) {
                double t = Double.parseDouble(t2.getText());
                String a = Double.toString(t / 1.2);
                t1.setText(a);

            }
        } catch (NumberFormatException nfe) {
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

}