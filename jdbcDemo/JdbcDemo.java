package jdbcDemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException {
		// loading the class
		// establishing the connection
		// preparing the statement
		// execute the quary
		// processing the result set
		// close the connection
		String url = "";
		String userName = "";
		String password = "";

		Connection connection = DriverManager.getConnection(url, userName, password);

		// create statement
		Statement statement = connection.createStatement();
		String query = "Select * from student";
		// join
		String join = "select * from student s join course c on s.id = c.id";
		ResultSet resultSet = statement.executeQuery(query);
		ResultSet resultSet1 = statement.executeQuery(join);
		while(resultSet.next()) {
			resultSet.getInt("id"); // name of the column;
		}
		System.out.println("Id" + "" + "name");
		
		//close the resource
		resultSet.close();
		 statement.close();
		 connection.close();

		// prepared statement
		PreparedStatement preparedStatment = connection.prepareStatement("Inster into students values(?,?)");

		preparedStatment.setInt(1, 101);
		preparedStatment.setString(1, "Deepak");
		
		int rows = preparedStatment.executeUpdate();
		System.out.println("row inserted" + rows);
		preparedStatment.close();
		// callable statement
		// prepare the callable statemnt for calling the stored procedure inside curly bracket syntax of store procedure;
		CallableStatement callableStatment = connection.prepareCall("{call getStudentName(?)}");
		callableStatment.setInt(1, 101);
		// excuate the stored procedure
		ResultSet resultSet2 = callableStatment.executeQuery();
		
	while (resultSet2.next()) {
		String name = resultSet2.getString("name");//column name
		System.out.println(name);
	}

// close the open resource; and it will execute in down to up

	}

}
