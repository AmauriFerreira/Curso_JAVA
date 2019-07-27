

import javax.swing.JOptionPane;

public class Exercicio8
{
	public static void main(String args [])
	{int x;
		
		String resultado = " "; 
			for(int i = 1; i<=20;i++)
			{
			 x = i*i;
				resultado = resultado + "O quadrado do numero "+i+" = "+x+"\n" ;
				
			
			}
		
			JOptionPane.showMessageDialog(null, resultado);
	
	}
	
}
