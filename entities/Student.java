package entities;

import entities.User;
import entities.CourseRegister;
//import entities.School;
/*
 * Represents the student enrolled in the school who uses STARS
 *
 * Done by AKSHITA RAVISANKAR, HOO KAH JUN, JEWELLE LIM FONG YEE, LEE YU JIE MELVIN, PUVVADA MEGHANA
 */


public class Student extends User {
	//place the student is born
	private String nationality;
	//gender of student
	private String gender;
	//matric number of student
	private String matricNo;
	//name of student
	private String studentName;
	//email of student
	private String email;
	//number of student
	private String mobileNo;
	//type of notification the student would want
	// 3 types: N1- email, N2- SMS, N3- SMS and email 
	private String notificationType;
	//course registration of a student
	private CourseRegister[] courseRegistrations;
	
	//school the student is enrolled in
	//private School school;
	//year the student is in
	private String Year;
	
	
	//create new student
	public Student() {
		super();
	}
	// get the courses the student is registered for
	public CourseRegister[] getCourseRegistration() {
		return courseRegistrations;
	}
	//get the courses the student is registered for
	public void setCourseRegistrations(CourseRegister[] courseRegistrations) {
		this.courseRegistrations = courseRegistrations;
	}
	
	//get the email of student
	public String getEmail() {
		return email;
	}
	//change the email of student
	public void setEmail(String email) {
		this.email = email;
	}
	//get the matric number of student
	public String getMatricNo() {
		return matricNo;
	}	
	//change the matric number of student
	public void setMatricNo(String matricNo) {
		this.matricNo = matricNo;
	}
	//get the mobile number of student
	public String getMobileNo() {
		return mobileNo;
	}
	//change the mobile number of student
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	//get nationality of student
	public String getNationality() {
		return nationality;
	}
	//change nationality of student
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	//get notifcation preference of student
	public String getNotificationType() {
		return notificationType;
	}
	//change notifcation preference of student
	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}
	//get the school the student is enrolled in
	//public School getSchool() {
	//	return school;
	//}
	//change the school the student is enrolled in
	//public void setSchool(School school) {
	//	this.school = school;
	//}
	//get the year the student is in
	public String getYear() {
		return Year;
	}
	//change the year the student is in
	public void setYear(String year) {
		this.Year = year;
	}
}
