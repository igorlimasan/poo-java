package tarefa4;

public class Animal implements Comparable<Animal>{
	private String nome;
	private String raca;
	private int idade;
	private int peso;
	
	
	
	
	public Animal(String nome, String raca, int idade, int peso) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	
	@Override
	public String toString() {
		return "Animal= Nome: " + nome + ", Raça: " + raca + ", Idade: " + idade + ", Peso: " + peso ;
	}

	public String fazerBarulho()
	{
		return "O barulho feito foi ";
	}
	//Ordem por Peso

	@Override
	public int compareTo(Animal outro) {
		
		if(this.peso<outro.getPeso()) return -1;
		if(this.peso>outro.getPeso()) return 1;
		return 0;
	}

	
	

}
