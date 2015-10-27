package tarefa4;

public class Cachorro extends Animal {

	public Cachorro(String nome,String raca, int idade, int peso) {
		super(nome,raca, idade, peso);
		
	}
	@Override
	public String fazerBarulho() {
		return "Au";
	}

}
