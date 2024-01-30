package telas;
import telas.Tela_Cadastro;


import telas.Home_admin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import telas.Tela_Cadastro;
import telas.Encapsulamento;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Cursor;
import telas.Dados_Perfil;
import java.util.ArrayList;

public class Tela_Login {

	public JFrame frame;
	private JTextField Campo_Email;
	private JPasswordField Campo_senha;
    static List_Usuarios list;
    static Usuario user;
    
    static Home_admin homeadmin;
    
	static String nome_para_tela;
	static String sobre_nome_tela;
	static String senha_para_tela;
	static String Email_para_tela;
    static String vv = " ";
	static int ID = 0;
    public int cont = 0;
    StringBuilder sb = new StringBuilder();
    ArrayList<String> objFriends = new ArrayList<>();
    
    public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
		
					Tela_Login window = new Tela_Login(list, user, homeadmin);
					
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	
	 */
	public Tela_Login(List_Usuarios list, Usuario user, Home_admin homeadmin) {
		this.list = list;
		this.user = user;
		this.homeadmin = homeadmin;
		
		//homeadmin.btnFriend = new JButton[list.listaUsuario.length];
		
		//homeadmin.frame.setVisible(true);
		
		
		homeadmin.nomeOBJ = new String[list.listaUsuario.length];
		homeadmin.nomeChat = new int[list.listaUsuario.length];
		homeadmin.Pedidos = new String[list.listaUsuario.length];
		
		initialize();
		

	}
	
	
	public boolean fazerLogin(String email, String senha) {
        try {
            for (Usuario usuario : list.getListaUsuarios()) {
            	
            	
         System.out.println("TESTE EMAIL:  "+usuario.getEmail());
         System.out.println("TESTE SENHA:  "+usuario.getSenha());
         if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha))   {
        	
        	 nome_para_tela = usuario.getNome();
        	 senha_para_tela = usuario.getSenha();
        	 Email_para_tela = usuario.getEmail();
        	 sobre_nome_tela = usuario.getSobre_nome();
        	 
        	 Component[] components = homeadmin.panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(true); 
				}
				
				Component[] components2 = homeadmin.panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(true);
				}
        	 
