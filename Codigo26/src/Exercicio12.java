


public class Exercicio12 {
	public static void main(String[] args) {


		

	numero = JOptionPane.showInputDialog(null,"Digite um número positivo:");
                                
                           x = Double.parseDouble(numero);

				y = Math.sqrt(x);
				
					
		for (Double i=x.length(); i > 0; i--) {
			c += x.substring(i - 1, i);
		}


	
		JOptionPane.showMessageDialog(null, "Raiz de " + x + " = " + y +"numero invertido:" + c);
	}
}