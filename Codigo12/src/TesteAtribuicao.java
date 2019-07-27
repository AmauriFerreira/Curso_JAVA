import javax.swing.JOptionPane;

public class TesteAtribuicao {

	// cadastrar um novo Professor no metodo main
	public static void main(String[] args) {

		// coletando os dados do Professor a ser cadastrado
		char resp;
		boolean pratica;
		String nome = JOptionPane.showInputDialog("Nome da disciplina");
		 resp = JOptionPane.showInputDialog("E pratica disciplina? S/N").charAt(0);
			//pratica=false;
			if(resp=='S')
			pratica=true;
			else
			pratica=false;
			
	
		String nome1 = JOptionPane.showInputDialog("Nome do professor");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		
		
		//cria a Disciplina
		Disciplina disciplina = new Disciplina(nome, pratica);

		// cria um objeto Professor
		Professor professor = new Professor(nome1, idade);
		
		// cria um objeto Atribuicao
		Atribuicao 	atribuicao  = new Atribuicao (professor, disciplina);

		// mostra o tribuicao
		JOptionPane.showMessageDialog(null, atribuicao.getDados());
		    
		
	}
}
