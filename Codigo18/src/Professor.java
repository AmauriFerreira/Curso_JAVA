//a. Crie a classe Professor com seu construtor, métodos de acesso e modificadores e os atributos privados nome, 
//do tipo String, idade, do tipo int. Crie o método getDados que retorna o valor dos atributos.
public class Professor {
	
	private String nome;
	private int idade;

	public Professor (String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//metodo getDados
	public String getDados() {
		return "Professor [nome=" + nome + ", idade=" + idade + "\n";
	}
	
	
}