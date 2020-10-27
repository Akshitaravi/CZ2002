package SS9Project;

import java.io.Serializable;
import java.util.Date;

/*
 * Each admin user.
 *
 * Done by AKSHITA RAVISANKAR, HOO KAH JUN, JEWELLE LIM FONG YEE, LEE YU JIE MELVIN, PUVVADA MEGHANA
 */
public class Admin extends User implements Serializable {
	private String admin;

	public Admin(String name, String username, String password, String nric, Date dob, int contact, boolean gender,
			String nationality, String blockNo, String streetName, String cityName, String postalCode) {
		super(name, username, password, nric, dob, contact, gender, nationality, blockNo, streetName, cityName,
				postalCode);
		this.admin = "admin";
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}
}