

import javax.swing.JOptionPane;

public class Exercicio3 {

	 public static void main(String[] args) {

		int dezenas;
		Double numero;
		Double numero1;
		String aux;
		Double aux1;

		aux = JOptionPane.showInputDialog(null,"Digite um numero inteiro com três casas decimais"); 
		numero = Double.parseDouble(aux);

		numero1 = numero%1;
		aux1=((numero1*100)%10);
		 dezenas = aux1.intValue( );
          
		JOptionPane.showMessageDialog(null,dezenas);
             
                  
    }
}
