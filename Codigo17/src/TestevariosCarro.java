import javax.swing.JOptionPane;

public class TestevariosCarro {
	
	//cadastra um novo Produto no metodo main
	public static void main(String args[]){
	
		// coletando os dados do Produto ser cadastrado
		
	
		String marca;
		String modelo;
		String cor;
		int max=Integer.parseInt(JOptionPane.showInputDialog("Numero de carros"));
		double preco;
		char resp1;
		int anoDeFabricacao;
		boolean zero;

		String msg="";

	
	for(int i=1;i<=max;i++)

		{
		JOptionPane.showMessageDialog(null,"Produto "+i);
		marca = JOptionPane.showInputDialog("Digite a Marca do carro");
		modelo = JOptionPane.showInputDialog("Modelo");
		cor = JOptionPane.showInputDialog("Cor");
		anoDeFabricacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano "));
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco"));
	    resp1 =JOptionPane.showInputDialog("O carro e zero S/N").charAt(0);
		zero=false;
		if(resp1 == 'S'){
			zero=true;
		}		
		
		Carro carro = new Carro(marca,modelo,cor,anoDeFabricacao,preco,zero);
		// 
		//monte a String de saida chamada os metodos de acesso do Produto
		msg += "MARCA: " + carro.getMarca() + "\nMODELO: " + carro.getModelo() + "\nCOR: " + carro.getCor()+ "\nAno de fabricacao: " + carro.getAnoDeFabricacao();
		if(carro.getZero()){
			msg +="\nO Carro e: Zero";
		}else{
			msg +="\nO Carro e: Seminovo";
		}
			JOptionPane.showMessageDialog(null,msg);
		
	}

  }
}
