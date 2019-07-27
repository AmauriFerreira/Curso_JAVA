public class Turma
{
	private Aluno aluno;
	private Disciplina disciplina;

	public Turma(Aluno aluno, Disciplina disciplina){
		this.aluno = aluno;
		this.disciplina = disciplina;
	}
	
    public void imprime(){
		String nomeAluno = aluno.getNome();
		int idadeAluno = aluno.getIdade();
		System.out.println("Aluno: "+nomeAluno);
		System.out.println("Idade: "+idadeAluno);
		System.out.println("Disciplina: "+disciplina.getNome());
	}
}