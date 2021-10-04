import dao.PokemonDAO;
import dao.PokemonDAOImp;
import modelo.Pokemon;

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

	}

}
