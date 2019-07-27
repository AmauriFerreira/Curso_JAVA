import javax.swing.JOptionPane;

public class TesteAtribuicao {

	// cadastrar um novo Professor no metodo main
	public static void main(String[] args) {

		// coletando os dados do Professor a ser cadastrado

		String nome = JOptionPane.showInputDialog("Nome da disciplina");
		boolean pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("E' pratica?true/false"));
		String nome1 = JOptionPane.showInputDialog("Nome do professor");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		
		
		//cria a Disciplina
		Disciplina disciplina = new Disciplina(nome, pratica);

		// cria um objeto Professor
		Professor professor = new Professor(nome1, idade);
		
		// cria um objeto Professor
		Atribuicao 	atribuicao  = new Atribuicao (professor, disciplina);

		// mostra o Professor
		JOptionPane.showMessageDialog(null, atribuicao.getDados());
		    
		
	}
}





