
public class Persona {
	
	private String nombre, dni;
	private int edad;
	private char sexo;
	private double peso, altura;
	private final char SEXO_DEFAULT = 'H';

	public Persona(String dni)
	{
		this.nombre = "";
		this.edad = 0;
		this.sexo = SEXO_DEFAULT;
		this.dni = dni;
		this.peso = 0.0;
		this.altura = 0.0;
	}
	
	public Persona(String dni, String nombre, int edad, char sexo)
	{
		this.nombre = nombre;
		this.edad = edad;
		if(sexo == 72 || sexo == 77)
		{
			this.sexo = sexo;
		}
		else if((sexo - 32) == 72 || (sexo - 32) == 77)
		{
			this.sexo = (char)(sexo - 32);
		}
		else
		{
			this.sexo = SEXO_DEFAULT;
		}
		this.dni = dni;
		this.peso = 0.0;
		this.altura = 0.0;
	}
	
	public Persona(String dni, String nombre, int edad, char sexo, double peso, double altura)
	{
		this.nombre = nombre;
		this.edad = edad;
		if(sexo == 72 || sexo == 77)
		{
			this.sexo = sexo;
		}
		else if((sexo - 32) == 72 || (sexo - 32) == 77)
		{
			this.sexo = (char)(sexo - 32);
		}
		else
		{
			this.sexo = SEXO_DEFAULT;
		}
		this.dni = dni;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
}
