import javax.swing.*;
public class SomaDoisNumerosComJanelinha {
	public static void main (String args[]) {
		int a, b, c;
		String aux;
		aux = JOptionPane.showInputDialog ("Digite o valor de a");
		a = Integer.parseInt(aux);
		aux = JOptionPane.showInputDialog ("Digite o valor de b");
		b = Integer.parseInt(aux);
		c = a + b;
		JOptionPane.showMessageDialog (null, "Soma = " + c);
	} 
}