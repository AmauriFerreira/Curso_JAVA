import javax.swing.JOptionPane;

public class Exercicio1 {

	 public static void main(String[] args) {

		String aux;
		Double a;
		int exp=2;
		aux = JOptionPane.showInputDialog("digite o primeiro numero");
		 a = Double.parseDouble(aux);
		 Double Quadrado = Math.pow(a,exp);
          
		JOptionPane.showMessageDialog(null,"O quadrado do número   "+ a +"  é igual a  " + Quadrado);
             
                  
    }
}
