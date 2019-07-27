import javax.swing.JOptionPane;
public class TesteDisciplina{
    
	public static void main (String[] args) {
	
	//cria os objetos disciplina
	Disciplina disciplina = new Disciplina("POO",true);
	
	//imprime dados
    System.out.println("Disciplina:"+disciplina.getNome());
	System.out.print("Disciplina pratica:");
	if (disciplina.isPratica()){
		System.out.println("Sim");
	}else{
		System.out.println("Nao");
	}
	//altera para não pratica
	disciplina.setPratica(false);
	
	//imprime dados novamente
    System.out.println("Disciplina:"+disciplina.getNome());
	System.out.print("Disciplina pratica:");
	if (disciplina.isPratica()){
		System.out.println("Sim");
	}else{
		System.out.println("Nao");
	}
}
}
		