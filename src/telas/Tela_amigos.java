package telas;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Cursor;

public class Tela_amigos {
	
	String[] email_name;
	String[] nome_vetor;
	
	
	JButton btnAmigo_add1 = new JButton();
	JButton btnAmigo_add2 = new JButton();
	JButton btnAmigo_add3 = new JButton();
	JButton btnAmigo_add4 = new JButton();
	JButton btnAmigo_add5 = new JButton();
	
	public JFrame frame;
	public JTextField textField;

	private static Home_admin homeadmin;
    static Tela_Login login;
    static List_Usuarios list;
    static Usuario user;
    
    JButton btnamigo1_1 = new JButton();
    JButton btnamigo1_2 = new JButton();
    JButton btnamigo1_3 = new JButton();
    JButton btnamigo1_4 = new JButton();
    JButton btnamigo1_5 = new JButton();
    
    
    JPanel panel = new JPanel();
    
	JLabel lblAdicionado = new JLabel("Adicionado");
	JLabel lblAdicionado_1 = new JLabel("Adicionado");
	JLabel lblAdicionado_2 = new JLabel("Adicionado");
	JLabel lblAdicionado_3 = new JLabel("Adicionado");
	JLabel lblAdicionado_4 = new JLabel("Adicionado");

    JLabel lblNome1 = new JLabel("");
    JLabel lblNome2 = new JLabel("");
    JLabel lblNome3 = new JLabel("");
    JLabel lblNome4 = new JLabel("");
    JLabel lblNome5 = new JLabel("");
    
    JLabel lblPhoto_1 = new JLabel("");
    JLabel lblPhoto_2 = new JLabel("");
    JLabel lblPhoto_3 = new JLabel("");
    JLabel lblPhoto_4 = new JLabel("");
    JLabel lblPhoto_5 = new JLabel("");
    
    JLabel lblArch_1 = new JLabel("");
    JLabel lblArch_2 = new JLabel("");
    JLabel lblArch_3 = new JLabel("");
    JLabel lblArch_4 = new JLabel("");
    JLabel lblArch_5 = new JLabel("");
    
	JButton btnRemover_1 = new JButton("Remover");
	JButton btnRemover_2 = new JButton("Remover");
	JButton btnRemover_3 = new JButton("Remover");
	JButton btnRemover_4 = new JButton("Remover");
	JButton btnRemover_5 = new JButton("Remover");

    ArrayList mostrarAmigos = new ArrayList<>();
	
    JLabel lblRemovido = new JLabel("Removido");
    JLabel lblRemovido_1 = new JLabel("Removido");
    JLabel lblRemovido_2 = new JLabel("Removido");
    JLabel lblRemovido_3 = new JLabel("Removido");
    JLabel lblRemovido_4 = new JLabel("Removido");
    JTextField txtZsdfgasdfh;
    
    JTextArea txtrArea_1 = new JTextArea();
    
    JLabel lblArch_2_1 = new JLabel("");
    JLabel lblPhoto_2_1 = new JLabel("");
    JLabel lblArch_2_2 = new JLabel("");
    JLabel lblPhoto_2_2 = new JLabel("");
    JLabel lblArch_2_3 = new JLabel("");
    JLabel lblPhoto_2_3 = new JLabel("");
    JLabel lblArch_2_4 = new JLabel("");
    JLabel lblPhoto_2_4 = new JLabel("");
    JLabel lblArch_2_5 = new JLabel("");
    JLabel lblPhoto_2_5 = new JLabel("");
    
