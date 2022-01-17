
public class Electrodomestico {
	
	private final String COLOR_DEFAULT = "blanco";
	private final double PRECIO_DEFAULT = 100;
	private final char CONSUMO_DEFAULT = 'F';
	private final double PESO_DEFAULT = 5;
	
	protected double precioBase, peso;
	protected String color;
	protected char consumo;

	public Electrodomestico() 
	{
		this.precioBase = PRECIO_DEFAULT;
		this.peso = PESO_DEFAULT;
		this.color = COLOR_DEFAULT;
		this.consumo = CONSUMO_DEFAULT;
	}

	public Electrodomestico(double precioBase, double peso) 
	{
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR_DEFAULT;
		this.consumo = CONSUMO_DEFAULT;
	}

	public Electrodomestico(double precioBase, double peso, String color, char consumo) 
	{
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = validarColor(color);
		this.consumo = validarConsumo(consumo);
	}

	//Validadores
	private String validarColor(String color2) 
	{
		if(color2.equalsIgnoreCase("blanco") || color2.equalsIgnoreCase("negro") || color2.equalsIgnoreCase("rojo") || color2.equalsIgnoreCase("azul") || color2.equalsIgnoreCase("gris"))
		{
			return color2.toLowerCase();
		}
		
		return COLOR_DEFAULT;
	}

	private char validarConsumo(char consumo2) 
	{
		if(consumo2 >= 65 && consumo2 <= 70)
		{
			return consumo2;
		}
		else if((consumo2 - 32) >= 65 && (consumo2 - 32) <= 70)
		{
			return (char)(consumo2 - 32);
		}
		
		return CONSUMO_DEFAULT;
	}

	//Getters y Setters
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + "€, peso=" + peso + "Kg, color=" + color + ", consumo="
				+ consumo + "]";
	}
	

}
