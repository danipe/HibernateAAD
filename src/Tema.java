
public class Tema {
	int id;
	String titulo, duracion;
	
	public Tema() {
		
	}
	
	public Tema(String t, String d) {
		this.titulo = t;
		this.duracion = d;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	
	
}
