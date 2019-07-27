import javax.swing.JOptionPane;

public class Exercicio10{
	public static void main(String args []){
		int resultado = 0;
		while(Integer.parseInt(JOptionPane.showInputDialog(null, ""))>0){
			resultado++;
	
		 }
    	JOptionPane.showMessageDialog(null, "Numero digitados = " + resultado);
	}
}