public class Tarefeiro extends Empregado{
	
	private int horasTrabalhadas;
	private double valorHora;
	
	public Tarefeiro(){
	      super();
	}
	
	public Tarefeiro (String nome, int horasTrabalhadas, double valorHora){
		super (sobrenome,cpf,nome,);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}
	
	public void setHorasTrabalhadas (double HorasTrabalhadas){
		this.horasTrabalhadas = horasTrabalhadas;
	}
		
	public void setValorHora (double valorHora){
		this.valorHora = valorHora;
	}
	
	public double getHorasTrabalhadas(){
		return this.horasTrabalhadas;
	}
	
	public double getValorHora(){
		return this.valorHora;
	}
		
	public double salarioTotal(){
		return this.horasTrabalhadas * this.valorHora;
	}
	
	@Override
	public String toString(){
		return super.toString() + "\n Salario Total = " + salarioTotal() + "]";
	}
	
}
