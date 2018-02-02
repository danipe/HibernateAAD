
public class Profesor {
	int id;
	String nombre, horario;
	
	public Profesor() {
		
	}
	
	public Profesor(String n, String h) {
		this.nombre = n;
		this.horario = h;
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

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	
}
