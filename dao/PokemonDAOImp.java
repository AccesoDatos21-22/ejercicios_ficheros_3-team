package dao;

import java.io.*;
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
		return null;
	}

	@Override
	public List<Pokemon> leerPokemon(String ruta, String nombre) {
		return null;
	}

	@Override
	public void escribirFlotante(float numeroDecimal, String ruta) {

	}

}
