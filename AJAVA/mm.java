import java.applet.*;
import java.awt.*;
/*<applet code="mm" height=400 width=400></applet>*/
public class mm extends Applet
{
	public void  paint(Graphics g)
	{
		g.drawRect(40,40,200,200);
		g.setColor(Color.blue);
		g.drawOval(90,70,80,80);
		g.drawOval(110,95,5,5);
		g.drawLine(130,95,130,115);
		g.drawArc(113,115,35,20,0,-180);
		g.drawOval(145,95,5,5);
	}
}