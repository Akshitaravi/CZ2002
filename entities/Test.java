package entities;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 * This is a test file for functionality
 */

public class Test {
	
	public static ArrayList<Student>listofStudents;
	public static ArrayList<Course>listofCourse;
	public static ArrayList<Index>totalindex;
	
	
	
	
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
		// Get Data
		//ArrayList<Course> listofCourse = new ArrayList<Course>();

		try {
			FileInputStream fis = new FileInputStream("data/testCourse.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			listofCourse = (ArrayList) ois.readObject();
			ois.close();
			fis.close();

			for (int i = 0; i < listofCourse.size(); i++)
				System.out.println(listofCourse.get(i));
		} catch (Exception e) {
			System.out.println("Exception Occured >> " + e.getMessage());
		}

		// Insert Data (Course)
		Course nCourse = new Course();
		nCourse.setCourseID("CZ2002");
		nCourse.setCourseName("OBJECT ORIENTED DESIGN & PROGRAMMING");
		//ArrayList<Index> totalindex = new ArrayList<Index>();
		ArrayList<Lesson> nSchedule = new ArrayList<Lesson>();

		Index index = new Index();
		index.setIndexID(19201);
		index.setCourse(nCourse);

		Lesson lesson = new Lesson(19201, "Lab", 4, true, convertTime("14:30"), "SWLAB1");
		nSchedule.add(lesson);
		lesson = new Lesson(19201, "Lec", 2, false, convertTime("09:30"), "LT2A");
		nSchedule.add(lesson);
		lesson = new Lesson(19201, "Lec", 5, false, convertTime("11:30"), "LT2A");
		nSchedule.add(lesson);
		lesson = new Lesson(19201, "Tut", 3, false, convertTime("10:30"), "LHN TR+17");
		nSchedule.add(lesson);

		index.setSchedule(nSchedule);
		totalindex.add(index);
		nCourse.setCourseIndex(totalindex);
		listofCourse.add(nCourse);

		try {
			FileOutputStream fos = new FileOutputStream("data/testCourse.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(listofCourse);
			oos.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("Exception Occured >> " + e.getMessage());
		}

		// Insert Data ( Admin)
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
