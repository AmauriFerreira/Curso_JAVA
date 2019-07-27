
public class Turma {
	//declara os atributos

	private String nome;
	private String curso;
	private int quantidadeDeAlunos;
	private int serie;
	

	//cria os contrutores
	public Turma (String a, String b, int c, int d){
		nome = a;
		curso = b;
		quantidadeDeAlunos = c;
		serie = d;
	}
	
	
	//metodos de acesso - getters
	
	public String getNome(){
		return nome;
	}
	public String getCurso(){
		return curso;
	}
	public int getQuantidadeDeAlunos(){
		return quantidadeDeAlunos;
	}
	public int getSerie(){
		return serie;
	}
	
	//metodos modificadores - setters
	
	public void setNome(String a){
		nome = a;
	}
	public void setCurso(String b){
		curso = b;
	}
	
	public void setQuantidadeDeAlunos (int c){
		quantidadeDeAlunos = c;
	}
	
	public void setSerie (int d){
		serie = d;
	}
	
	

	
}