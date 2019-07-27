//ler 2 números, somar e mostrar o resultado
import javax.swing.JOptionPane;

public class SomaDois {
	public static void main (String args[]) {
		String aux;
		int a, b, c;
		aux = JOptionPane.showInputDialog("digite o primeiro numero");
		a = Integer.parseInt(aux);
		
		b = Integer.parseInt(
		    JOptionPane.showInputDialog("Digite o segundo numero"));
		c = a + b;
		
		JOptionPane.showMessageDialog (null, "soma = " + (a + b));
		
	}
}