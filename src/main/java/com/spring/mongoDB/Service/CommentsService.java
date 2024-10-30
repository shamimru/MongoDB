package com.spring.mongoDB.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.spring.mongoDB.model.Comments;
import com.spring.mongoDB.repository.CommentsRepo;

@Service
public class CommentsService {
	@Autowired
	CommentsRepo commentsRepo;
	@Autowired
	MongoTemplate mongoTemplate;
	
	public void save(Comments c) {
		
		commentsRepo.save(c);
	}
	
	
	public List<Comments> getByName(String s) {
		
		Query query =new Query();
		query.addCriteria(Criteria.where("title").is(s));
		List<Comments> list = mongoTemplate.find(query, Comments.class);
		return list;
	}

}
