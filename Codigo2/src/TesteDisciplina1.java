import javax.swing.JOptionPane;
public class TesteDisciplina1{
    
	public static void main (String[] args) {
	
	//cria os objetos disciplina
	Disciplina disciplina = new Disciplina("POO",true);
	Aluno aluno = new Aluno("Joao", 19, 72.6, 'M', true);
	Turma turma = new Turma(aluno, disciplina);
	
	
   
   
   
   
	//exibir na tela
	
	System.out.println(turma.getAluno());
	
	JOptionPane.showMessageDialog (null, turma.)
	System.out.println("Disciplina:"+disciplina.getTurma());
	
	turma.imprime ();
	//exibir na janela
	
	

    
	
}
}
		