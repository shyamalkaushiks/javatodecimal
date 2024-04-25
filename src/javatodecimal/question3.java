package javatodecimal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class question3 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql:///shyamal";
		String username="root";
		String password="password";
Connection connection=DriverManager.getConnection(url, username, password);
  Statement statement=connection.createStatement();
  String query = "SELECT name, age FROM test";
  ResultSet resultset=statement.executeQuery(query);
  while(resultset.next())
  {
	  String name = resultset.getString("name");
      int age = resultset.getInt("age");
      System.out.println("Name: " + name + ", Age: " + age);
  }
	}

}
