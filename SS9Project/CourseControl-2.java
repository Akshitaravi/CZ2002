package Control;

import java.util.ArrayList;
import java.util.List;

import entities.Test;
import entities.WaitList;
import entities.Course;
import entities.Student;
import entities.CourseRegister;
import entities.Index;

public class CourseControl {
	static ArrayList<Course> courseList = Test.listofCourse;
	static ArrayList<Student> studentList = Test.listofStudents;
	static ArrayList<CourseRegister> registrationList = CourseRegister.registeredList;
	static ArrayList<WaitList>waitListStudents= WaitList.listofwaitlistStudents;
	
	//get courseID from courseID list
	public static Course getCourseByID(String courseID) {
		//for(Course c: courseList) {
		for(Course tempcourse:courseList){
			if(tempcourse.getCourseID().equals(courseID)) {
				return tempcourse;}
			
		
		   else {
		    System.out.println("Course not found!");
		    }
		}
		return null;
		
		}
	
	//get index from Courselist
	public static Index getIndex(String courseID, int indexID) {
		Course course = getCourseByID(courseID);
		List<Index> indexList = course.getCourseIndex();
		
		for (Index tempindex: indexList) {
			if(tempindex.getIndexID()==indexID) {
				return tempindex;
			}
			else {
				System.out.println("Index not found!");
			}
		}
		return null;
	}
	
	public static CourseRegister getRegisteredCourse(Student registeredStudent, String registeredCourseID){
		//Course course = getCourseByID(courseID);
		
		for (CourseRegister tempcourse2 : registrationList) {
			if (tempcourse2.getStudent().equals(registeredStudent)) {
				if (tempcourse2.getCourse().equals(registeredCourseID)){
					return tempcourse2;}
				}
		}
		return null;
	}
	
	//initially this method was in StudentControl but it was rewritten as above
	//public static CourseRegister getCourseReg2(Student loggedInStudent, String courseID){
			//Course course = getCourseByID(courseID);
			
			//for (CourseRegister c : registrationList) {
				//if (c.getStudent().equals(loggedInStudent)) {
					//if (c.getCourse().equals(course)){
						//return c;}
					//}
			//}
			//return null;
		//}
	//public static void updateWaitList(String courseID, Index index) {
		//int waitlistIndexID = index.getIndexID();
		
		//for (CourseRegister tempreg : registrationList){
			//if ((tempreg.getIndex() == index) && (tempreg.getStatus() == false)){
				//tempreg.setStatus(true);
				
				//Insert Code to Notify users
				
				//Insert code to add index for student on waitlist				
				//Course waitlistStudent = ((ArrayList<Course>) WaitList.waitListStudents).get(0);
				//waitlistStudent.addCourse;
									
				
				//index.waitingListMinus();
				//index.vacancyMinus();}
		//}
		
	//}
	
	
	
	

}
