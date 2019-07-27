import javax.swing.JOptionPane;

public class Exercicio11{
	public static void main(String args []){
		int resultado;
		String result = "";
		int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número: "));
		for(int i = 0; i<=10; i++){
			resultado = i * a;
		
			result = result + a +" x " +i+" = " + resultado + "\n"; 
				
			
		}
		
		JOptionPane.showMessageDialog(null, result);
		
		
		
		
	}
	
	
	
}