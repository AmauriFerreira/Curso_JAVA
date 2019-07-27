public class Carro {
	//declara os atributos
	private String marca;
	private String modelo;
	private String cor;
	private int anoDeFabricacao;
	private double preco;
	private boolean zero;
	

	
	//cria os contrutores
	public Carro (String a, String b, String c,int d, double e, boolean f){		
		marca = a;
		modelo = b;
		cor = c;
		anoDeFabricacao = d; 
		preco = e;
		zero = f;
		
	}
	
	
	//metodos de acesso - getters
	public String getMarca(){
		return marca;
	}
	public String getModelo(){
		return modelo;
	}
	public String getCor(){
		return cor;
	}
	
	public int getAnoDeFabricacao(){
		return anoDeFabricacao;
	}
	
	public double getPreco(){
		return preco;
	}

	public boolean getZero(){
		return zero;
	}	

	
	//metodos modificadores - setters
	
	public void setMarca(String a){
		marca = a;
	}
	public void setModelo(String b){
		modelo= b;
	}
		public void setCor(String c){
		cor = c;
	}
	
	public void setAnoDeFabricacao (int d){
		anoDeFabricacao = d;
	}
	
	public void setPreco (double d){
		preco = d;
	}
	
	public void setZero (boolean f){
		zero = f;
	}		
	
}