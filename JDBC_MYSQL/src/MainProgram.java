//Java Database Connectivity theory by telusko

/*
 * 1. import -> java.sql
 * 2. load and register the driver -> com.mysql.jdbc.Driver
 * 3. create connection -> Connection
 * 4. create a statement -> Statement
 * 5. execute a query
 * 6. process the results
 * 7. close
 */


import java.sql.*;

public class MainProgram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://db4free.net:3306/justclick";
		String uname="ngoctu";
		String pass="19001560";
		
		String query = "select * from Favorite";
		
		//Load class
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		
		while (rs.next()) {
			System.out.println(rs.getString("id_user"));
		}
		
		st.close();
		con.close();
	}

}
