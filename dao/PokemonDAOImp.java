package dao;

import java.io.*;
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
		try {
			BufferedWriter bwPok = new BufferedWriter(new FileWriter(ruta,true));
			Pokemon pok = new Pokemon(name,life,atack,defense,specialAttack,specialdefense,speed);
			if (!pok.existe(ruta)){
				bwPok.write(pok.toString()+"\n");
			}else{
				System.out.println(name+" ya existe.");
			}
			bwPok.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void imprimirPokemon (String ruta) {

		try {
			BufferedReader brPoke = new BufferedReader(new FileReader(ruta));
			String linea;
			String pokeS[];
			while ((linea = brPoke.readLine()) != null) {
				pokeS = linea.split(";");
				Pokemon pok = new Pokemon(pokeS[0],Integer.parseInt(pokeS[1]),Integer.parseInt(pokeS[2]),Integer.parseInt(pokeS[3]),Integer.parseInt(pokeS[4]),Integer.parseInt(pokeS[5]),Integer.parseInt(pokeS[6]));
				System.out.println(
						"nombre='" + pok.getNombre() + '\n' +
								"\tvida=" + pok.getVida() + '\n' +
								"\tataque=" + pok.getAtaque() + '\n' +
								"\tdefensa=" + pok.getDefensa() + '\n' +
								"\tataqueEspecial=" + pok.getAtaqueEspecial() + '\n' +
								"\tdefensaEspecial=" + pok.getDefensaEspecial() + '\n' +
								"\tvelosidad=" + pok.getVelosidad()
				);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

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
