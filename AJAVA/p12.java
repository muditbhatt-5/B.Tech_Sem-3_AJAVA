import java.applet.*; 
 import java.awt.*; 
 import java.awt.event.MouseListener; 
 import java.awt.event.MouseEvent; 
 /* <applet code ="p12" width=300 height=200> </applet> */ 
 public class p12 extends Applet implements MouseListener 
    { 
         int x=0,y=0;
         String str="";
         public void init() 
           {  
               addMouseListener(this); 
           } 
public void paint(Graphics g)
{
g.drawString(str+"X:"+x+"Y:"+y ,100,100);

}
               public void mousePressed(MouseEvent e) 
                 { 
                    setBackground(Color.blue); 
                 } 
                     public void mouseReleased(MouseEvent e) 
                          { 
                          setBackground(Color.red); 
                         } 
                             public void mouseEntered(MouseEvent e) 
                                { 
                                   showStatus("Mouse Entered"); 
                                } 
                                    public void mouseExited(MouseEvent e) 
                                      { 
                                         showStatus("Mouse exited"); 
                                      }          
                                          public void mouseClicked(MouseEvent e) 
                                           { 
                                               x=e.getX();
                                                y=e.getY();
                                                repaint();

                                           } 
    }