import java.sql.*;
class m
{
	public static void main(String args[]) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");	

	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/muditt","root","");
	
	Statement st = con.createStatement();
	
	ResultSet rs = st.executeQuery("select * from bcci");
	if(con != null)
	{
		System.out.println("Connection established");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+ "" + rs.getString(2));
		}
	}
	else
	{
		System.out.println("Connection failed");
		con.close();
		st.close();
		rs.close();
	}
	}
}