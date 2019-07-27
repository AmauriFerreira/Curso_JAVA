//b) Escrever a classe CartaoDeCredito, como extensao da classe CartaoDeCredito, com o atributo
//proprio numeroDoCartao (String). Escrever, nesta classe, metodos construtores, metodo de
//acesso e metodo modificador para o atributo próprio.

public class CartaoDeCredito extends Pagamento{
   
   
   private CartaoDeCredito () {
	   super ();
   }
   private String numeroDoCartao;
 
   public CartaoDeCredito(String numeroDoCartao){
	   super (nomeDoPagador,cpf,valorASerPago);
       this.numeroDoCartao= numeroDoCartao; 
    
   }

   //metodos de acesso
   public String getNumeroDoCartao(){
       return numeroDoCartao;
   }
   
   
    //metodos de modificadores
	
	 public void setNumeroDoCartao(String numeroDoCartao){
	 this.numeroDoCartao = numeroDoCartao;  
   
   @Override
	public String toString(){
		return super.toString() "\n NumeroDoCartao:[ " + this.numeroDoCartao+ "]";
	}
   
}