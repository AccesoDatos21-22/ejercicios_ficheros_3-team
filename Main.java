import dao.PokemonDAOImp;
import modelo.Pokemon;

public class Main {
	
	public static void main(String[] args) {

		Pokemon pokimon = new Pokemon();

		PokemonDAOImp poli = new PokemonDAOImp();
		poli.add(pokimon);
		poli.escribirPokemon("ob.bin",pokimon);

	}

}
