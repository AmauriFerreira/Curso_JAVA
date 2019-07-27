public class Desempregado extends  PessoaFisica{
	
	private double seguroDesemprego;

	public Empregado(){
	      super();
	}
	
	public Desempregado(double seguroDesemprego){
		super(sobrenome,cpf,nome);
		this.seguroDesemprego = seguroDesemprego;
	}
	public void setSeguroDesemprego (double seguroDesemprego){
		this.seguroDesemprego = seguroDesemprego;
	}
	public double getSeguroDesemprego(){
		return this.seguroDesemprego;
	}
	@Override
	public String toString(){
		return super.toString() "\n[ O valor do seguro desemprego e= " + this.seguroDesemprego + "]";
	}
}