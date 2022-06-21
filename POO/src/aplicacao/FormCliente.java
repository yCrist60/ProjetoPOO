package aplicacao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.PrjCliente;
import classes.PrjEndereco;
import classes.PrjUsuario;
import repositorio.RepoSistema;

public class FormCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdCliente;
	private JTextField txtNomeCliente;
	private JTextField txtEmail;
	private JTextField txtIdUsuario;
	private JTextField txtNomeUsuario;
	private JPasswordField txtSenha;
	private JLabel lblIdEndereco;
	private JTextField txtIdEndereco;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private JLabel lblLogradouro;
	private JLabel lblNumero;
	private JLabel lblBairro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCliente frame = new FormCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormCliente() {
		setResizable(false);
		setTitle("Gerenciar Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 594);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 224));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdCliente = new JLabel("id do Cliente");
		lblIdCliente.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblIdCliente.setBounds(21, 21, 98, 19);
		contentPane.add(lblIdCliente);
		
		txtIdCliente = new JTextField();
		txtIdCliente.setBounds(21, 49, 86, 20);
		contentPane.add(txtIdCliente);
		txtIdCliente.setColumns(10);
		
		JLabel lblNomeCliente = new JLabel("Nome do Cliente:");
		lblNomeCliente.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNomeCliente.setBounds(143, 23, 173, 14);
		contentPane.add(lblNomeCliente);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(143, 49, 325, 20);
		contentPane.add(txtNomeCliente);
		txtNomeCliente.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEmail.setBounds(21, 105, 98, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(21, 130, 447, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblIdUsuario = new JLabel("id do Usu\u00E1rio");
		lblIdUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblIdUsuario.setBounds(21, 196, 98, 19);
		contentPane.add(lblIdUsuario);
		
		txtIdUsuario = new JTextField();
		txtIdUsuario.setColumns(10);
		txtIdUsuario.setBounds(21, 226, 86, 20);
		contentPane.add(txtIdUsuario);
		
		JLabel lblNomeUsuario = new JLabel("Nome do Usu\u00E1rio:");
		lblNomeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNomeUsuario.setBounds(143, 198, 173, 14);
		contentPane.add(lblNomeUsuario);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setColumns(10);
		txtNomeUsuario.setBounds(143, 226, 164, 20);
		contentPane.add(txtNomeUsuario);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(339, 226, 129, 20);
		contentPane.add(txtSenha);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSenha.setBounds(339, 198, 123, 14);
		contentPane.add(lblSenha);
		
		lblIdEndereco = new JLabel("id do Endere\u00E7o");
		lblIdEndereco.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblIdEndereco.setBounds(21, 288, 164, 19);
		contentPane.add(lblIdEndereco);
		
		txtIdEndereco = new JTextField();
		txtIdEndereco.setColumns(10);
		txtIdEndereco.setBounds(21, 318, 86, 20);
		contentPane.add(txtIdEndereco);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		txtLogradouro.setBounds(143, 318, 325, 20);
		contentPane.add(txtLogradouro);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(21, 394, 86, 20);
		contentPane.add(txtNumero);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(143, 394, 325, 20);
		contentPane.add(txtBairro);
		
		lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLogradouro.setBounds(143, 290, 107, 14);
		contentPane.add(lblLogradouro);
		
		lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNumero.setBounds(21, 363, 64, 14);
		contentPane.add(lblNumero);
		
		lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBairro.setBounds(143, 363, 129, 14);
		contentPane.add(lblBairro);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Inst�ncia da classe PRJUsuario
				PrjUsuario usuario = new PrjUsuario();
				//Inst�ncia da classe PRJEndereco
				PrjEndereco endereco = new PrjEndereco();
				//Inst�ncia da class PRJCLiente
				PrjCliente cliente = new PrjCliente();
				
				//Vamos adicionar os cliente a mem�ria com o RepoSistema.
				RepoSistema rs = new RepoSistema();
				
				//O Id do Usu�rio recebe apenas n�mero inteiros, por�m  a caixa
				//em que  � digitado o id � do tipo text.Portanto se faz
				//necess�rio realizar uma convers�o de texto para inteiro
				//com o comando Integer.parseInt.
				usuario.idUsuario = Integer.parseInt(txtIdUsuario.getText());
				usuario.nomeUsuario = txtNomeUsuario.getText();
				usuario.senha = txtSenha.getText();
				
				endereco.idEndereco = Integer.parseInt(txtIdEndereco.getText());
				endereco.logradouro = txtLogradouro.getText();
				endereco.numero = txtNumero.getText();
			    endereco.bairro = txtBairro.getText();
			    
			    cliente.idCliente = Integer.parseInt(txtIdCliente.getText());
			    cliente.NomeCliente = txtNomeCliente.getText();
			    cliente.email = txtEmail.getText();
			    cliente.usuario = usuario;
			    cliente.endereco = endereco;
			    
			    
			    
				
				
				JOptionPane.showMessageDialog(null, rs.cadUsuario(usuario)+"\n"+rs.cadCliente(cliente));
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCadastrar.setBounds(361, 451, 107, 23);
		contentPane.add(btnCadastrar);
	}
}
