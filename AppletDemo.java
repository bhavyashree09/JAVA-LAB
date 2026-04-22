import java.applet.Applet;
import java.awt.Graphics;

public class AppletDemo extends Applet {

    String name;

    public void init() {
        name = getParameter("username");
        if (name == null) {
            name = "Guest";
        }
    }

    public void start() {
    }

    public void stop() {
    }

    public void destroy() {
    }

    public void paint(Graphics g) {
        g.drawString("Hello " + name, 50, 50);
    }
}