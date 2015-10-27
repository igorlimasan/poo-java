package tarefa4;

import java.util.List;
import java.util.LinkedList;

public abstract class Manada {
	protected List<Animal>animais=new LinkedList<Animal>();
	public abstract String estourar();
	
	public List<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}

	public void adicionarAnimal(Animal animal)
	{
		animais.add(animal);
	}
	
	

}
