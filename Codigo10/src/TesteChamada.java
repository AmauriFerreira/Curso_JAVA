//package teste;

public class TesteChamada {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(10, "Gil");
		//System.out.println(a1);
		Aluno a2 = new Aluno();
		//System.out.println(a2);
	
		Chamada ads = new Chamada();
		ads.matricularAluno(a1);
		ads.matricularAluno(a2);
	
		/*
		for(Aluno a: ads.getLista()){
			System.out.println(a);
		}
		*/
		
		System.out.println(ads);
		
		ads.getLista().get(1).setRa(20);
		ads.getLista().get(1).setNome("Joao");
		
		System.out.println(a2);
		
		a1 = new Aluno(30, "Cris");
		ads.matricularAluno(a1);
		
		ads.matricularAluno(new Aluno(40, "Ju"));
		
		System.out.println(ads);
		/* nao fazer
		ads.getLista().add(1, new Aluno(50, "Gal"));
		System.out.println(ads);
		*/
		
		ads.expulsarAluno(a1);
		System.out.println(ads);
	
		if(ads.busca(a2)==true){
			System.out.println(a2.getNome() + " esta na lista");
		}
		else{
			System.out.println(a2.getNome() + " nao esta na lista");
		}
		
		if(ads.busca(a1)==true){
			System.out.println(a1.getNome() + " esta na lista");
		}
		else{
			System.out.println(a1.getNome() + " nao esta na lista");
		}
	}

}
