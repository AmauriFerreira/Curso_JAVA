public class TesteEmpregados {
	public static void main (String args[]){
		
		Empregado e1 = new Empregado();
		Empregado e2 = new Empregado("Joao");
		
		Mensalista m1 = new Mensalista();
		Mensalista m2 = new Mensalista("Antonio", 1000);
		
		Comissionado c1 = new Comissionado();
		Comissionado c2 = new Comissionado("Gil", 1200, 660);
		
		Horista h1 = new Horista();
		Horista h2 = new Horista("Maria", 220, 10);
		
	
	System.out.println (e1);
	System.out.println (e2);
	
	System.out.println (m1);
	System.out.println (m2);
	
	System.out.println (c1);
	System.out.println (c2);
	
	System.out.println (h1);
	System.out.println (h2);
	
	}
}