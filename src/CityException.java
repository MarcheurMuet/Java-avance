
public class CityException {
	
	 private String name;
	    private int people;
	    private String country;
	    static int cityNumb = -1;

		static int cityNumbration = -1;

		

		final int MIN_CITY_PEOPLE = 0;

		final static int MIN_CITY = 0;
		
	public static void main(String[] args) {
		
		try {
			if (cityNumbration <= MIN_CITY)
				throw new RuntimeException("Le nombre de ville doit être positif!");
		} catch (Exception e) {
				// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nLe total de ville est de : " +  cityNumb);
	}
}