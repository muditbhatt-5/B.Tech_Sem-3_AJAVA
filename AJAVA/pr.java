import java.applet.*;
import java.awt.*;
/*<applet code="pr" height=300 width=300></applet>*/
public class pr extends Applet {
public void init() {
setLayout(new FlowLayout(FlowLayout.CENTER));
Label l1 = new Label("Enter your name :");
TextField t1 = new TextField("your name", 30);
Label l2 = new Label("Enter your email :");
TextField t2 = new TextField("your email", 30);
Label l3 = new Label("Enter your Contact no :");
TextField t3 = new TextField("your name", 30);
Label l4 = new Label("Enter your address :");
TextField t4 = new TextField("your address", 30);
Label l5 = new Label("Enter your gender :");
CheckboxGroup cbg = new CheckboxGroup();
Checkbox checkBox1 = new Checkbox("Male", cbg, false);
checkBox1.setBounds(100, 100, 50, 50);
Checkbox checkBox2 = new Checkbox("Female", cbg, true);
checkBox2.setBounds(100, 150, 50, 50);
Label l6 = new Label("hobbies : ");
List l7 = new List(4, true);
l7.add("music");
l7.add("programming");
l7.add("dance");
l7.add("nothing");
Label l8 = new Label("Select Your Course : ");
Choice course = new Choice();
course.add("Diploma");
course.add("MCA");
course.add("MBA");
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
add(l4);
add(t4);
add(l5);
add(checkBox1);
add(checkBox2);
add(l6);
add(l7);
add(l8);
add(course);
}
}