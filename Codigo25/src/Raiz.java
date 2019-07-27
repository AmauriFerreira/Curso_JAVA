import javax.swing.JOptionPane;
public class Raiz {
	public static void main (String args[]) {
		double x, y;
		x = Double.parseDouble(
		    JOptionPane.showInputDialog("Digite um número positivo:"));
		y = Math.sqrt(x);
		JOptionPane.showMessageDialog(null, "Raiz de " + x + " = " +
		+ y);
	}
}