public class Pessoa {
	private String nome;
	private Data dataNascimento;
	private Endereco endereco;
	
	public Pessoa (String nome, Data dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	public Pessoa (String nome, Data dataNascimento, Endereco endereco) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public void setDataNascimento (Data dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNome() {
		return this.nome;
	}
	public Data getDataNascimento() {
		return this.dataNascimento;
	}
	public String stringPessoa () {
		String s = this.nome + "\nnasceu em " + 
		this.dataNascimento.stringData();
		if (this.endereco != null)
			s = s + "mora em " + this.endereco.stringEndereco();
		return s;
	} 
 }