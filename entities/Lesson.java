package entities;

import java.io.Serializable;
import java.util.Date;

/*
 * Each Lesson represent a type of lesson in a schedule.
 *
 * Done by AKSHITA RAVISANKAR, HOO KAH JUN, JEWELLE LIM FONG YEE, LEE YU JIE MELVIN, PUVVADA MEGHANA
 */

public class Lesson implements Serializable {
	// Lesson belong to which index
	private int indexID;
	// Lesson type
	private String lessonType;
	// Lesson fall on which day (1 = Mon, 5 = Fri)
	private int day;
	// Lab Odd/Even Week. (true = Odd Week)
	private boolean labWeek;
	// Start time of the lesson
	private Date startTime;
	// Venue of the lesson
	private String venue;

	public Lesson(int indexID, String lessonType, int day, boolean labWeek, Date st, String venue) {
		this.indexID = indexID;
		this.lessonType = lessonType;
		this.day = day;
		this.labWeek = labWeek;
		this.startTime = st;
		this.venue = venue;
	}

	public int getIndexID() {
		return indexID;
	}

	public void setIndexID(int indexID) {
		this.indexID = indexID;
	}

	public int getLessonDay() {
		return day;
	}

	public void setLessonDay(int day) {
		this.day = day;
	}

	public boolean getLessonWeek() {
		return labWeek;
	}

	public void setLessonWeek(boolean labWeek) {
		this.labWeek = labWeek;
	}

	public Date getLessonStartTime() {
		return startTime;
	}

	public Date getLessonEndTime() {
		if (this.lessonType == "Lab")
			return new Date(this.startTime.getTime() + 7200000);
		else
			return new Date(this.startTime.getTime() + 3600000);
	}

	public void setLessonStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}
}