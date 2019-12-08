package diner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController 
{
	@GetMapping("/registerView")
	public String getRegisterView(Model model)
	{
		return "views/RegisterView";
	}
}
