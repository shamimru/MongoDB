package com.spring.mongoDB.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

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
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE_TIME)
	Date createdDate;

	
	
}
