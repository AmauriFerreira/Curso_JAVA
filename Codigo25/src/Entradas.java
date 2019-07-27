import javax.swing.JOptionPane;

public class Entradas {
	public static void main (String args[]) {
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		JOptionPane.showMessageDialog (null, "a string nome tem " + 
		nome.length() + " letras");
		
		char primeira = nome.charAt(0);
		
		char ultima = nome.charAt(nome.length()-1);
		
		JOptionPane.showMessageDialog (null, "primeira letra = " +
		primeira + "\nultima letra = " + ultima);
		
		nome = JOptionPane.showInputDialog("Voce gosta de programar?");
		boolean temFuturo;
		if (nome.toLowerCase().equals("sim")) {
			temFuturo = true;
		}
		else {
			temFuturo = false;
		}
		JOptionPane.showMessageDialog (null, temFuturo);
		
		if (!temFuturo) {
			
		}
		else {
			
		}
		
		
	}
}




