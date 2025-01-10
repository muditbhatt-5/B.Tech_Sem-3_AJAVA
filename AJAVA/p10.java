import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="p10" height=300 width=300> </applet> */
public class p10 extends Applet implements ActionListener {
Button b1, b2;
String str = "";
public void init() {
b1 = new Button("Button 1");
b2 = new Button("Button 2");
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae) {
if (ae.getSource() == b1) {
b2.setLabel("Button 1 Clicked");
str = "Button 1 Clicked";
} 
else if (ae.getSource() == b2) {
b1.setLabel("Button 2 Clicked");
str = "Button 2 Clicked";
}
repaint();
}
public void paint(Graphics g) {
g.drawString(str, 100, 100);
}
}