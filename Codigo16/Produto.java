public class Produto {
	private String nome;
	private double preco;
	private Etiqueta etiqueta;
	
	public Produto (String nome, double preco, Etiqueta etiqueta) {
		this.nome = nome;
		this.preco = preco;
		this.etiqueta = etiqueta;
	}
	//fazer gets e sets
	public String getDados() {
		return "Nome: " + nome + "\nPreco: " + preco + etiqueta.getDados();
	}
	
	
}