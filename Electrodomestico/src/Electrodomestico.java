
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
		
		if(color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris"))
		{
			this.color = color;
		}
		else
		{
			this.color = COLOR_DEFAULT;
		}

		if(consumo >= 65 && consumo <= 70)
		{
			this.consumo = consumo;
		}
		else if((consumo - 32) >= 65 && (consumo - 32) <= 70)
		{
			this.consumo = (char)(consumo - 32);
		}
		else
		{
			this.consumo = CONSUMO_DEFAULT;
		}
	}

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
