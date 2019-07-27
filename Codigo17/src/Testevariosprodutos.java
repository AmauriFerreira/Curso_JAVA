import javax.swing.JOptionPane;

public class Testevariosprodutos {
	
	//cadastra um novo Produto no metodo main
	public static void main(String args[]){
	
	// coletando os dados do Produto ser cadastrado
	
		String nome;

		int max=Integer.parseInt(JOptionPane.showInputDialog("Numero de produtos"));

		double preco;
		
		int quantidade;

		String msg="";

	
	for(int i=1;i<=max;i++)

		{

	JOptionPane.showMessageDialog(null,"Produto "+i);
	
		nome = JOptionPane.showInputDialog("Nome");
    
		preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));
	
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade "));
	
	
	
	Produto produto = new Produto(nome,preco,quantidade);
	
	//monte a String de saida chamada os metodos de acesso do Produto
	msg += produto.getNome() +"\nO preço $" + produto.getPreco() + "\nQuantidade:" + produto.getQuantidade();
	
		}
	
		JOptionPane.showMessageDialog(null,msg);
		
	}

}