package com.itsajs.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class WelcomeToJenkinsCICDController 
{
	@GetMapping("/welcome")
   public String getWelcomeToJenkinsMessage(HttpServletRequest request)
   {
		System.out.println("entered in WelcomeToJenkinsCICDController.java "+request.getContextPath()+"|"+LocalDateTime.now());
		
	   return "Welcome To Jenkins CI/CD Pipeline"+"|"+request.getContextPath();
   }
}
