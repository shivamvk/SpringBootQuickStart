package io.shivamvk.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.shivamvk.springbootstarter.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;

	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);
	}
	
	@RequestMapping("/topics/{topicid}/courses/{id}")
	public Course getCourses(@PathVariable String id) {
		return courseService.getCourse(id);
	}
	
	@PostMapping(value="/topics/{topicid}/courses")
	public String addCourse(@RequestBody Course course, @PathVariable String topicid) {
		course.setTopic(new Topic(topicid, "", ""));
		return courseService.addCourse(course);
	}
	
	@PutMapping(value="/topics/{topicid}/courses/{id}")
	public String updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicid) {
		course.setTopic(new Topic(topicid, "", ""));
		return courseService.updateCourse(course, id);
	}
	
	@DeleteMapping(value="/topics/{topicid}/courses/{id}")
	public String deleteCourse(@PathVariable String id) {
		return courseService.deleteCourse(id);
	}
	
}
