

public class Amigo{
   private String nome, sexo, mensagem;
   private int idade;
   
   // construtor
   public Amigo(String nome, String sexo, String mensagem, int idade){
	   this.nome = nome;
	   this.sexo = sexo;
	   this.mensagem = mensagem;
	   this.idade = idade;
   }
   
   public Amigo(String nome, String sexo,int idade){
	   this.nome = nome;
	   this.sexo = sexo;
	   this.idade = idade;
	   this.mensagem = "Seja bem vindo!";
   }
   
   public Amigo(){
   }


   public String getNome(){
      return nome;
   }
   
   public String getSexo(){
      return sexo;
   }
   
   public String getMensagem(){
      return mensagem;
   }
   
   public int getIdade(){
      return idade;
   }
   
   public void setNome(String nome){
      this.nome = nome;
   }
   
   public void setSexo(String sexo){
      this.sexo = sexo;
   }
   
   public void setMensagem(String mensagem){
      //tamanho da mensagem e no maximo 144
      if(mensagem.length() <= 144){
         this.mensagem = mensagem;
      } else {
         //trunca se for maior
         this.mensagem = mensagem.substring(0, 144);
      }
   }
   
   public void setIdade(int idade){
      this.idade = idade;
   }
   
   public String toString(){
      return "[Nome: "+nome+"] [Sexo: "+sexo+"] [Idade: "+idade+
         "]\n[Mensagem: "+mensagem+"]";
   }   
}
