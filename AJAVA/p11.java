import java.awt.*;
import java.awt.event.*;
public class p11 extends Frame implements ActionListener
{
Frame f;
TextField tf;
Button b;
p11()
{
f=new Frame("p11");
tf = new TextField();
tf.setBounds(50,50,150,20);
b=new Button("SUBMIT");
b.setBounds(50,100,60,30);

b.addActionListener(this);
f.add(b);
f.add(tf);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);


}
public void actionPerformed(ActionEvent e)
{
tf.setText("WELCOME");
}

public static void main (String args[])
{

p11 d= new p11();
}
}