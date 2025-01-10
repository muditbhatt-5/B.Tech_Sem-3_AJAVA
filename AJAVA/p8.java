import java.awt.event.*;
import java.awt.*;
import java.applet.*;
/* <applet code="p8" height=300 width=300> </applet> */
public class p8 extends Applet implements ActionListener
{
Label l1 , l2;
TextField t1 , t2;
public void init() 
{
Label l1 = new Label("Enter Your UserName: ", Label.LEFT);
TextField t1 = new TextField(20);
Label l2 = new Label("Enter Your Password: ", Label.LEFT);
TextField t2 = new TextField(20);
add(l1);
add(t1);
add(l2);
add(t2);
t1.addActionListener(this);
t2.addActionListener(this);
t2.setEchoChar('*');
}
public void actionPerformed(ActionEvent ae) 
{
repaint();
}
public void paint(Graphics g) 
{
g.drawString("UserName : " + t1.getText(), 60, 80);
g.drawString("Password : " + t2.getText(), 60, 100);
g.drawString("Selected Text : " + t1.getSelectedText(), 60, 120);
}
}