package com.springrest.springrest.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;


@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourses() {
		
		return courseDao.findAll();
	}
	@Override
	public Course getCourses(long courseId) {
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updatCourse(Course course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
		
	}

	
	
	
	
	
	
	
	
	
	
	
//	List<Course> list;
//	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(145, "java core Course", "this course contains basic of java"));
//		list.add(new Course(4343,"spring boot course", "creating rest api using spring boot"));
//	}
//	
//		@Override
//	public List<Course> getCourses() {
//		return list;
//	}
//    @Override
//	public Course getCourses(long courseId) {
//		Course c= null;
//		for(Course course : list) {
//			if (course.getId() == courseId) {
//				c= course;
//				break;
//			}
//		}
//		return c;
//	}
//    @Override
//	public Course addCourse(Course course) {
//		list.add(course);
//		return course;
//	}
//	@Override
//	public Course updatCourse(Course course) {
//		list.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});		
//		return course;
//	}
//   @Override
//	public void deleteCourse(long parseLong) {
//		list=this.list.stream().filter(e ->e.getId()!=parseLong).collect(Collectors.toList());		
//	}
	

}
