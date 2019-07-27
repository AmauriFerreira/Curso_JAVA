

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main (String args[]) {
		
			double x, y;
			String numero;

		numero = JOptionPane.showInputDialog("Digite um número positivo:");

			x = Double.parseDouble(numero);

				y = Math.sqrt(x);
				
					JOptionPane.showMessageDialog(null, "Raiz de " + x + " = " + y);

	}
}