package com.spring.mongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.mongoDB.model.Comments;

@Repository
public interface CommentsRepo  extends MongoRepository<Comments, Long>{

	
}