    JButton btnAdicionar = new JButton("Adicionar");
    JButton btnAdicionar_1 = new JButton("Adicionar");
    JButton btnAdicionar_2 = new JButton("Adicionar");
    JButton btnAdicionar_3 = new JButton("Adicionar");
    JButton btnAdicionar_4 = new JButton("Adicionar");
    private final JLabel lblL_1 = new JLabel("");
    public final JLabel lblVocNoContm = new JLabel("Você não contém amigos ainda.");
    private final JLabel lblL_2 = new JLabel("L");
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Tela_amigos window = new Tela_amigos(homeadmin, list, user);
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
	public Tela_amigos(Home_admin homeadmin, List_Usuarios list, Usuario user) {
		this.user = user;
    	this.homeadmin = homeadmin;
    	this.list = list;
    	
    	email_name = new String[login.list.listaUsuario.length];
    	this.frame = new JFrame();
		nome_vetor= new String[homeadmin.login.list.listaUsuario.length];
    	
		initialize();
	}

	
	private void initialize() {
		
		lblArch_1.setBounds(22, 56, 338, 77);
		lblArch_2.setBounds(22, 146, 338, 77);
		lblArch_3.setBounds(22, 235, 338, 77);
		lblArch_4.setBounds(22, 323, 340, 77);
		lblArch_5.setBounds(22, 410, 338, 77);

		lblRemovido.setVisible(false);
		lblRemovido_1.setVisible(false);
		lblRemovido_2.setVisible(false);
		lblRemovido_3.setVisible(false);
		lblRemovido_4.setVisible(false);
		
		
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
		btnAdicionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar.setForeground(new Color(241, 241, 241));
		btnAdicionar.setBackground(new Color(26, 95, 180));
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int o = login.list.EncontrarInt(nome_vetor[0]);
				
				login.list.listaUsuario[o].list_Pedidos.addPedido(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.addPedidoRequerido(o);
				
				btnAdicionar.setVisible(false);
				lblAdicionado.setVisible(true);
								
			
			}
		});
		btnAdicionar.setBounds(226, 142, 117, 25);
		
		frame.getContentPane().add(btnAdicionar);
		btnAdicionar_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar_1.setForeground(new Color(241, 241, 241));
		btnAdicionar_1.setBackground(new Color(26, 95, 180));
		btnAdicionar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int o = login.list.EncontrarInt(nome_vetor[1]);
				
				login.list.listaUsuario[o].list_Pedidos.addPedido(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.addPedidoRequerido(o);
			
				btnAdicionar_1.setVisible(false);
				lblAdicionado_1.setVisible(true);
				
			}
		});
		btnAdicionar_1.setBounds(226, 215, 117, 25);
		
		frame.getContentPane().add(btnAdicionar_1);
		btnAdicionar_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar_2.setForeground(new Color(241, 241, 241));
		btnAdicionar_2.setBackground(new Color(26, 95, 180));
		btnAdicionar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int o = login.list.EncontrarInt(nome_vetor[2]);
				
				login.list.listaUsuario[o].list_Pedidos.addPedido(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.addPedidoRequerido(o);
				
				btnAdicionar_2.setVisible(false);
				lblAdicionado_2.setVisible(true);
			
			}
		});
		btnAdicionar_2.setBounds(226, 288, 117, 25);
		
		frame.getContentPane().add(btnAdicionar_2);
		btnAdicionar_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar_3.setForeground(new Color(241, 241, 241));
		btnAdicionar_3.setBackground(new Color(26, 95, 180));
		btnAdicionar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int o = login.list.EncontrarInt(nome_vetor[3]);
				
				login.list.listaUsuario[o].list_Pedidos.addPedido(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.addPedidoRequerido(o);
			
				btnAdicionar_3.setVisible(false);
				lblAdicionado_3.setVisible(true);
			}
		});
		btnAdicionar_3.setBounds(226, 362, 117, 25);
		
		frame.getContentPane().add(btnAdicionar_3);
		btnAdicionar_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar_4.setForeground(new Color(241, 241, 241));
		btnAdicionar_4.setBackground(new Color(26, 95, 180));
		btnAdicionar_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int o = login.list.EncontrarInt(nome_vetor[4]);
				
				login.list.listaUsuario[o].list_Pedidos.addPedido(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.addPedidoRequerido(o);
				
				btnAdicionar_4.setVisible(false);
				lblAdicionado_4.setVisible(true);
			
			}
		});
		btnAdicionar_4.setBounds(226, 430, 117, 25);
		
		frame.getContentPane().add(btnAdicionar_4);
		
		lblAdicionado.setBounds(245, 147, 96, 15);
		frame.getContentPane().add(lblAdicionado);
		
		lblAdicionado_1.setBounds(243, 221, 91, 15);
		frame.getContentPane().add(lblAdicionado_1);
		
		lblAdicionado_2.setBounds(243, 294, 91, 15);
		frame.getContentPane().add(lblAdicionado_2);
		
		lblAdicionado_3.setBounds(243, 368, 96, 15);
		frame.getContentPane().add(lblAdicionado_3);
		
		lblAdicionado_4.setBounds(243, 436, 98, 15);
		frame.getContentPane().add(lblAdicionado_4);
				btnAmigo_add1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						int o = login.list.EncontrarInt(nome_vetor[0]);
						
						if(login.list.listaUsuario[o].Foto_Perfil !=null) {
							homeadmin.lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
							}else homeadmin.lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
							if(login.list.listaUsuario[o].bio !=null) {
								homeadmin.textArea_Bio.setText(login.list.listaUsuario[o].getBio());
							}else homeadmin.textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
							if(login.list.listaUsuario[o].getGitHub() !=null) {
								homeadmin.lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
							}else homeadmin.lblLinkgitgub.setText("Não Declarado");
							if(login.list.listaUsuario[o].getLinked() !=null) {
								homeadmin.lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
							}else homeadmin.lblLinkLinkend.setText("Não Declarado");
							if(login.list.listaUsuario[o].getCurso() !=null) {
								homeadmin.lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
							}else homeadmin.lblCurso_Perfil.setText("Não Declarado");
							
							homeadmin.lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
							homeadmin.lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
							
							homeadmin.lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
							
							homeadmin.btnEditar.setEnabled(false);
							homeadmin.btnEditar.setVisible(false);
							
							frame.setVisible(false);
							
							Component[] components = homeadmin.panel_4.getComponents(); 
							for (Component component : components) {
							    component.setEnabled(false); 
							}
							
							Component[] components2 = homeadmin.panel_5.getComponents();
							for(Component component : components2) {
								component.setEnabled(false);
							}
							
							
							homeadmin.frame.setEnabled(true);
							homeadmin.perfil.setVisible(true);
				        	
						
					}
				});
				btnAmigo_add1.setContentAreaFilled(false);
		
				
				frame.getContentPane().add(btnAmigo_add1);
		btnAmigo_add2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				int o = login.list.EncontrarInt(nome_vetor[1]);
				
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					homeadmin.lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else homeadmin.lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						homeadmin.textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else homeadmin.textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						homeadmin.lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else homeadmin.lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						homeadmin.lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else homeadmin.lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						homeadmin.lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else homeadmin.lblCurso_Perfil.setText("Não Declarado");
					
					homeadmin.lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					homeadmin.lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					homeadmin.lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					homeadmin.btnEditar.setEnabled(false);
					homeadmin.btnEditar.setVisible(false);
					
					frame.setVisible(false);
					
					Component[] components = homeadmin.panel_4.getComponents(); 
					for (Component component : components) {
					    component.setEnabled(false); 
					}
					
					Component[] components2 = homeadmin.panel_5.getComponents();
					for(Component component : components2) {
						component.setEnabled(false);
					}
					
					
					homeadmin.frame.setEnabled(true);
					homeadmin.perfil.setVisible(true);
		        	
			
				
			}
		});
		btnAmigo_add2.setContentAreaFilled(false);
				
			//	btnAmigo_add1.setBounds(lblArch_2_1.getBounds());
		frame.getContentPane().add(btnAmigo_add2);
		btnAmigo_add3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			

				int o = login.list.EncontrarInt(nome_vetor[2]);
				
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					homeadmin.lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else homeadmin.lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						homeadmin.textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else homeadmin.textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						homeadmin.lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else homeadmin.lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						homeadmin.lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else homeadmin.lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						homeadmin.lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else homeadmin.lblCurso_Perfil.setText("Não Declarado");
					
					homeadmin.lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					homeadmin.lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					homeadmin.lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					homeadmin.btnEditar.setEnabled(false);
					homeadmin.btnEditar.setVisible(false);
					
					frame.setVisible(false);
					
					Component[] components = homeadmin.panel_4.getComponents(); 
					for (Component component : components) {
					    component.setEnabled(false); 
					}
					
					Component[] components2 = homeadmin.panel_5.getComponents();
					for(Component component : components2) {
						component.setEnabled(false);
					}
					
					
					homeadmin.frame.setEnabled(true);
					homeadmin.perfil.setVisible(true);
		        	
			
			
			
			}
		});
		btnAmigo_add3.setContentAreaFilled(false);
		frame.getContentPane().add(btnAmigo_add3);
		btnAmigo_add4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int o = login.list.EncontrarInt(nome_vetor[3]);
				
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					homeadmin.lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else homeadmin.lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						homeadmin.textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else homeadmin.textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						homeadmin.lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else homeadmin.lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						homeadmin.lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else homeadmin.lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						homeadmin.lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else homeadmin.lblCurso_Perfil.setText("Não Declarado");
					
					homeadmin.lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					homeadmin.lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					homeadmin.lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					homeadmin.btnEditar.setEnabled(false);
					homeadmin.btnEditar.setVisible(false);
					
					frame.setVisible(false);
					
					Component[] components = homeadmin.panel_4.getComponents(); 
					for (Component component : components) {
					    component.setEnabled(false); 
					}
					
					Component[] components2 = homeadmin.panel_5.getComponents();
					for(Component component : components2) {
						component.setEnabled(false);
					}
					
					
					homeadmin.frame.setEnabled(true);
					homeadmin.perfil.setVisible(true);
		        	
			
				
				
				
			}
		});
		btnAmigo_add4.setContentAreaFilled(false);
		frame.getContentPane().add(btnAmigo_add4);
		btnAmigo_add5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				int o = login.list.EncontrarInt(nome_vetor[4]);
				
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					homeadmin.lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else homeadmin.lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						homeadmin.textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else homeadmin.textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						homeadmin.lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else homeadmin.lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						homeadmin.lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else homeadmin.lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						homeadmin.lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else homeadmin.lblCurso_Perfil.setText("Não Declarado");
					
					homeadmin.lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					homeadmin.lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					homeadmin.lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					homeadmin.btnEditar.setEnabled(false);
					homeadmin.btnEditar.setVisible(false);
					
					frame.setVisible(false);
					
					Component[] components = homeadmin.panel_4.getComponents(); 
					for (Component component : components) {
					    component.setEnabled(false); 
					}
					
					Component[] components2 = homeadmin.panel_5.getComponents();
					for(Component component : components2) {
						component.setEnabled(false);
					}
					
					
					homeadmin.frame.setEnabled(true);
					homeadmin.perfil.setVisible(true);
		        	
			
				
			}
		});
		btnAmigo_add5.setContentAreaFilled(false);
		frame.getContentPane().add(btnAmigo_add5);
		lblPhoto_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblPhoto_2_1.setBounds(18, 126, 64, 62);
		
		frame.getContentPane().add(lblPhoto_2_1);
		lblArch_2_1.setBorder(UIManager.getBorder("InternalFrame.border"));
		lblArch_2_1.setBounds(12, 118, 338, 77);
		btnAmigo_add1.setBounds(lblArch_2_1.getBounds());
		frame.getContentPane().add(lblArch_2_1);
		lblPhoto_2_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblPhoto_2_2.setBounds(18, 200, 64, 62);
		
		frame.getContentPane().add(lblPhoto_2_2);
		lblArch_2_2.setBorder(UIManager.getBorder("InternalFrame.border"));
		lblArch_2_2.setBounds(12, 192, 338, 77);
		btnAmigo_add2.setBounds(lblArch_2_2.getBounds());
		
		frame.getContentPane().add(lblArch_2_2);
		lblPhoto_2_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblPhoto_2_3.setBounds(18, 274, 64, 62);
		
		frame.getContentPane().add(lblPhoto_2_3);
		lblArch_2_3.setBorder(UIManager.getBorder("InternalFrame.border"));
		lblArch_2_3.setBounds(12, 266, 338, 77);
		btnAmigo_add3.setBounds(lblArch_2_3.getBounds());
		frame.getContentPane().add(lblArch_2_3);
		lblPhoto_2_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblPhoto_2_4.setBounds(18, 348, 64, 62);
		
		
		frame.getContentPane().add(lblPhoto_2_4);
		lblArch_2_4.setBorder(UIManager.getBorder("InternalFrame.border"));
		lblArch_2_4.setBounds(12, 340, 338, 77);
		btnAmigo_add4.setBounds(lblArch_2_4.getBounds());
		
		frame.getContentPane().add(lblArch_2_4);
		lblPhoto_2_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblPhoto_2_5.setBounds(18, 420, 64, 62);
		
		frame.getContentPane().add(lblPhoto_2_5);
		lblArch_2_5.setBorder(UIManager.getBorder("InternalFrame.border"));
		lblArch_2_5.setBounds(12, 412, 338, 77);
		btnAmigo_add5.setBounds(lblArch_2_5.getBounds());
		
		frame.getContentPane().add(lblArch_2_5);
		txtrArea_1.setEditable(false);
		txtrArea_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtrArea_1.setBackground(new Color(0, 0, 0, 0));
		txtrArea_1.setBounds(83, 129, 137, 398);
		
			
			frame.getContentPane().add(txtrArea_1);
			
		//	txtrArea_1.setText("\n Samuel Lucas\n\n\n\n Pedro Lima\n\n\n\n Rafael Felipe\n\n\n\n Jonathan Ferreira\n\n\n\n Carlos Rafael");
		
		
		
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setEnabled(false);
		//textField.setBounds(403, 123, 166, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setText("kleber@gmail.com");
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		//textArea.setBounds(377, 154, 171, 278);
		frame.getContentPane().add(textArea);
		textArea.setEditable(false);
		
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String amigo = textField.getText();
			list.Encontrar(amigo);
			
			if(!list.listaUsuario[login.ID].getEmail().equals(amigo)) {
			
			if(list.listaUsuario[login.ID].list.contains(list.fff) == false) {
			list.addFriend(login.ID, amigo);				
			}
			else {
				JOptionPane.showMessageDialog(null, "Esse usuário já é seu amigo!");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Você não pode ser o seu próprio amigo!");
				 }
			}
		});
		
		
	//	btnAdd.setBounds(393, 444, 117, 25);
		frame.getContentPane().add(btnAdd);
		
		JButton btnMostrarTodos = new JButton("Mostrar Todos");
		btnMostrarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	list.mostrarAmigos(login.ID);
				
		        ElementosInt aux = list.listaUsuario[login.ID].list.primeiro;
		        StringBuilder sb = new StringBuilder();
		        int i = 0;
		        while (aux != null) {
		            //sb.append(aux.publication).append("\n");
		            //sb.append("\n" + Tela_Login.nome_para_tela).append(":");
		        	i = aux.getValor();
			        sb.append("").append(aux.getValor()).append(" - ").append(list.listaUsuario[i].getNome()).append(" ").append(list.listaUsuario[i].getEmail()).append("\n"); //O primeiro sb.append("") é para posicionar aonde o nome do Usuário vai ficar 
			        aux = aux.getElemento();
		        }
		        
		        textArea.setText(sb.toString());
				
			}
		});
	//	btnMostrarTodos.setBounds(385, 538, 137, 25);
		frame.getContentPane().add(btnMostrarTodos);
		
		
		JButton btnFechar = new JButton("");
		btnFechar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFechar.setContentAreaFilled(false);
		btnFechar.setBorderPainted(false);
		btnFechar.setBorder(null);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				homeadmin.frame.setVisible(true);
				homeadmin.lblBorro.setVisible(false);
				homeadmin.Desembacar();
				
				frame.dispose();
				
			}
		});
		btnFechar.setBounds(821, 14, 117, 25);
		frame.getContentPane().add(btnFechar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(list.Encontrar(textField.getText()) == true) {
				if(!list.listaUsuario[login.ID].getEmail().equals(textField.getText())) {
					
					if(list.listaUsuario[login.ID].list.contains(list.fff) == true) {
					list.listaUsuario[login.ID].list.removerAmigo(list.fff);
					list.listaUsuario[list.fff].list.removerAmigo(login.ID);
				//	JOptionPane.showMessageDialog(null, "Amigo removido!!!");
					}
					
				
					}
				}
			}
		});
	//	btnRemover.setBounds(393, 492, 117, 25);
		frame.getContentPane().add(btnRemover);
		
		
		panel.setBounds(575, 66, 368, 508);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(0,0,0,0));
		btnRemover_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemover_1.setForeground(new Color(241, 241, 241));
		btnRemover_1.setBackground(new Color(165, 29, 45));
		
		btnRemover_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(list.Encontrar(email_name[0]) == true) {
					if(!list.listaUsuario[login.ID].getEmail().equals(email_name[0])) {
						
						if(list.listaUsuario[login.ID].list.contains(list.fff) == true) {
						list.listaUsuario[login.ID].list.removerAmigo(list.fff);
						list.listaUsuario[list.fff].list.removerAmigo(login.ID);
					//	JOptionPane.showMessageDialog(null, "Amigo removido!!!");
						btnRemover_1.setVisible(false);
						lblRemovido.setVisible(true);
						}
						
					
						}
					}
				
				
			}
		});
		btnRemover_1.setBounds(231, 83, 117, 25);
		panel.add(btnRemover_1);
		btnRemover_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemover_2.setForeground(new Color(241, 241, 241));
		btnRemover_2.setBackground(new Color(165, 29, 45));
		
		btnRemover_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(list.Encontrar(email_name[1]) == true) {
					if(!list.listaUsuario[login.ID].getEmail().equals(email_name[1])) {
						
						if(list.listaUsuario[login.ID].list.contains(list.fff) == true) {
						list.listaUsuario[login.ID].list.removerAmigo(list.fff);
						list.listaUsuario[list.fff].list.removerAmigo(login.ID);
					//	JOptionPane.showMessageDialog(null, "Amigo removido!!!");
						btnRemover_2.setVisible(false);
						lblRemovido_1.setVisible(true);
						}
						
					
						}
					}
			}
		});
		btnRemover_2.setBounds(231, 172, 117, 25);
		panel.add(btnRemover_2);
		btnRemover_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemover_3.setForeground(new Color(241, 241, 241));
		btnRemover_3.setBackground(new Color(165, 29, 45));
		
		btnRemover_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(list.Encontrar(email_name[2]) == true) {
					if(!list.listaUsuario[login.ID].getEmail().equals(email_name[2])) {
						
						if(list.listaUsuario[login.ID].list.contains(list.fff) == true) {
						list.listaUsuario[login.ID].list.removerAmigo(list.fff);
						list.listaUsuario[list.fff].list.removerAmigo(login.ID);
					//	JOptionPane.showMessageDialog(null, "Amigo removido!!!");
						btnRemover_3.setVisible(false);
						lblRemovido_2.setVisible(true);
						}
						
					
						}
					}
				
				
			}
		});
		btnRemover_3.setBounds(231, 262, 117, 25);
		panel.add(btnRemover_3);
		btnRemover_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemover_4.setForeground(new Color(241, 241, 241));
		btnRemover_4.setBackground(new Color(165, 29, 45));
		
		btnRemover_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(list.Encontrar(email_name[3]) == true) {
					if(!list.listaUsuario[login.ID].getEmail().equals(email_name[0])) {
						
						if(list.listaUsuario[login.ID].list.contains(list.fff) == true) {
						list.listaUsuario[login.ID].list.removerAmigo(list.fff);
						list.listaUsuario[list.fff].list.removerAmigo(login.ID);
					//	JOptionPane.showMessageDialog(null, "Amigo removido!!!");
						btnRemover_4.setVisible(false);
						lblRemovido_3.setVisible(true);
						}
						
					
						}
					}
			}
		});
		btnRemover_4.setBounds(231, 349, 117, 25);
		panel.add(btnRemover_4);
		btnRemover_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemover_5.setForeground(new Color(241, 241, 241));
		btnRemover_5.setBackground(new Color(165, 29, 45));
		
		btnRemover_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(list.Encontrar(email_name[4]) == true) {
					if(!list.listaUsuario[login.ID].getEmail().equals(email_name[0])) {
						
						if(list.listaUsuario[login.ID].list.contains(list.fff) == true) {
						list.listaUsuario[login.ID].list.removerAmigo(list.fff);
						list.listaUsuario[list.fff].list.removerAmigo(login.ID);
					//	JOptionPane.showMessageDialog(null, "Amigo removido!!!");
						btnRemover_5.setVisible(false);
						lblRemovido_4.setVisible(true);
						}
						
					
						}
					}
			}
		});
		btnRemover_5.setBounds(231, 437, 117, 25);
		panel.add(btnRemover_5);
		
		lblRemovido.setBounds(245, 89, 95, 15);
		panel.add(lblRemovido);
		lblRemovido.setFont(new Font("Noto Mono", Font.BOLD, 15));
		lblRemovido.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRemovido_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRemovido_1.setFont(new Font("Noto Mono", Font.BOLD, 15));
		lblRemovido_1.setBounds(245, 177, 95, 15);
		
		panel.add(lblRemovido_1);
		lblRemovido_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRemovido_2.setFont(new Font("Noto Mono", Font.BOLD, 15));
		lblRemovido_2.setBounds(243, 267, 95, 15);
		
		panel.add(lblRemovido_2);
		lblRemovido_3.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRemovido_3.setFont(new Font("Noto Mono", Font.BOLD, 15));
		lblRemovido_3.setBounds(245, 354, 95, 15);
		
		panel.add(lblRemovido_3);
		lblRemovido_4.setVerticalAlignment(SwingConstants.BOTTOM);
		lblRemovido_4.setFont(new Font("Noto Mono", Font.BOLD, 15));
		lblRemovido_4.setBounds(245, 442, 95, 15);
		
		panel.add(lblRemovido_4);
		
		lblNome1.setBounds(99, 88, 120, 15);
		panel.add(lblNome1);
		
		lblNome2.setBounds(99, 177, 120, 15);
		panel.add(lblNome2);
		
		lblNome3.setBounds(99, 267, 120, 15);
		panel.add(lblNome3);
		
		lblNome4.setBounds(99, 354, 120, 15);
		panel.add(lblNome4);
		
		lblNome5.setBounds(99, 442, 120, 15);
		panel.add(lblNome5);
		
		lblPhoto_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblPhoto_1.setBounds(28, 64, 64, 62);
		panel.add(lblPhoto_1);
		
		lblPhoto_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblPhoto_2.setBounds(28, 153, 64, 62);
		panel.add(lblPhoto_2);
		
		lblPhoto_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblPhoto_3.setBounds(28, 243, 64, 62);
		panel.add(lblPhoto_3);
		
		lblPhoto_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblPhoto_4.setBounds(28, 330, 64, 62);
		panel.add(lblPhoto_4);
		
		lblPhoto_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblPhoto_5.setBounds(28, 418, 64, 62);
		panel.add(lblPhoto_5);
		btnamigo1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int o = login.list.EncontrarInt(email_name[0]);
				
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					homeadmin.lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else homeadmin.lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						homeadmin.textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else homeadmin.textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						homeadmin.lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else homeadmin.lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						homeadmin.lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else homeadmin.lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						homeadmin.lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else homeadmin.lblCurso_Perfil.setText("Não Declarado");
					
					homeadmin.lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					homeadmin.lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					homeadmin.lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					homeadmin.btnEditar.setEnabled(false);
					homeadmin.btnEditar.setVisible(false);
					
					frame.setVisible(false);
					
					Component[] components = homeadmin.panel_4.getComponents(); 
					for (Component component : components) {
					    component.setEnabled(false); 
					}
					
					Component[] components2 = homeadmin.panel_5.getComponents();
					for(Component component : components2) {
						component.setEnabled(false);
					}
					
					
					homeadmin.frame.setEnabled(true);
					homeadmin.perfil.setVisible(true);
		        	
				
			}
		});
		btnamigo1_1.setContentAreaFilled(false);
		
		
		panel.add(btnamigo1_1);
		btnamigo1_1.setBounds(lblArch_1.getBounds());
		btnamigo1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int o = login.list.EncontrarInt(email_name[1]);
				
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					homeadmin.lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else homeadmin.lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						homeadmin.textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else homeadmin.textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						homeadmin.lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else homeadmin.lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						homeadmin.lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else homeadmin.lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						homeadmin.lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else homeadmin.lblCurso_Perfil.setText("Não Declarado");
					
					homeadmin.lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					homeadmin.lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					homeadmin.lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					homeadmin.btnEditar.setEnabled(false);
					homeadmin.btnEditar.setVisible(false);
					frame.setVisible(false);
					
					Component[] components = homeadmin.panel_4.getComponents(); 
					for (Component component : components) {
					    component.setEnabled(false); 
					}
					
					Component[] components2 = homeadmin.panel_5.getComponents();
					for(Component component : components2) {
						component.setEnabled(false);
					}
					
					
					homeadmin.frame.setEnabled(true);
					
					homeadmin.perfil.setVisible(true);
		        	
			
				
			}
		});
		btnamigo1_2.setContentAreaFilled(false);
		
		panel.add(btnamigo1_2);
		btnamigo1_2.setBounds(lblArch_2.getBounds());
		btnamigo1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int o = login.list.EncontrarInt(email_name[2]);
				
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					homeadmin.lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else homeadmin.lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						homeadmin.textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else homeadmin.textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						homeadmin.lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else homeadmin.lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						homeadmin.lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else homeadmin.lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						homeadmin.lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else homeadmin.lblCurso_Perfil.setText("Não Declarado");
					
					homeadmin.lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					homeadmin.lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					homeadmin.lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					homeadmin.btnEditar.setEnabled(false);
					homeadmin.btnEditar.setVisible(false);
					frame.setVisible(false);
					
					Component[] components = homeadmin.panel_4.getComponents(); 
					for (Component component : components) {
					    component.setEnabled(false); 
					}
					
					Component[] components2 = homeadmin.panel_5.getComponents();
					for(Component component : components2) {
						component.setEnabled(false);
					}
					
					
					homeadmin.frame.setEnabled(true);
					
					
					homeadmin.perfil.setVisible(true);
		        	
			
				
			}
		});
		btnamigo1_3.setContentAreaFilled(false);
		
		panel.add(btnamigo1_3);
		btnamigo1_3.setBounds(lblArch_3.getBounds());
		btnamigo1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int o = login.list.EncontrarInt(email_name[3]);
				
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					homeadmin.lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else homeadmin.lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						homeadmin.textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else homeadmin.textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						homeadmin.lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else homeadmin.lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						homeadmin.lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else homeadmin.lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						homeadmin.lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else homeadmin.lblCurso_Perfil.setText("Não Declarado");
					
					homeadmin.lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					homeadmin.lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					homeadmin.lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					homeadmin.btnEditar.setEnabled(false);
					homeadmin.btnEditar.setVisible(false);
					
					frame.setVisible(false);
					Component[] components = homeadmin.panel_4.getComponents(); 
					for (Component component : components) {
					    component.setEnabled(false); 
					}
					
					Component[] components2 = homeadmin.panel_5.getComponents();
					for(Component component : components2) {
						component.setEnabled(false);
					}
					
					
					homeadmin.frame.setEnabled(true);
					
					
					homeadmin.perfil.setVisible(true);
		        	
			
				
			}
		});
		btnamigo1_4.setContentAreaFilled(false);
		
		panel.add(btnamigo1_4);
		btnamigo1_4.setBounds(lblArch_4.getBounds());
		btnamigo1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				int o = login.list.EncontrarInt(email_name[4]);
				
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					homeadmin.lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else homeadmin.lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						homeadmin.textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else homeadmin.textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						homeadmin.lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else homeadmin.lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						homeadmin.lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else homeadmin.lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						homeadmin.lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else homeadmin.lblCurso_Perfil.setText("Não Declarado");
					
					homeadmin.lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					homeadmin.lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					homeadmin.lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					homeadmin.btnEditar.setEnabled(false);
					homeadmin.btnEditar.setVisible(false);
					
					frame.setVisible(false);
					Component[] components = homeadmin.panel_4.getComponents(); 
					for (Component component : components) {
					    component.setEnabled(false); 
					}
					
					Component[] components2 = homeadmin.panel_5.getComponents();
					for(Component component : components2) {
						component.setEnabled(false);
					}
					
					
					homeadmin.frame.setEnabled(true);
					
					frame.setVisible(false);
					homeadmin.perfil.setVisible(true);
			
				
			}
		});
		btnamigo1_5.setContentAreaFilled(false);
		
		panel.add(btnamigo1_5);
		btnamigo1_5.setBounds(lblArch_5.getBounds());
		
		panel.add(lblArch_1);
		lblArch_1.setBorder(UIManager.getBorder("InternalFrame.border"));
		
		panel.add(lblArch_2);
		lblArch_2.setBorder(UIManager.getBorder("InternalFrame.border"));
		
		lblArch_3.setBorder(UIManager.getBorder("InternalFrame.border"));
		panel.add(lblArch_3);
		
		lblArch_4.setBorder(UIManager.getBorder("InternalFrame.border"));
		panel.add(lblArch_4);
		
		lblArch_5.setBorder(UIManager.getBorder("InternalFrame.border"));
		panel.add(lblArch_5);
		
		JLabel lblAmigo = new JLabel("Amigos:");
		lblAmigo.setBounds(134, 4, 117, 44);
		panel.add(lblAmigo);
		lblAmigo.setFont(new Font("Padauk", Font.BOLD, 27));
		
		txtZsdfgasdfh = new JTextField();
		txtZsdfgasdfh.setForeground(new Color(192, 191, 188));
		txtZsdfgasdfh.setText("Pesquisar Amigo(a)");
		txtZsdfgasdfh.setFont(new Font("Dialog", Font.BOLD, 16));
	//	txtZsdfgasdfh.setFont(new Font("FreeSans", Font.BOLD, 16));
		txtZsdfgasdfh.setBorder(null);
		txtZsdfgasdfh.setBackground(new Color(246, 246, 246));
		txtZsdfgasdfh.setBorder(null);
		txtZsdfgasdfh.setBounds(37, 47, 226, 26);
		//txtZsdfgasdfh.setBackground(new Color(0,0,0,0));
		frame.getContentPane().add(txtZsdfgasdfh);
		txtZsdfgasdfh.setColumns(10);
		
	//	txtZsdfgasdfh.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		JButton btnBuscar = new JButton("");
		btnBuscar.setBorder(null);
		btnBuscar.setBorderPainted(false);
		btnBuscar.setContentAreaFilled(false);
		btnBuscar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				btnAmigo_add1.setVisible(false);
				btnAmigo_add2.setVisible(false);
				btnAmigo_add3.setVisible(false);
				btnAmigo_add4.setVisible(false);
				btnAmigo_add5.setVisible(false);
				
				lblAdicionado.setVisible(false);
				lblAdicionado_1.setVisible(false);
				lblAdicionado_2.setVisible(false);
				lblAdicionado_3.setVisible(false);
				lblAdicionado_4.setVisible(false);
				
				btnAdicionar.setVisible(false);
				btnAdicionar_1.setVisible(false);
				btnAdicionar_2.setVisible(false);
				btnAdicionar_3.setVisible(false);
				btnAdicionar_4.setVisible(false);
				
				lblArch_2_1.setVisible(false);
				lblPhoto_2_1.setVisible(false);
				lblArch_2_2.setVisible(false);
				lblPhoto_2_2.setVisible(false);
				lblArch_2_3.setVisible(false);
				lblPhoto_2_3.setVisible(false);
				lblArch_2_4.setVisible(false);
				lblPhoto_2_4.setVisible(false);
				lblArch_2_5.setVisible(false);
				lblPhoto_2_5.setVisible(false);
				
				String nome_amigo = txtZsdfgasdfh.getText();
				StringBuilder sb = new StringBuilder();
				int y = 0;
				int cont = 0;
		        for(int x =0; x<list.listaUsuario.length; x++) {
		        	if(homeadmin.login.list.listaUsuario[x] != null && x != homeadmin.login.ID && list.listaUsuario[homeadmin.login.ID].list.contains(x) == false) {
		        	if(homeadmin.login.list.listaUsuario[x].list_Pedidos.pedidoAqui(homeadmin.login.ID) == false && list.listaUsuario[x].list_Pedidos.pedidoLa(homeadmin.login.ID) == false) {
		        	
		        	if(homeadmin.login.list.listaUsuario[x].getNome().equals(nome_amigo)) {
			        sb.append("\n").append(" ").append(homeadmin.login.list.listaUsuario[x].getNome()).append(" ").append(homeadmin.login.list.listaUsuario[x].getSobre_nome()).append("\n").append("\n").append("\n"); //O primeiro sb.append("") é para posicionar aonde o nome do Usuário vai ficar 
			        nome_vetor[y] = homeadmin.login.list.listaUsuario[x].getEmail();
			        y++;
			        cont++;
		        	}
			        
		        	}
		        	}
		        }
				
				txtrArea_1.setText(sb.toString());
				
				if(cont == 0) {
					txtZsdfgasdfh.setText("");
                	txtZsdfgasdfh.setText("Pesquisar Amigo(a)");
                	txtZsdfgasdfh.setForeground(Color.GRAY);
					
					textArea.setVisible(false);
					lblAdicionado.setVisible(false);
					lblAdicionado_1.setVisible(false);
					lblAdicionado_2.setVisible(false);
					lblAdicionado_3.setVisible(false);
					lblAdicionado_4.setVisible(false);
					
					btnAdicionar.setVisible(false);
					btnAdicionar_1.setVisible(false);
					btnAdicionar_2.setVisible(false);
					btnAdicionar_3.setVisible(false);
					btnAdicionar_4.setVisible(false);
					
					lblArch_2_1.setVisible(false);
					lblPhoto_2_1.setVisible(false);
					lblArch_2_2.setVisible(false);
					lblPhoto_2_2.setVisible(false);
					lblArch_2_3.setVisible(false);
					lblPhoto_2_3.setVisible(false);
					lblArch_2_4.setVisible(false);
					lblPhoto_2_4.setVisible(false);
					lblArch_2_5.setVisible(false);
					lblPhoto_2_5.setVisible(false);
					
					btnAmigo_add1.setVisible(false);
					btnAmigo_add2.setVisible(false);
					btnAmigo_add3.setVisible(false);
					btnAmigo_add4.setVisible(false);
					btnAmigo_add5.setVisible(false);
					
					
					
					JOptionPane.showMessageDialog(null, "Nenhum Usuario encontrado");
				}
				if(cont >=1) {
					textArea.setVisible(true);
					lblArch_2_1.setVisible(true);
					lblPhoto_2_1.setVisible(true);
					lblArch_2_2.setVisible(false);
					lblPhoto_2_2.setVisible(false);
					lblArch_2_3.setVisible(false);
					lblPhoto_2_3.setVisible(false);
					lblArch_2_4.setVisible(false);
					lblPhoto_2_4.setVisible(false);
					lblArch_2_5.setVisible(false);
					lblPhoto_2_5.setVisible(false);
					
					btnAdicionar.setVisible(true);
					btnAdicionar_1.setVisible(false);
					btnAdicionar_2.setVisible(false);
					btnAdicionar_3.setVisible(false);
					btnAdicionar_4.setVisible(false);
					
					btnAmigo_add1.setVisible(true);
					btnAmigo_add2.setVisible(false);
					btnAmigo_add3.setVisible(false);
					btnAmigo_add4.setVisible(false);
					btnAmigo_add5.setVisible(false);
					
					
					int b = homeadmin.login.list.EncontrarInt(nome_vetor[0]);
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
		                    lblPhoto_2_1.setIcon(new ImageIcon(scaledImage));
		                    lblPhoto_2_1.setVisible(true);
		                } catch (IOException ei) {
		                    ei.printStackTrace();
		                }
			    	
			    	
			    	}else {
			    		lblPhoto_2_1.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
			    		lblPhoto_2_1.setVisible(true);
			    	}
					
				}
				if(cont >= 2) {
					textArea.setVisible(true);
					lblArch_2_1.setVisible(true);
					lblPhoto_2_1.setVisible(true);
					lblArch_2_2.setVisible(true);
					lblPhoto_2_2.setVisible(true);
					lblArch_2_3.setVisible(false);
					lblPhoto_2_3.setVisible(false);
					lblArch_2_4.setVisible(false);
					lblPhoto_2_4.setVisible(false);
					lblArch_2_5.setVisible(false);
					lblPhoto_2_5.setVisible(false);
					
					btnAdicionar.setVisible(true);
					btnAdicionar_1.setVisible(true);
					btnAdicionar_2.setVisible(false);
					btnAdicionar_3.setVisible(false);
					btnAdicionar_4.setVisible(false);
					
					btnAmigo_add1.setVisible(true);
					btnAmigo_add2.setVisible(true);
					btnAmigo_add3.setVisible(false);
					btnAmigo_add4.setVisible(false);
					btnAmigo_add5.setVisible(false);
					
					
					int b = homeadmin.login.list.EncontrarInt(nome_vetor[1]);
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
		                    lblPhoto_2_2.setIcon(new ImageIcon(scaledImage));
		                    lblPhoto_2_2.setVisible(true);
		                } catch (IOException ei) {
		                    ei.printStackTrace();
		                }
			    	
			    	
			    	}else {
			    		lblPhoto_2_2.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
			    		lblPhoto_2_2.setVisible(true);
			    	}
					
				}
				if(cont >= 3){
					textArea.setVisible(true);
					lblArch_2_1.setVisible(true);
					lblPhoto_2_1.setVisible(true);
					lblArch_2_2.setVisible(true);
					lblPhoto_2_2.setVisible(true);
					lblArch_2_3.setVisible(true);
					lblPhoto_2_3.setVisible(true);
					lblArch_2_4.setVisible(false);
					lblPhoto_2_4.setVisible(false);
					lblArch_2_5.setVisible(false);
					lblPhoto_2_5.setVisible(false);
					
					btnAdicionar.setVisible(true);
					btnAdicionar_1.setVisible(true);
					btnAdicionar_2.setVisible(true);
					btnAdicionar_3.setVisible(false);
					btnAdicionar_4.setVisible(false);
					
					btnAmigo_add1.setVisible(true);
					btnAmigo_add2.setVisible(true);
					btnAmigo_add3.setVisible(true);
					btnAmigo_add4.setVisible(false);
					btnAmigo_add5.setVisible(false);
					
					
					int b = homeadmin.login.list.EncontrarInt(nome_vetor[2]);
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
		                    lblPhoto_2_3.setIcon(new ImageIcon(scaledImage));
		                    lblPhoto_2_3.setVisible(true);
		                } catch (IOException ei) {
		                    ei.printStackTrace();
		                }
			    	
			    	
			    	}else {
			    		lblPhoto_2_3.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
			    		lblPhoto_2_3.setVisible(true);
			    	}
					
				}
				if(cont >= 4) {
					textArea.setVisible(true);
					lblArch_2_1.setVisible(true);
					lblPhoto_2_1.setVisible(true);
					lblArch_2_2.setVisible(true);
					lblPhoto_2_2.setVisible(true);
					lblArch_2_3.setVisible(true);
					lblPhoto_2_3.setVisible(true);
					lblArch_2_4.setVisible(true);
					lblPhoto_2_4.setVisible(true);
					lblArch_2_5.setVisible(false);
					lblPhoto_2_5.setVisible(false);
					
					btnAdicionar.setVisible(true);
					btnAdicionar_1.setVisible(true);
					btnAdicionar_2.setVisible(true);
					btnAdicionar_3.setVisible(true);
					btnAdicionar_4.setVisible(false);
					
					btnAmigo_add1.setVisible(true);
					btnAmigo_add2.setVisible(true);
					btnAmigo_add3.setVisible(true);
					btnAmigo_add4.setVisible(true);
					btnAmigo_add5.setVisible(false);
					
					
					int b = homeadmin.login.list.EncontrarInt(nome_vetor[3]);
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
		                    lblPhoto_2_4.setIcon(new ImageIcon(scaledImage));
		                    lblPhoto_2_4.setVisible(true);
		                } catch (IOException ei) {
		                    ei.printStackTrace();
		                }
			    	
			    	
			    	}else {
			    		lblPhoto_2_4.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
			    		lblPhoto_2_4.setVisible(true);
			    	}
					
				}
				
				if(cont == 5) {
					textArea.setVisible(true);
					lblArch_2_1.setVisible(true);
					lblPhoto_2_1.setVisible(true);
					lblArch_2_2.setVisible(true);
					lblPhoto_2_2.setVisible(true);
					lblArch_2_3.setVisible(true);
					lblPhoto_2_3.setVisible(true);
					lblArch_2_4.setVisible(true);
					lblPhoto_2_4.setVisible(true);
					lblArch_2_5.setVisible(true);
					lblPhoto_2_5.setVisible(true);
					
					btnAdicionar.setVisible(true);
					btnAdicionar_1.setVisible(true);
					btnAdicionar_2.setVisible(true);
					btnAdicionar_3.setVisible(true);
					btnAdicionar_4.setVisible(true);
					
					
					btnAmigo_add1.setVisible(true);
					btnAmigo_add2.setVisible(true);
					btnAmigo_add3.setVisible(true);
					btnAmigo_add4.setVisible(true);
					btnAmigo_add5.setVisible(true);
					
					
					int b = homeadmin.login.list.EncontrarInt(nome_vetor[4]);
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
		                    lblPhoto_2_5.setIcon(new ImageIcon(scaledImage));
		                    lblPhoto_2_5.setVisible(true);
		                } catch (IOException ei) {
		                    ei.printStackTrace();
		                }
			    	
			    	
			    	}else {
			    		lblPhoto_2_5.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
			    		lblPhoto_2_5.setVisible(true);
			    	}
					
				}
				txtZsdfgasdfh.setText("");
            	txtZsdfgasdfh.setText("Pesquisar Amigo(a)");
            	txtZsdfgasdfh.setForeground(Color.GRAY);
		        }
			
	
		});
		btnBuscar.setBounds(289, 50, 105, 15);
		frame.getContentPane().add(btnBuscar);
		
		JLabel lblL = new JLabel("");
		lblL.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-08-19 10-08-37.png"));
		lblL.setBounds(16, 33, 262, 57);
		frame.getContentPane().add(lblL);
		lblL_1.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/voltar_botão.png"));
		lblL_1.setBounds(808, 2, 151, 51);
		
		frame.getContentPane().add(lblL_1);
		lblVocNoContm.setFont(new Font("FreeMono", Font.BOLD, 22));
		lblVocNoContm.setBounds(576, 200, 410, 113);
		
		frame.getContentPane().add(lblVocNoContm);
		lblL_2.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-25 07-52-49.png"));
		lblL_2.setBounds(277, 38, 131, 43);
		
		frame.getContentPane().add(lblL_2);
		
		
		JButton btnPerdi_foco = new JButton("");
		btnPerdi_foco.setBorder(null);
		btnPerdi_foco.setContentAreaFilled(false);
		btnPerdi_foco.setBounds(0, 0, 959, 586);
		frame.getContentPane().add(btnPerdi_foco);
		
		
		
		
		
		txtZsdfgasdfh.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtZsdfgasdfh.getText().equals("Pesquisar Amigo(a)")) {
                	txtZsdfgasdfh.setText("");
                	txtZsdfgasdfh.setForeground(Color.BLACK); // Altera a cor do texto para preto
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtZsdfgasdfh.getText().isEmpty()) {
                	txtZsdfgasdfh.setText("Pesquisar Amigo(a)");
                	txtZsdfgasdfh.setForeground(Color.GRAY); // Restaura a cor do texto para cinza
                }
            }
        });
        
        

        txtZsdfgasdfh.requestFocusInWindow(); 

		
		
		btnPerdi_foco.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Remove todos os MouseListeners anteriores do frame
		        

		        // Adiciona um novo MouseListener ao frame
		        frame.addMouseListener(new MouseAdapter() {
		            @Override
		            public void mouseClicked(MouseEvent e) {
		                txtZsdfgasdfh.requestFocusInWindow();

		                String texto = txtZsdfgasdfh.getText();
		                if (texto == null || texto.isEmpty()) {
		                    txtZsdfgasdfh.setText("Pesquisar Amigo(a)");
		                    
		                }
		            }
		        });
		    }
		});
		
		btnAmigo_add1.setVisible(false);
		btnAmigo_add2.setVisible(false);
		btnAmigo_add3.setVisible(false);
		btnAmigo_add4.setVisible(false);
		btnAmigo_add5.setVisible(false);
		
		
		
			}
	
        }