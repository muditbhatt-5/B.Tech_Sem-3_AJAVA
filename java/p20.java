import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class p20 extends JFrame implements ActionListener
{
JTextField jtf1=new JTextField(10);
JTextField jtf2=new JTextField(10);
JTextField jtf3=new JTextField(10);
JLabel jlb1=new JLabel("Employee No :",JLabel.CENTER);
JLabel jlb2=new JLabel("Employee Name:",JLabel.CENTER);
JLabel jlb3=new JLabel("Employee Salary:",JLabel.CENTER);
JLabel jlb4=new JLabel(" ");
JLabel jlb5=new JLabel(" ");
JLabel jlb6=new JLabel(" ");
JLabel jlb7=new JLabel(" ");
JButton jbinst=new JButton("Insert");
JButton jbupdt=new JButton("Update");
JButton jbdlt=new JButton("Delete");
Statement stmt;
ResultSet rs;
p20()
{
jbinst.addActionListener(this);
jbdlt.addActionListener(this);
jbupdt.addActionListener(this);
JPanel jp=new JPanel();
jp.setLayout(new GridLayout(0,2));
jp.add(jlb1);
jp.add(jtf1);
jp.add(jlb2);
jp.add(jtf2);
jp.add(jlb3);
jp.add(jtf3);
jp.add(jbinst);
jp.add(jbdlt);
jp.add(jbupdt);
jp.add(jlb4);
jp.add(jlb5);
jp.add(jlb6);
jp.add(jlb7);
add(jp);
initializeDB();
}
private void initializeDB(){
 try{
 Class.forName("com.mysql.cj.jdbc.Driver");
Connection cn=DriverManager. getConnection ("jdbc:mysql: //localhost:3306/muditt", "root", "");
 stmt=cn.createStatement();
 }
 catch(Exception e){ 
 System.out.println(e);
 }
}
public void actionPerformed(ActionEvent e) 
{
String s2;
int s1, s3;
if(e.getActionCommand().equals("Insert"))
{
 s1= Integer.parseInt(jtf1.getText());
 s2= jtf2.getText();
 s3= Integer.parseInt(jtf3.getText());
 try{
int in=stmt.executeUpdate("INSERT INTO EMPLOYEE (EMP_NO,EMP_NAME, EMP_SAL) VALUES("+s1+",'"+s2+"',"+s3+")");
if(in>0)
JOptionPane.showMessageDialog(null, "Record Inserted Successfully!!!");
String qs="SELECT DISTINCT * FROM EMPLOYEE"; 
rs=stmt.executeQuery(qs);
if(rs.next())
{
int st1=s1;
String st2=s2;
int st3=s3;
jlb5.setText("Employee No : "+st1);
jlb6.setText("Employee Name : "+st2);
jlb7.setText("Employee Salary : "+st3);
}
}
catch(SQLException ex)
{
ex.printStackTrace();
}
}
if(e.getActionCommand().equals("Delete"))
{
 try
 {
 String sql = "DELETE FROM EMPLOYEE " + "WHERE EMP_NO="+jtf1.getText();
 stmt.execute(sql);
 JOptionPane.showMessageDialog(null, "Record Deleted Successfully!!!");
 }
 catch(SQLException ex)
 {
 ex.printStackTrace();
 }
}
if(e.getActionCommand().equals("Update"))
{
try
{
String sql="UPDATE EMPLOYEE SET EMP_NAME='"+jtf2.getText()+"', EMP_SAL='"+jtf3.getText()+"' WHERE EMP_NO = "+jtf1.getText()+"";
stmt.execute(sql);
JOptionPane.showMessageDialog(null, "Record Updated Successfully!!!");
}
catch(SQLException ex)
{
ex.printStackTrace();
}
}
}
public static void main(String[] args) throws Exception{
p20 frame = new p20();
frame.setTitle("Practial 18");
frame.setSize(500,500);
frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
frame.setVisible(true);
frame.setResizable(false);
frame.setLayout(new FlowLayout());
}
}