import dao.PokemonDAO;
import dao.PokemonDAOImp;
import modelo.Pokemon;
import ficheros.Ejercicios1_3;
import dao.AulaDAOImp;
import modelo.Alumno;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.nio.file.Paths;

public class Main {
	
	public static void main(String[] args) {

		//Pruebas ejercicio 1
		PokemonDAOImp po = new PokemonDAOImp();
		po.escribirPokemon("cosita.csv","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",100,500,2,6,5,5);
		po.escribirPokemon("cosita.csv","asdfdasfadffddf",100,500,2,6,5,5);
		po.escribirPokemon("cosita.csv","pefafdsadfdffsfasfne",100,500,2,6,5,5);
		po.escribirPokemon("cosita.csv","fasdffffsaf",100,500,2,6,5,5);
		po.escribirPokemon("cosita.csv","fdasfffdfdsa",100,500,2,6,5,5);
		po.escribirPokemon("cosita.csv","fdsafffffffffffffff",100,500,2,6,5,5);
		po.escribirPokemon("cosita.csv","micha",100,500,2,6,5,5);

		//Pruebas ejercicio 2
		po.imprimirPokemon("cosita.csv");

		//Pruebas Aula
		AulaDAOImp aula = new AulaDAOImp(2);
		aula.add(new Alumno("Paco","Hernandez Paine",500,"Calle del Melon",69));
		aula.add(new Alumno("Pedro","Hernandez Paine",500,"Calle del Melon",69));

		aula.escribeAlumnos(Paths.get("Alum.txt"));
		aula.leeAlumnos(Paths.get("Alum.txt"));
	}

}
