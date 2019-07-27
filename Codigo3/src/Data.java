public class Data {
	private int dia;
	private int mes;
	private int ano;
	public Data (int dia, int mes, int ano) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}
	public Data () {
		this.setDia(0);
		this.setMes(0);
		this.setAno(0);
	}
	public void setDia (int dia) {
		if (dia < 1 || dia >30)
			this.dia = 1;
		else 
			this.dia = dia;
	}
	public void setMes (int mes) {
		if (mes < 1 || mes > 12)
			this.mes = 1;
		else 
			this.mes = mes;
	}
	public void setAno (int ano) {
		if (ano < 1970 || ano > 2030)
			this.ano = 1970;
		else 
			this.ano = ano;
	}
	public int getDia () {
		return this.dia;
	}
	public int getMes () {
		return this.mes;
	}
	public int getAno () {
		return this.ano;
	}
	public String stringData () {
		return this.dia + "/" + this.mes + "/" + this.ano + "\n";
	}
}