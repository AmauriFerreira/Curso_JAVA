public class TesteHospital {
	public static void main (String args[]) {
		Hospital h1;  //declaração
		h1 = new Hospital(); //instanciação
		
		h1.nome = "HCor";
		h1.endereco = "Rua x";
		h1.nAmbulancias = 10;
		h1.nLeitos = 1000;
		h1.mostraHospital();
		
		Hospital h2 = new Hospital("Nove de Julho", "Rua Nove de Julho");
		h2.mostraHospital();
		
		h1.ganhaAmbulancias(3);
		h2.ganhaAmbulancias(11);
		
		h1.mostraHospital();
		h2.mostraHospital();
		
		//h2 = h1;
		//h2.mostraHospital();
		
		h1.nAmbulancias--;
	}
}






