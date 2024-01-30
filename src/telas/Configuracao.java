package telas;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import telas.Tela_Login;
import telas.Dados_Perfil;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.PasswordAuthentication;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Cursor;
import javax.swing.JRadioButton;


public class Configuracao {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_3;
	
	static Home_admin homeadmin;
	static Tela_Login login;
	


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				//	Home_admin homeadmin = new Home_admin(null, null, null);
					Configuracao window = new Configuracao(homeadmin);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public Configuracao(Home_admin homeadmin) {
		
		this.homeadmin = homeadmin;
		
		initialize();
		
		
	}
	
	static String senha_digitada;
	private JButton btnFechar;
	private JLabel lblTitle;
	private JLabel lblFatec;
	private JLabel lblExten;
	private JRadioButton rdbtnNewPas_1;
	


	
	
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
		
		btnFechar = new JButton("");
		btnFechar.setBorder(null);
		btnFechar.setFocusTraversalKeysEnabled(false);
		btnFechar.setFocusPainted(false);
		btnFechar.setFocusable(false);
		btnFechar.setDefaultCapable(false);
		btnFechar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFechar.setContentAreaFilled(false);
		btnFechar.setBounds(819, 60, 117, 39);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
       	     	homeadmin.frame.setVisible(true);
				homeadmin.Desembacar();
				frame.dispose();
			
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnFechar);
		
		textField = new JTextField(Tela_Login.nome_para_tela);
		textField.setBounds(164, 198, 259, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		textField.setFont(new Font("FreeSans", Font.BOLD, 16));
		textField.setBorder(null);
		textField.setBackground(new Color(246, 246, 246));
		textField.setAutoscrolls(false);
		textField.setCaretColor(Color.DARK_GRAY);
		//frame.getContentPane().add(Campo_Email);
		textField.setColumns(10);
		
		textField_1 = new JTextField(login.list.listaUsuario[login.ID].getSobre_nome());
		textField_1.setBounds(164, 277, 259, 25);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		textField_1.setEditable(false);
		textField_1.setFont(new Font("FreeSans", Font.BOLD, 16));
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(246, 246, 246));
		textField_1.setAutoscrolls(false);
		textField_1.setCaretColor(Color.DARK_GRAY);
		textField_1.setColumns(10);
		
		
		textField_2 = new JTextField(Tela_Login.Email_para_tela);
		textField_2.setBounds(166, 362, 257, 25);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.setEditable(false);
		textField_2.setFont(new Font("FreeSans", Font.BOLD, 16));
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(246, 246, 246));
		textField_2.setAutoscrolls(false);
		textField_2.setCaretColor(Color.DARK_GRAY);
		textField_2.setColumns(10);
		
		
		String senha = Tela_Login.senha_para_tela;
		String mostrarSenha = "*".repeat(senha.length());
		
		textField_4 = new JTextField(mostrarSenha);
		textField_4.setBounds(540, 199, 226, 25);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		textField_4.setEditable(false);
		textField_4.setFont(new Font("FreeSans", Font.BOLD, 16));
		textField_4.setBorder(null);
		textField_4.setBackground(new Color(246, 246, 246));
		textField_4.setAutoscrolls(false);
		textField_4.setCaretColor(Color.DARK_GRAY);
		textField_4.setColumns(10);
		
		
		textField_6 = new JPasswordField();
		textField_6.setBounds(540, 278, 226, 25);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		textField_6.setFont(new Font("FreeSans", Font.BOLD, 16));
		textField_6.setBorder(null);
		textField_6.setBackground(new Color(246, 246, 246));
		textField_6.setAutoscrolls(false);
		textField_6.setCaretColor(Color.DARK_GRAY);
		
		
		textField_3 = new JPasswordField();
		textField_3.setBounds(540, 361, 226, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		textField_3.setFont(new Font("FreeSans", Font.BOLD, 16));
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(246, 246, 246));
		textField_3.setAutoscrolls(false);
		textField_3.setCaretColor(Color.DARK_GRAY);
		textField_3.setColumns(10);
		
		
		
		JButton btnConfirmar = new JButton("");
		btnConfirmar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfirmar.setFocusable(false);
		btnConfirmar.setFocusTraversalKeysEnabled(false);
		btnConfirmar.setFocusPainted(false);
		btnConfirmar.setBorder(null);
		btnConfirmar.setContentAreaFilled(false);
		btnConfirmar.setBorderPainted(false);
		btnConfirmar.setBounds(396, 456, 157, 45);
		
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			if(textField_3.getText().equals(textField_6.getText())) {
				if(textField_3.getText().length() >=8) {
				
				try {
				    String command = "bash /home/samuel/PycharmProjects/pythonProject1/ex1.sh";
				    ProcessBuilder processBuilder = new ProcessBuilder(command.split("\\s+"));
				    Process process = processBuilder.start();
				   // process.waitFor();
				    
				    Thread.sleep(1000); 
				    //process.destroy();
				    String caminhoDoArquivo = "/home/samuel/PycharmProjects/pythonProject1/codigo.txt";

				    BufferedReader reader = new BufferedReader(new FileReader(caminhoDoArquivo));
				    String codigoNoArquivo = reader.readLine();
				    reader.close();
				    				    
				    String userInput = JOptionPane.showInputDialog(null, "Digite o código por favor:", "Código", JOptionPane.INFORMATION_MESSAGE);
				    
				    if (codigoNoArquivo.equals(userInput)) {
				    	process.destroyForcibly();
				    	
				        String processo = "feh"; // Nome do processo que você deseja encerrar

				        try {
				            ProcessBuilder processBuilder1 = new ProcessBuilder("pidof", processo);
				            Process process1 = processBuilder1.start();

				            BufferedReader reader1 = new BufferedReader(new InputStreamReader(process1.getInputStream()));
				            String pid = reader1.readLine().trim(); // Obtém o PID do processo feh
				            reader.close();

				            ProcessBuilder killProcess = new ProcessBuilder("kill", pid);
				            Process kill = killProcess.start();
				            int status = kill.waitFor(); // Aguarda a conclusão do comando para encerrar o processo

				            if (status == 0) {
				                System.out.println("Processo " + processo + " encerrado com sucesso.");
				            } else {
				                System.out.println("Falha ao encerrar o processo " + processo);
				            }
				        } catch (IOException | InterruptedException ei) {
				            ei.printStackTrace();
				        }
				    	
				        fazerLogin(Tela_Login.Email_para_tela, Tela_Login.senha_para_tela);
				    }else {

				    	process.destroyForcibly();
				    	
				        String processo = "feh"; // Nome do processo que você deseja encerrar

				        try {
				            ProcessBuilder processBuilder1 = new ProcessBuilder("pidof", processo);
				            Process process1 = processBuilder1.start();

				            BufferedReader reader1 = new BufferedReader(new InputStreamReader(process1.getInputStream()));
				            String pid = reader1.readLine().trim(); // Obtém o PID do processo feh
				            reader.close();

				            ProcessBuilder killProcess = new ProcessBuilder("kill", pid);
				            Process kill = killProcess.start();
				            int status = kill.waitFor();// Aguarda a conclusão do comando para encerrar o processo
				            

				            if (status == 0) {
				                System.out.println("Processo " + processo + " encerrado com sucesso.");
				            } else {
				                System.out.println("Falha ao encerrar o processo " + processo);
				            }
				        } catch (IOException | InterruptedException ei) {
				            ei.printStackTrace();
				        }
				    	
				    	
						JOptionPane.showMessageDialog(null,"Código inválido","Alerta",JOptionPane.ERROR_MESSAGE);


				    }

				} catch (IOException | InterruptedException ei) {
				    ei.printStackTrace();
				}

				}else {
					JOptionPane.showMessageDialog(null,"É necessário no minimo 8 caracteres para a senha", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
				}
						
				
			}else {
				JOptionPane.showMessageDialog(null, "Senha estão diferentes!");
			}
			
			}
		});
		frame.getContentPane().add(btnConfirmar);
		
		JRadioButton rdbtnNewPas = new JRadioButton("");
		rdbtnNewPas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton checkBox = (JRadioButton) e.getSource();
				   ((JPasswordField) textField_6).setEchoChar(checkBox.isSelected() ? '\u0000' : '•');
				
				   
			}
		});
		rdbtnNewPas.setContentAreaFilled(false);
		rdbtnNewPas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnNewPas.setFocusable(false);
		rdbtnNewPas.setFocusPainted(false);
		rdbtnNewPas.setBorder(null);
		rdbtnNewPas.setBounds(777, 279, 21, 23);
		frame.getContentPane().add(rdbtnNewPas);
		
		rdbtnNewPas_1 = new JRadioButton("");
		rdbtnNewPas_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JRadioButton checkBox = (JRadioButton) e.getSource();
				   ((JPasswordField) textField_3).setEchoChar(checkBox.isSelected() ? '\u0000' : '•');
				
				   
				
			}
		});
		rdbtnNewPas_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnNewPas_1.setFocusable(false);
		rdbtnNewPas_1.setFocusPainted(false);
		rdbtnNewPas_1.setContentAreaFilled(false);
		rdbtnNewPas_1.setBorder(null);
		rdbtnNewPas_1.setBounds(777, 363, 21, 23);
		frame.getContentPane().add(rdbtnNewPas_1);
		
		JLabel lblF = new JLabel("");
		lblF.setIcon(new ImageIcon("/home/samuel/Desktop/.Selecionado_troca_de_senha.png"));
	//	lblF.setBounds(523, 250, 321, 87);
		frame.getContentPane().add(lblF);
		
		JLabel lblNewLabel = new JLabel("v");
		lblNewLabel.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/voltar_botão.png"));
		lblNewLabel.setBounds(807, 54, 137, 55);
		frame.getContentPane().add(lblNewLabel);
		
		lblExten = new JLabel("exten");
		lblExten.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-11 15-37-29.png"));
		lblExten.setBounds(532, -4, 423, 57);
		frame.getContentPane().add(lblExten);
		
		JLabel lblArch = new JLabel("Arch");
		lblArch.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-11 15-02-08.png"));
		lblArch.setBounds(67, 95, 794, 448);
		frame.getContentPane().add(lblArch);
		
		lblTitle = new JLabel("Title");
		lblTitle.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-11 15-23-35.png"));
		lblTitle.setBounds(334, 56, 292, 45);
		frame.getContentPane().add(lblTitle);
		
		lblFatec = new JLabel("");
		lblFatec.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-11 15-30-15.png"));
		lblFatec.setBounds(2, -11, 953, 68);
		frame.getContentPane().add(lblFatec);
		
		
	}
	
	public boolean fazerLogin(String email, String senha) {
        try {
            for (Usuario usuario : Tela_Login.list.getListaUsuarios()) {
            	
         if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha))   {
        	
        	usuario.setSenha(textField_3.getText());;
        	homeadmin.Desembacar();
        	Tela_Login.homeadmin.frame.setVisible(false);
        	frame.setVisible(false);
        	
        	JOptionPane.showMessageDialog(null, "Senha alterada!!!");
        	Tela_Login.ID = 0;
        	Tela_Login.main(null);
        	
        	
        	//homeadmin.login.frame.setVisible(true);
        	
        	
        	//homeadmin.login.ID = 0;
        	
        	frame.dispose();
             return true;
         }else {
        //	 JOptionPane.showMessageDialog(null, "Algo deu Errado");
         }
        
     }
     
       } catch (Exception e) {
          
       }
   
        return false;
   
	}
}
