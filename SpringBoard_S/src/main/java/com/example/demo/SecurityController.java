package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/")
	public String index() {
		return "home";
	}

	@GetMapping("/user")
	public String user() {
		return "user";
	}
	/*
	 * @GetMapping("loginPage") public String loginPage() { return "loginPage"; }
	 * 
	 * @GetMapping("/user") public String user() { return "user"; }
	 * 
	 * @GetMapping("/user/pay") public String adminPay() { return "adminPay"; }
	 * 
	 * @GetMapping("/user/**") public String admin() { return "admin"; }
	 * 
	 * @GetMapping("/login") public String login() { return "login"; }
	 * 
	 * @GetMapping("/denied") public String denied() { return "Access is denied"; }
	 */

}
