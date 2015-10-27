package tarefa4;

import java.util.Comparator;
//Comparação por peso na classe Animal.java
public class ComparaNome implements Comparator<Animal> {
	
	@Override
	public int compare(Animal animal, Animal outroAnimal) {
		return animal.getNome().compareTo(outroAnimal.getNome());
	}

}
