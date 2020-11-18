package entities;

import java.io.Serializable;
import java.util.Date;

/*
 * Each admin user.
 *
 * Done by AKSHITA RAVISANKAR, HOO KAH JUN, JEWELLE LIM FONG YEE, LEE YU JIE MELVIN, PUVVADA MEGHANA
 */
public class Admin extends User implements Serializable {

		// the ID of the Staff
		private String staffID;
	
		//create an admin
		public Admin() {
			super();
		}
	
		//Gets the staff  ID of this Admin.
		public String getStaffID() {
			return staffID;
		}
	
		//change staff ID of this admin
		public void setStaffNo(String staffNo) {
			this.staffNo = staffNo;
		}
	
	}
