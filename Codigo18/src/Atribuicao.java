//c. Crie a classe Atribuicao com seu construtor, métodos de acesso e modificadores e os atributos privados professor, do tipo Professor, e disciplina, do tipo Disciplina. 
//Crie o método getDados que retorna o valor dos atributos.
public class Atribuicao {
	private Professor professor;
	private Disciplina disciplina;
	
	public Atribuicao (Professor nome) {
		this.professor = professor;
		this.disciplina = disciplina;
		
	}
	
	public String getDados(){
		String msg;
		msg = "Professor: " + professor.getDados() + "Disciplina" + disciplina.getDados();
		return msg;
	}
}