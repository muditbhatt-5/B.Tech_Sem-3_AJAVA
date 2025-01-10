import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="p9" height=300 width=300> </applet> */
public class p9 extends Applet implements ActionListener
{
Button b1,b2,b3,b4;
String name;
public void init()
{
b1 = new Button("Red"); 
b2 = new Button("Blue");
b3 = new Button("Yellow");
b4 = new Button("Black");
add(b1); 
add(b2); 
add(b3);
add(b4);
b1.addActionListener(this); 
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
name = ae.getActionCommand();
repaint();
}
public void paint(Graphics g)
{
if(name.equals("Red"))
setBackground(Color.red);
else if(name.equals("Blue"))
setBackground(Color.blue);
else if(name.equals("Yellow"))
setBackground(Color.yellow);
else if(name.equals("Black"))
setBackground(Color.black);
}
}