
public class Password {
	 
	private final String CARACTERES = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	private int longitud;
	private String contraseña;
	
	public Password()
	{
		this.longitud = 8;
		this.contraseña = passRandom(8);
	}
	
	public Password(int longitud)
	{
		this.longitud = longitud;
		this.contraseña = passRandom(longitud);
	}

	private String passRandom(int longitud2) {

		String str = "";
		
		for (int i = 0; i < longitud2; i++) 
		{
			str += (char)((CARACTERES.charAt((int)(Math.random() * CARACTERES.length()))));
		}
		
		return str;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}

}
