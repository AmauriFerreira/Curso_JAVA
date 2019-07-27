public class Mensalista extends Empregado{
	
	private double salario;
	
	public Mensalista (){
		super();
	}
	
	public Mensalista (String nome, double salario){
		super (sobrenome,cpf,nome,);
		this.salario = salario;
		
	}
	
	public void setSalario (double salario){
		this.salario = salario;
	}
	public double getSalario(){
		return this.salario;
	}
	@Override
	public String toString(){
		return super.toString() + "\nSalario = " +this.salario + "]\n";
	}
}
