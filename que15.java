import java.awt.Applet.*;
import java.awt.*;

// <applet code=que15 width=300 height=300></applet>

public class que15 extends Applet{
  public static void main(String[] args) {
    public void paint(Graphics g) {
      g.setColor(Color.red);
      g.drawLine(10, 10, 30, 30);
      Color c1 = new Color(10, 20, 255);
      g.setColor(c1);
      g.fillRect(40, 40, 40, 10);
    }
  }
}
