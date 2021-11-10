package ficheros;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

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
	public void escribefrases(List<String> cadenas, Path ruta) {
		Iterator<String> it = cadenas.iterator();
		String frase;
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(ruta.toString(),true));
//			System.out.println("Mete las frases");

			while (it.hasNext()) {
				bw.write(it.next()+"\r\n");
			}
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

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
	public void leerFrases(Path ruta) {
		// TODO Auto-generated method stub
		try {
			System.out.println(Files.readAllLines(ruta));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void escribirFlotante(float numeroDecimal, String ruta) {
		// TODO Auto-generated method stub
		try {
			DataOutputStream fos = new DataOutputStream(new FileOutputStream(ruta));
			fos.writeFloat(numeroDecimal);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Float> leerFlotante(String ruta) {

		List<Float> lista = new ArrayList<Float>();
		DataInputStream di = null;
		try {
			di = new DataInputStream(new FileInputStream(ruta));
			Float flo ;

			while (di.available() > 0) {
				lista.add(di.readFloat());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				di.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return lista;
	}

	public void imprimirFlotante(String ruta) {
		DataInputStream di = null;
		try {
			di = new DataInputStream(new FileInputStream(ruta));
			Float flo ;

			while (di.available() > 0) {
				System.out.println(di.readFloat());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				di.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
	
		
		


}
