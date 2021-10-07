package dao;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import modelo.Alumno;
import modelo.Pokemon;

public class PokemonDAOImp implements PokemonDAO {

	private List<Pokemon> pokemones;
	private int numPokemones; // atributo para controlar el n�mero real de

	@Override
	public boolean estaVacio() {
		return false;
	}

	@Override
	public boolean estaLLeno() {
		return false;
	}

	@Override
	public void add(Pokemon pokemon) {
		pokemones = new ArrayList<Pokemon>();
		pokemones.add(pokemon);
	}

	@Override
	public boolean eliminar(Pokemon pokemon) {
		return false;
	}

	@Override
	public void escribirPokemon(String ruta, String name, int life, int atack, int defense, int specialAttack, int specialdefense, int speed) {

	}

	@Override
	public void imprimirPokemon(String ruta) {

	}

	@Override
	public void escribirPokemon(String ruta, Pokemon pokemon) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta,true));
			if (!pokemones.contains(pokemon)) {
				oos.writeObject(pokemon);
			}
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Pokemon> leerPokemon(String ruta) {
		List<Pokemon> list = new ArrayList<Pokemon>();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
			Pokemon poki;
			poki = (Pokemon)ois.readObject();
			list.add((Pokemon)poki);
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<Pokemon> leerPokemon(String ruta, String nombre) {

		List<Pokemon> list = new ArrayList<Pokemon>();
		List<Pokemon> listC = new ArrayList<Pokemon>();
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
			Pokemon poki;
			poki = (Pokemon)ois.readObject();
			list.add((Pokemon)poki);
			ois.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		for(Pokemon pok:list) {
			if (pok.getNombre().contains(nombre)) {
				listC.add(pok);
			}
		}

		return listC;
	}

	@Override
	public void escribirFlotante(float numeroDecimal, String ruta) {

	}

}
