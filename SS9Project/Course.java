package test2;

import java.io.Serializable;
import java.util.*;

/*
 * Each course represent a subject for a degree programme. Each course can have multiple indexes.
 *
 * Done by AKSHITA RAVISANKAR, HOO KAH JUN, JEWELLE LIM FONG YEE, LEE YU JIE MELVIN, PUVVADA MEGHANA
 */

public class Course implements Serializable {
	// Name of course
	private String courseName;
	// Course Identifier (Eg: CE/CZxxxx)
	private String courseID;
	// List of Index (Class) under the course
	private ArrayList<Index> index;

	public Course(String courseName, String courseID, ArrayList<Index> index) {
		super();
		this.courseName = courseName;
		this.courseID = courseID;
		this.index = index;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public ArrayList<Index> getCourseIndex() {
		return index;
	}

	public void setCourseIndex(ArrayList<Index> index) {
		this.index = index;
	}
	
	
}
