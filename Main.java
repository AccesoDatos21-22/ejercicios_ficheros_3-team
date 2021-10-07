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

		Ejercicios1_3 ej = new Ejercicios1_3();
		Scanner sc = new Scanner(System.in);
		/*System.out.println("¿Cual es el nombre del fichero?");*/
		/*Path pa = ej.getNombre(sc);*/

		/*List<String> li = ej.getFrases(sc);*/

	/*	ej.leerFrases(pa);*/
		/*System.out.println(ej.leerFlotante("pene.txt"));*/
		ej.imprimirFlotante("pene.txt");
		sc.close();
	}

}
