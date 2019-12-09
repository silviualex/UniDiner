package diner.controller;

import java.security.Principal;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import diner.config.DBConnection;
import diner.model.dto.UserDTO;

@Controller
public class RegisterController 
{
	@GetMapping("/registerView")
	public String getRegisterView(Model model)
	{
		model.addAttribute("userDTO", new UserDTO());
		return "views/RegisterView";
	}
	
	@PostMapping("/registerView")
	public String postRegisterView(Model model, Principal principal, @ModelAttribute UserDTO userDTO,
			@RequestParam("submit") String reqParam) throws SQLException
	{		
		model.addAttribute("userDTO", new UserDTO());
		switch(reqParam)
		{
			case "Register":
				String username = userDTO.getUsername();
				String password = userDTO.getPassword();
				String repeatPassword = userDTO.getRepeatPassword();			
				Connection conn = DBConnection.getConnctionToDB();
				
				Statement stmt = conn.createStatement();
				//INSERT INTO `table_name`(column_1,column_2,...) VALUES (value_1,value_2,...);
				String querry  = "INSERT INTO  username, password in";
				
		}
		return "views/RegisterView";
	}
}
