import java.util.List;

public class Asignatura {
	int id;
	String nombre, horas;
	List<Tema> temas;
	
	public Asignatura() {
		
	}
	
	public Asignatura(String n, String h, List<Tema> temas) {
		this.nombre = n;
		this.horas = h;
		this.temas = temas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

	public List<Tema> getTemas() {
		return temas;
	}

	public void setTemas(List<Tema> temas) {
		this.temas = temas;
	}
	
	
	
}
