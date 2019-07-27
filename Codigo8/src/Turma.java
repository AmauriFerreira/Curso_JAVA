public class Turma {
	//atributos
	private String codigo;
	private int ano;
	//construtor
	public Turma(String codigo, int ano) {
		this.codigo = codigo;
		this.ano = ano;
	}
	//metodos de acesso
	public String getCodigo() {
		return codigo;
	}
	public int getAno() {
		return ano;
	}
	//metodos modificadores
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	//metodo getDados
	public String getDados() {
		return "Turma [codigo=" + codigo + ", ano=" + ano + "]";
	}
}
