package tarefa4;

import java.util.Comparator;

public class ComparaNome implements Comparator<Animal> {

	@Override
	public int compare(Animal animal, Animal outroAnimal) {
		return animal.getNome().compareTo(outroAnimal.getNome());
	}

}
