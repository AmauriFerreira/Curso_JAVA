import javax.swing.JOptionPane;
public class Disciplina {
	//atributos
	private String nome;
	private boolean pratica;
	private String str;
	//construtor
	public Disciplina(String nome, boolean pratica) {
		this.nome = nome;
		this.pratica = pratica;
		setPratica(this.pratica);
	}
	//metodos de acesso
	public String getNome() {
		return nome;
	}
	public boolean getPratica() {
		return pratica;
	}
	//metodos modificadores
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setPratica(boolean pratica) {
		if (pratica==true)
			str = "A diciplina e platica";
			//this.pratica=true;
		else 
			str = "A diciplina e platica";
			//this.pratica=true;
	}
	//metodo getDados
	public String getDados() {
		return "\nNome da disciplina =" + nome + "\nPratica=" + str;
	}
}
