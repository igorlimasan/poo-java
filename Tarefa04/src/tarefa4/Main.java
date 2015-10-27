package tarefa4;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Gato cat1 = new Gato("Bola","Siamês", 7, 45);
		Gato cat2 = new Gato("Quadrado","Persa", 6, 150);
		Cachorro dog1 = new Cachorro("Triângulo","Husky", 1, 100);
		Cachorro dog2 = new Cachorro("Pitágoras","Labrador", 2, 40);
		ManadaSustenido manas = new ManadaSustenido();
		ManadaVirgula manav =new ManadaVirgula();
		manav.adicionarAnimal(cat1);
		manav.adicionarAnimal(cat2);
		manav.adicionarAnimal(dog1);
		
		manas.adicionarAnimal(cat1);
		manas.adicionarAnimal(cat2);
		manas.adicionarAnimal(dog1);
		manas.adicionarAnimal(dog2);
		Collections.sort(manas.animais);
		//Ordenado Por Peso
		for(Animal a :manas.animais)
		{
			System.out.println(a+"\n");
		}
		//Ordenado por Nome
		System.out.println("--------------------------------------------------------------------------------\n");
		ComparaNome cm = new ComparaNome();
		Collections.sort(manas.animais,cm);
		for(Animal a: manas.animais)
		{
			System.out.println(a+"\n");
		}
		//System.out.println(manav.estourar());
		//System.out.println(manas.estourar());
		

	}

}
