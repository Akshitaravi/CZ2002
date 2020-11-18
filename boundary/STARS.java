package boundary;

import java.io.Console;
import java.util.Scanner;

/*
 * Main Application
 *
 * Done by AKSHITA RAVISANKAR, HOO KAH JUN, JEWELLE LIM FONG YEE, LEE YU JIE MELVIN, PUVVADA MEGHANA
 */

public class STARS {
	private static boolean isAuthenticated = false;
	private static Scanner sc = new Scanner(System.in);
	private static String username = "", password = "";

	public static void main(String argz[]) {
		showWelcome();
		if (login()) {
			//if (user.getAccountType() == 'S') {
			//	StudentMenu.display(user);
			//} else {
			//	AdminMenu.display(user);
			//}
		}
	}

	public static void showWelcome() {
		System.out.println("==========================================================");
		System.out.println("|             _____ _____ ___  ______  _____             |");
		System.out.println("|            /  ___|_   _/ _ \\ | ___ \\/  ___|            |");
		System.out.println("|            \\ `--.  | |/ /_\\ \\| |_/ /\\ `--.             |");
		System.out.println("|             `--. \\ | ||  _  ||    /  `--. \\            |");
		System.out.println("|            /\\__/ / | || | | || |\\ \\ /\\__/ /            |");
		System.out.println("|            \\____/  \\_/\\_| |_/\\_| \\_|\\____/             |");
		System.out.println("|                                                        |");
		System.out.println("|    Welcome to Student Automated Registration System    |");
		System.out.println("|       All connections are monitored and recorded       |");
		System.out.println("|        Unauthorised access will be prosecuted.         |");
		System.out.println("==========================================================");
	}

	private static boolean login() {
		Console cs = System.console();
		while (!isAuthenticated) {// while not authenticated
			System.out.print("Username : ");
			username = sc.nextLine().toUpperCase();
			System.out.print("Password : ");
			if (cs != null)
				password = new String(cs.readPassword());
			else
				password = sc.nextLine();

			if (!username.isEmpty() & !password.isEmpty()) {
			//Checking algorithm
				//String hashedPassword = generateHashedPassword(passWord);
				//user = DBController.validateUser(userName, hashedPassword);
				//if (user != null) {
				//	isAuthenticated = true;
				//	return isAuthenticated;
				//} else
				//	System.out.println("\t	Invalid username or password. Please try again. ");
			} else
				System.out.println("Please enter username and password.");
		}
		return false;
	}
}