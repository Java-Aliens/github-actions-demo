package com.alien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitHubActionsDemoApplication {

	@GetMapping("/welcome")
	public String disp() {
		return "Welcome to github actions";
	}

	public static void main(String[] args) {
		SpringApplication.run(GitHubActionsDemoApplication.class, args);
	}

}



/*
 * echo "# github-actions-demo" >> README.md 
 * git init git add README.md git
 * commit -m "first commit" 
 * git branch -M main 
 * git remote add origin
 * https://github.com/Java-Aliens/github-actions-demo.git 
 * git push -u origin master
 */