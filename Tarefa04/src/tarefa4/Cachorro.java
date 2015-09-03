package tarefa4;

public class Cachorro extends Animal {

	public Cachorro(String raca, int idade, int peso) {
		super(raca, idade, peso);
		
	}
	@Override
	public String fazerBarulho() {
		return "Au";
	}

}
