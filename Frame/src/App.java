import java.awt.Button;
import java.awt.TextArea;
import java.awt.List;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.awt.Choice;
import java.util.ArrayList;
import java.util.Stack;

public class App extends Frame implements ActionListener, KeyListener, WindowListener, ItemListener {

    Button b;
    Button b2;
    Button b3;
    TextArea TA = new TextArea();
    List L = new List(10);
    TextField t = new TextField("", 20);
    Choice c;
    Stack<String> Pila = new Stack<String>();
    ArrayList<String> Llista = new ArrayList<String>();

    public static void main(String[] args) {
        new App();
    }

    App() { // constructor
        super("finestra");
        this.setLayout(new FlowLayout());// f.setLayout = this.setLayout=setLayout
        add(t);
        b = new Button("Afegir a Pila i Llista");
        b2 = new Button("Visualitzar");
        b3 = new Button("Visualitzar A la textArea");
        c = new Choice();
        add(b);
        add(c);
        add(b2);
        add(TA);
        add(L);
        add(b3);
        setVisible(true);
        setSize(700, 700);
        b.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        c.addItemListener(this);
        L.addItemListener(this);
        t.addKeyListener(this);
        addWindowListener(this);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c) {
            System.out.println("presed");
            System.out.println(c.getSelectedItem());
        }
        if (e.getSource() == L) {
            TA.append(" ");
            TA.append(L.getSelectedItem());
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            Pila.push(t.getText());
            Llista.add(t.getText());
            System.out.println(Pila);
            t.setText("");
        }
        if (e.getSource() == b2) {
            c.removeAll();
            L.removeAll();
            for (int i = Llista.size() - 1; i >= 0; i--) {
                c.add(Llista.get(i));
            }
            int n = Pila.size();
            for (int i = 0; i < n; i++) {
                L.add(Pila.pop());
            }

            Llista.clear();

        }
        if (e.getSource() == b3) {
            String[] s = L.getSelectedItems();
            String ss = "";

            for (String string : s) {
                ss += string;
            }

            TA.setText(ss);
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

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

}