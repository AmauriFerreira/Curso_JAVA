import javax.swing.JOptionPane;

public class TesteAluno {

	// cadastrar um novo aluno no metodo main
	public static void main(String[] args) {

		// coletando os dados do aluno a ser cadastrado

		String nome = JOptionPane.showInputDialog("Nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		// pega o primeiro caracter da String e retorna como char
		char sexo = JOptionPane.showInputDialog("Sexo M/F").charAt(0);
		String codigo = JOptionPane.showInputDialog("Codigo da Turma");
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano da Turma"));
	
		//cria a turma
		Turma turma = new Turma(codigo, ano);

		// cria um objeto aluno
		Aluno aluno = new Aluno(nome, idade, peso, sexo, turma);

		// nao precisa mais montar a string de saida, e so chamar o metodo getDados
		
		// mostra o aluno
		JOptionPane.showMessageDialog(null, aluno.getDados());

		// altera informacoes; nao precisa criar todas as variaveis novamente
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		// tem que digitar true ou false
		boolean formando = Boolean.parseBoolean(JOptionPane.showInputDialog("E' formando?true/false"));

		// muda usando os metodo modificadores
		aluno.setIdade(idade);
		aluno.setPeso(peso);
		aluno.setFormando(formando);

		// mostra novamente o cadastro do aluno
		
		// mostra o aluno
		JOptionPane.showMessageDialog(null, aluno.getDados());
	}
}
