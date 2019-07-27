public class Agencia{
	
	//atributos
	
	private String nome;
	
	private int numero;
	
	private int digito;
	

	//construtor
	
	public  Agencia(String nome,int numero, int digito){
		
		this.nome= nome;
		this.numero = numero;
		this.digito=digito;
		
	}	
	//metodos modificadores
	
		public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setDigito(int digito) {
		this.digito= digito;
	}
	
	//metodo getDados
	public String getDados() {
		return " Agencia : "+ numero + "  Digito:" + digito ;
	}
}
