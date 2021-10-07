import dao.PokemonDAOImp;
import modelo.Pokemon;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {

		Pokemon pokimon = new Pokemon();

		PokemonDAOImp poli = new PokemonDAOImp();
		poli.add(pokimon);
		poli.escribirPokemon("ob.bin",pokimon);
		List<Pokemon> list = poli.leerPokemon("ob.bin");
		System.out.println(list);
	}

}
