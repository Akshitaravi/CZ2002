package entities;

import control.FileReadWrite;

public class Test2 {
	public static void main(String Argz[]) {
		FileReadWrite rw = new FileReadWrite();
		String filename = "test.ics";

		rw.CreateFile(filename);
		rw.WriteToFile(filename, "BEGIN:VCALENDAR\n");
		rw.WriteToFile(filename, "PRODID:-//Google Inc//Google Calendar 70.9054//EN\n");
		rw.WriteToFile(filename, "VERSION:2.0\n");
		rw.WriteToFile(filename, "CALSCALE:GREGORIAN\n");
		rw.WriteToFile(filename, "METHOD:PUBLISH\n\n");

		rw.WriteToFile(filename, "BEGIN:VTIMEZONE\n");
		rw.WriteToFile(filename, "TZID:Asia/Singapore\n");
		rw.WriteToFile(filename, "BEGIN:STANDARD\n");
		rw.WriteToFile(filename, "TZOFFSETFROM:+0800\n");
		rw.WriteToFile(filename, "TZOFFSETTO:+0800\n");
		rw.WriteToFile(filename, "TZNAME:+08\n");
		rw.WriteToFile(filename, "DTSTART:19700101T000000\n");
		rw.WriteToFile(filename, "END:STANDARD\n");
		rw.WriteToFile(filename, "END:VTIMEZONE\n");

		// Event 1
		rw.WriteToFile(filename, "BEGIN:VEVENT\n");
		rw.WriteToFile(filename, "DTSTART;TZID=Asia/Singapore:20200810T183000\n");
		rw.WriteToFile(filename, "DTEND;TZID=Asia/Singapore:20200810T193000\n");
		rw.WriteToFile(filename,
				"RDATE;TZID=Asia/Singapore:20200817T183000,20200824T183000,20200831T183000,20200907T183000,20200914T183000,20200921T183000,20201005T183000,20201012T183000,20201019T183000,20201026T183000,20201102T183000,20201109T183000\n");
		rw.WriteToFile(filename, "LOCATION:LT2A\n");
		rw.WriteToFile(filename, "SUMMARY:[LEC] [CZ2000] [CS2] Introduction to Computer Science\n");
		rw.WriteToFile(filename, "END:VEVENT\n");

		// Event 2
		rw.WriteToFile(filename, "BEGIN:VEVENT\n");
		rw.WriteToFile(filename, "DTSTART;TZID=Asia/Singapore:20200814T183000\n");
		rw.WriteToFile(filename, "DTEND;TZID=Asia/Singapore:20200814T193000\n");
		rw.WriteToFile(filename, "RRULE;TZID=Asia/Singapore:FREQ=WEEKLY;BYDAY=FR;COUNT=14\n");
		rw.WriteToFile(filename, "EXDATE:20201002T183000\n");
		rw.WriteToFile(filename, "LOCATION:LT2A\n");
		rw.WriteToFile(filename, "SUMMARY:[LEC] [CZ2000] [CS2] Introduction to Computer Science\n");
		rw.WriteToFile(filename, "END:VEVENT\n");

		rw.WriteToFile(filename, "END:VCALENDAR\n");

	}
}
