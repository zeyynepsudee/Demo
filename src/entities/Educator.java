package entities;

public class Educator {
private int id;
private String educatorName;
private String educatorLastName;
public Educator(int id, String educatorName, String educatorLastName) {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEducatorName() {
	return educatorName;
}
public void setEducatorName(String educatorName) {
	this.educatorName = educatorName;
}
public String getEducatorLastName() {
	return educatorLastName;
}
public void setEducatorLastName(String educatorLastName) {
	this.educatorLastName = educatorLastName;
}
}
