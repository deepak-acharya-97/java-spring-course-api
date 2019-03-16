package com.course.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.course.model.Topic;

@Service
public class TopicService {
	private List<Topic> topics = Arrays.asList(
			new Topic("987","Data Structures","Trees"),
			new Topic("899","UNIX Programming","vi commands"),
			new Topic("677","Operating Systems","pagination")
	);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
}
