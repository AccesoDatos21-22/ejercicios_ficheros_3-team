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

		PokemonDAOImp po = new PokemonDAOImp();
		po.escribirPokemon("cosita.csv","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",100,500,2,6,5,5);
		po.escribirPokemon("cosita.csv","asdfdasfadffddf",100,500,2,6,5,5);
		po.escribirPokemon("cosita.csv","pefafdsadfdffsfasfne",100,500,2,6,5,5);
		po.escribirPokemon("cosita.csv","fasdffffsaf",100,500,2,6,5,5);
		po.escribirPokemon("cosita.csv","fdasfffdfdsa",100,500,2,6,5,5);
		po.escribirPokemon("cosita.csv","fdsafffffffffffffff",100,500,2,6,5,5);
		po.escribirPokemon("cosita.csv","micha",100,500,2,6,5,5);

		po.imprimirPokemon("cosita.csv");

		ej.leerFrases(pa);
		System.out.println(ej.leerFlotante("pene.txt"));
		ej.imprimirFlotante("pene.txt");
		sc.close();
	}

}
