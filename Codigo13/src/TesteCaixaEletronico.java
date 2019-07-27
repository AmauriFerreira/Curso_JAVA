import javax.swing.JOptionPane;

public class TesteCaixaEletronico {


	public static void main(String[] args) {

		// coletando os dados do cliente cadastrado
		
		
		String nome = JOptionPane.showInputDialog("Nome do cliente");
		
		String cpf = JOptionPane.showInputDialog("Numero de cpf");
		
		//String nome = JOptionPane.showInputDialog("Nome da agencia");
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta:"));
		char[] digitos = String.valueOf( numero ).toCharArray();
		
		while (digitos.length!=4){
		JOptionPane.showMessageDialog(null,"O numero da conta tem que ter 4 dig.");
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta:"));
		digitos = String.valueOf( numero ).toCharArray();
		}
		
		int numeroAgencia =Integer.parseInt(JOptionPane.showInputDialog("Numero da agencia:"));
		
		int digito= Integer.parseInt(JOptionPane.showInputDialog("Digite o digito da conta:"));
		
	
		
		// cria um objeto Agencia
		
		Agencia agencia = new Agencia(nome, numeroAgencia,digito);
		
		// cria um objeto ContaCorrente 
		
		ContaCorrente contaCorrente  = new ContaCorrente(numero,digito,agencia,150);
		
		// cria um objeto Cliente
	
		Cliente cliente = new Cliente(nome, cpf,contaCorrente);

		
		
		JOptionPane.showMessageDialog(null, cliente.getDados()+ contaCorrente.getDados());
		
		//Sacar
		contaCorrente.setSacar(Double.parseDouble(JOptionPane.showInputDialog("Quanto voce deseja saca?")));

		
		}		
	}
