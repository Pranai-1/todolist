package com.pranai.example.practiceweb1.login;

import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	@RequestMapping("welcome")
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", getName());
		return "welcome";
}

	private String getName() {
	Authentication authentication=SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}
