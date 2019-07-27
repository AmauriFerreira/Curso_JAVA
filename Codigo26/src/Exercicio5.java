

import javax.swing.JOptionPane;

			public class Exercicio5 {

	 public static void main(String[] args) {

		String aux;
		Double Raio;
		Double Area;
		
		
			aux = JOptionPane.showInputDialog(null,"Digite o raio do circulo");
			
				Raio = Double.parseDouble(aux);
		
					Area = (Raio*Raio*3.14159);
          
						JOptionPane.showMessageDialog(null,Area);
             
                  
    }
}
