public class Mostrador {
	private int valor;
	private int limite;
	
	public Mostrador (int limite) {
		this.limite = limite;
		this.valor = 0;
	}
	public void incrementa1 () {
		valor = (valor + 1) % limite;
	}
	public int getValor() {
		return valor;
	}
	public String mostra () {
		if (valor < 10)
			return "0" + valor;
		else 
			return "" + valor;
	}
}