package control;

import java.io.File;
import java.io.FileWriter;

public class FileReadWrite {
	// Create a new file
	public void CreateFile(String filename) {
		try {
			File fo = new File(filename);
			if (fo.exists())
				fo.delete();
			fo.createNewFile();
			System.out.println("File created: " + fo.getName());
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public void CreateFile(String filename, String path) {
		try {
			File fo = new File(path + "/" + filename);
			if (fo.exists())
				fo.delete();
			fo.createNewFile();
			System.out.println("File created: " + fo.getName());
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	// Append Write File
	public void WriteToFile(String filename, String text) {
		try {
			// Try writing into a file
			// FileWriter(File file, boolean append)
			FileWriter fw = new FileWriter(filename, true);
			// Append the text to the bottom of the file
			fw.write(text);
			// Close Filewriter to save memory
			fw.close();
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public void WriteToFile(String filename, String path, String text) {
		try {
			// Try writing into a file
			// FileWriter(File file, boolean append)
			FileWriter fw = new FileWriter(path + "/" + filename, true);
			// Append the text to the bottom of the file
			fw.write(text);
			// Close Filewriter to save memory
			fw.close();
		} catch (Exception e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}