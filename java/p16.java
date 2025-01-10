import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code="p16" height=250 width=500></applet>*/

public class p16 extends Applet implements ItemListener
{
CheckboxGroup cbg;
Checkbox c1,c2,c3;
TextField t1;
public void init()

{
    cbg=new CheckboxGroup();
    c1=new Checkbox("Red",cbg,false);
    c2=new Checkbox("Yellow",cbg,false);
    c3=new Checkbox("Green",cbg,false);
    t1=new TextField(30);
    add(c1);
    add(c2);
    add(c3);
    add(t1);


    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);
}
public void paint(Graphics g)
{
    g.setColor(Color.red);
    g.drawOval(10, 50, 30, 30);
    g.setColor(Color.yellow);
    g.drawOval(10, 100, 30, 30);
    g.setColor(Color.green);
    g.drawOval(10, 150, 30, 30);
    String s1=cbg.getSelectedCheckbox().getLabel();
    if(s1=="Red")
    {
        g.setColor(Color.red);
        g.fillOval(10, 50, 30, 30);
        t1.setText("Stop The Vehicle");
        }
        else if(s1=="Yellow")
        {
        g.setColor(Color.yellow);
        g.fillOval(10, 100, 30, 30);
        t1.setText("Be Ready to Go");
        }
        else if(s1=="Green")
        {
        g.setColor(Color.green);
        g.fillOval(10, 150, 30, 30);
        t1.setText(" You Can Go Now");
        }
        }
        public void itemStateChanged(ItemEvent ie)
        {
        repaint();
        }
        
}