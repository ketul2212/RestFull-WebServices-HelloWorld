package com.ketul.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ketul.demo.module.User;

@RestController
public class MyController {
	
	@GetMapping("/hello-world")
	public String welcome() {
		return "<p style='color:red;'>Hello World</p>";
	}
	
	@GetMapping("/hello-world-bean")
	public User userBean() {
		return new User("Ketul Patel");
	}
	
	@GetMapping("/hello-world-bean/path/{name}")
	public User userBean(@PathVariable String name) {
		return new User("Welcome " + name);
	}
}
