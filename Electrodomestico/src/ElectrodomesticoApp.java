
public class ElectrodomesticoApp {

	public static void main(String[] args) {

		Electrodomestico el1 = new Electrodomestico();
		Electrodomestico el2 = new Electrodomestico(225.35, 45.25);
		Electrodomestico el3 = new Electrodomestico(456.23, 84.64, "Gris", 'b');
		Electrodomestico el4 = new Electrodomestico(456.23, 84.64, "verde", 'h');

		System.out.println(el1);
		System.out.println(el2);
		System.out.println(el3);
		System.out.println(el4);
	}

}
