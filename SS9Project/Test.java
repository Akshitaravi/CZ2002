package SS9Project;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 * This is a test file for functionality
 */

public class Test {
	public static Date convertTime(String s) {
		DateFormat df = new SimpleDateFormat("HH:mm");
		Date date = null;
		try {
			date = df.parse(s);
		} catch (Exception e) {
			System.out.println("Exception Occured >> " + e.getMessage());
		}
		return date;
	}

	public static void main(String[] Argz) {
		ArrayList<Index> totalindex = new ArrayList<Index>();

		// Index(int indexID, String courseID, int vacancy, Schedule schedule)
		// Schedule(int inID, int dLab, int dL1, int dL2, int dTut, Date tLab, Date tL1,
		// Date tL2, Date tTut, String vLab, String vL1, String vL2, String vTut,
		// boolean wk) {

		Schedule nSchedule = new Schedule(19201, 4, 2, 5, 3, convertTime("14:30"), convertTime("09:30"),
				convertTime("11:30"), convertTime("10:30"), "SWLAB1", "LT2A", "LT2A", "LHN TR+17", true);

		Index index = new Index(19201, "CZ2002", 10, nSchedule);
		totalindex.add(index);

		Course nCourse = new Course("OBJECT ORIENTED DESIGN & PROGRAMMING", "CZ2002", totalindex);

		try {
			FileOutputStream fos = new FileOutputStream("data/testCourse.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(nCourse);
			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("Exception Occured >> " + e.getMessage());
		}
	}
}