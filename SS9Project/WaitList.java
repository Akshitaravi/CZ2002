package SS9Project;

//import entities.Index;

/*
 * Represents the waitlist an Index has.
 *
 * Done by AKSHITA RAVISANKAR, HOO KAH JUN, JEWELLE LIM FONG YEE, LEE YU JIE MELVIN, PUVVADA MEGHANA
 */

public class WaitList {
	// index number this waitlist is for
	private String IndexID;
	// number of students in this waitlist
	private String numberOfStudentWaitList;
	// list of students in this waitlist: with their matric numbers
	private String[] studentWaitList;
	// index this waitlist belongs to
	private Index Index;

	// create a new waitlist
	public WaitList() {
	}

	// get index number this waitlist is for
	public String getIndexID() {
		return IndexID;
	}

	// change index number this waitlist belongs to
	public void setIndexID(String IndexID) {
		this.IndexID = IndexID;
	}

	// get index number this waitlist belongs to
	public Index getIndex() {
		return Index;
	}

	// change the index this waitlist belongs to
	public void setIndex(Index index) {
		Index = index;
	}

	// gets number of students in this waitlist
	public String getNumberOfStudentWaitList() {
		return numberOfStudentWaitList;
	}

	// changes number of students in this waitlist
	public void setNumberOfStudentWaitList(String numberOfStudentWaitList) {
		this.numberOfStudentWaitList = numberOfStudentWaitList;
	}

	// gets list of students in this waitlist: with their matric numbers
	public String[] getStudentWaitList() {
		return studentWaitList;
	}

	// changes list of students in this waitlist: with their matric numbers
	public void setStudentWaitList(String[] studentWaitList) {
		this.studentWaitList = studentWaitList;
	}

}
