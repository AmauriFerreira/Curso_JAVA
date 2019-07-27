//d) Escrever a classe Boleto, como extensao da classe Boleto, com os atributos próprio
//numeroDoBoleto (String), dia (int), mes (int) e ano (int) de vencimento. Escrever, nesta classe,
//métodos construtores, métodos de acesso e métodos modificadores para os atributos próprios.

public class Boleto extends Pagamento {
	
	
   private String numeroDoBoleto;
   private int diaVenc;
   private int mesVenc;
   private int anoVenc;
 
   private CBoleto () {
	    super ();
   }
  
   public Boleto(String numeroDoBoleto, int diaVenc,int mesVenc,int anoVenc){
	   super (nomeDoPagador,cpf,valorASerPago);
       this.numeroDoBoleto= numeroDoBoleto;
       this.diaVenc = diaVenc;
       this.mesVenc=mesVenc;
	   this.anoVenc=anoVenc;
      
   }

   //metodos de acesso
   public String getnumeroDoBoleto(){
       return numeroDoBoleto;
   }
   public int getDiaVenc(){
        return diaVenc;
   }
   
    public int getMesVenc(){
        return mesVenc;
   }
      public int getAnoVenc(){
        return anoVenc;
   }
   
  
    //metodos de modificadores
	
	 public void setNumeroDoBoleto(String numeroDoBoleto){
	 this.numeroDoBoleto = numeroDoBoleto;  
   }
   
    public void setDiaVenc(int diaVenc){
	 this.diaVenc=diaVenc;  
   }
   
     public void MesVenc(int MesVenc){
	 this.mesVenc=mesVenc;  
   }
   
    public void AnoVenc(int anoVenc){
	 this.anoVenc=anoVenc;  
   }
   
   @Override
	public String toString(){
		return super.toString() "\n NumeroDoBoleto:[ " + this.numeroDoBoleto + "]";
	}
	
   
}
