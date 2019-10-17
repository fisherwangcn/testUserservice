package com.example.testuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TestUserServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestUserServiceApplication.class, args);
	}

}

@RestController
class MyController{
	@RequestMapping(value = "/user", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Object getUser(){
		return "branch mybranch user1 ----------first commit";
	}
}
