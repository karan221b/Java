import java.awt.*;
public class DrawingLines extends Frame
{
  public DrawingLines()
  {          // the following 3 lines creates an empty frame
    setTitle("Line Graphics by S N Rao");
    setSize(300, 350);
    setVisible(true);
  }
  public void paint(Graphics g)
  {        
    g.drawLine(60,90, 150, 200);
    g.drawLine(110, 120, 250, 270);
	//g.drawCircle(110, 120, 250, 270);
	 g.draw3DRect(60, 70, 150, 100, true);
    g.draw3DRect(240, 70, 150, 100, false);
	 g.drawOval(50, 80, 150, 100);
    g.fillOval(230, 80, 150, 100);
	 g.drawArc(60, 70, 200, 200, 0, 180);
	 g.drawRoundRect(40, 50, 90, 90, 200, 200);
  }
  public static void main(String args[])
  {
    new DrawingLines();
  }
}