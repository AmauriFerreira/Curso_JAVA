import java.util.Scanner;
public class SomaDoisNumeros {
	public static void main (String args[]) {
		int a, b, c;
		Scanner entrada;
		entrada = new Scanner(System.in);
		System.out.print ("Digite o valor de a: ");
		a = entrada.nextInt();
		System.out.print ("Digite o valor de b: ");
		b = entrada.nextInt();
		c = a + b;
		System.out.println ("Soma = " + c);
	} 
}