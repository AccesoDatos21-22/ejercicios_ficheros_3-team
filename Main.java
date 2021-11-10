import dao.AulaDAOImp;
import dao.PokemonDAOImp;
import ficheros.Ejercicios1_3;
import modelo.Alumno;
import modelo.Pokemon;

import java.nio.file.Paths;
import java.util.Scanner;

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


		//Pruebas escribir frases
		Ejercicios1_3 ej = new Ejercicios1_3();
		Scanner sc = new Scanner(System.in);
//		System.out.println("¿Cual es el nombre del fichero?");
//		Path pa = ej.getNombre(sc);
//		System.out.println("Frases (salir para salir)");
//		List<String> li = ej.getFrases(sc);
//		ej.escribefrases(li,pa);
//		ej.leerFrases(pa);

		//Pruebas flotante
		ej.escribirFlotante(50,"Flotante.txt");
		ej.imprimirFlotante("Flotante.txt");
		sc.close();

		//Pruebas pokemones
		Pokemon pokimon = new Pokemon();
		PokemonDAOImp poli = new PokemonDAOImp();
		poli.add(pokimon);
		poli.escribirPokemon("ob.bin",pokimon);
//		List<Pokemon> list = poli.leerPokemon("ob.bin");
//		System.out.println(list);

		//Pruebas aula
		AulaDAOImp aula = new AulaDAOImp(2);
		aula.add(new Alumno("Paco","Hernandez Paine",500,"Calle del Melon",69));
		aula.add(new Alumno("Pedro","Hernandez Paine",500,"Calle del Melon",69));
		aula.escribeAlumnos(Paths.get("Alum.txt"));
		aula.leeAlumnos(Paths.get("Alum.txt"));
	}

}
