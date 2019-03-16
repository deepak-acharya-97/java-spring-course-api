package com.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.course.model.Topic;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return Arrays.asList(
				new Topic("987","Data Structures","Trees"),
				new Topic("899","UNIX Programming","vi commands"),
				new Topic("677","Operating Systems","pagination")
		);
	}
}
