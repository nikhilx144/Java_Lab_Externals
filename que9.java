import java.awt.event.*;
import java.awt.*;

public class que9 extends MouseAdapter {
  Frame f;
  que9() {
    f = new Frame("Adapter Class");
    f.addMouseListener(this);
    f.setSize(400, 400);
    f.setLayout(null);
    f.setVisible(true);
  }
  public void mouseClicked(MouseEvent me) {
    Graphics g = f.getGraphics();
    g.setColor(Color.blue);
    g.fillOval(me.getX(), me.getY(), 30, 30);
  }
  public static void main(String[] args) {
    new que9();
  }
}