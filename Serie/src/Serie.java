
public class Serie {

	private String titulo, creador, genero;
	private int numTemporadas;
	private boolean entregado;
	
	public Serie()
	{
		this.titulo = "";
		this.genero = "";
		this.creador = "";
		this.numTemporadas = 3;
		this.entregado = false;
	}
	
	public Serie(String titulo, String creador)
	{
		this.titulo = titulo;
		this.genero = "";
		this.creador = creador;
		this.numTemporadas = 3;
		this.entregado = false;
	}

	public Serie(String titulo, String creador, String genero, int numTemporadas) 
	{
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.numTemporadas = numTemporadas;
		this.entregado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", creador=" + creador + ", genero=" + genero + ", numTemporadas="
				+ numTemporadas + ", entregado=" + entregado + "]";
	}
	
}
