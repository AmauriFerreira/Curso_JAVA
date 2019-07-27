
public class Produto {
	//declara os atributos

	private String nome;
	private double preco;
	private int quantidade;

	

	//cria os contrutores
	public Produto (String a, double b, int c){
		nome = a;
		preco = b;
		quantidade = c;
		
	}
	
	
	//metodos de acesso - getters
	
	public String getNome(){
		return nome;
	}
	public double getPreco(){
		return preco;
	}
	public int getQuantidade(){
		return quantidade;
	}

	
	//metodos modificadores - setters
	
	public void setNome(String a){
		nome = a;
	}
	public void setCurso(double b){
		preco = b;
	}
	
	public void setQuantidade (int c){
		quantidade = c;
	}
	
}
	

	
	
	
	