package tarefa4;

public class Animal {
	private String raca;
	private int idade;
	private int peso;
	
	
	public Animal(String raca, int idade, int peso) {
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}
	
	public String fazerBarulho()
	{
		return "O barulho feito foi ";
	}
	

}
