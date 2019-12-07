package diner.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DemoLoginController 
{
	@GetMapping("/loginView")
	public String getLoginView(Model model)
	{
		//return username whatever
		//String username = "' or ''='";
		//String pass = "' or ''='";
		
		//bypass password
		String username = "diana'; #";
		String pass = "pass'"; 
		
		//String username = "diana";
		//String pass = "pass'; DROP TABLE user; # ";
		try
		{
		Connection connection;
		String url = "jdbc:mysql://localhost:3306/unidiner?verifyServerCertificate=false&useSSL=false";
		connection = DriverManager.getConnection(url,"root","123456"); 
		Statement stmt = connection.createStatement();
		String sqlQuery = "Select * From User where username = '" + username + "' and password = '" + pass + "';";
		System.out.println(sqlQuery);
		ResultSet result = stmt.executeQuery(sqlQuery);
		
		 while ( result.next() ) {
             String lastName = result.getString("username");
             System.out.println(lastName);
         }
		}
		catch(Exception e)
		{
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
		}
		return "views/loginView";
	}
	
	@PostMapping("/loginView")
	public String postLoginView(Model model)
	{
		
		return "views/loginView";
	}
}
