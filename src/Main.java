import java.util.ArrayList;

import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtilities.getSessionFactory().openSession();
		session.beginTransaction();
		Profesor p1 = new Profesor("Juanmi","17:00-20:00");
		Profesor p2 = new Profesor("Belén","13:00-16:00");
		session.save(p1);
		session.save(p2);
		Titulacion t1 = new Titulacion("Desarrollo de Aplicaciones Multiplataforma","DAM","400");
		Titulacion t2 = new Titulacion("Desarrollo de Aplicaciones Web","DAW","400");
		session.save(t1);
		session.save(t2);
		ArrayList<Tema> temas1 = new ArrayList<Tema>();
		temas1.add(new Tema("Firebase","100"));
		temas1.add(new Tema("Hibernate","70"));
		Asignatura a1 = new Asignatura("Acceso a Datos","120",temas1);
		ArrayList<Tema> temas2 = new ArrayList<Tema>();
		temas2.add(new Tema("Procesos","100"));
		temas2.add(new Tema("Servicios","70"));
		Asignatura a2 = new Asignatura("Procesos y Servicios","180",temas2);
		session.save(a1);
		session.save(a2);
		session.getTransaction().commit();
		session.close();
		HibernateUtilities.getSessionFactory().close();
	}

}
