package ficheros;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import interfaces.InterfazEjercicios1_3;

/**
 * 
 * @author Escribe_aqui_tu_nombre
 * @date 
 * @version 
 * @license GPLv3
 *
 */
public class Ejercicios1_3 implements InterfazEjercicios1_3 {

	
	
	@Override
	public List<String> getFrases(Scanner escaner) {

		String frasecita = "";
		List<String> frases = new ArrayList<String>();

		while (!(frasecita=escaner.nextLine()).equals("salir")) {
			frases.add(frasecita);
		}
		return frases;
	}

	@Override
	public Path getNombre(Scanner escaner) {
		Path pa = null;
		try {
			pa = Paths.get(escaner.nextLine());

			if (!Files.exists(pa)) {
				System.out.println("El fichero no existe en el directorio actual");
			}

		}catch (Exception e) {
			e.printStackTrace();
		}

		return pa;
	}
	
	@Override
	public void escribefrases(Path ruta) {

		try {



			BufferedWriter bw= new BufferedWriter(new FileWriter(ruta.toString()));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void leerFrases(Path ruta) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void escribirFlotante(float numeroDecimal, String ruta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Float> leerFlotante(String ruta) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
		
		


}
