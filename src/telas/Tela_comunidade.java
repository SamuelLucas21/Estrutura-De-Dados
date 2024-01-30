package telas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.UIManager;

public class Tela_comunidade {

	private JFrame frame;
	private JTextField textField;
	static List_Comunidade lista;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//List_Comunidade lista = new List_Comunidade(5);
					
					Tela_comunidade window = new Tela_comunidade(lista);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela_comunidade(List_Comunidade lista) {
		
		this.lista = new List_Comunidade(5);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setIgnoreRepaint(true);
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(241, 241, 241));
		frame.setBackground(new Color(119, 118, 123));
		// Imagem do Programa assim que estiver sendo executavel 
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/home/samuel/Pictures/Screenshot from 2023-08-19 09-58-19.jpg"));
		frame.setBounds(500, 250, 955, 586);
		
		
		// ESSA FUNÇÃO PARA DEIXAR A TELAS MAXIMIZADA
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		

		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(783, 118, 117, 25);
		frame.getContentPane().add(btnProcurar);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setBounds(783, 200, 117, 25);
		frame.getContentPane().add(btnEntrar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(783, 276, 117, 25);
		frame.getContentPane().add(btnSair);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(153, 12, 117, 25);
		frame.getContentPane().add(btnExcluir);
		
		textField = new JTextField();													//textField
		textField.setBounds(75, 121, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setVisible(false);
		
		JLabel lblCriarComunidade = new JLabel("Criar Comunidade:");					//lblCriarComunidade
		lblCriarComunidade.setFont(new Font("Dialog", Font.BOLD, 17));
		lblCriarComunidade.setBounds(74, 76, 196, 15);
		frame.getContentPane().add(lblCriarComunidade);
		lblCriarComunidade.setVisible(false);
		
		JLabel lblNome = new JLabel("Nome:");											//lblNome
		lblNome.setBounds(78, 107, 70, 15);
		frame.getContentPane().add(lblNome);
		lblNome.setVisible(false);
		
		JLabel lblDescrio = new JLabel("Descrição:");									//lblDescrio
		lblDescrio.setBounds(75, 164, 114, 15);
		frame.getContentPane().add(lblDescrio);
		lblDescrio.setVisible(false);
		
		JTextArea textArea = new JTextArea();											//textArea
		textArea.setBorder(UIManager.getBorder("FormattedTextField.border"));
		textArea.setBounds(75, 200, 320, 134);
		frame.getContentPane().add(textArea);
		textArea.setVisible(false);
		
		JButton btnCriar_1 = new JButton("Criar2");										//btmCriar_1
		btnCriar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Perfil profile = new Perfil();

				
				profile.setNome(textField.getText());
				profile.setDescricao(textArea.getText());
				
				lista.CriarComunidade(profile);
				
				lista.showComunidades();
				
			
			}
		});
		
		
		btnCriar_1.setBounds(75, 346, 117, 25);
		frame.getContentPane().add(btnCriar_1);
		btnCriar_1.setVisible(false);		
		
		JButton btnCriar = new JButton("Criar");
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setVisible(true);
				lblCriarComunidade.setVisible(true);
				lblNome.setVisible(true);
				lblDescrio.setVisible(true);
				textArea.setVisible(true);
				btnCriar.setVisible(false);
				btnCriar_1.setVisible(true);
			}
		});
		btnCriar.setBounds(12, 12, 117, 25);
		frame.getContentPane().add(btnCriar);
		
		JButton button = new JButton("<----");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setVisible(false);
				lblCriarComunidade.setVisible(false);
				lblNome.setVisible(false);
				lblDescrio.setVisible(false);
				textArea.setVisible(false);
				btnCriar.setVisible(true);
				btnCriar_1.setVisible(false);
				
				
			}
		});
		
		button.setBounds(306, 346, 89, 25);
		frame.getContentPane().add(button);
		
		
		
		
	}
}
