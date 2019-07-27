import javax.swing.JOptionPane;

public class TesteProduto {
	
	//cadastra um novo Produto no metodo main
	public static void main(String args[]){
	
	// coletando os dados do Produto ser cadastrado
	
	
	String nome1 = JOptionPane.showInputDialog("Nome");
    
	double preco1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));
	
	int quantidade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade "));
	
	
	
	Produto produto1 = new Produto(nome1,preco1,quantidade1);
	
	//monte a String de saida chamada os metodos de acesso do Produto
	String msg1 = produto1.getNome() +"\nO preço $" + produto1.getPreco() + "\nQuantidade:" + produto1.getQuantidade();
	
		JOptionPane.showMessageDialog(null,msg1);
		
	}

}