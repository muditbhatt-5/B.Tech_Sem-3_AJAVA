import java.sql.*;
import java.util.*;
public class p18 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mm2","root","");
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery("select * from employee");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
		}
		rs.close();
		st.close();
		con.close();
	}
}
