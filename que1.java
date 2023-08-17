import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class que1 extends Applet implements MouseListener, MouseMotionListener, KeyListener{
  int x = 0;
  int y = 0;
  String msg = "";

  public void init() {
    addMouseListener(this);
    addMouseMotionListener(this);
    addKeyListener(this);
  }

  public void mousePressed(MouseEvent me) {
    x = me.getX();
    y = me.getY();
    msg = "Mouse Pressed";
    repaint();
  }

  public void mouseReleased(MouseEvent me) {
    x = me.getX();
    y = me.getY();
    msg = "Mouse Pressed";
    repaint();
  }

  public void mouseClicked(MouseEvent me) {
    x = me.getX();
    y = me.getY();
    msg = "Mouse Clicked at (" + x + ", " + y + ")";
    repaint();
  }

  public void mouseEntered(MouseEvent me) {
    x = 0;
    y = 0;
    msg = "Mouse Entered";
    repaint();
  }

  public void mouseExited(MouseEvent me) {
    x = 0;
    y = 0;
    msg = "Mouse Entered";
    repaint();
  }

  public void mouseDragged(MouseEvent me) {
    x = me.getX();
    y = me.getY();
    showStatus("Dragging mouse at (" + x + ", " + y + ")");
  }
  
  public void mouseMoved(MouseEvent me) {
    x = me.getX();
    y = me.getY();
    showStatus("Moving mouse at (" + x + ", " + y + ")");
  }

  public void keyPressed(KeyEvent ke) {
    showStatus("Key Pressed");
  }

  public void keyReleased(KeyEvent ke) {
    showStatus("Key Pressed");
  }

  public void keyTyped(KeyEvent ke) {
    msg += ke.getKeyChar();
    repaint();
  }

  public void paint(Graphics g) {
    g.drawString(msg, x, y);
  }
}
