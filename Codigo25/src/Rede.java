import java.util.ArrayList;

public class Rede{
   private ArrayList<Amigo> amigos;
   
   public Rede(){
      amigos = new ArrayList<Amigo>();
   }

   public void addAmigo(Amigo amigo){
      amigos.add(amigo);
   }
   
	//metodo busca
	public int buscarAmigo(String nome){
		for(int i=0; i<amigos.size(); i++){
			if(amigos.get(i).getNome().equals(nome)) return i;
		}
		return -1;
	}



   // metodo remover
   
   
   //metodo listar
   public void listar(){
	   for(Amigo s: amigos){
		   System.out.println(s.getNome());
	   }
   }
}
