import javax.swing.JOptionPane;

public class Divisores {

	static String Divisores (int n) {
		String resultado = "1, ";
		int metade = n/2;
		for (int i = 2; i<=metade; i++ ) {
			if (n % i == 0) {
				resultado = resultado + i + ", ";
			}
		}
		resultado = resultado + n;
		return resultado;
	}
	public static void main (String args[]) {
		int n;
		n = Integer.parseInt(
		    JOptionPane.showInputDialog("Digite seus valores, 0 encerra"));
		while (n > 0) {
			JOptionPane.showMessageDialog(null, "Divisores de " 
			+ n + "\n" + sDivisores(n));
			n = Integer.parseInt(
		    JOptionPane.showInputDialog("Proximo, 0 encerra"));
		}
	}

}




