

import javax.swing.JOptionPane;

public class Teste{
   public static void main(String[] args){
   Rede rede = new Rede();
   
   //adicione 3 amigos
   rede.addAmigo(new Amigo("Joao", "H", "Zé ninguem", 19));
   rede.addAmigo(new Amigo("Maria", "M", 19));
   rede.addAmigo(new Amigo("Benjamin", "H", 60));
   
   //exiba a lista de amigos
   
   
   //remova um amigo
   
      //metodo listar
   public void listar(){
	   for(Amigo s: amigos){
		   System.out.println(s.getNome());
	   }
   }
}
