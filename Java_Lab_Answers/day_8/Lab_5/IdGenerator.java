package day_8.Lab_5;

public class IdGenerator {
	private static long genIdEmp=1891;
	private static long genIdCust=1011;
	public static long generateIdEMP() {
		return genIdEmp++;
	}
	public static long generateIdCust() {
		return genIdCust++;
	}
}
