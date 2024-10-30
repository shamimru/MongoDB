package com.spring.mongoDB.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("comments_mongo")
public class Comments {

	@Id
	private String id;
	String title;
	String content;
	String author;
	List<?> comments;
	Metadata metadata;

}
