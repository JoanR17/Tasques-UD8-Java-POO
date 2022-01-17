
public class SerieApp {

	public static void main(String[] args) {

		Serie s1 = new Serie();
		Serie s2 = new Serie("Arcane", "League of Legends");
		Serie s3 = new Serie("Arcane", "League of Legends", "Accion", 2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
