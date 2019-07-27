//d. Crie a classe TesteAtribuicao com o método main que instancia um Professor, uma Disciplina e uma Atribuicao. 
//Imprima dos dados da Atribuicao.
public class TesteAtribuicao{
	
	public static void main (String[]args){
		Professor professor = new Professor ("Joao",50);
		Disciplina disciplina = new Disciplina ("PEM",true);
		Atribuicao atribuicao = new Atribuicao (professor,disciplina);
		
		System.out.println (atribuicao.getDados());
	}
	
}