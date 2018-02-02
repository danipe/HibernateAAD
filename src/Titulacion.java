
public class Titulacion {
	int id;
	String nombre, abreviatura, horas;
	
	public Titulacion() {
		
	}
	
	public Titulacion(String n, String a, String h) {
		this.nombre = n;
		this.abreviatura = a;
		this.horas = h;
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

	public String getAbreviatura() {
		return abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}
	
	
}
