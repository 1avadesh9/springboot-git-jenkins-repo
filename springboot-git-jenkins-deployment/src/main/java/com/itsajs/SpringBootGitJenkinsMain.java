package com.itsajs;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableCaching
@Slf4j
public class SpringBootGitJenkinsMain implements CommandLineRunner
{
   public static void main(String[] args)
   {
	   SpringApplication.run(SpringBootGitJenkinsMain.class, args);
	   System.out.println("*******SPRINGBOOT GIT JENKINS PROJECT DEPLOYMENT STARTED ON  "+LocalDateTime.now());
   }

@Override
public void run(String... args) throws Exception 
{
  log.info("entered in SpringBootGitJenkinsMain.java run()...");
	
}
}
