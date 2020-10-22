package SS9Project;

import java.io.Serializable;
import java.util.*;

/*
 * Each course represent a subject for a degree programme.
 *
 * Done by AKSHITA RAVISANKAR, HOO KAH JUN, JEWELLE LIM FONG YEE, LEE YU JIE MELVIN, PUVVADA MEGHANA
 */

public class Course implements Serializable {
	// Name of course
	private String name;
	// Course Identifier (Eg: CE/CZxxxx)
	private String courseID;
	// List of Index (Class) under the course
	private ArrayList<Index> index;

	public Course(String name, String courseID, ArrayList<Index> index) {
		super();
		this.name = name;
		this.courseID = courseID;
		this.index = index;
	}

	public String getCourseName() {
		return name;
	}

	public void setCourseName(String name) {
		this.name = name;
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