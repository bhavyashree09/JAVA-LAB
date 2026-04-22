import java.awt.*;
import java.awt.event.*;

class EventDemo extends Frame implements KeyListener, MouseListener {

    Label l;

    EventDemo() {
        l = new Label();
        l.setBounds(20, 50, 300, 20);
        add(l);

        addKeyListener(this);
        addMouseListener(this);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed: " + e.getKeyChar());
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked at: " + e.getX() + "," + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new EventDemo();
    }
}