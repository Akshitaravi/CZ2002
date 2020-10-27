package SS9Project;

import java.io.Serializable;
import java.util.Date;

/*
 * Each User consists of their basic identiy information
 *
 * Done by AKSHITA RAVISANKAR, HOO KAH JUN, JEWELLE LIM FONG YEE, LEE YU JIE MELVIN, PUVVADA MEGHANA
 */

public class User implements Serializable {
	// Name of student
	private String name;
	// Network Account
	private String username;
	// Network Password
	private String password;
	// User NRIC/FIN
	private String nric;
	// Date of Birth
	private Date dob;
	// Contact No
	private int contact;
	// Gender (True = Male, False = Female)
	private boolean gender;
	// Nationality
	private String nationality;
	// Residential Address
	private String blockNo;
	private String streetName;
	private String cityName;
	private String postalCode;

	public User(String name, String username, String password, String nric, Date dob, int contact, boolean gender,
			String nationality, String blockNo, String streetName, String cityName, String postalCode) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.nric = nric;
		this.contact = contact;
		this.dob = dob;
		this.contact = contact;
		this.gender = gender;
		this.nationality = nationality;
		this.blockNo = blockNo;
		this.streetName = streetName;
		this.cityName = cityName;
		this.postalCode = postalCode;
	}
}