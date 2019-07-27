import javax.swing.JOptionPane;

public class TesteCarro {
	
	//cadastra um novo Produto no metodo main
	public static void main(String args[]){
	
		// coletando os dados do Produto ser cadastrado
		
		
		String marca = JOptionPane.showInputDialog("Digite a Marca do carro");
		String modelo = JOptionPane.showInputDialog("Modelo");
		String cor = JOptionPane.showInputDialog("Cor");
		int anoDeFabricacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano "));
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preco"));
		char resp1 =JOptionPane.showInputDialog("O carro e zero S/N").charAt(0);
		boolean zero=false;
		if(resp1 == 'S'){
			zero=true;
		}		
		
		Carro carro = new Carro(marca,modelo,cor,anoDeFabricacao,preco,zero);
		// 
		//monte a String de saida chamada os metodos de acesso do Produto
		String msg = "MARCA: " + carro.getMarca() + "\nMODELO: " + carro.getModelo() + "\nCOR: " + carro.getCor()+ "\nAno de fabricacao: " + carro.getAnoDeFabricacao();
		if(carro.getZero()){
			msg +="\nO Carro e: Zero";
		}else{
			msg +="\nO Carro e: Seminovo";
		}
			JOptionPane.showMessageDialog(null,msg);
		
	}

}

	