package tarefa4;

public class Gato extends Animal {

	public Gato(String nome,String raca, int idade, int peso) {
		super(nome,raca, idade, peso);
		
	}
	@Override
	public String fazerBarulho() {
		return "Miau";
	}

}
