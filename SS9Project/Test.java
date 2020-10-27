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

	public static Date newDate(String s) {
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
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

		ArrayList<Admin> totaladmin = new ArrayList<Admin>();
		Admin admin1 = new Admin("Tan Kheng Leong", "KHENGLEONG", "P@ssw0rd", "S1234567A", newDate("1970-01-01"),
				87654321, true, "SG", "50", "Nanyang Avenue", "Singapore", "639798");
		totaladmin.add(admin1);

		try {
			FileOutputStream fos = new FileOutputStream("data/testAdmin.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(totaladmin);
			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("Exception Occured >> " + e.getMessage());
		}

	}
}