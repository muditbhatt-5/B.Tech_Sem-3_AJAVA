import java.sql.*;
class d
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muditt","root","");
		Statement st = con.createStatement();
		PreparedStatement ps=con.prepareStatement("create table employe(eid int,ename varchar(100))");
		int count=ps.executeUpdate();
		System.out.println(count);
		System.out.println("OOps!!! Table Is Successfully created");

		con.close();
		st.close();
	}
}