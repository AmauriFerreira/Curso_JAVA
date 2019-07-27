public class Aluno {
	// atributos
	private String nome;
	private int idade;
	private double peso;
	private boolean formando;
	private char sexo;
	private Turma turma;
	//construtor
	public Aluno(String nome, int idade, double peso, char sexo, Turma turma) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.formando = false;
		this.sexo = sexo;
		this.turma = turma;
	}
	/*metodos de acesso
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public double getPeso() {
		return peso;
	}
	public boolean getFormando() {
		return formando;
	}
	public char getSexo() {
		return sexo;
	}
	public Turma getTurma() {
		return turma;
	}*/
	//metodos modificadores
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void setFormando(boolean formando) {
		this.formando = formando;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	//metodo getDados
	public String getDados() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", peso=" + peso
				+ ", formando=" + formando + ", sexo=" + sexo + ", turma="
				+ turma.getDados() + "]";
	}
}
