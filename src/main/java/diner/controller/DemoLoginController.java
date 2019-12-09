package diner.controller;

import java.security.Principal;
import java.sql.Connection;
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
import diner.entity.UserDiner;

@Controller
public class DemoLoginController {

	@GetMapping("/loginView")
	public String getMethod(Model model, Principal principal, HttpSession session) {

		model.addAttribute("user", new UserDiner());

		return "views/loginView";
	}

	@PostMapping("/loginView")
	public String postLoginView(Model model, @ModelAttribute UserDiner user) throws SQLException {

		model.addAttribute("user", new UserDiner());
		Connection connection = DBConnection.getConnctionToDB();
		Statement stmt = connection.createStatement();
		String sqlQuery = "SELECT * FROM User WHERE user_name = '" + user.getName() + "' AND user_password = '" + user.getPassword() + "';";
		ResultSet result = stmt.executeQuery(sqlQuery);

		if (result.next() ) {
			return "views/index";
		}

		return "views/loginView";
	}
}
