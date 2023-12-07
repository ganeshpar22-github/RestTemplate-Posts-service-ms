package com.msdemo.post.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msdemo.post.model.Posts;

@RestController
@RequestMapping("/post")
public class PostController {
	
	@GetMapping(value="/{postId}")
	public Posts getPosts(@PathVariable("postId") String postId) {
		
		Posts postOne = new Posts(postId, "This is description of "+ postId);
		return postOne;
	}
	

}
