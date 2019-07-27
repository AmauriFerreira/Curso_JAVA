public class Endereco {
	private int num;
	private String rua;
	private String complemento;
	
	public Endereco (int num, String rua) {
		this.num = num;
		this.rua = rua;
	}
	public Endereco (int num, String rua, String complemento) {
		this.num = num;
		this.rua = rua;
		this.complemento = complemento;
	}
	public int getNum () {
		return this.num;
	}
	public void setNum (int num) {
		this.num = num;
	}
	public String getRua () {
		return this.rua;
	}
	public void setRua (String rua) {
		this.rua = rua;
	}
	public String getComplemento () {
		return this.complemento;
	}
	public void setComplemento (String complemento) {
		this.complemento = complemento;
	}
	public String stringEndereco () {
		String s = this.rua + ", " + this.num;
		if (this.complemento != null) s = s + " - " + this.complemento;
		return s;
	}
}