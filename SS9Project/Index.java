package SS9Project;

import java.io.Serializable;

/*
 * Each Index represent a class for a course.
 *
 * Done by AKSHITA RAVISANKAR, HOO KAH JUN, JEWELLE LIM FONG YEE, LEE YU JIE MELVIN, PUVVADA MEGHANA
 */

public class Index implements Serializable {
	// Index ID for a Course
	private int indexID;
	// Course ID that the index belongs to
	private String courseID;
	// Vacancy left for the index
	private int vacancy;
	// Schedule for the index
	private Schedule schedule;

	public Index(int indexID, String courseID, int vacancy, Schedule schedule) {
		super();
		this.indexID = indexID;
		this.courseID = courseID;
		this.vacancy = vacancy;
		this.schedule = schedule;
	}

	public int getIndexID() {
		return indexID;
	}

	public void setIndexID(int indexID) {
		this.indexID = indexID;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public int getIndexVacancy() {
		return vacancy;
	}

	public void setIndexVacancy(int vacancy) {
		this.vacancy = vacancy;
	}

	public Schedule getIndexSchedule() {
		return schedule;
	}
}