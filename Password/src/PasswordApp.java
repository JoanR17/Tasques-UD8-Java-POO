
public class PasswordApp {

	public static void main(String[] args) {

		Password pass1 = new Password();
		Password pass2 = new Password(16);
		
		System.out.println(pass1);
		System.out.println(pass2);
	}

}
