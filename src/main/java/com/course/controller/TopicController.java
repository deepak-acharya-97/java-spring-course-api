package com.course.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.course.model.Topic;
import com.course.service.TopicService;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
}
