public class Atribuicao {
	
	//atributos
	
	private Professor professor;
	
	private Disciplina disciplina;

	//construtor
	
	public Atribuicao(Professor  objetoprofessor, Disciplina objetodisciplina) {
		
		this.professor = objetoprofessor;
		
		this.disciplina = objetodisciplina;
	
	}
	
	//metodo getDados
	public String getDados() {
		String msg;
		msg =  professor.getDados ()+ disciplina.getDados ();
		return msg;
		
}
}