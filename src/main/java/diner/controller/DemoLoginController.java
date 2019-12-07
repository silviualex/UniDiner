package diner.controller;

import java.security.Principal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import diner.config.DBConnection;
import diner.entity.User;

@Controller
public class DemoLoginController {

	@GetMapping("/loginView")
	public String getMethod(Model model, Principal principal, HttpSession session) {

		model.addAttribute("user", new User());

		return "views/loginView";
	}

	@PostMapping("/loginView")
	public String postLoginView(Model model, @ModelAttribute User user) throws SQLException {

		// return username whatever
		// String username = "' or ''='";
		// String pass = "' or ''='";

		// bypass password
		String username = "diana'; #";
		String pass = "pass'";

		// String username = "diana";
		// String pass = "pass'; DROP TABLE user; # ";

		Connection connection = DBConnection.getConnctionToDB();
		Statement stmt = connection.createStatement();
		String sqlQuery = "Select * From User where username = '" + username + "' and password = '" + pass + "';";
		ResultSet result = stmt.executeQuery(sqlQuery);

		while (result.next()) {
			String lastName = result.getString("username");
			System.out.println(lastName);

		}

		return "views/loginView";
	}
}
