import javax.swing.JOptionPane;

public class TesteTurma {
	
	//cadastra um novo turma no metodo main
	public static void main(String args[]){
	
	// coletando os dados do turma a ser cadastrado
	
	
	String nome1 = JOptionPane.showInputDialog("Nome");
    
	String curso1 = JOptionPane.showInputDialog("Curso");
	
	int quantidadeDealunos1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de turma"));
	
	int serie1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a serie"));
	
	
		//cria um objeto turmaturma
	Turma turma1 = new Turma(nome1,curso1,quantidadeDealunos1,serie1);
	
	//monte a String de saida chamada os metodos de acesso do turma 
	String msg1 = turma1.getNome() +"\nCurso" + turma1.getCurso() + "\nQuantidade:" + turma1.getQuantidadeDeAlunos() + "\nserie" 
	+ turma1.getSerie() ;
	

	
	//Mostra o turma
	JOptionPane.showMessageDialog(null,msg1);
	
	
  }
  
}