import java.util.*;

public class FoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		Date today = new Date(0);
		try {
		System.out.println(date.getClass().getName());
		System.out.println(today.getClass().getName());
		} catch (NullPointerException e) { // il catch ça puisque la date était Null à la base
			System.out.println(e);
		}
	}
}