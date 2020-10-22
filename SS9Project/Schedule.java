package SS9Project;

import java.io.Serializable;
import java.util.Date;

/*
 * Each Schedule represent a schedule for a class.
 *
 * Done by AKSHITA RAVISANKAR, HOO KAH JUN, JEWELLE LIM FONG YEE, LEE YU JIE MELVIN, PUVVADA MEGHANA
 */
public class Schedule implements Serializable {
	private Lesson lab, lec1, lec2, tut;

	public Schedule(int inID, int dLab, int dL1, int dL2, int dTut, Date tLab, Date tL1, Date tL2, Date tTut,
			String vLab, String vL1, String vL2, String vTut, boolean wk) {

		this.lab = new Lesson(inID, "Lab", dLab, wk, tLab, vLab);
		this.lec1 = new Lesson(inID, "Lec", dL1, false, tL1, vL1);
		this.lec2 = new Lesson(inID, "Lec", dL2, false, tL2, vL2);
		this.tut = new Lesson(inID, "Tut", dTut, false, tTut, vTut);
	}
}