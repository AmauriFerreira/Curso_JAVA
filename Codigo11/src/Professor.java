public class Professor {
	//atributos
	private String nome1;
	private int idade;
	//construtor
	public Professor(String nome1, int idade) {
		this.nome1 = nome1;
		this.idade = idade;
	}
	
	
	
	//metodos modificadores
	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	//metodo getDados
	public String getDados() {
		return "Professor [nome=" + nome1 + " /nIdade=" + idade + "]";
	}
}
