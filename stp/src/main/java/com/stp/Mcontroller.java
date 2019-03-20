package com.stp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mcontroller {

	@GetMapping("/main")
	public String mainPage() {
		return "main Page" + "test";
	}
}
