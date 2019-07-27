public class Comissionado extends Mensalista{
	
	private double comissao;
	
	public Comissionado(){
	      super();
	}
	public Comissionado (String nome, double salario, double comissao){
		super (sobrenome,cpf,nome, salario);
		this.comissao = comissao;
	}
	
	public void setComissao (double comissao){
		this.comissao = comissao;
	}
	public double getComissao(){
		return this.comissao;
	}
	public double salarioTotal(){
		return super.getSalario() + this.comissao;
	}
	@Override
	public String toString(){
		return super.toString() + "\nComissao = " +this.comissao + "]\n" + "[Salario Total = " + (super.getSalario() + this.comissao) + "]";
	}
	
}
