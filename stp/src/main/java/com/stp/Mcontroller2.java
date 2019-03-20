package com.stp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;

@Controller
public class Mcontroller2 {

	@RequestMapping(value = "/index")
	public String index(Model model) {
		User user = new User();
		user.setId("hog");
		user.setName("호그");
		model.addAttribute("user", user);
		return "index";
	}
}
