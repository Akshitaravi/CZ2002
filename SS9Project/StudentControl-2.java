package Control;

import entities.Course;
import entities.Index;
import entities.Student;
//import entities.WaitList;
import entities.CourseRegister;

public class StudentControl extends CourseControl{
	
	
	//remaining to do
	//public void checkVacany()
	//public void changeIndex(String accoundID)
	
    
	
	public static void addCourse(Student student, String courseID, int indexID) {
		Course regCourse = getCourseByID(courseID);
		Index regIndex = getIndex(courseID, indexID);
		Boolean status;
		int vacancy = regIndex.getIndexVacancy();
		
		if (vacancy <= 0){
			status = false;
			regIndex.waitingListPlus();
			System.out.println("There are not vacancies in this index," + indexID + "," + courseID + " will be put into waiting list.");
		}
		else{
			status =true;
			regIndex.vacancyMinus();
			System.out.println("Index " + indexID + " of course " + courseID + " has been successfully registered!");
		
		
		CourseRegister tempaddCourse = new CourseRegister (student, regCourse, regIndex, status);
		registrationList.add(tempaddCourse);}
		
		
	}
	
	
	
	public static void dropCourse(Student student2, String courseID, int indexID){
		CourseRegister regCourse2 = getRegisteredCourse(student2, courseID);
		Index regIndex2	= getIndex(courseID, indexID);
		Boolean status= regCourse2.getStatus();
		
		registrationList.remove(regCourse2);
		System.out.println("Index " + indexID + "of" + courseID + " has been dropped!");
		
		if (status == true){ // Registered
			regIndex2.vacancyPlus();
			//updateWaitList(courseID, regIndex2);
		}
		else{ 
			regIndex2.waitingListMinus();
		}		
	}
	
	public static void swapIndex(Student swapStudent, Student peer, String courseID, int swapStuIndexNumber, int peerIndexNumber){
		Course course = getCourseByID (courseID);
		CourseRegister peerCoursereg = getRegisteredCourse(peer, courseID);
		CourseRegister swapStuCoursereg	= getRegisteredCourse(swapStudent, courseID);
		Index swapStuIndex= getIndex(courseID, swapStuIndexNumber);
		Index peerIndex	= getIndex(courseID, peerIndexNumber);
		
		registrationList.remove(swapStuCoursereg);
		registrationList.remove(peerCoursereg);
		CourseRegister yourCourseReg = new CourseRegister (swapStudent, course, peerIndex, true);
		peerCoursereg = new CourseRegister (peer, course, swapStuIndex, true);
		
		registrationList.add(swapStuCoursereg);
		registrationList.add(peerCoursereg);	
		System.out.println("Your index and your peer's index has been swapped successfully");
		System.out.println("Your new index: " + peerIndex);
		System.out.println("Your peer's new index: " + swapStuIndex);
		
	}
	
	public static void printRegistered(Student printStudentInfo){
		Course courseReg;
		Index indexReg;		
		
		System.out.println("The following courses are registered successfully");
		System.out.println("CourseID, Index Number");
		
		
		for(CourseRegister reg : registrationList) {
			if (reg.getStudent().equals(printStudentInfo)){
				courseReg = reg.getCourse();
				indexReg = reg.getIndex();
								
				System.out.print(courseReg.getCourseID());
				System.out.print(indexReg.getIndexID());
				
	
	
}
		}
		
	}
	
}
