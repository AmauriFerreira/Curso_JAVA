public class Cliente{
	
	//atributos
	
	private String nome;
	
	private String cpf;
	
	private ContaCorrente conta ;
	

	//construtor
	
	public Cliente(String nome, String cpf,ContaCorrente conta ) {
		
		this.nome= nome;
		this.cpf = cpf;	
		this.conta=conta;
	}	
	//metodos modificadores
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf= cpf;
	}
	//metodo getDados
	public String getDados() {
		return "Nome: " + nome + "\nCpf:" + cpf ;
	}
}