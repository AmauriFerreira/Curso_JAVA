public class Empregado extends PessoaFisica {

	
	private String nome;
	
	public Empregado(){
	      super();
	}
	public Empregado(String nome){
		super(sobrenome,cpf);
		this.nome = nome;
	}
	public void setNome (String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	@Override
	public String toString(){
		return super.toString();
	}
}