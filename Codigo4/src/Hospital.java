public class Hospital {
	static int nHospitais;
	String nome;
	int nLeitos;
	String endereco;
	int nAmbulancias;
	public Hospital () {}
	public Hospital (String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		nHospitais++;
	}
	public Hospital (String nome, String endereco, int nLeitos, int nAmbulancias) {
		this.nome = nome;
		this.endereco = endereco;
		this.nAmbulancias = nAmbulancias;
		this.nLeitos = nLeitos;
		nHospitais++;
	}
	void ganhaAmbulancias (int nAmbulancias) {
		this.nAmbulancias += nAmbulancias;
	}
	void reforma (int nLeitos) {
		this.nLeitos -= nLeitos;
	}
	void mostraHospital () {
		System.out.println ("Hospital " + nHospitais + " " + nome + "\nSituado em " + endereco + "\ntem " + nLeitos + " leitos e " + nAmbulancias + " ambulancias\n");
	}
	
}




