package tarefa4;

public class Main {

	public static void main(String[] args) {
		Gato cat1 = new Gato("Siamês", 7, 45);
		Gato cat2 = new Gato("Persa", 6, 30);
		Cachorro dog1 = new Cachorro("Husky", 1, 30);
		Cachorro dog2 = new Cachorro("Labrador", 2, 40);
		ManadaSustenido manas = new ManadaSustenido();
		ManadaVirgula manav =new ManadaVirgula();
		manav.adicionarAnimal(cat1);
		manav.adicionarAnimal(cat2);
		manav.adicionarAnimal(dog1);
		manav.adicionarAnimal(dog2);
		
		manas.adicionarAnimal(cat1);
		manas.adicionarAnimal(cat2);
		manas.adicionarAnimal(dog1);
		manas.adicionarAnimal(dog2);
		
		System.out.println(manav.estourar());
		System.out.println(manas.estourar());
		

	}

}