        //	 init.frame.dispose();
             return true; // Login bem-sucedido
         }
         ID++;
        
     }
     
       } catch (Exception e) {
          // Login falhou
       }
   
        return false;
   
	}
	
	
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
		
		
		JLabel lblPhotofatec = new JLabel("Photo_fatec");
		lblPhotofatec.setBackground(new Color(241, 241, 241));
		lblPhotofatec.setIgnoreRepaint(true);
		lblPhotofatec.setIcon(new ImageIcon("/home/samuel/eclipse-workspace/Sistema_Protótico/src/Imagens/photo_system.png"));
		lblPhotofatec.setBounds(0, 62, 544, 380);
		frame.getContentPane().add(lblPhotofatec);
		
		Campo_Email = new JTextField();
		Campo_Email.setFont(new Font("FreeSans", Font.BOLD, 16));
		Campo_Email.setBorder(null);
		Campo_Email.setBackground(new Color(246, 246, 246));
		Campo_Email.setAutoscrolls(false);
		Campo_Email.setCaretColor(Color.DARK_GRAY);
		Campo_Email.setBounds(609, 172, 255, 24);
		frame.getContentPane().add(Campo_Email);
		Campo_Email.setColumns(10);
		
		
		Campo_senha = new JPasswordField();
		Campo_senha.setFont(new Font("Dialog", Font.BOLD, 15));
		Campo_senha.setAutoscrolls(false);
		Campo_senha.setBackground(new Color(246, 246, 246));
		Campo_senha.setBorder(null);
		Campo_senha.setSelectionColor(new Color(184, 207, 229)); 
		Campo_senha.setBounds(605, 260, 255, 24);
		frame.getContentPane().add(Campo_senha);
		
		JLabel lblMostrarsenha = new JLabel("");
		lblMostrarsenha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblMostrarsenha.setIcon(new ImageIcon("/home/samuel/Desktop/.Ocultar_senha.png"));
		lblMostrarsenha.setBounds(614, 302, 237, 35);
		frame.getContentPane().add(lblMostrarsenha);
		
		JLabel lblmostrar_senha_ativado = new JLabel("hhh");
		lblmostrar_senha_ativado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblmostrar_senha_ativado.setIcon(new ImageIcon("/home/samuel/Desktop/.Mostrar_senha.png"));
		lblmostrar_senha_ativado.setBounds(614, 305, 200, 28);
		frame.getContentPane().add(lblmostrar_senha_ativado);
		lblmostrar_senha_ativado.setVisible(false);
		
		JButton btnFecharjanela = new JButton("");
		btnFecharjanela.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFecharjanela.setBorderPainted(false);
		btnFecharjanela.setRequestFocusEnabled(false);
		btnFecharjanela.setRolloverEnabled(false);
		btnFecharjanela.setContentAreaFilled(false);
		btnFecharjanela.setFont(new Font("Dialog", Font.BOLD, 10));
		btnFecharjanela.setBounds(915, 0, 20, 27);
		frame.getContentPane().add(btnFecharjanela);
		btnFecharjanela.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				//fechar_janela();
			Encapsulamento fechar = new Encapsulamento();
			
	        int escolha = JOptionPane.showOptionDialog(
	                null,
	                "Deseja fechar o Programa?",
	                "Você tem Certeza?",
	                JOptionPane.OK_CANCEL_OPTION,
	                JOptionPane.WARNING_MESSAGE,
	                null,
	                new Object[]{"Sim", "Voltar para Programa"}, // Opções para o usuário
	                "Sim" // Opção padrão selecionada
	            );
			
	        	if(escolha == 0) {
	        		
	        		
	        		fechar.fechar_janela();
	        	}
			
			}
		});
		
				
				JButton btnNewButton = new JButton("");
				btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnNewButton.setBorderPainted(false);
				btnNewButton.setContentAreaFilled(false);
				btnNewButton.setAutoscrolls(true);
				btnNewButton.setForeground(new Color(250, 240, 230));
				btnNewButton.setIcon(null);
				btnNewButton.setBackground(new Color(220, 20, 60));
				btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
				//btnNewButton.setVisible(false);
				
				if(homeadmin.contador == 0) {
					homeadmin.textArea.setVisible(true);
					homeadmin.textArea_1.setVisible(false);
					homeadmin.textArea_2.setVisible(false);
				}if(homeadmin.contador == 1) {
					homeadmin.textArea.setVisible(false);
					homeadmin.textArea_1.setVisible(true);
					homeadmin.textArea_2.setVisible(false);
					
				}if(homeadmin.contador == 2) {
					homeadmin.textArea.setVisible(false);
					homeadmin.textArea_1.setVisible(false);
					homeadmin.textArea_2.setVisible(true);
					
				}
				//homeadmin.textArea.setVisible(true);
				
				btnNewButton.addActionListener(new ActionListener() {
					


					//Ação do botãoEntrar
					public void actionPerformed(ActionEvent e) {
						int ana = 0;
						
						Component[] components = homeadmin.panel_4.getComponents(); 
						for (Component component : components) {
						    component.setEnabled(false); 
						}
						
						Component[] components2 = homeadmin.panel_5.getComponents();
						for(Component component : components2) {
							component.setEnabled(false);
						}
						
						homeadmin.btnPerfil_2_1.setVisible(false);
						homeadmin.btnPerfil_2_2.setVisible(false);
						homeadmin.btnPerfil_2_3.setVisible(false);
						homeadmin.btnPerfil_2_4.setVisible(false);
						homeadmin.btnPerfil_2_5.setVisible(false);
						
						homeadmin.btnPerfil_1.setVisible(false);
						homeadmin.btnPerfil_2.setVisible(false);
						homeadmin.btnPerfil_3.setVisible(false);
						homeadmin.btnPerfil_4.setVisible(false);
						homeadmin.btnPerfil_5.setVisible(false);
						
						homeadmin.textArea_4.setText("");
						homeadmin.perfil.setVisible(false);
						homeadmin.EditarPerfil.setVisible(false);
						
						homeadmin.lblL_6.setVisible(true);
						homeadmin.textField.setVisible(true);
						homeadmin.btnEnviar.setVisible(true);
						homeadmin.mnNewMenu.setVisible(false);
						homeadmin.btnSelectPerson.setVisible(false);
						
						homeadmin.button.setVisible(false);
						homeadmin.textField_2.setVisible(false);
						homeadmin.lblEnv.setVisible(true);
						
						
						homeadmin.textField.setVisible(true);
	                	homeadmin.lblL_6.setVisible(true);
	                	homeadmin.lblName.setVisible(true);
						homeadmin.panel_5.setVisible(true);
						homeadmin.panel_5.setVisible(true);
						homeadmin.btnTeste.setVisible(true);
						homeadmin.FotoPerfil.setVisible(true);
						homeadmin.lblBotes.setVisible(true);
						homeadmin.btnPublic.setVisible(true);
						homeadmin.btnPublic.setVisible(true);
						homeadmin.buttonPerfil.setVisible(true);
						homeadmin.btnPublication.setVisible(true);
						homeadmin.btnTelaAmigos.setVisible(true);
						homeadmin.btnSalvos.setVisible(true);
						homeadmin.btnChat.setVisible(true);
						homeadmin.btnConfiguraes.setVisible(true);
						homeadmin.panel_4.setVisible(true);
						homeadmin.panel_5.setVisible(true);
						
						homeadmin.lblFff_1.setVisible(false);
						homeadmin.lblFff_2.setVisible(false);
						homeadmin.lblFff_3.setVisible(false);
						homeadmin.lblFff_4.setVisible(false);
						homeadmin.lblFff_5.setVisible(false);
						
						homeadmin.lblL_1.setVisible(false);						
						homeadmin.lblL_2.setVisible(false);
						homeadmin.lblL_3.setVisible(false);
						homeadmin.lblL_4.setVisible(false);
						homeadmin.lblL_5.setVisible(false);
						
						homeadmin.lblFf_1.setVisible(false);
						homeadmin.lblFf_2.setVisible(false);
						homeadmin.lblFf_3.setVisible(false);
						homeadmin.lblFf_4.setVisible(false);
						homeadmin.lblFf_5.setVisible(false);
						
						homeadmin.lblArch_2_1.setVisible(false);
						homeadmin.lblArch_2_2.setVisible(false);
						homeadmin.lblArch_2_3.setVisible(false);
						homeadmin.lblArch_2_4.setVisible(false);
						homeadmin.lblArch_2_5.setVisible(false);
						
				        int i = 0;
				        int vazio = 0;
				        int nulo = 0;
				        
						
						String comparacao_email = Campo_Email.getText();
						String senhaTexto = new String(Campo_senha.getPassword());

						
						
						if(fazerLogin(comparacao_email, senhaTexto)) {
							System.out.println("CONSEGUIMOS");
										
							Dados_Perfil.setNome(nome_para_tela);
							if(list.listaUsuario[ID].list.getChatFatec() != null) {
							homeadmin.textArea_4.setText(list.listaUsuario[ID].list.getChatFatec().toString());		
							
							
							}
							if(homeadmin == null) {
							
								homeadmin.main();
							}
							
							if(list.listaUsuario[ID].Foto_Perfil != null) {
							
			                try {
			                    // Carrega a imagem do arquivo
			                    BufferedImage originalImage = ImageIO.read(new File(list.listaUsuario[ID].Foto_Perfil));

			                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
			                    int newWidth = 100;
			                    int newHeight = 100;
			                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

			                    // Atribui a imagem redimensionada à JLabel
			                    homeadmin.FotoPerfil.setIcon(new ImageIcon(scaledImage));
			                    
			                } catch (IOException ei) {
			                    ei.printStackTrace();
			                }
							
							homeadmin.btnAdicionarFoto.setText("Alterar foto");
							homeadmin.btnRemoverFoto.setVisible(true);
							homeadmin.btnVisualizarFoto.setVisible(true);
							
							}else {
								homeadmin.FotoPerfil.setIcon(new ImageIcon());
								homeadmin.lblFotoPane.setIcon(new ImageIcon());
								homeadmin.btnAdicionarFoto.setText("addPhoto");
								homeadmin.btnRemoverFoto.setVisible(false);
								homeadmin.btnVisualizarFoto.setVisible(false);
								
							}
							
							homeadmin.lblNome_do_usuario.setText(nome_para_tela + " " + sobre_nome_tela);
		                	homeadmin.lblName.setText(nome_para_tela + " " + sobre_nome_tela + ":");
		                	homeadmin.lblName.setVisible(true);
							homeadmin.frame.setVisible(true);
							
							frame.dispose();
							
							nulo = 30;
							
							
						}else {
							//init.frame.dispose();
							System.out.println("Infelizmente não foi dessa vez");
							//nulo = 10;
						}
					        

						 
						 Usuario_2 usuarioObj = new Usuario_2();
					        String[] usuarios = usuarioObj.getUsuario();
					        String[] senha = usuarioObj.getSenha();
					        

					        
					        
					        //read = new Scanner(System.in);
					        
					        //System.out.print("Login: ");
					        //String buscar = read.nextLine();
					        if(nulo != 30) {
							        for (i = 0; i < usuarios.length; i++) {
							           
							        	nulo = nulo + 1;
							        	
							        	if (usuarios[i].equals(Campo_Email.getText())) {
							                
							     			        		ID=0;
							        		
							                if((senha[i].equals(senhaTexto))){
							                
												nome_para_tela = comparacao_email;
												senha_para_tela = senha[i];
												Email_para_tela = nome_para_tela;
							                	Dados_Perfil.setNome(nome_para_tela);
							                	
							                	
							                	
							                	
							                	frame.setVisible(false);
							                	
							//                	homeadmin.frame.setVisible(true);
							                	
							                	if(homeadmin == null) {
													
													homeadmin.main();
												}
							                	homeadmin.btnPerfil_1.setVisible(false);
												homeadmin.btnPerfil_2.setVisible(false);
												homeadmin.btnPerfil_3.setVisible(false);
												homeadmin.btnPerfil_4.setVisible(false);
												homeadmin.btnPerfil_5.setVisible(false);
							                	
												
												
								                	homeadmin.lblName.setText("");
								                	homeadmin.textField.setVisible(false);
								                	homeadmin.lblL_6.setVisible(false);
								                	homeadmin.lblName.setVisible(true);
													homeadmin.panel_5.setVisible(false);
													homeadmin.panel_5.setVisible(false);
													homeadmin.btnTeste.setVisible(false);
													homeadmin.FotoPerfil.setVisible(false);
													homeadmin.lblBotes.setVisible(false);
													homeadmin.btnPublic.setVisible(false);
													homeadmin.btnPublic.setVisible(false);
													homeadmin.buttonPerfil.setVisible(false);
													homeadmin.btnPublication.setVisible(false);
													homeadmin.btnTelaAmigos.setVisible(false);
													homeadmin.btnSalvos.setVisible(false);
													homeadmin.btnChat.setVisible(false);
													homeadmin.btnConfiguraes.setVisible(false);
													homeadmin.panel_4.setVisible(false);
													homeadmin.panel_5.setVisible(false);
													
													homeadmin.btnPerfil_2_1.setVisible(false);
													homeadmin.btnPerfil_2_2.setVisible(false);
													homeadmin.btnPerfil_2_3.setVisible(false);
													homeadmin.btnPerfil_2_4.setVisible(false);
													homeadmin.btnPerfil_2_5.setVisible(false);
													
													
													homeadmin.lblL_6.setVisible(false);
													homeadmin.textField.setVisible(false);
													homeadmin.btnEnviar.setVisible(false);
													
													homeadmin.mnNewMenu.setVisible(true);
													homeadmin.btnSelectPerson.setVisible(true);
													
													homeadmin.lblEnv.setVisible(false);
													homeadmin.button.setVisible(true);
													homeadmin.textField_2.setVisible(true);
													
													ana = 10;
													
													String vetor[] = new String[list.listaUsuario.length];
													
													// Supondo que você tenha um vetor de checkbox menu items
													JCheckBoxMenuItem[] checkBoxes = { homeadmin.chckbxmntmN_1, homeadmin.chckbxmntmN_2, homeadmin.chckbxmntmN_3, homeadmin.chckbxmntmN_4};
													homeadmin.chckbxmntmN.setVisible(true);
													homeadmin.chckbxmntmN_1.setVisible(false);
													homeadmin.chckbxmntmN_2.setVisible(false);
													homeadmin.chckbxmntmN_3.setVisible(false);
													homeadmin.chckbxmntmN_4.setVisible(false);
													homeadmin.chckbxmntmN_5.setVisible(false);
													
//											Essa variavel é para todos os usuários		homeadmin.chckbxmntmN
	
													String aoiu[] = new String[list.listaUsuario.length];
													int taii =0;
													for(int ii =0; ii<list.listaUsuario.length;ii++) {
														if(list.listaUsuario[ii] != null) {
															aoiu[ii] = list.listaUsuario[ii].getEmail();
															taii++;
														}
													}
													
													// Supondo que 'list' seja a sua lista e 'vetor' o seu vetor de valores
													int tai = vetor.length;
													int coli = 0;
													for (int uu = 0; uu < checkBoxes.length; uu++) {
													    
													        if(list.listaUsuario[uu] !=null) {
													        String nomeCompleto = list.listaUsuario[uu].getNome() + " " + list.listaUsuario[uu].getSobre_nome();
													        
													        checkBoxes[uu].setText(nomeCompleto);
													        checkBoxes[uu].setVisible(true);
													        checkBoxes[uu].setActionCommand((aoiu[coli]));
													        // Define o valor inteiro associado
													        coli++;
													        }
													}
													/*
																						homeadmin.scrollPane_2.setVisible(false);
																						homeadmin.btnSelectPerson.setVisible(false);
																						homeadmin.button.setVisible(false);
																						homeadmin.textField_2.setVisible(false);
																						homeadmin.mnNewMenu.setVisible(false);
																                		homeadmin.lblNome_do_usuario.setText(""); ////////////////////////////////// Colocar novamente							                	
																                		homeadmin.lblBotes.setVisible(true);
																                		
																                		*/
																                		
													
													homeadmin.textArea_4.setText(homeadmin.chatFatec.toString());

													homeadmin.frame.setVisible(true);
							                		
							                	
							                	
							                	
							                	
								//				frame.dispose();
	
							                	nulo = 0;
							                	
							                	System.out.println("Você acertou o pré cadastrado");
							                			
							                }else {
							            	  nulo = 10;
							            	  break;
							                }

							        	}
					        	
					        	}		
					
					        }
					        	
					        if(comparacao_email == null || comparacao_email.trim().equals("")) {
					        	vazio = vazio + 10;			    
					        	nulo = 0;
							}
					        if(senhaTexto == null || senhaTexto.trim().equals("")) {
					        	vazio = vazio + 20;		
					        	nulo = 0;
					        	
							}			        
					        if(vazio == 10) {
					        	//JOptionPane.showMessageDialog(null,"Campo de Email vazio");
								JOptionPane.showMessageDialog(null,"Campo de Email vazio","Alerta",JOptionPane.WARNING_MESSAGE);
								ID = 0;
								ana =10;
					        }
					        if(vazio == 20) {
					        	//JOptionPane.showMessageDialog(null,"Campo de Senha vazio");
								JOptionPane.showMessageDialog(null,"Campo do Senha vazio","Alerta",JOptionPane.WARNING_MESSAGE);
								ID = 0;
								ana =10;
					        }			        
					        if(vazio == 30) {
					        	//JOptionPane.showMessageDialog(null,"Campos Email e Senha vazios");
								JOptionPane.showMessageDialog(null,"Campos de Email e Senha vazios","Alerta",JOptionPane.WARNING_MESSAGE);
								ID = 0;
								ana =10;
					        }
					        if(nulo == 10) {
					        	//JOptionPane.showMessageDialog(null,"Usuário ou Senha Inválidos");
								JOptionPane.showMessageDialog(null,"Usuário ou Senha Inválidos","Alerta",JOptionPane.ERROR_MESSAGE);
								ID = 0;
								ana =10;

					        }
					//        homeadmin.lblNomeusuario.setText(nome_para_tela + " " + sobre_nome_tela);
					        if(ana ==0) {
					        int cont = 0;
					        int y = 0;
					        for(int x =0; x<list.listaUsuario.length; x++) {
					        	
					        	//String aux = login.list.listaUsuario[i].getNome();
					            //sb.append(aux.publication).append("\n");
					            //sb.append("\n" + Tela_Login.nome_para_tela).append(":");
					        	if(list.listaUsuario[x] != null && x != ID && list.listaUsuario[ID].list.contains(x) == false) {
					        	
					        	if(list.listaUsuario[x].list_Pedidos.pedidoAqui(ID) == false && list.listaUsuario[x].list_Pedidos.pedidoLa(ID) == false) {
						        sb.append(list.listaUsuario[x].getNome()).append(" ").append(list.listaUsuario[x].getSobre_nome()).append("\n").append("\n").append("\n").append("\n"); //O primeiro sb.append("") é para posicionar aonde o nome do Usuário vai ficar 
						        homeadmin.nomeOBJ[y] = list.listaUsuario[x].getEmail();
						        y++;
						        cont++;
						        //aux = aux.getElemento();
					        	}
						        
					        	}
					        }
					        
					    //    homeadmin.lblFriend.setText(sb.toString());
					        homeadmin.textAreaFriends.setText(sb.toString());
					        
					        if(cont == 0) {
					        	homeadmin.textAreaFriends.setVisible(false);
					        	homeadmin.lblNoHParticipantes.setVisible(true);
					        	homeadmin.btnFriend_1.setVisible(false);
					        	homeadmin.btnFriend_2.setVisible(false);
					        	homeadmin.btn_Friend_3.setVisible(false);
					        	homeadmin.btn_Friend_4.setVisible(false);
					        	homeadmin.btn_Friend_5.setVisible(false);
					        	homeadmin.textAreaFriends.setVisible(false);
					        	homeadmin.lblAdicionado.setVisible(false);
					        	homeadmin.lblAdicionado_1.setVisible(false);
					        	homeadmin.lblAdicionado_2.setVisible(false);
					        	homeadmin.lblAdicionado_3.setVisible(false);
					        	homeadmin.lblAdicionado_4.setVisible(false);
					        	
					        	homeadmin.btnPerfil_1.setVisible(false);
								homeadmin.btnPerfil_2.setVisible(false);
								homeadmin.btnPerfil_3.setVisible(false);
								homeadmin.btnPerfil_4.setVisible(false);
								homeadmin.btnPerfil_5.setVisible(false);
					        	
					        }if(cont >=1){
					        	
					        	homeadmin.textAreaFriends.setVisible(true);
					        	homeadmin.lblNoHParticipantes.setVisible(false);
					        	homeadmin.btnFriend_1.setVisible(true);
					        	homeadmin.btnFriend_2.setVisible(false);
					        	homeadmin.btn_Friend_3.setVisible(false);
					        	homeadmin.btn_Friend_4.setVisible(false);
					        	homeadmin.btn_Friend_5.setVisible(false);
					        	homeadmin.lblAdicionado.setVisible(true);
					        	homeadmin.lblAdicionado_1.setVisible(false);
					        	homeadmin.lblAdicionado_2.setVisible(false);
					        	homeadmin.lblAdicionado_3.setVisible(false);
					        	homeadmin.lblAdicionado_4.setVisible(false);
					        	homeadmin.lblArch_2_1.setVisible(true);
					        	
					        	homeadmin.btnPerfil_1.setVisible(true);
								homeadmin.btnPerfil_2.setVisible(false);
								homeadmin.btnPerfil_3.setVisible(false);
								homeadmin.btnPerfil_4.setVisible(false);
								homeadmin.btnPerfil_5.setVisible(false);
					        	
					        	int b = list.EncontrarInt(homeadmin.nomeOBJ[0]);
					        	
						    	if(list.listaUsuario[b].Foto_Perfil!=null) {
					                try {
					                    // Carrega a imagem do arquivo
					                    BufferedImage originalImage = ImageIO.read(new File(list.listaUsuario[b].Foto_Perfil));

					                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
					                    int newWidth = 90;
					                    int newHeight = 100;
					                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

					                    // Atribui a imagem redimensionada à JLabel
					                    //homeadmin.FotoPerfil.setIcon(new ImageIcon(scaledImage));
					                    homeadmin.lblFff_1.setIcon(new ImageIcon(scaledImage));
					                    homeadmin.lblFff_1.setVisible(true);
					                } catch (IOException ei) {
					                    ei.printStackTrace();
					                }
						    	
						    	
						    	}else {
						    		homeadmin.lblFff_1.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
						    		homeadmin.lblFff_1.setVisible(true);
						    	}
					        	
					        	
					        }if(cont >=2){
					        	
					        	
					        	homeadmin.textAreaFriends.setVisible(true);
					        	homeadmin.lblNoHParticipantes.setVisible(false);
					        	homeadmin.btnFriend_1.setVisible(true);
					        	homeadmin.btnFriend_2.setVisible(true);
					        	homeadmin.btn_Friend_3.setVisible(false);
					        	homeadmin.btn_Friend_4.setVisible(false);
					        	homeadmin.btn_Friend_5.setVisible(false);
					        	homeadmin.lblAdicionado.setVisible(true);
					        	homeadmin.lblAdicionado_1.setVisible(true);
					        	homeadmin.lblAdicionado_2.setVisible(false);
					        	homeadmin.lblAdicionado_3.setVisible(false);
					        	homeadmin.lblAdicionado_4.setVisible(false);
					        	homeadmin.lblArch_2_2.setVisible(true);
					        	
					        	homeadmin.btnPerfil_1.setVisible(true);
								homeadmin.btnPerfil_2.setVisible(true);
								homeadmin.btnPerfil_3.setVisible(false);
								homeadmin.btnPerfil_4.setVisible(false);
								homeadmin.btnPerfil_5.setVisible(false);
					        	
					        	int b = list.EncontrarInt(homeadmin.nomeOBJ[1]);
						    	if(list.listaUsuario[b].Foto_Perfil!=null) {
					                try {
					                    // Carrega a imagem do arquivo
					                    BufferedImage originalImage = ImageIO.read(new File(list.listaUsuario[b].Foto_Perfil));

					                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
					                    int newWidth = 90;
					                    int newHeight = 100;
					                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

					                    // Atribui a imagem redimensionada à JLabel
					                    //homeadmin.FotoPerfil.setIcon(new ImageIcon(scaledImage));
					                    homeadmin.lblFff_2.setIcon(new ImageIcon(scaledImage));
					                    homeadmin.lblFff_2.setVisible(true);
					                } catch (IOException ei) {
					                    ei.printStackTrace();
					                }
						    	
						    	
						    	}else {
						    		homeadmin.lblFff_2.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
						    		homeadmin.lblFff_2.setVisible(true);
						    	}
					        	
					        }if(cont >=3){
					        	homeadmin.textAreaFriends.setVisible(true);
					        	homeadmin.lblNoHParticipantes.setVisible(false);
					        	homeadmin.btnFriend_1.setVisible(true);
					        	homeadmin.btnFriend_2.setVisible(true);
					        	homeadmin.btn_Friend_3.setVisible(true);
					        	homeadmin.btn_Friend_4.setVisible(false);
					        	homeadmin.btn_Friend_5.setVisible(false);
					        	homeadmin.lblAdicionado.setVisible(true);
					        	homeadmin.lblAdicionado_1.setVisible(true);
					        	homeadmin.lblAdicionado_2.setVisible(true);
					        	homeadmin.lblAdicionado_3.setVisible(false);
					        	homeadmin.lblAdicionado_4.setVisible(false);
					        	homeadmin.lblArch_2_3.setVisible(true);
					        	
					        	homeadmin.btnPerfil_1.setVisible(true);
								homeadmin.btnPerfil_2.setVisible(true);
								homeadmin.btnPerfil_3.setVisible(true);
								homeadmin.btnPerfil_4.setVisible(false);
								homeadmin.btnPerfil_5.setVisible(false);
					        	
					        	int b = list.EncontrarInt(homeadmin.nomeOBJ[2]);
						    	if(list.listaUsuario[b].Foto_Perfil!=null) {
					                try {
					                    // Carrega a imagem do arquivo
					                    BufferedImage originalImage = ImageIO.read(new File(list.listaUsuario[b].Foto_Perfil));

					                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
					                    int newWidth = 90;
					                    int newHeight = 100;
					                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

					                    // Atribui a imagem redimensionada à JLabel
					                    //homeadmin.FotoPerfil.setIcon(new ImageIcon(scaledImage));
					                    homeadmin.lblFff_3.setIcon(new ImageIcon(scaledImage));
					                    homeadmin.lblFff_3.setVisible(true);
					                } catch (IOException ei) {
					                    ei.printStackTrace();
					                }
						    	
						    	
						    	}else {
						    		homeadmin.lblFff_3.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
						    		homeadmin.lblFff_3.setVisible(true);
						    	}

					        	
					        	
					        }if(cont >=4){
					        	homeadmin.textAreaFriends.setVisible(true);
					        	homeadmin.lblNoHParticipantes.setVisible(false);
					        	homeadmin.btnFriend_1.setVisible(true);
					        	homeadmin.btnFriend_2.setVisible(true);
					        	homeadmin.btn_Friend_3.setVisible(true);
					        	homeadmin.btn_Friend_4.setVisible(true);
					        	homeadmin.btn_Friend_5.setVisible(false);
					        	homeadmin.lblAdicionado.setVisible(true);
					        	homeadmin.lblAdicionado_1.setVisible(true);
					        	homeadmin.lblAdicionado_2.setVisible(true);
					        	homeadmin.lblAdicionado_3.setVisible(true);
					        	homeadmin.lblAdicionado_4.setVisible(false);
					        	homeadmin.lblArch_2_4.setVisible(true);
					        	
					        	homeadmin.btnPerfil_1.setVisible(true);
								homeadmin.btnPerfil_2.setVisible(true);
								homeadmin.btnPerfil_3.setVisible(true);
								homeadmin.btnPerfil_4.setVisible(true);
								homeadmin.btnPerfil_5.setVisible(false);
					        	
					        	int b = list.EncontrarInt(homeadmin.nomeOBJ[3]);
						    	if(list.listaUsuario[b].Foto_Perfil!=null) {
					                try {
					                    // Carrega a imagem do arquivo
					                    BufferedImage originalImage = ImageIO.read(new File(list.listaUsuario[b].Foto_Perfil));

					                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
					                    int newWidth = 90;
					                    int newHeight = 100;
					                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

					                    // Atribui a imagem redimensionada à JLabel
					                    //homeadmin.FotoPerfil.setIcon(new ImageIcon(scaledImage));
					                    homeadmin.lblFff_4.setIcon(new ImageIcon(scaledImage));
					                    homeadmin.lblFff_4.setVisible(true);
					                } catch (IOException ei) {
					                    ei.printStackTrace();
					                }
						    	
						    	
						    	}else {
						    		homeadmin.lblFff_4.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
						    		homeadmin.lblFff_4.setVisible(true);
						    	}

					        }if(cont ==5){
					        	homeadmin.textAreaFriends.setVisible(true);
					        	homeadmin.lblNoHParticipantes.setVisible(false);
					        	homeadmin.btnFriend_1.setVisible(true);
					        	homeadmin.btnFriend_2.setVisible(true);
					        	homeadmin.btn_Friend_3.setVisible(true);
					        	homeadmin.btn_Friend_4.setVisible(true);
					        	homeadmin.btn_Friend_5.setVisible(true);
					        	homeadmin.lblAdicionado.setVisible(true);
					        	homeadmin.lblAdicionado_1.setVisible(true);
					        	homeadmin.lblAdicionado_2.setVisible(true);
					        	homeadmin.lblAdicionado_3.setVisible(true);
					        	homeadmin.lblAdicionado_4.setVisible(true);
					        	homeadmin.lblArch_2_5.setVisible(true);
					        	
					        	homeadmin.btnPerfil_1.setVisible(true);
								homeadmin.btnPerfil_2.setVisible(true);
								homeadmin.btnPerfil_3.setVisible(true);
								homeadmin.btnPerfil_4.setVisible(true);
								homeadmin.btnPerfil_5.setVisible(true);
					        	
					        	int b = list.EncontrarInt(homeadmin.nomeOBJ[4]);
						    	if(list.listaUsuario[b].Foto_Perfil!=null) {
					                try {
					                    // Carrega a imagem do arquivo
					                    BufferedImage originalImage = ImageIO.read(new File(list.listaUsuario[b].Foto_Perfil));

					                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
					                    int newWidth = 90;
					                    int newHeight = 100;
					                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

					                    // Atribui a imagem redimensionada à JLabel
					                    //homeadmin.FotoPerfil.setIcon(new ImageIcon(scaledImage));
					                    homeadmin.lblFff_5.setIcon(new ImageIcon(scaledImage));
					                    homeadmin.lblFff_5.setVisible(true);
					                } catch (IOException ei) {
					                    ei.printStackTrace();
					                }
						    	
						    	
						    	}else {
						    		homeadmin.lblFff_5.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
						    		homeadmin.lblFff_5.setVisible(true);
						    	}

					        	
					        }
					        					        
					        StringBuilder st = new StringBuilder();
					        int d = 0;
					        int t = 0;
					        for(int x =0; x<list.listaUsuario.length; x++) {
								        	
							   if(list.listaUsuario[x] != null && x != ID && list.listaUsuario[ID].list.contains(x) == false) {
								   if(list.listaUsuario[ID].list_Pedidos.pedidoAqui(x) == true) {
								   st.append("\n").append(list.listaUsuario[x].getNome()).append(" ").append(list.listaUsuario[x].getSobre_nome()).append("\n").append("\n").append("\n"); //O primeiro sb.append("") é para posicionar aonde o nome do Usuário vai ficar 
								   homeadmin.Pedidos[d] = list.listaUsuario[x].getEmail();
								   
								   
									        
									d++;
									t++;    
								   }
								        	}
								   }
								        
								    //    homeadmin.lblFriend.setText(sb.toString());
								    homeadmin.txtrSamuelLucas.setText(st.toString());
								    
								    if(t==0) {
								    	homeadmin.panel_5.setVisible(false);
								    }
								    if(t>=1) {
								    	homeadmin.panel_5.setVisible(true);
								    	homeadmin.btnAdicionar.setVisible(true);
								    	homeadmin.btnAdicionar_2.setVisible(false);
								    	homeadmin.btnAdicionar_3.setVisible(false);
								    	homeadmin.btnAdicionar_4.setVisible(false);
								    	homeadmin.btnAdicionar_4_1.setVisible(false);
								    	homeadmin.btnRemover.setVisible(true);
								    	//homeadmin.btnRemover.setVisible(false);
								    	homeadmin.btnRemover_1.setVisible(false);
								    	homeadmin.btnRemover_2.setVisible(false);
								    	homeadmin.btnRemover_4.setVisible(false);
								    	homeadmin.btnRemover_4_1.setVisible(false);
								    	homeadmin.lblArch.setVisible(true);
								    	homeadmin.lblArch_1.setVisible(false);
								    	homeadmin.lblArch_2.setVisible(false);
								    	homeadmin.lblArch_3.setVisible(false);
								    	homeadmin.lblArch_4.setVisible(false);
								    	
								    	
								    	homeadmin.btnPerfil_2_1.setVisible(true);
										homeadmin.btnPerfil_2_2.setVisible(false);
										homeadmin.btnPerfil_2_3.setVisible(false);
										homeadmin.btnPerfil_2_4.setVisible(false);
										homeadmin.btnPerfil_2_5.setVisible(false);
										
								    	
								    	
								    	int a = list.EncontrarInt(homeadmin.Pedidos[0]);
								    	if(list.listaUsuario[a].Foto_Perfil!=null) {
							                try {
							                    // Carrega a imagem do arquivo
							                    BufferedImage originalImage = ImageIO.read(new File(list.listaUsuario[a].Foto_Perfil));

							                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
							                    int newWidth = 90;
							                    int newHeight = 100;
							                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

							                    // Atribui a imagem redimensionada à JLabel
							                    //homeadmin.FotoPerfil.setIcon(new ImageIcon(scaledImage));
							                    homeadmin.lblFf_1.setIcon(new ImageIcon(scaledImage));
							                    homeadmin.lblFf_1.setVisible(true);
							                } catch (IOException ei) {
							                    ei.printStackTrace();
							                }
								    	
								    	
								    	}else {
								    		homeadmin.lblFf_1.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
								    		homeadmin.lblFf_1.setVisible(true);
								    	}
								        
					        			
								    }
								    if(t>=2) {
								    	homeadmin.panel_5.setVisible(true);
								    	homeadmin.btnAdicionar.setVisible(true);
								    	homeadmin.btnAdicionar_2.setVisible(true);
								    	homeadmin.btnAdicionar_3.setVisible(false);
								    	homeadmin.btnAdicionar_4.setVisible(false);
								    	homeadmin.btnAdicionar_4_1.setVisible(false);
								    	homeadmin.btnRemover.setVisible(true);
								    //	homeadmin.btnRemover.setVisible(true);
								    	homeadmin.btnRemover_1.setVisible(false);
								    	homeadmin.btnRemover_2.setVisible(true);
								    	homeadmin.btnRemover_4.setVisible(false);
								    	homeadmin.btnRemover_4_1.setVisible(false);
								    	
								    	homeadmin.lblArch.setVisible(true);
								    	homeadmin.lblArch_1.setVisible(true);
								    	homeadmin.lblArch_2.setVisible(false);
								    	homeadmin.lblArch_3.setVisible(false);
								    	homeadmin.lblArch_4.setVisible(false);
								    	
								    	homeadmin.btnPerfil_2_1.setVisible(true);
										homeadmin.btnPerfil_2_2.setVisible(true);
										homeadmin.btnPerfil_2_3.setVisible(false);
										homeadmin.btnPerfil_2_4.setVisible(false);
										homeadmin.btnPerfil_2_5.setVisible(false);
										
								    	
								    	
								    	int a = list.EncontrarInt(homeadmin.Pedidos[1]);
								    	
								    	if(list.listaUsuario[a].Foto_Perfil!=null) {
							                try {
							                    // Carrega a imagem do arquivo
							                    BufferedImage originalImage = ImageIO.read(new File(list.listaUsuario[a].Foto_Perfil));

							                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
							                    int newWidth = 100;
							                    int newHeight = 100;
							                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

							                    // Atribui a imagem redimensionada à JLabel
							                    //homeadmin.FotoPerfil.setIcon(new ImageIcon(scaledImage));
							                    homeadmin.lblFf_2.setIcon(new ImageIcon(scaledImage));
							                    homeadmin.lblFf_2.setVisible(true);
							                    
							                } catch (IOException ei) {
							                    ei.printStackTrace();
							                }
								    	
								    	
								    	}else {
								    		homeadmin.lblFf_2.setVisible(true);
								    		homeadmin.lblFf_2.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
								    	}
								        
					        			
					         }
								    if(t>=3) {
								    	homeadmin.panel_5.setVisible(true);
								    	homeadmin.btnAdicionar.setVisible(true);
								    	homeadmin.btnAdicionar_2.setVisible(true);
								    	homeadmin.btnAdicionar_3.setVisible(true);
								    	homeadmin.btnAdicionar_4.setVisible(false);
								    	homeadmin.btnAdicionar_4_1.setVisible(false);
								    	homeadmin.btnRemover.setVisible(true);
								    //	homeadmin.btnRemover.setVisible(true);
								    	homeadmin.btnRemover_1.setVisible(true);
								    	homeadmin.btnRemover_2.setVisible(true);
								    	homeadmin.btnRemover_4.setVisible(false);
								    	homeadmin.btnRemover_4_1.setVisible(false);
								    	
								    	homeadmin.lblArch.setVisible(true);
								    	homeadmin.lblArch_1.setVisible(true);
								    	homeadmin.lblArch_2.setVisible(true);
								    	homeadmin.lblArch_3.setVisible(false);
								    	homeadmin.lblArch_4.setVisible(false);
								    	
								    	homeadmin.btnPerfil_2_1.setVisible(true);
										homeadmin.btnPerfil_2_2.setVisible(true);
										homeadmin.btnPerfil_2_3.setVisible(true);
										homeadmin.btnPerfil_2_4.setVisible(false);
										homeadmin.btnPerfil_2_5.setVisible(false);
										
								    	
								    	int a = list.EncontrarInt(homeadmin.Pedidos[2]);
								    	
								    	if(list.listaUsuario[a].Foto_Perfil!=null) {
							                try {
							                    // Carrega a imagem do arquivo
							                    BufferedImage originalImage = ImageIO.read(new File(list.listaUsuario[a].Foto_Perfil));

							                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
							                    int newWidth = 100;
							                    int newHeight = 100;
							                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

							                    // Atribui a imagem redimensionada à JLabel
							                    //homeadmin.FotoPerfil.setIcon(new ImageIcon(scaledImage));
							                    homeadmin.lblFf_3.setIcon(new ImageIcon(scaledImage));
							                    homeadmin.lblFf_3.setVisible(true);
							                } catch (IOException ei) {
							                    ei.printStackTrace();
							                }
								    	
								    	
								    	}else {
								    		homeadmin.lblFf_3.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
								    		homeadmin.lblFf_3.setVisible(true);
								    	}

								    }
								    if(t>=4) {
								    	homeadmin.panel_5.setVisible(true);
								    	homeadmin.btnAdicionar.setVisible(true);
								    	homeadmin.btnAdicionar_2.setVisible(true);
								    	homeadmin.btnAdicionar_3.setVisible(true);
								    	homeadmin.btnAdicionar_4.setVisible(true);
								    	homeadmin.btnAdicionar_4_1.setVisible(false);
								    	homeadmin.btnRemover.setVisible(true);
								    	//homeadmin.btnRemover.setVisible(true);
								    	homeadmin.btnRemover_1.setVisible(true);
								    	homeadmin.btnRemover_2.setVisible(true);
								    	homeadmin.btnRemover_4.setVisible(true);
								    	homeadmin.btnRemover_4_1.setVisible(false);
								    	
								    	homeadmin.lblArch.setVisible(true);
								    	homeadmin.lblArch_1.setVisible(true);
								    	homeadmin.lblArch_2.setVisible(true);
								    	homeadmin.lblArch_3.setVisible(true);
								    	homeadmin.lblArch_4.setVisible(false);
								    	
								    	homeadmin.btnPerfil_2_1.setVisible(true);
										homeadmin.btnPerfil_2_2.setVisible(true);
										homeadmin.btnPerfil_2_3.setVisible(true);
										homeadmin.btnPerfil_2_4.setVisible(true);
										homeadmin.btnPerfil_2_5.setVisible(false);
										
								    	
								    	
								    	int a = list.EncontrarInt(homeadmin.Pedidos[3]);
								    	
								    	if(list.listaUsuario[a].Foto_Perfil!=null) {
							                try {
							                    // Carrega a imagem do arquivo
							                    BufferedImage originalImage = ImageIO.read(new File(list.listaUsuario[a].Foto_Perfil));

							                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
							                    int newWidth = 100;
							                    int newHeight = 100;
							                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

							                    // Atribui a imagem redimensionada à JLabel
							                    //homeadmin.FotoPerfil.setIcon(new ImageIcon(scaledImage));
							                    homeadmin.lblFf_4.setIcon(new ImageIcon(scaledImage));
							                    homeadmin.lblFf_4.setVisible(true);
							                    
							                } catch (IOException ei) {
							                    ei.printStackTrace();
							                }
								    	
								    	
								    	}else {
								    		homeadmin.lblFf_4.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
								    		homeadmin.lblFf_4.setVisible(true);
								    	}


								    }
								    if(t==5) {
								    	homeadmin.panel_5.setVisible(true);
								    	homeadmin.btnAdicionar.setVisible(true);
								    	homeadmin.btnAdicionar_2.setVisible(true);
								    	homeadmin.btnAdicionar_3.setVisible(false);
								    	homeadmin.btnAdicionar_4.setVisible(false);
								    	homeadmin.btnAdicionar_4_1.setVisible(false);
								    	homeadmin.btnRemover.setVisible(true);
								    //	homeadmin.btnRemover.setVisible(true);
								    	homeadmin.btnRemover_1.setVisible(true);
								    	homeadmin.btnRemover_2.setVisible(true);
								    	homeadmin.btnRemover_4.setVisible(true);
								    	homeadmin.btnRemover_4_1.setVisible(true);
								    	
								    	homeadmin.lblArch.setVisible(true);
								    	homeadmin.lblArch_1.setVisible(true);
								    	homeadmin.lblArch_2.setVisible(true);
								    	homeadmin.lblArch_3.setVisible(true);
								    	homeadmin.lblArch_4.setVisible(true);
								    	
								    	homeadmin.btnPerfil_2_1.setVisible(true);
										homeadmin.btnPerfil_2_2.setVisible(true);
										homeadmin.btnPerfil_2_3.setVisible(true);
										homeadmin.btnPerfil_2_4.setVisible(true);
										homeadmin.btnPerfil_2_5.setVisible(true);
																		    	
								    	int a = list.EncontrarInt(homeadmin.Pedidos[4]);
								    	
								    	if(list.listaUsuario[a].Foto_Perfil!=null) {
							                try {
							                    // Carrega a imagem do arquivo
							                    BufferedImage originalImage = ImageIO.read(new File(list.listaUsuario[a].Foto_Perfil));

							                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
							                    int newWidth = 100;
							                    int newHeight = 100;
							                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

							                    // Atribui a imagem redimensionada à JLabel
							                    //homeadmin.FotoPerfil.setIcon(new ImageIcon(scaledImage));
							                    homeadmin.lblFf_5.setIcon(new ImageIcon(scaledImage));
							                    homeadmin.lblFf_5.setVisible(true);
							                } catch (IOException ei) {
							                    ei.printStackTrace();
							                }
								    	
								    	
								    	}else {
								    		homeadmin.lblFf_5.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
								    		homeadmin.lblFf_5.setVisible(true);
								    	}

								    }
								    
					        }
								    
					}
					
});
				
		btnNewButton.setBounds(665, 369, 139, 38);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCadastrar = new JButton("");
		btnCadastrar.setBorder(null);
		btnCadastrar.setContentAreaFilled(false);
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnCadastrar.setBounds(668, 439, 129, 38);
		frame.getContentPane().add(btnCadastrar);
		btnCadastrar.setFont(new Font("Dialog", Font.BOLD, 12));
		
		btnCadastrar.addActionListener(new ActionListener() {
			
			//Ação do botão Cadastrar
			public void actionPerformed(ActionEvent e) {
				
			
			Tela_Cadastro main = new Tela_Cadastro(list);
			//System.out.println("Voce digitou");
			Tela_Cadastro.main(null);
			frame.dispose();
			
		
			}
			}) ;
		
		
		JRadioButton rdbtnMostrarSenha = new JRadioButton("");
		rdbtnMostrarSenha.setFocusable(false);
		rdbtnMostrarSenha.setFocusPainted(false);
		rdbtnMostrarSenha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnMostrarSenha.setContentAreaFilled(false);
		rdbtnMostrarSenha.setMinimumSize(new Dimension(30, 30));
		rdbtnMostrarSenha.setMaximumSize(new Dimension(40, 40));
		rdbtnMostrarSenha.setActionCommand("");
		rdbtnMostrarSenha.setFont(new Font("Dialog", Font.BOLD, 11));
		rdbtnMostrarSenha.setBounds(626, 310, 171, 21);
		frame.getContentPane().add(rdbtnMostrarSenha);
		rdbtnMostrarSenha.addActionListener(new ActionListener() {
			
			//Ação do RadioButtom para ocultar o que sai do texto password
			public void actionPerformed(ActionEvent e) {
				 JRadioButton checkBox = (JRadioButton) e.getSource();
	                Campo_senha.setEchoChar(checkBox.isSelected() ? '\u0000' : '•');
	                
	                if (checkBox.isSelected()) {
	                    lblmostrar_senha_ativado.setVisible(true);
	                    lblMostrarsenha.setVisible(false);
	                } else {
	                    lblmostrar_senha_ativado.setVisible(false);
	                    lblMostrarsenha.setVisible(true);
	                }
		
			}
				}) ;
		
		
		JLabel lblHhh_1 = new JLabel("");
		lblHhh_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblHhh_1.setIcon(new ImageIcon("/home/samuel/Desktop/.Tela_Login.png"));
		lblHhh_1.setBounds(483, 40, 595, 498);
		frame.getContentPane().add(lblHhh_1);
		
		JLabel arch = new JLabel("New label");
		arch.setIcon(new ImageIcon("/home/samuel/eclipse-workspace/Sistema_Protótico/src/Imagens/Screenshot from 2023-08-19 15-51-08.png"));
		arch.setBounds(567, 56, 428, 399);
		frame.getContentPane().add(arch);
		
		JLabel lblHhh = new JLabel("");
		lblHhh.setIcon(new ImageIcon("/home/samuel/Downloads/X_vermelho-removebg-preview_resized.png"));
		lblHhh.setBounds(911, -8, 26, 43);
		frame.getContentPane().add(lblHhh);

		
	}
	

	
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
