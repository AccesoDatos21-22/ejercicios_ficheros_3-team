import dao.PokemonDAO;
import dao.PokemonDAOImp;
import modelo.Pokemon;
import ficheros.Ejercicios1_3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
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
		System.out.println("¿Cual es el nombre del fichero?");
		Path pa = ej.getNombre(sc);
		System.out.println("Frases (salir para salir)");
		List<String> li = ej.getFrases(sc);
		ej.escribefrases(li,pa);
		ej.leerFrases(pa);

		//Pruebas flotante
		ej.escribirFlotante(50,"Flotante.txt");
		ej.imprimirFlotante("Flotante.txt");
		sc.close();
	}

}
