package business;

import java.util.List;

import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Category;
import entities.Course;

public class CourseManagement {
private List<Course> courses;
private CourseDao courseDao;
private Logger[] loggers;
public CourseManagement(CourseDao courseDao, Logger[] loggers ) {
	super();
	this.courseDao=courseDao;
	this.loggers= loggers;
}

public void add(Course course)throws Exception{
	for(Course courseA : courses) {
		if (course.getCourseName().equals(course.getCourseName())) {
			throw new Exception("Kurs ismi aynı olamaz");
		}
	}
courseDao.add(course);
for(Logger logger : loggers) {
	logger.log(course.getCourseName());
}

}




}
