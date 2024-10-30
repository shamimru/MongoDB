package com.spring.mongoDB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongoDB.Service.CommentsService;
import com.spring.mongoDB.model.Comments;

@RestController
public class Controller {
	
	@Autowired
	CommentsService commentsService;
	@GetMapping("/s")
	public String g() {
		return "hello";
	}

	
	@PostMapping("/save")
	public String save(@RequestBody Comments c) {
		commentsService.save(c);
		return "success";
	}
	@GetMapping("/getByName/{s}")
	public List<Comments> getByName(@PathVariable String s) {
		System.out.println(s);
		List<Comments> byName = commentsService.getByName(s);
		for (Comments comments : byName) {
			System.out.println(comments);
		}
		return byName;
	}
}
