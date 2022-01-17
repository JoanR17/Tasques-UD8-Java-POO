
public class Password {
	 
	private final String CARACTERES = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	private int longitud;
	private String password;
	
	public Password()
	{
		this.longitud = 8;
		this.password = passRandom(8);
	}
	
	public Password(int longitud)
	{
		this.longitud = longitud;
		this.password = passRandom(longitud);
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + password + "]";
	}

}
