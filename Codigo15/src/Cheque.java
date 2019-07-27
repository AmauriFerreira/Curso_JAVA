//c) Escrever a classe Cheque, como extensão da classe Pagamento, com o atributo próprio
//numeroDoCheque (String). Escrever, nesta classe, métodos construtores, método de acesso e
//metodo modificador para o atributo proprio.

public class Cheque extends Pagamento{
	
	private Cheque () {
		 super ( );
	}
	
   private String numeroDoCheque;
  
   public Cheque(String numeroDoCheque){
	   super (nomeDoPagador,cpf,valorASerPago);
       this.numeroDoCheque= numeroDoCheque;
       
    
   }

   //metodos de acesso
   public String getNumeroDoCheque(){
       return numeroDoCheque;
   }
   
    //metodos de modificadores
	
	 public void setNumeroDoCheque(String numeroDoCheque){
	 this.numeroDoCheque = numeroDoCheque;  
   }
   
    @Override
	public String toString(){
		return super.toString() " \n NumeroDoCheque:[ " + this.numeroDoCheque + "]";
	}
	
}

