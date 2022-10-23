package dataAccess;

import entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println(course + "Jdbc ile veritabanına kurs eklendi");
		
	}
	public void delete(Course course) {
		System.out.println(course + "Jdbc ile veritabanından kurs silindi");
}

	public void update(Course course) {
		System.out.println(course + "Jdbc ile veritabanında kurs güncellendi");

}
}