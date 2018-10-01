package io.shivamvk.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicservice;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicservice.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
	}
	
	@PostMapping(value="/topics")
	public String addTopic(@RequestBody Topic topic) {
		return topicservice.addTopic(topic);
	}
	
	@PutMapping(value="/topics/{id}")
	public String updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		return topicservice.updateTopic(topic, id);
	}
	
	@DeleteMapping(value="/topics/{id}")
	public String deleteTopic(@PathVariable String id) {
		return topicservice.deleteTopic(id);
	}
	
}
