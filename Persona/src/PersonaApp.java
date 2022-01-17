
public class PersonaApp {

	public static void main(String[] args) {

		Persona persona1 = new Persona("12345678A");
		Persona persona2 = new Persona("12345678A", "Joan", 22, 'H');
		Persona persona3 = new Persona("12345678B", "Olga", 22, 'm', 54.3, 161.2);
		
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);

	}

}
