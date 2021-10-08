import dao.AulaDAOImp;
import modelo.Alumno;

import java.nio.file.Paths;

public class Main {
	
	public static void main(String[] args) {



		AulaDAOImp aula = new AulaDAOImp(2);
		aula.add(new Alumno("Paco","Hernandez Paine",500,"Calle del Melon",69));
		aula.add(new Alumno("Pedro","Hernandez Paine",500,"Calle del Melon",69));

		aula.escribeAlumnos(Paths.get("Alum.txt"));
		aula.leeAlumnos(Paths.get("Alum.txt"));
	}

}
