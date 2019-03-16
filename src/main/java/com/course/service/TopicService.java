package com.course.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.course.model.Topic;
import com.course.utility.Utilities.Utility;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("987","Data Structures","Trees"),
			new Topic("899","UNIX Programming","vi commands"),
			new Topic("677","Operating Systems","pagination")
	));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		Topic topic = topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		if(Utility.isNotNull(topic)) return topic;
		else return new Topic(id,"No Topic Name Found","No Desciption Found");
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void deleteTopic(String id) {
		Topic topic=topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		topics.remove(topic);
	}
	
}
