package tarefa4;

public class Gato extends Animal {

	public Gato(String raca, int idade, int peso) {
		super(raca, idade, peso);
		
	}
	@Override
	public String fazerBarulho() {
		return "Miau";
	}

}
