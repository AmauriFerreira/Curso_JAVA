package zoologico;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Animal> zoo = new ArrayList<>();
		
		Gato g1 = new Gato("Zeca");
		Gato g2 = new Gato("Manda Chuva");
		
		Cachorro c1 = new Cachorro("Pluto");
		Cachorro c2 = new Cachorro("Laika");
		
		zoo.add(g1);
		zoo.add(g2);
		zoo.add(c1);
		zoo.add(c2);
		
		for(Animal a: zoo){
			System.out.println(a);
			a.fazBarulho();
		}
	}

}
