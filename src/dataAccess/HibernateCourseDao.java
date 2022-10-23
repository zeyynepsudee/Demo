package dataAccess;

import entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println(course + "Hibernate ile veritabanına kurs eklendi");
		
	}
	public void delete(Course course) {
		System.out.println(course + "Hibernate ile veritabanından kurs silindi");
}

	public void update(Course course) {
		System.out.println(course + "Hibernate ile veritabanında kurs güncellendi");
	}
}