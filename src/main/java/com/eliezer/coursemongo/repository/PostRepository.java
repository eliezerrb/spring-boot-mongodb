package com.eliezer.coursemongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eliezer.coursemongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{
	
}
