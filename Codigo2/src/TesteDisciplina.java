import javax.swing.JOptionPane;
public class TesteDisciplina{
    
	public static void main (String[] args) {
	
	//cria os objetos disciplina
	Disciplina disciplina = new Disciplina("POO",true);
	
	//altera para não pratica
    System.out.println("Disciplina:"+disciplina.getNome());
	
	disciplina.setPratica(false);
	
	System.out.println(disciplina.getDados());
	
}
}
		