import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Aluno {
	//atributos
	private int idAluno;
	private String nome;
	private String endereco;
	private String email;
	private int fone;
	private String login;
	private String senha;
	
	//construtores
	public Aluno ()
	{
	}
	
	public Aluno(int idAluno, String nome, String end, String email, int fone, String login, String senha)
	{
		this.idAluno=idAluno;
		this.nome=nome;
		this.endereco=end;
		this.email=email;
		this.fone= fone;
		this.login = login;
		this.senha = senha;
	}
	
	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFone() {
		return fone;
	}

	public void setFone(int fone) {
		this.fone = fone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString()
	{
		return idAluno+"	"+nome+"	"+endereco+"	"+email+"	"+fone+"	"
	+login+"	"+senha;
	}
	public void incluir(Connection conn)
	{
		String sqlInsert = "INSERT INTO aluno(id,nome,endereco,email,fone,login,senha) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?)";
		try(PreparedStatement stm=conn.prepareStatement(sqlInsert);)
		{
			stm.setInt(1, getIdAluno());
			stm.setString(2, getNome());
			stm.setString(3, getEndereco());
			stm.setString(4, getEmail());
			stm.setInt(5, getFone());
			stm.setString(6, getLogin());
			stm.setString(7, getSenha());
			stm.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			try
			{
				conn.rollback();
			}
			catch(SQLException e1)
			{
				System.out.println(e1.getStackTrace());
			}
		}
	}
	public void excluir(Connection conn)
	{
		String sqlDelete = "DELETE FROM aluno WHERE nome = ?";
		try(PreparedStatement stm = conn.prepareStatement(sqlDelete);)
		{
			stm.setString(1, getNome());
			stm.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			try
			{
				conn.rollback();
			}
			catch(SQLException e1)
			{
				System.out.println(e1.getStackTrace());
			}
		}
	}
	public void atualizarEmail(Connection conn, String novoEmail)
	{
		String sqlUpdate = "UPDATE ALUNO SET EMAIL = ? WHERE NOME = ?";
		try (PreparedStatement stm = conn.prepareStatement(sqlUpdate);)
		{
			stm.setString(1, novoEmail);
			stm.setString(2, getNome());
			stm.execute();
		}
		catch (Exception e)
		{
			e.printStackTrace();
			try
			{
				conn.rollback();
			}
			catch (SQLException e1)
			{
				System.out.println(e1.getStackTrace());
			}
		}
	}
	public void carregar(Connection conn)
	{
		String sqlSelect = "SELECT * FROM aluno WHERE aluno.nome = ?";
		try(PreparedStatement stm = conn.prepareStatement(sqlSelect);)
		{
			stm.setString(1, getNome());
			try(ResultSet rs = stm.executeQuery();)
			{
				if(rs.next())
				{
					this.setNome(rs.getString(2));
					this.setEndereco(rs.getString(3));
					this.setEmail(rs.getString(4));
					this.setFone(rs.getInt(5));
					this.setLogin(rs.getString(6));
					this.setSenha(rs.getString(7));
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		catch(SQLException e1)
		{
			System.out.println(e1.getStackTrace());
		}
	}
	public ArrayList<Aluno> buscarAlunos(Connection conn)
	{
		String sqlSelect = "SELECT id, nome, endereco, email, fone, login, senha FROM ALUNO";
		ArrayList<Aluno> lista = new ArrayList<>();
		try(PreparedStatement stm = conn.prepareStatement(sqlSelect);
			ResultSet rs = stm.executeQuery();)
		{
			while(rs.next())
			{
				Aluno aluno  = new Aluno();
				aluno.setIdAluno(rs.getInt("id"));
				aluno.setNome(rs.getString("nome"));
				aluno.setEndereco(rs.getString("endereco"));
				aluno.setEmail(rs.getString("email"));
				aluno.setFone(rs.getInt("fone"));
				aluno.setLogin(rs.getString("login"));
				aluno.setSenha(rs.getString("senha"));
				lista.add(aluno);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return lista;
	}
	
}

-------------------------------------------------------------------------------------------------------------------------------------
import java.sql.Connection;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class TelaAluno extends JFrame implements ActionListener{
	private JLabel lblId, lblNome, lblEndereco, lblEmail, lblFone, lblLogin, lblSenha;
	private JTextField txtId, txtNome, txtEndereco, txtEmail, txtFone, txtLogin, txtSenha;
	private JButton btnInsere, btnAtualiza, btnExclui, btnConsulta, btnLimpa;
	private JPanel pnlOeste, pnlLeste, pnlSul;
	private Connection conn;
	
	public TelaAluno(Connection conn) {
		
		super ("Aluno");
		
		this.conn = conn;
		
		lblId = new JLabel("Id");
	
		lblNome = new JLabel("Nome");
		
		lblEndereco = new JLabel("Endereço");
		
		lblEmail = new JLabel("E-mail");
		
		lblFone = new JLabel("Fone");

		lblLogin = new JLabel("Login");

		lblSenha = new JLabel("Senha");

		
		txtId = new JTextField(8);
		txtId.setEditable(false);
		txtNome = new JTextField(20);
		txtEndereco = new JTextField(40);
		txtEmail = new JTextField(30);
		txtFone = new JTextField(11);
		txtLogin = new JTextField(15);
		txtSenha = new JTextField(15);
		
		btnInsere = new JButton("Inserir");
		btnAtualiza = new JButton("Atualizar");
		btnExclui = new JButton("Excluir");
		btnConsulta = new JButton("Consultar");
		btnLimpa = new JButton("Limpar");
		
		pnlOeste = new JPanel();
		pnlOeste.setLayout(new GridLayout(7, 1));
		
		pnlOeste.add(lblId);
		pnlOeste.add(lblNome);
		pnlOeste.add(lblEndereco);
		pnlOeste.add(lblEmail);
		pnlOeste.add(lblFone);
		pnlOeste.add(lblLogin);
		pnlOeste.add(lblSenha);
		
		pnlLeste = new JPanel();
		pnlLeste.setLayout(new GridLayout(7, 1));
		
		pnlLeste.add(txtId);
		pnlLeste.add(txtNome);
		pnlLeste.add(txtEndereco);
		pnlLeste.add(txtEmail);
		pnlLeste.add(txtFone);
		pnlLeste.add(txtLogin);
		pnlLeste.add(txtSenha);


		
		pnlSul = new JPanel();
		
		pnlSul.setLayout(new FlowLayout());
		pnlSul.add(btnInsere);
		pnlSul.add(btnAtualiza);
		pnlSul.add(btnExclui);
		pnlSul.add(btnConsulta);
		pnlSul.add(btnLimpa);
		
		Container caixa = getContentPane();
		caixa.setLayout(new BorderLayout());
		
		caixa.add(pnlOeste, BorderLayout.WEST);
		caixa.add(pnlLeste, BorderLayout.EAST);
		caixa.add(pnlSul, BorderLayout.SOUTH);
		
		btnInsere.addActionListener(this);
		btnAtualiza.addActionListener(this);
		btnExclui.addActionListener(this);
		btnConsulta.addActionListener(this);
		btnLimpa.addActionListener(this);
		
		setSize(550, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		 


	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAtualiza) {
			Aluno aluno = new Aluno();
			String sNome = txtNome.getText();
			aluno.setNome(sNome);
			aluno.carregar(conn);
			if (aluno.getNome() != null && sNome.length() > 0) {
				String novoEmail = JOptionPane.showInputDialog(this,"Insira o novo email");
				aluno.atualizarEmail(conn, novoEmail);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno não encontrado");
			}
		}
		else if (e.getSource() == btnExclui) {
			Aluno aluno = new Aluno();
			String sNome = txtNome.getText();
			aluno.setNome(sNome);
			aluno.carregar(conn);
			if (aluno.getNome() != null && sNome.length() > 0) {
				aluno.excluir(conn);
				limpa();
				JOptionPane.showMessageDialog(this, "Excluido com sucesso!");
			}else {
				JOptionPane.showMessageDialog(this, "Aluno não encontrado");
			}
		}
		else if (e.getSource() == btnLimpa) {
			limpa();	
		}
		else if (e.getSource() == btnConsulta) {
				Aluno aluno = new Aluno();
				String sNome = txtNome.getText();
				aluno.setNome(sNome);
				aluno.carregar(conn);
				System.out.println(aluno.getNome());	
										
				if (aluno.getNome() != null && sNome.length() > 0) {
									
					txtId.setText(String.valueOf(aluno.getIdAluno()));
					txtNome.setText(aluno.getNome());	
					txtEndereco.setText(aluno.getEndereco());
					txtEmail.setText(aluno.getEmail());
					txtFone.setText(String.valueOf(aluno.getFone()));
					txtLogin.setText(aluno.getLogin());
					
				}
				else {
					JOptionPane.showMessageDialog(this, "Aluno não encontrado");
				}

			
		}
		
		else {
				Aluno aluno = new Aluno();
				//String sId = txtId.getText();
				String sNome = txtNome.getText();
				String sEndereco = txtEndereco.getText();
				String sEmail = txtEmail.getText();
				String sFone = txtFone.getText();
				String sLogin = txtLogin.getText();
				String sSenha = txtSenha.getText();
				if (/* sId.length() > 0 && */ sNome.length() > 0 && sEndereco.length() > 0 && sEmail.length() > 0 && sFone.length() > 0 && sLogin.length() > 0 && sSenha.length() > 0) {
					//aluno.setIdAluno(Integer.parseInt(sId));
					aluno.setNome(sNome);
					aluno.setEndereco(sEndereco);
					aluno.setEmail(sEmail);
					aluno.setFone(Integer.parseInt(sFone));
					aluno.setLogin(sLogin);
					aluno.setSenha(sSenha);
					aluno.incluir(conn);
					limpa();
					JOptionPane.showMessageDialog(this, "Incluído com sucesso");
				}
				else {
					JOptionPane.showMessageDialog(this, "Preencha todos os campos");
				}
			}
		}






	






------------------------------------------------------------------------------------------------------

-------------------------------------------------------------------------

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class TelaEmpregado extends JFrame implements ActionListener{
	private JLabel lblNumRegistro, lblNomeEmpregado, lblRgEmpregado, lblCpfEmpregado, lblDataAdmisao,lblCargoEmpregado;
	private JTextField txtNumRegistro, txtNomeEmpregado, txtRgEmpregado,txtCpfEmpregado,txtDataAdmisao,txtCargoEmpregado;
	private JButton btnInsere, btnLimpa, btnSai,btnExcluir;
	private JPanel pnlOeste, pnlLeste, pnlSul;
	private Connection conn;
	
	public TelaEmpregado(Connection conn) {
		super ("empregadosCadastro ");
		
		this.conn = conn;
		
		lblNumRegistro = new JLabel("Numero de Registro");
		lblNomeEmpregado= new JLabel("Nome do Empregado");
		lblRgEmpregado= new JLabel("Rg do Empregado");
		lblCpfEmpregado = new JLabel("Cpf do Empregado");
		lblDataAdmisao = new JLabel("Data de Admisao do Empregado");
		lblCargoEmpregado = new JLabel("Data de Admisao do Empregado");
		
		
		txtNumRegistro = new JTextField(8);
		txtNomeEmpregado= new JTextField(15);
		txtRgEmpregado = new JTextField(10);
		txtCpfEmpregado = new JTextField(10);
		txtDataAdmisao = new JTextField(8);
		txtDataAdmisao = new JTextField(8);
		txtCargoEmpregado = new JTextField(8);
	
		
		btnInsere = new JButton("Inserir");
		btnLimpa = new JButton("Limpar");
		btnSai = new JButton("Sair");
		btnExcluir = new JButton("Excluir");
		
		
		pnlOeste = new JPanel();
		pnlOeste.setLayout(new GridLayout(3, 1));
		pnlOeste.add(lblNumRegistro);
		pnlOeste.add(lblNomeEmpregado);
		pnlOeste.add(lblRgEmpregado);
		pnlOeste.add(lblCpfEmpregado);
		pnlOeste.add(lblDataAdmisao);
		pnlOeste.add(lblCargoEmpregado);
		
		pnlLeste = new JPanel();
		pnlLeste.setLayout(new GridLayout(3, 1));
		pnlLeste.add(txtNumRegistro);
		pnlLeste.add(txtNomeEmpregado);
		pnlLeste.add(txtRgEmpregado);
		pnlLeste.add(txtCpfEmpregado);
		pnlLeste.add(txtDataAdmisao);
		pnlLeste.add(txtCargoEmpregado);
		
		pnlSul = new JPanel();
		pnlSul.setLayout(new FlowLayout());
		pnlSul.add(btnInsere);
		pnlSul.add(btnLimpa);
		pnlSul.add(btnSai);
		pnlExcluir.add(btnExcluir);
		
		
		
		Container caixa = getContentPane();
		caixa.setLayout(new BorderLayout());
		
		caixa.add(pnlOeste, BorderLayout.WEST);
		caixa.add(pnlLeste, BorderLayout.EAST);
		caixa.add(pnlSul, BorderLayout.SOUTH);
		
		btnInsere.addActionListener(this);
		btnLimpa.addActionListener(this);
		btnSai.addActionListener(this);
		btnExcluir.addActionListener(this);
		
		setSize(450, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLimpa) {
			
		txtNumRegistro.setText ("");
		txtNomeEmpregado.setText("");
		txtRgEmpregado.setText ("");
		txtCpfEmpregado.setText ("");
		txtDataAdmisao.setText("");
		txtDataAdmisao.setText ("");
		txtCargoEmpregado.setText ("");
			
		}
		else if (e.getSource() == btnSai) {
			System.exit(0);
		}
		else {
			Empregado empregado = new Empregado();
			String sNumRegistro = txtNumRegistro.getText();
			String sNomeEmpregado = txtNomeEmpregado.getText();
			String sRgEmpregado = txtRgEmpregado.getText();
			String sCpfEmpregado = txtCpfEmpregado.getText();
			String sDataAdmisao = txtDataAdmisao.getText();
			String sCargoEmpregado= txtCargoEmpregado.getText();
			if (sNumRegistro.length() > 0 && sNomeEmpregado.length() > 0 &&
			   sRgEmpregado.length() >0 && sCpfEmpregado.length() > 0 && 
			   sDataAdmisao.length() > 0 && sCargoEmpregado.length() > 0 ) {
				empregado.setIdEmpregado(Integer.parseInt(sNumRegistro));
				empregado.setNome(sNomeEmpregado);
				empregado.setRg(sRgEmpregado);
				empregado.setCpf(sCpfEmpregado);
				empregado.setDtAdmissao(sDataAdmisao);
				empregado.setCargo(sCargoEmpregado);
				empregado.incluir(conn);
			}
			else {
				JOptionPane.showMessageDialog(this, "Preencha todos os campos");
				}
			} 
		}
	}






import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class TelaEmpregado extends JFrame implements ActionListener{
	private JLabel lblNumRegistro, lblNomeEmpregado, lblRgEmpregado, lblCpfEmpregado, lblDataAdmisao,lblCargoEmpregado;
	private JTextField txtNumRegistro, txtNomeEmpregado, txtRgEmpregado,txtCpfEmpregado,txtDataAdmisao,txtCargoEmpregado;
	private JButton btnInsere, btnLimpa, btnSai,btnExcluir;
	private JPanel pnlOeste, pnlLeste, pnlSul;
	private Connection conn;
	
	public TelaEmpregado(Connection conn) {
		super ("empregadosCadastro ");
		
		this.conn = conn;
		
		lblNumRegistro = new JLabel("Numero de Registro");
		lblNomeEmpregado= new JLabel("Nome do Empregado");
		lblRgEmpregado= new JLabel("Rg do Empregado");
		lblCpfEmpregado = new JLabel("Cpf do Empregado");
		lblDataAdmisao = new JLabel("Data de Admisao do Empregado");
		lblCargoEmpregado = new JLabel("Data de Admisao do Empregado");
		
		
		txtNumRegistro = new JTextField(8);
		txtNomeEmpregado= new JTextField(15);
		txtRgEmpregado = new JTextField(10);
		txtCpfEmpregado = new JTextField(10);
		txtDataAdmisao = new JTextField(8);
		txtDataAdmisao = new JTextField(8);
		txtCargoEmpregado = new JTextField(8);
	
		
		btnInsere = new JButton("Inserir");
		btnLimpa = new JButton("Limpar");
		btnSai = new JButton("Sair");
		btnExcluir = new JButton("Excluir");
		
		
		pnlOeste = new JPanel();
		pnlOeste.setLayout(new GridLayout(6,1));
		pnlOeste.add(lblNumRegistro);
		pnlOeste.add(lblNomeEmpregado);
		pnlOeste.add(lblRgEmpregado);
		pnlOeste.add(lblCpfEmpregado);
		pnlOeste.add(lblDataAdmisao);
		pnlOeste.add(lblCargoEmpregado);
		
		pnlLeste = new JPanel();
		pnlLeste.setLayout(new GridLayout(6,1));
		pnlLeste.add(txtNumRegistro);
		pnlLeste.add(txtNomeEmpregado);
		pnlLeste.add(txtRgEmpregado);
		pnlLeste.add(txtCpfEmpregado);
		pnlLeste.add(txtDataAdmisao);
		pnlLeste.add(txtCargoEmpregado);
		
		pnlSul = new JPanel();
		
		pnlSul.setLayout(new FlowLayout());
		pnlSul.add(btnInsere);
		pnlSul.add(btnLimpa);
		pnlSul.add(btnSai);
		pnlExcluir.add(btnExcluir);
		
		Container caixa = getContentPane();
		caixa.setLayout(new BorderLayout());
		
		caixa.add(pnlOeste, BorderLayout.WEST);
		caixa.add(pnlLeste, BorderLayout.EAST);
		caixa.add(pnlSul, BorderLayout.SOUTH);
		
		btnInsere.addActionListener(this);
		btnLimpa.addActionListener(this);
		btnSai.addActionListener(this);
		btnExcluir.addActionListener(this);
		
		setSize(450, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLimpa) {
			
		txtNumRegistro.setText ("");
		txtNomeEmpregado.setText("");
		txtRgEmpregado.setText ("");
		txtCpfEmpregado.setText ("");
		txtDataAdmisao.setText("");
		txtDataAdmisao.setText ("");
		txtCargoEmpregado.setText ("");
			
		}
		
		else if (e.getSource() == btnExclui) {
			Aluno aluno = new Aluno();
			String sNome = txtNome.getText();
			aluno.setNome(sNome);
			aluno.carregar(conn);
			if (aluno.getNome() != null && sNome.length() > 0) {
				aluno.excluir(conn);
				limpa();
				JOptionPane.showMessageDialog(this, "Excluido com sucesso!");
			}else {
				JOptionPane.showMessageDialog(this, "Aluno não encontrado");
			}
		}
		else if (e.getSource() == btnSai) {
			System.exit(0);
		}
		else {
			Empregado empregado = new Empregado();
			String sNumRegistro = txtNumRegistro.getText();
			String sNomeEmpregado = txtNomeEmpregado.getText();
			String sRgEmpregado = txtRgEmpregado.getText();
			String sCpfEmpregado = txtCpfEmpregado.getText();
			String sDataAdmisao = txtDataAdmisao.getText();
			String sCargoEmpregado= txtCargoEmpregado.getText();
			if (sNumRegistro.length() > 0 && sNomeEmpregado.length() > 0 &&
			   sRgEmpregado.length() >0 && sCpfEmpregado.length() > 0 && 
			   sDataAdmisao.length() > 0 && sCargoEmpregado.length() > 0 ) {
				empregado.setIdEmpregado(Integer.parseInt(sNumRegistro));
				empregado.setNome(sNomeEmpregado);
				empregado.setRg(sRgEmpregado);
				empregado.setCpf(sCpfEmpregado);
				empregado.setDtAdmissao(sDataAdmisao);
				empregado.setCargo(sCargoEmpregado);
				empregado.incluir(conn);
			}
			else {
				JOptionPane.showMessageDialog(this, "Preencha todos os campos");
				}
			} 
		}
	}


