import javax.swing.JOptionPane;

public class TesteTurma2 {
	
	//cadastra um novo turma no metodo main
	public static void main(String args[]){
	
	// coletando os dados do turma a ser cadastrado
	
	
	String nome1 = JOptionPane.showInputDialog("Nome");
    
	String curso1 = JOptionPane.showInputDialog("Curso");
	
	int quantidadeDeAlunos1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de turma"));
	
	int serie1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a serie"));
	
	
		//cria um objeto turmaturma
	Turma turma1 = new Turma(nome1,curso1,quantidadeDeAlunos1,serie1);
	
	//monte a String de saida chamada os metodos de acesso do turma 
	String msg1 = turma1.getNome() +"\nCurso" + turma1.getCurso() + "\nQuantidade:" + turma1.getQuantidadeDeAlunos() + "\nserie" 
	+ turma1.getSerie() ;
	


	
	// coletando os dados do turma a ser cadastrado
	
	
	String nome2 = JOptionPane.showInputDialog("Nome");
    
	String curso2 = JOptionPane.showInputDialog("Curso");
	
	int quantidadeDeAlunos2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de aluno"));
	
	int serie2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a serie"));
	
	
		//cria um objeto turmaturma
	Turma turma2 = new Turma(nome2,curso2,quantidadeDeAlunos2,serie2);
	
	//monte a String de saida chamada os metodos de acesso do turma 
	String msg2 = turma2.getNome() +"\nCurso" + turma2.getCurso() + "\nQuantidade:" + turma2.getQuantidadeDeAlunos() + "\nserie" 
	+ turma2.getSerie() ;
	//Mostra o turma
	
		JOptionPane.showMessageDialog(null,msg1);
		JOptionPane.showMessageDialog(null,msg2);
	
	
  }
  
}