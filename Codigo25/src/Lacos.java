import javax.swing.JOptionPane;

public class Lacos {
	public static void main(String args[]) {
		//ler um número inteiro positivo
		int x = Integer.parseInt(
		        JOptionPane.showInputDialog("Digite um valor positivo"));
		while (x < 0) {
			x = Integer.parseInt(
		    JOptionPane.showInputDialog("Valor deve ser positivo"));
		}
	}
}