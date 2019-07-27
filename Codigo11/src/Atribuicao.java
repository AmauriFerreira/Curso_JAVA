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
		msg = "Professor" + professor.getDados ()+ "Disciplina" + disciplina.getDados ();
		return msg;
		
}
}