//b. Crie a classe Disciplina com seu construtor, métodos de acesso e modificadores e os atributos privados nome, 
//do tipo String, pratica, do tipo boolean. Crie o método getDados que retorna o valor dos atributos.
public class Disciplina {
	
	private String nome;
	private boolean pratica;
	
	public Disciplina (String nome, boolean pratica) {
		this.nome = nome;
		this.pratica = pratica;
	}
	
	public String getNome() {
		return nome;
	}
	public boolean isPratica(){
	   return pratica;
   }
   public void setNome(String nome) {
		this.nome = nome;
	}
	 public void setPratica(boolean pratica){
	 this.pratica = pratica;  
   }
   public String getDados() {
	   String msg;
	   String pratica = "nao";
	   if(isPratica()) {
		   pratica = "sim";
	   }
	   msg = "Disciplina: " + nome + " Pratica: " + pratica;
	   return msg;
	}
}