//a) Escrever, em linguagem Java, a classe Pagamento, cujos atributos unicos sao
//nomeDoPagador (String), cpf (String) e valorASerPago (double). Escrever, nesta classe, metodos
//construtores, metodos de acesso e metodos modificadores para os atributos.

public class Pagamento
{
   private String nomeDoPagador;
   private int cpf;
   private double valorASerPago;
   
   public Pagamento(String nomeDoPagador, int cpf, double valorASerPago){
	   
       this.nomeDoPagador= nomeDoPagador;
       this.cpf = cpf;
       this.valorASerPago=valorASerPago;
    
   }

   //metodos de acesso
   public String getNomeDoPagador(){
       return nomeDoPagador;
   }
   public int getCpf(){
        return cpf;
   }
   
   public double getValorASerPago(){
        return valorASerPago;
   }
   
    //metodos de modificadores
	
	 public void setNomeDoPagador(String nomeDoPagador){
	 this.nomeDoPagador = nomeDoPagador;  
   }
   
    public void setCpf(int cpf){
	 this.cpf=cpf;  
   }
   
   public void setValorASerPago(double valorASerPago){
	 this.valorASerPago=valorASerPago;  
   }
   @Override
	public String toString() {
		return " NomeDoPagador =" + this.nomeDoPagador + " \nCpf=" + this.cpf + "\nvalorASerPago=" + this.valorASerPago ;
	//}
   
}
