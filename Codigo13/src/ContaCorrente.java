import javax.swing.JOptionPane;
public class ContaCorrente{
	
	//atributos
	
	private int numero;
	
	private int digito;
	
	private Agencia agencia;
	
	private double saldo;
	
	
	//construtor
	
	public  ContaCorrente(int numero, int digito,Agencia agencia,double saldo) {
		// mostra o Professor
		char[] digitos = String.valueOf( numero ).toCharArray();
		int dig1,dig2,dig3,dig4,res;
		dig1 = Character.getNumericValue(digitos[0]);
		dig2 = Character.getNumericValue(digitos[1]);
		dig3 = Character.getNumericValue(digitos[2]);
		dig4 = Character.getNumericValue(digitos[3]);
		
		this.numero = numero;
		res = (dig1*4 +dig2*6 + dig3*8 +dig4*2)%11;
		
		if(res==10)
		this.digito = 0;	
		else
		this.digito = res;
		
		this.agencia=agencia;
		this.saldo = saldo;
	
	}
	
	//metodos modificadores
	
	public double getconsultarSaldo(){
       return saldo;
   }
   
   	public String imprimirSaldo(){
   
	   return " ContaCorrente [numero=" + numero + " /ndigito=" + digito+ "/nagencia=" + agencia+ "/nsaldo=" + saldo+ "]]";
   }
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setDigito(int digito) {
		this.digito= digito;
	}
	public void setDepositar (double depositar){
		this.saldo=saldo + depositar;
	}
	public void setSacar(double sacar){
		if ( saldo - sacar > 0){
		this.saldo= saldo - sacar;
		JOptionPane.showMessageDialog(null,"Saque foi efetuado; Saldo restante:"+ saldo);
		}
		else 
			JOptionPane.showMessageDialog(null,"O saque nao foi efetuado,Saldo insuficinete. Seu saldo atual e:"+ saldo );
	}
	//metodo getDados
	public String getDados() {
		return " \nContaCorrente: " + numero + " Digito:" + digito+ "\n" + agencia.getDados() + "\nsaldo=" + saldo;
	}
}