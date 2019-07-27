import javax.swing.JOptionPane;
public class TesteDisciplina1{
    
	public static void main (String[] args) {
	
	//cria os objetos disciplina
	Disciplina disciplina = new Disciplina("POO",true);
	Aluno aluno = new Aluno("Joao", 19, 72.6, 'M', true);
	Turma turma = new Turma(aluno, disciplina);
	
	
   
	System.out.print("Disciplina pratica:");
	if (disciplina.isPratica()){
		System.out.println("Sim");
	}else{
		System.out.println("Nao");
	}
	
	//altera para não pratica
	disciplina.setPratica(false);
	
	
	System.out.print("Disciplina pratica:");
	if (disciplina.isPratica()){
		System.out.println("Sim");
	}else{
		System.out.println("Nao");
	}
}
}
		