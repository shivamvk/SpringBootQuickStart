package io.shivamvk.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepo;
	
	
	public List<Topic> getAllTopics(){
		return (List<Topic>) topicRepo.findAll();
	}
	
	public Topic getTopic(String id) {
		return topicRepo.findById(id).get();
	}
	
	public String addTopic(Topic topic) {
		topicRepo.save(topic);
		return "Topic added";
	}

	public String updateTopic(Topic topic, String id) {
		topicRepo.save(topic);
		return "Topic Updated";
	}
	
	public String deleteTopic(String id) {
		topicRepo.deleteById(id);
		return "Deleted";
	}
}
