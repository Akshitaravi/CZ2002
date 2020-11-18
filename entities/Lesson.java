package entities;

import java.io.Serializable;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
	public boolean isTimeClashBLesson(ArrayList<Lesson> newlist) {
		boolean isClash = false;
		try {
			Date thisstarttime = new SimpleDateFormat("HHmm").parse(this.getStarttime());
			Date thisendtime = new SimpleDateFormat("HHmm").parse(this.getEndtime());

			for (int i = 0; i < newlist.size(); i++) {
				if (this.day.equals(newlist.get(i).getDay())) {
					if ((this.week.equals("EVEN") & newlist.get(i).getWeek().equals("ODD"))
							| (this.week.equals("ODD") & newlist.get(i).getWeek().equals("EVEN"))) {
						continue;
					}
					Date newstarttime = new SimpleDateFormat("HHmm").parse(newlist.get(i).getStarttime());
					Date newendtime = new SimpleDateFormat("HHmm").parse(newlist.get(i).getEndtime());

					if (newstarttime.equals(thisstarttime)
							| (newstarttime.before(thisendtime) & newstarttime.after(thisstarttime)))
						isClash = true;
					else if (newendtime.equals(thisendtime)
							| (newendtime.after(thisstarttime) & newendtime.before(thisendtime)))
						isClash = true;
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (isClash)
			return true;
		else
			return false;
	}
}
