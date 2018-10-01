package io.shivamvk.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepo;
	
	
	public List<Course> getAllCourses(String topicid){
		return (List<Course>) courseRepo.findByTopicId(topicid);
	}
	
	public Course getCourse(String id) {
		return courseRepo.findById(id).get();
	}
	
	public String addCourse(Course course) {
		courseRepo.save(course);
		return "Course added";
	}

	public String updateCourse(Course topic, String id) {
		courseRepo.save(topic);
		return "Topic Updated";
	}
	
	public String deleteCourse(String id) {
		courseRepo.deleteById(id);
		return "Deleted";
	}
}
