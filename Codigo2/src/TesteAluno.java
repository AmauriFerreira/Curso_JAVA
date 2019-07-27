import javax.swing.JOptionPane;
public class TesteAluno{
    //cadastrar um novo aluno no metodo main
	public static void main (String[] args) {
		//declaração de variaveis
		String nome;
		int idade;
		int max=Integer.parseInt(JOptionPane.showInputDialog("Numero de alunos"));
		double peso;
		char sexo;
		char resp;
		boolean formando;
		String msg="";
		
		for(int i=1;i<=max;i++)
		{
			JOptionPane.showMessageDialog(null,"Aluno "+i);
			//coletando os dados do aluno
			nome = JOptionPane.showInputDialog("Nome");
			idade=Integer.parseInt(JOptionPane.showInputDialog("Idade"));
			peso=Double.parseDouble(JOptionPane.showInputDialog("Peso"));
			//pega o primeiro caractere da String e retorna como char
			sexo=JOptionPane.showInputDialog("Sexo M/F").charAt(0);

			resp = JOptionPane.showInputDialog("Formando S/N").charAt(0);
			formando=false;
			if (resp == 'S') {
				formando=true;
			}
			
			
			
			//cria um objeto aluno1
			Aluno aluno = new Aluno(nome, idade, peso, sexo, formando);
		
			
		   // Monta a String de saida chamando os metodos de acesso do aluno1

		   msg += "Nome: "+aluno.getNome() + "\nIdade: "  + aluno.getIdade() + " anos" + "\nPeso: " + aluno.getPeso() + " kg";

		   if (aluno.getFormando()){
			   msg += "\nFormando: sim";
		   } else {
			  msg += "\nFormando: nao";
		   }
		   if (aluno.getSexo()== 'M'){
			   msg += "\nsexo: masculino\n\n";
		   } else {
			   msg += "\nsexo: feminino\n\n";
		   }
		}

	   // mostra alunos
	   JOptionPane.showMessageDialog (null, msg);
	}
}