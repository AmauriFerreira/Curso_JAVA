

import javax.swing.JOptionPane;

	public class Exercicio6 {

	 public static void main(String[] args) {
	
			double x, y;
			String numero;

		numero = JOptionPane.showInputDialog(null,"Digite um número positivo:");
                                
                           x = Double.parseDouble(numero);

				y = Math.sqrt(x);
				
					JOptionPane.showMessageDialog(null, "Raiz de " + x + " = " + y);

             
                  
    }
}
