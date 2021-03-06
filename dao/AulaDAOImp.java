/**
 *AulaDAOImp.java
 *@author Laura y Carlos
 *@version 1.0
 */

package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import modelo.Alumno;

/**
 *  @descrition AulaDAOImp
 *	@author Laura y Carlos
 *  @date 18/9/2021
 *  @version 1.0
 *  @license GPLv3
 */
public class AulaDAOImp implements AulaDAO{
	private List<Alumno> alumnos;
	private int numalumnos; // atributo para controlar el número real de
							// elementos que tiene nuestro almacén

	/**
	 * Constructor del Almacén con un determinado tamano
	 * 
	 * @param tamano
	 */
	public AulaDAOImp(int tamano) {
		alumnos = new ArrayList<Alumno>(tamano);
		numalumnos = tamano;

	}

	/**
	 * Comprueba si el almacén está vacio
	 * 
	 * @return true si está vacio
	 */
	public boolean estaVacio() {
		return false;
	}

	/**
	 * Comprueba si el almacén está lleno
	 * 
	 * @return
	 */
	public boolean estaLLeno() {
		return false;
	}

	/**
	 * Anade un nuevo elemento al almacén si hay sitio
	 * 
	 * @param valor a anadir al almacén
	 */
	public void add(Alumno alumno) {
		alumnos.add(alumno);
	}

	/**
	 * Elimina un elemento del almacén si está en el almacen
	 * 
	 * @param valor
	 * @return true si elimina el elemento, false en caso contrario
	 */
	public boolean eliminar(Alumno alumno) {
		return false;

	}

	/**
	 * Imprime por pantalla los elementos del almacén
	 */
	public void informacionAlumnos() {
		
	}

	/**
	 * Método que escribe los alumnos en un archivo
	 * 
	 * @param ruta
	 */
	public void escribeAlumnos(Path ruta) {
		String cosita;
		try {
			for(Alumno alu:alumnos) {
				cosita = "Nombre: "+ alu.getNombre() +
						"\tApellidos: "+alu.getApellidos()+
						"\tFecha de naciemineto: "+alu.getAnoNacimiento()+
						"\tDireccion: "+alu.getDireccion()+"\n";


					Files.writeString(ruta, cosita, StandardOpenOption.APPEND);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Método que lee alumnos de un archivo y los muestra por pantalla
	 * 
	 * @param ruta
	 */
	public void leeAlumnos(Path ruta) {

		try {
			System.out.println(Files.readAllLines(ruta));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
