
import java.util.ArrayList;

public class Chamada {
	private ArrayList<Aluno> lista;
	
	public Chamada(){
		lista = new ArrayList<>();
	}
	
	public ArrayList<Aluno> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Aluno> lista) {
		this.lista = lista;
	}

	public void matricularAluno(Aluno a){
		lista.add(a);
	}

	@Override
	public String toString() {
		String s = "";
		for (Aluno a: lista){
			s = s + a + "\n";
		}
		return s;
	}
	
	public void expulsarAluno (Aluno a){
		lista.remove(a);
	}
	
	public boolean busca(Aluno a){
		for(Aluno al: lista){
			if(al.equals(a)){
				return true;
			}
		}
		return false;
	}

}
