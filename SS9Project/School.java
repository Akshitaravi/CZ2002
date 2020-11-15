package SS9Project;
//package entities;

import java.io.Serializable;
import java.util.*;

/*
 * This class represents a school. A school can have many Students and many Courses.
 *
 * Done by AKSHITA RAVISANKAR, HOO KAH JUN, JEWELLE LIM FONG YEE, LEE YU JIE MELVIN, PUVVADA MEGHANA
 */

public class School implements Serializable {

	//The full name of this School.
	private String schoolName;

	//students enrolled in this school
	private Student[] students;

	// Creates a new School.
	 
	public School() {

	}
	//gets the name of the school
	public String getSchoolName() {
		return schoolName;
	}

	//gets list of students enrolled in this school
	public Student[] getStudents() {
		return students;
	}
	//changes the name of the school
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	//changes the students enrolled in this school
	public void setStudents(Student[] students) {
		this.students = students;
	}

}