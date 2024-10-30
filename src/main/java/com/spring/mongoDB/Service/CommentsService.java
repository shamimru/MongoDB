package com.spring.mongoDB.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mongoDB.model.Comments;
import com.spring.mongoDB.repository.CommentsRepo;

@Service
public class CommentsService {
	@Autowired
	CommentsRepo commentsRepo;
	
	public void save(Comments c) {
		
		commentsRepo.save(c);
	}

}
