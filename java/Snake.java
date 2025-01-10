//snake game
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.Dimension;
/* <applet code="Snake" height=400 width=400></applet>
*/
public class Snake extends Applet implements Runnable ,KeyListener
{
int x1,y1,x0,y0,len=90,dir=1,i,j,f=0,r=0,score;
public int x,y,xx,yy;
int s[][]=new int[7][1000];
Thread t;
public void init()
{
  addKeyListener(this);
  t=new Thread(this);
  t.start();
}
public void run()
{
  Dimension dim =new Dimension(1000,1000); //dimension of window
  xx =(int)(dim.getWidth());
  yy =(int)(dim.getHeight());
  x1=xx/2;  //to set header point at middel of the window.
  y1=yy/2;
  s[0][0]=0;
  s[1][0]=x1;  //x - coordinate of Header Point
  s[2][0]=y1;  //y - coordinate of Header Point
  s[3][0]=len; //length of line
  s[4][0]=dir; //direction of line
  s[5][0]=x1-len; //x - coordinate of Tail Point
  s[6][0]=y1;  //y - coordinate of Tail Point
 
  showStatus(" x "+ xx +" y " + yy);
  Random ran = new Random();
   x = ran.nextInt(xx);  //to generate point at random position
   y = ran.nextInt(yy);
  
  for(;;)
  {
  
   showStatus(/*" xr "+ s[1][r] +" yr " + s[2][r] +" rl "+ s[3][r] +" xf "+s[1][f]+" yf "+s[2][f]+" r "+r+" f "+f +*/"Score "+ score);
   try{
    t.sleep(10); //to set the speed of snake
    }
   catch(Exception e)
   {}
   if(r<=f)
   {
    if((s[1][f]==x || s[1][f]==x+1) && (s[2][f]==y || s[2][f]==y+1)) //in this program i have considered a ractangle of 1X1 rather than single point.
    {                 //check whether snake met to point or not?
     s[3][r]+=25; // value shows : when snake meets the point how much length will be incremented?
     score++;  // score incremented as snake meets point
    
      x = ran.nextInt(xx);  // again point generation
      y = ran.nextInt(yy);
    }
    if(r<f)
    {
    //COMUTATION FOR ' r 'th COLUMN
     if(s[3][r]<=0)  //when length of line becomes zero r is increamented
     {
      r++;
     }
     s[3][r]--;   //to decreament last line of snake
    
     //changes co-ordinates according to direction
     if(s[4][r]==1)
     {
       s[5][r]=s[1][r]-s[3][r];
       s[6][r]=s[2][r];
     }
     if(s[4][r]==2)
     {
       s[5][r]=s[1][r];
       s[6][r]=s[2][r]-s[3][r];
     }
     if(s[4][r]==3)
     {
       s[5][r]=s[1][r]+s[3][r];
       s[6][r]=s[2][r];
     }
     if(s[4][r]==4)
     {
       s[5][r]=s[1][r];
       s[6][r]=s[2][r]+s[3][r];
     }
    
    
    //COMPUTATION FOR ' f 'th COLUMN
   
     //changes co-ordinates according to direction
     s[3][f]++;
     if(s[4][f]==1)
     {
       s[1][f]=s[5][f]+s[3][f];
       s[2][f]=s[6][f];
     }
     if(s[4][f]==2)
     {
      s[1][f]=s[5][f];
      s[2][f]=s[6][f]+s[3][f];
    
     }
     if(s[4][f]==3)
     {
      
       s[1][f]=s[5][f]-s[3][f];
       s[2][f]=s[6][f];
     }
     if(s[4][f]==4)
     {
       s[1][f]=s[5][f];
       s[2][f]=s[6][f]-s[3][f];
      
     }
    
    }
   
    //when sake contains only single line
    if(r==f)
    {
     if(s[4][r]==1)
     {
       s[1][f]++;
       s[5][r]=s[1][r]-s[3][r];
     }
     if(s[4][f]==2)
     { s[2][f]++;
      s[6][r]=s[2][r]-s[3][r];
     }
     if(s[4][f]==3)
     {  s[1][f]--;
       s[5][r]=s[1][r]+s[3][r];
     }
     if(s[4][f]==4)
     {  s[6][r]=s[2][r]+s[3][r];
       s[2][f]--;
     }
    }
   
   
    //computation for part of line when it meets to border
     if(s[1][f]>xx-1)
     {
      f++;    //when meet to border generats a new line with opposite side in same direction.
      s[4][f]=s[4][f-1];
      s[1][f]=0;
      s[5][f]=0;
      s[2][f]=s[2][f-1];
      s[6][f]=s[6][f-1];
      s[3][f]=0;
     }
     if(s[2][f]>yy-1)
     {
      f++;
      s[4][f]=s[4][f-1];
      s[2][f]=0;
      s[6][f]=0;
      s[1][f]=s[1][f-1];
      s[5][f]=s[5][f-1];
      s[3][f]=0;
     }
     if(s[1][f]<0)
     {
      f++;
      s[4][f]=s[4][f-1];
      s[1][f]=xx-1;
      s[5][f]=xx-1;
      s[2][f]=s[2][f-1];
      s[6][f]=s[6][f-1];
      s[3][f]=0;
     }
     if(s[2][f]<0)
     {
      f++;
      s[4][f]=s[4][f-1];
      s[2][f]=yy-1;
      s[6][f]=yy-1;
      s[1][f]=s[1][f-1];
      s[5][f]=s[5][f-1];
      s[3][f]=0;
     }
    
    
     //Collision checking
     for(int j=r;j<f;j++)
     {
      //comparision with vertical lines of snake
      if(s[4][j]==2||s[4][j]==4)
      {
       if(s[1][f]==s[1][j] )
       {
        if(s[2][j]>s[6][j])
        {
         if(s[2][f]<=s[2][j] && s[2][f]>=s[6][j])
         {r=f+1;}
        
        }
        else
        {
         if(s[2][f]>=s[2][j] && s[2][f]<=s[6][j])
         {r=f+1;}
        
        }
       }
      }
      //comparision with horizontal lines of snake
      if(s[4][j]==1||s[4][j]==3)
      {
       if(s[2][f]==s[2][j] )
       {
        if(s[1][j]>s[5][j])
        {
         if(s[1][f]<=s[1][j] && s[1][f]>=s[5][j])
         {r=f+1;}
        
        }
        else
        {
         if(s[1][f]>=s[1][j] && s[1][f]<=s[5][j])
         {r=f+1;}
        }
       }
      }
     }
   }
   repaint();
  }
}
public void keyPressed(KeyEvent e)
{
  //catch key pressed
  if(r<=f)
  {
   int n = e.getKeyCode();
   f++;
   s[5][f]=s[1][f-1];
   s[1][f]=s[1][f-1];
   s[6][f]=s[2][f-1];
   s[2][f]=s[2][f-1];
   s[3][f]=0;
   if(n==KeyEvent.VK_RIGHT)
   {
    if(s[4][f-1]!=3) //because if snake is moving left side, to move instanly right side is not allowed.
    s[4][f]=1;
    else
    f--;
   }
   if(n==KeyEvent.VK_LEFT)
   {
    if(s[4][f-1]!=1)   //reverse of above
    s[4][f]=3;
    else
    f--;
   }
   if(n==KeyEvent.VK_UP)
   {
   
    if(s[4][f-1]!=2)//because if snake is moving downward, to move instanly upward side is not allowed.
    s[4][f]=4;
    else
    f--;
   }
   if(n==KeyEvent.VK_DOWN)
   {
    if(s[4][f-1]!=4) //reverse of above
    s[4][f]=2;
    else
    f--;
   }
  }
  repaint();
}
public void keyTyped(KeyEvent e)
{}
public void keyReleased(KeyEvent e)
{}
public void paint(Graphics g)
{
  if(r<=f) //when collision is not occured.
  {
   for(i=r;i<=f;i++)
   {
    g.setColor(Color.BLUE);
    g.drawLine(s[1][i],s[2][i],s[5][i],s[6][i]);
    g.drawRect(x,y,1,1);
   
   }
  }
  else //when collision occured
  {
   g.setFont(new Font("serif",Font.BOLD,xx/10));
   g.drawString("Game Over" ,xx/4,((int)(yy/2)-75));
   g.drawString("Your Score is : "+score,xx/6,((int)yy/4+75));
  }
}
}