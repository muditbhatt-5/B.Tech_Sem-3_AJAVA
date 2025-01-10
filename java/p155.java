import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
/*<applet code="p155" height=400 width=400></applet>*/
public class p155 extends JApplet 
{
 JLabel lname , lemail , lcontact , laddress , lgender , lhobby , lbranch;
 JButton register;
 JTextField name , email , contact;
 JTextArea address;
 JRadioButton male , female;
 JCheckBox danching , playing , drawing;
 JComboBox branch;
public void init() {
 Container c = getContentPane();
 FlowLayout f1 = new FlowLayout();
 c.setLayout(f1);
 
 lname = new JLabel ("Enter Your Name:",JLabel.LEFT);
 c.add(lname);
 name = new JTextField(10);
 c.add(name);
 lemail = new JLabel ("Enter Your Email",JLabel.LEFT);
 c.add(lemail);
 email = new JTextField(10);
 c.add(email);
 lcontact = new JLabel ("Enter Your Contact:",JLabel.LEFT);
 c.add(lcontact);
 contact = new JTextField(10);
 c.add(contact);
 lgender = new JLabel ("Enter Your Gender");
 c.add(lgender);
 JRadioButton Male = new JRadioButton("Male");
 c.add(Male);
 JRadioButton Female = new JRadioButton("Female");
 c.add(Female);
 ButtonGroup bg = new ButtonGroup();
 bg.add(male);
 bg.add(Female);
 lhobby = new JLabel ("Enter Your Hobbies");
 c.add(lhobby);
 danching = new JCheckBox("Danching");
 c.add(danching);
 playing = new JCheckBox("Playing");
 c.add(playing);
 drawing = new JCheckBox("Drawing");
 c.add(drawing);
 lbranch = new JLabel ("Enter Your Branch:");
 c.add(lbranch);
 String options[] = {"Computer","Electrical","Civil"};
 branch = new JComboBox(options);
 c.add(branch);
 register = new JButton("Register");
 c.add(register); 
 }
    public static void main (String[] args)
 {
    
 }
}
