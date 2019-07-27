//package teste;
public class Aluno {
	private int ra;
	private String nome;
	
	public Aluno(int ra, String nome) {
		this.ra = ra;
		this.nome = nome;
	}
	
	public Aluno(){	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString(){
		return "Aluno [ra=" + ra + ", nome=" + nome + "]"; 
	}
	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if(ra != other.ra)
			return false;
		return true;
	}
	
}
