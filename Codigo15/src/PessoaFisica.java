 public class   PessoaFisica {
	private String nome;
	private String sobrenome;
	private String cpf;

	
	public  PessoaFisica(String nome,String sobrenome,String cpf){
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	public void setNome (String nome){
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome){
		this.sobrenome= sobrenome;
	}
	public void setCpf (String cpf){
		this.cpf = cpf;
	}
	public String getNome(){
		return this.nome;
	}
		public String getSobrenome(){
		return this.sobrenome;
	}
		public String getCpf(){
		return this.cpf;
	}
	@Override
	public String toString(){
		return " PessoaFisica: [nome = " + this.nome + "\nsobrenome = " + this.sobrenome + "\nCpf= " + this.cpf "]";
	}
}