public class Empregado extends PessoaFisica {

	
	private String recebimento;
	
	public Empregado(){
	      super();
	}
	public Empregado(String recebimento){
		super(sobrerecebimento,cpf);
		this.recebimento = recebimento;
	}
	public void setRecebimento (String recebimento){
		this.recebimento = recebimento;
	}
	public String getRecebimento(){
		return this.recebimento;
	}
	@Override
	public String toString(){
		return super.toString();
	}
}