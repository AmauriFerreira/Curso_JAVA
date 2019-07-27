public class Teste {
	public static void main (String args[]) {
		Data d1 = new Data();
		Data d2 = new Data(15, 9, 2016);
		//System.out.println (d1.exibeData());
		//System.out.println (d2.exibeData());
		
		Endereco e1 = new Endereco (100, "Vergueiro");
		Endereco e2 = new Endereco (200, "Frei Joao", "ap 15");
		//System.out.println (e1.stringEndereco ());
		//System.out.println (e2.stringEndereco ());
		
		Pessoa p1 = new Pessoa ("Ana", d1,e1);
		Pessoa p2 = new Pessoa ("Bia", d2, e2);
		
		System.out.println (p1.stringPessoa());
		System.out.println (p2.stringPessoa());
		
	}
}





