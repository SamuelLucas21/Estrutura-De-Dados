package telas;

import java.awt.BorderLayout;
import java.awt.Color;


import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.ArrayList;

import telas.Tela_Login;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import telas.Publicar;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JScrollBar;
import java.awt.Rectangle;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JToolBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButtonMenuItem;
import java.awt.Insets;

public class Home_admin {
	
	JButton btnBack_1 = new JButton("");

	JTextArea textArea_Bio = new JTextArea();

	JLabel lblFotopagperfil = new JLabel("");
	
	public int cont = 0;
	
	Tela_Login login;
	String nome;
	static List_Usuarios list;
	
	public JFrame frame;
		
	Dados_Perfil dados;
	static Usuario user;
	JButton btnEnviar = new JButton("");
	JButton button = new JButton("->");

	int identificador = 0;
	JDesktopPane perfil = new JDesktopPane();
	JButton btnEditar = new JButton("");

static	ArrayList<String> mensagens = new ArrayList<>();
JButton buttonPerfil = new JButton("");
JButton btnPublication = new JButton("");
JButton btnChat = new JButton("");
JButton btnTelaAmigos = new JButton("");
JButton btnSalvos = new JButton("");
JLabel lblBotes = new JLabel("");
JButton btnConfiguraes = new JButton("");
JButton btnPublic = new JButton("");

StringBuilder chatFatec = new StringBuilder();

JLabel labelNomeAmigo = new JLabel("");

JTextArea textAreaFriends = new JTextArea();

JTextArea txtrHellow = new JTextArea("");
JTextArea textArea_3_2 = new JTextArea("");
JTextArea textArea_3_3 = new JTextArea("");

JLabel lblNomedopublicador_1 = new JLabel("\n");
JLabel lblNomedopublicador_2 = new JLabel("");
JLabel lblNomedopublicador_3 = new JLabel("");

 ListaEncadeada listada;
 ListaEncadeada listada2;
 ListaEncadeada listada3;
 
 ListaEncadeada publicar1;
 ListaEncadeada publicar2;
 ListaEncadeada publicar3;
	
 JButton btnEnviar_1 = new JButton("");
 
 JLabel lblNomeusuario = new JLabel();
 
 String nomeOBJ[];
 String Pedidos[];
 int nomeChat[];
 
 JLabel lblFff_1 = new JLabel("FF2");
 JLabel lblFff_2 = new JLabel("FF2");
 JLabel lblFff_3 = new JLabel("FF2");
 JLabel lblFff_4 = new JLabel("FF2");
 JLabel lblFff_5 = new JLabel("FF2");
	
// JLabel lblFff_3 = new JLabel("FF2");
 //JLabel lblFff_4 = new JLabel("FF2");
 //JLabel lblFff_5 = new JLabel("FF2");
 
 
 JLabel lblFf_1 = new JLabel("FF1");
 JLabel lblFf_2 = new JLabel("FF1");
 JLabel lblFf_3 = new JLabel("FF1");
 JLabel lblFf_4 = new JLabel("FF1");
 JLabel lblFf_5 = new JLabel("FF1");
 
 
 JLabel lblSugestesDeAmizade = new JLabel("Sugestões de Amizade:");
 JLabel lblNoHParticipantes = new JLabel("Não há participantes");
 
 JButton btn_Friend_3 = new JButton("Adicionar");
 JButton btn_Friend_4 = new JButton("Adicionar");
 JButton btn_Friend_5 = new JButton("Adicionar");
 
 String selectedFilePath;
 JLabel lblFotoPane = new JLabel("");
 JButton btnRemoverFoto = new JButton("Remover");
 JButton btnAddfoto = new JButton();
 JButton btnAdicionarFoto = new JButton("addPhoto");
 JButton btnVisualizarFoto = new JButton("Visualizar");	
 JLabel lblBorro = new JLabel("");
 JButton btnFriend[];// = new JButton("Friend_1");
 JButton btnFriend_1 = new JButton("Friend_2");
 JButton btnFriend_2 = new JButton("Adicionar");
 
 JLabel lblAdicionado = new JLabel("Adicionado...");
 JLabel lblAdicionado_1 = new JLabel("Adicionado...");
 JLabel lblAdicionado_2 = new JLabel("Adicionado...");
 JLabel lblAdicionado_3 = new JLabel("Adicionado...");
 JLabel lblAdicionado_4 = new JLabel("Adicionado...");
 
 
 JButton btnProximo = new JButton("");
 JButton btnAntetior = new JButton("");
 
 JButton btnAmigo_1 = new JButton("Amigo1");
 JButton btnAmigo_2 = new JButton("Amigo2");
 JButton btnAmigo_3 = new JButton("Amigo3");
 JButton btnAmigo_4 = new JButton("Amigo4");
 JButton btnAmigo_5 = new JButton("Amigo5");
 
 	JLabel lblF_1 = new JLabel("f1");
	JLabel lblF_2 = new JLabel("f2");
	JLabel lblF_3 = new JLabel("f3");
	JLabel lblF_4 = new JLabel("f4");
	JLabel lblF_5 = new JLabel("f5");
	
	JLabel lblL_1 = new JLabel("l");
	JLabel lblL_2 = new JLabel("l");
	JLabel lblL_3 = new JLabel("l");
	JLabel lblL_4 = new JLabel("l");
	JLabel lblL_5 = new JLabel("l");
	
	JLabel lblArch_2_1 = new JLabel("");
	JLabel lblArch_2_2 = new JLabel("");
	JLabel lblArch_2_3 = new JLabel("");
	JLabel lblArch_2_4 = new JLabel("");
	JLabel lblArch_2_5 = new JLabel("");
	
	JButton btnPerfil_1 = new JButton();
	JButton btnPerfil_2 = new JButton();
	JButton btnPerfil_3 = new JButton();
	JButton btnPerfil_4 = new JButton();
	JButton btnPerfil_5 = new JButton();
	
	JButton btnPerfil_2_1 = new JButton();
	JButton btnPerfil_2_2 = new JButton();
	JButton btnPerfil_2_3 = new JButton();
	JButton btnPerfil_2_4 = new JButton();
	JButton btnPerfil_2_5 = new JButton();
	
	JButton btnCancelar = new JButton("Cancelar");
	
	JButton btnTeste = new JButton("");

	
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
	                
					ListaEncadeada listada = new ListaEncadeada();
					ListaEncadeada listada2 = new ListaEncadeada();
					ListaEncadeada listada3 = new ListaEncadeada();
					
					ListaEncadeada publicar1 = new ListaEncadeada();
					ListaEncadeada publicar2 = new ListaEncadeada();
					ListaEncadeada publicar3 = new ListaEncadeada();
					
					Home_admin window = new Home_admin(listada, list, user);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	JTextArea textArea = new JTextArea();
	JTextArea textArea_1 = new JTextArea();
	JTextArea textArea_2 = new JTextArea();
	JLabel lblDesfocado = new JLabel("Desfocado");
	JLabel lblPhoto = new JLabel("Publicação Vazia");
	JLabel lblPhoto_1 = new JLabel("Publicação Vazia");
	JLabel lblPhoto_2 = new JLabel("Publicação Vazia");
	
	JPanel panel_1 = new JPanel();
	JPanel panel_2 = new JPanel();
	JPanel panel_3 = new JPanel();
	JPanel panel_4 = new JPanel();
	
	JMenu mnNewMenu = new JMenu("Selecionar Membros");

	
	JScrollPane scrollPane_2 = new JScrollPane();
	
	public int contador = 0;
	
	public Home_admin(ListaEncadeada listada, List_Usuarios list, Usuario user) {
		this.listada = listada;
//		this.listada2 = listada;
//		this.listada3 = listada;
		//btnFriend = new JButton[login.list.listaUsuario.length];
		
		this.listada2 = new ListaEncadeada();
		this.listada3 = new ListaEncadeada();
		
		this.list = list;
		this.user = user;
		this.contador = 0;
		
		this.publicar1 = new ListaEncadeada();
		this.publicar2 = new ListaEncadeada();
		this.publicar3 = new ListaEncadeada();
		
		cont = 0;
		
		initialize();
		
	}

	JScrollPane scrollPane = new JScrollPane();
	


	JLabel lblNome_do_usuario = new JLabel();
	JLabel FotoPerfil = new JLabel("");
	
	public JTextField textField = new JTextField();
	
	public JPanel panel_5 = new JPanel();
	public JButton btnAdicionar = new JButton("Aceitar");
	public JButton btnRemover = new JButton("Remover");
	public JButton btnAdicionar_2 = new JButton("Aceitar");
	public JButton btnRemover_2 = new JButton("Remover");
	public JButton btnAdicionar_3 = new JButton("Aceitar");
	public JButton btnRemover_1 = new JButton("Remover");
	public JButton btnAdicionar_4 = new JButton("Aceitar");
	public JButton btnRemover_4 = new JButton("Remover");
	public JButton btnAdicionar_4_1 = new JButton("Aceitar");
	public JButton btnRemover_4_1 = new JButton("Remover");
	JTextArea txtrSamuelLucas = new JTextArea();
	
	JLabel lblArch = new JLabel("");
	JLabel lblArch_1 = new JLabel("");
	JLabel lblArch_2 = new JLabel("");
	JLabel lblArch_3 = new JLabel("");
	JLabel lblArch_4 = new JLabel("");
	JLabel lblName = new JLabel("");
	public JLabel lblEnv = new JLabel("");
	private final JLabel lblL_7 = new JLabel("");
	private final JLabel lblL_7_1 = new JLabel("");
	private final JLabel lblL_7_1_1 = new JLabel("");
	private final JLabel lblL_7_1_2 = new JLabel("");
	
	JTextArea textArea_3 = new JTextArea();
	private JTextField textField_1;
	JTextArea textAreaChat_1 = new JTextArea();
	
	JLabel lblPhotofriend = new JLabel("");
	private final JLabel lblO = new JLabel("");
	private final JButton btnRemoved = new JButton("");
	JTextField textField_2 = new JTextField();
	JLabel lblL_6 = new JLabel("");
	JCheckBoxMenuItem chckbxmntmN = new JCheckBoxMenuItem("Todos");
	JCheckBoxMenuItem chckbxmntmN_1 = new JCheckBoxMenuItem("n1");
	JCheckBoxMenuItem chckbxmntmN_2 = new JCheckBoxMenuItem("n2");
	JCheckBoxMenuItem chckbxmntmN_3 = new JCheckBoxMenuItem("n3");
	JCheckBoxMenuItem chckbxmntmN_4 = new JCheckBoxMenuItem("n4");
	JCheckBoxMenuItem chckbxmntmN_5 = new JCheckBoxMenuItem("n5");

	JButton btnSelectPerson = new JButton("");
	
	JTextArea textArea_4 = new JTextArea();
	public final JLabel lblAvisos = new JLabel("");
	public JLabel lblNameperfil = new JLabel("Samuel Lucas");
	private final JLabel lblEmail = new JLabel("E-mail:");
	private final JLabel lblIdade = new JLabel("Idade:");
	private final JLabel lblCurso = new JLabel("Curso:");
	private final JLabel lblLogogithub = new JLabel("");
	private final JLabel lblLogoLinked = new JLabel("");
	public JLabel lblLinkgitgub = new JLabel("Não Declarado");
	public JLabel lblLinkLinkend = new JLabel("Não Declarado");
	public final JDesktopPane EditarPerfil = new JDesktopPane();
	private final JLabel label_gitEditor = new JLabel("");
	private final JLabel lbllinkedEditor = new JLabel("");
	private JTextField textField_3;
	private JTextField textField_4;
	public final JLabel lblEmail_Perfil = new JLabel("");
	public final JLabel lblIdade_Perfil = new JLabel("");
	public final JLabel lblCurso_Perfil = new JLabel("");
	private final JButton btnVoltar = new JButton("");
	
	public JCheckBoxMenuItem checkBox_Combo_Box = new JCheckBoxMenuItem("");
	
	JCheckBoxMenuItem checkBox_GitEdit = new JCheckBoxMenuItem("");

	JCheckBoxMenuItem checkBox_LindenEdit = new JCheckBoxMenuItem("");
	private final JLabel lblLblbackgoungcinza = new JLabel("");
	private final JLabel lblLblbackgroundcinza = new JLabel("");
	private final JButton btnSupport = new JButton("Support");
	
	private void initialize() {
		

		
		btnCancelar.setBackground(new Color(238,238,238));
		textAreaChat_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		
		textAreaChat_1.setLineWrap(true);
		textAreaChat_1.setWrapStyleWord(true);
		textArea_4.setEditable(false);
		textArea_Bio.setFont(new Font("Ubuntu", Font.BOLD, 20));
		textArea_Bio.setMargin(new Insets(1, 1, 0, 1));
		
		textArea_Bio.setLineWrap(true);
		textArea_Bio.setWrapStyleWord(true);
		textArea_Bio.setEditable(false);
		
		textArea_4.setLineWrap(true);
		textArea_4.setWrapStyleWord(true);
		textArea_4.setEnabled(true);
		
		textArea_3.setEditable(false);
		
		textArea_3.setLineWrap(true);
		textArea_3.setWrapStyleWord(true);
        
        txtrHellow.setEditable(false);
		
        txtrHellow.setLineWrap(true); // Ativa a quebra de linha automática
        txtrHellow.setWrapStyleWord(true); // Quebra a linha por palavras
        textArea_3_2.setFont(new Font("Waree", Font.PLAIN, 16));
        textArea_3_2.setEditable(false);
        
        textArea_3_2.setLineWrap(true); // Ativa a quebra de linha automática
        textArea_3_2.setWrapStyleWord(true); // Quebra a linha por palavras
        textArea_3_3.setFont(new Font("Waree", Font.PLAIN, 16));
        textArea_3_3.setEditable(false);
        
        textArea_3_3.setLineWrap(true); // Ativa a quebra de linha automática
        textArea_3_3.setWrapStyleWord(true); // Quebra a linha por palavras
        
        txtrHellow.setBackground(new Color(0,0,0,1));
        textArea_3_2.setBackground(new Color(0,0,0,1));
        textArea_3_3.setBackground(new Color(0,0,0,1));
        
        textArea_1.setLineWrap(true);
        textArea_1.setWrapStyleWord(true);
                
        textArea_2.setLineWrap(true);
        textArea_2.setWrapStyleWord(true);
	//	textAreaFriends.setText("Samuel Lucas" + "\n" +"\n" +"\n" +"\n"+"Pedro Lima" +"\n" + "\n" + "\n" +"\n" +"Felipe Jothan"  +"\n" + "\n" + "\n" +"\n" +"James Bond"+"\n" + "\n" + "\n" +"\n" +"Willian" );
		
		lblFf_1.setVisible(false);
		lblFf_2.setVisible(false);
		lblFf_3.setVisible(false);
		lblFf_4.setVisible(false);
		lblFf_5.setVisible(false);
		
		panel_3.setVisible(false);
		
		frame = new JFrame();
		frame.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				
			}
		});
		lblPhoto_2.setVisible(false);
		
		JDesktopPane mostrarImagem = new JDesktopPane();
		mostrarImagem.setBackground(new Color(238, 238, 238));
		mostrarImagem.setSize(821, 467);
		mostrarImagem.setLocation(214, 133);
		mostrarImagem.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		mostrarImagem.setVisible(false);
		EditarPerfil.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		EditarPerfil.setBackground(new Color(255, 255, 255));
		EditarPerfil.setBounds(499, 118, 450, 502);
		frame.getContentPane().add(EditarPerfil);
		
		JLabel lblBiografia = new JLabel("Biografia:");
		lblBiografia.setBackground(new Color(255, 255, 255));
		lblBiografia.setFont(new Font("Dialog", Font.BOLD, 20));
		lblBiografia.setBounds(12, 12, 142, 24);
		EditarPerfil.add(lblBiografia);
		
		JTextArea textArea_BioEdit = new JTextArea();
		textArea_BioEdit.setFont(new Font("Dialog", Font.PLAIN, 15));
		textArea_BioEdit.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		textArea_BioEdit.setBounds(19, 48, 412, 234);
		EditarPerfil.add(textArea_BioEdit);
		label_gitEditor.setIcon(new ImageIcon("/home/samuel/Downloads/github.png"));
		label_gitEditor.setBounds(22, 310, 37, 32);
		textArea_BioEdit.setWrapStyleWord(true);
		textArea_BioEdit.setLineWrap(true);
		
		EditarPerfil.add(label_gitEditor);
		lbllinkedEditor.setIcon(new ImageIcon("/home/samuel/Downloads/linkedin.png"));
		lbllinkedEditor.setBounds(22, 362, 37, 32);
		
		EditarPerfil.add(lbllinkedEditor);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"...", "ANÁLISE E DESENVOLVIMENTO DE SISTEMAS", "GESTÃO EMPRESARIAL", "GESTÃO DA PRODUÇÃO INDUSTRIAL", "EVENTOS"}));
		comboBox.setBounds(98, 422, 297, 24);
		EditarPerfil.add(comboBox);
		
		JLabel lblCurso_1 = new JLabel("Curso:");
		lblCurso_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblCurso_1.setBounds(15, 427, 70, 15);
		EditarPerfil.add(lblCurso_1);
		

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvar.setForeground(new Color(241, 241, 241));
		btnSalvar.setBackground(new Color(119, 118, 123));
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String test = (String) comboBox.getSelectedItem();
				
				login.list.listaUsuario[login.ID].setBio("   "+textArea_BioEdit.getText());
				
				login.list.listaUsuario[login.ID].setGitHub(textField_3.getText());
				login.list.listaUsuario[login.ID].setLinked(textField_4.getText());
				
				if(test != "...") {
					login.list.listaUsuario[login.ID].setCurso(test);	
				}else lblCurso_Perfil.setText("Não Declarado");
				
				
					if(login.list.listaUsuario[login.ID].bio !=null) {
						textArea_Bio.setText(login.list.listaUsuario[login.ID].getBio());
					}
					if(login.list.listaUsuario[login.ID].getGitHub() !=null) {
						lblLinkgitgub.setText(login.list.listaUsuario[login.ID].getGitHub());
					}else lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[login.ID].getLinked() !=null) {
						lblLinkLinkend.setText(login.list.listaUsuario[login.ID].getLinked());
					}else lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[login.ID].getCurso() !=null) {
						lblCurso_Perfil.setText(login.list.listaUsuario[login.ID].getCurso());
					}else lblCurso_Perfil.setText("Não Declarado");
					
					lblEmail_Perfil.setText(login.list.listaUsuario[login.ID].getEmail());
					lblIdade_Perfil.setText(login.list.listaUsuario[login.ID].getIdade() + " Anos");
					
					lblNameperfil.setText(login.list.listaUsuario[login.ID].getNome() + login.vv +login.list.listaUsuario[login.ID].getSobre_nome());
					
					checkBox_GitEdit.setSelected(false);
					checkBox_LindenEdit.setSelected(false);
					checkBox_Combo_Box.setSelected(false);
					
					
					btnBack_1.setVisible(true);
					perfil.setEnabled(true);
				btnEditar.setVisible(true);
				EditarPerfil.setVisible(false);
				JOptionPane.showMessageDialog(null, "Dados salvo com sucesso!");
			}
		});
		btnSalvar.setBounds(166, 465, 117, 25);
		EditarPerfil.add(btnSalvar);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(241, 241, 241));
		textField_3.setBorder(null);
		textField_3.setBounds(83, 316, 307, 19);
		EditarPerfil.add(textField_3);
		textField_3.setColumns(10);
//		textField_3.setBackground(EditarPerfil.getBackground());
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(241, 241, 241));
		textField_4.setBorder(null);
		textField_4.setBounds(78, 368, 312, 17);
		EditarPerfil.add(textField_4);
		textField_4.setColumns(10);
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setIcon(new ImageIcon("/home/samuel/Downloads/X_vermelho-removebg-preview_resized.png"));
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				perfil.setEnabled(true);
				btnEditar.setVisible(true);
				EditarPerfil.setVisible(false);
				checkBox_GitEdit.setSelected(false);
				checkBox_LindenEdit.setSelected(false);
				checkBox_Combo_Box.setSelected(false);
				
				btnBack_1.setVisible(true);
			}
		});
		btnVoltar.setBounds(422, 5, 21, 22);
		
		EditarPerfil.add(btnVoltar);
		checkBox_GitEdit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		checkBox_GitEdit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (checkBox_GitEdit.isSelected()) {
		            textField_3.setEnabled(true);
		        } else {
		            textField_3.setEnabled(false); 
		        }
		    }
		});

		checkBox_GitEdit.setBounds(415, 318, 19, 19);
		EditarPerfil.add(checkBox_GitEdit);
		checkBox_LindenEdit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		checkBox_LindenEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkBox_LindenEdit.isSelected() == true) {
					textField_4.setEnabled(true);
				}else {
					textField_4.setEnabled(false);
				}
				
			}
		});
		checkBox_LindenEdit.setBounds(414, 368, 19, 19);
		EditarPerfil.add(checkBox_LindenEdit);
		
		perfil.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		perfil.setBounds(150, 72, 906, 568);
		frame.getContentPane().add(perfil);
		
		
		lblFotopagperfil.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
		lblFotopagperfil.setBounds(17, 13, 275, 417);
		perfil.add(lblFotopagperfil);
		
		textArea_Bio.setEditable(false);
		textArea_Bio.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		textArea_Bio.setBounds(353, 124, 493, 306);
		perfil.add(textArea_Bio);
		lblNameperfil.setFont(new Font("Dialog", Font.BOLD, 29));
		lblNameperfil.setBounds(469, 27, 330, 88);
		
		perfil.add(lblNameperfil);
		lblEmail.setFont(new Font("Dialog", Font.BOLD, 17));
		lblEmail.setBounds(350, 465, 65, 15);
		
		perfil.add(lblEmail);
		lblIdade.setFont(new Font("Dialog", Font.BOLD, 17));
		lblIdade.setBounds(353, 490, 65, 15);
		
		perfil.add(lblIdade);
		lblCurso.setFont(new Font("Dialog", Font.BOLD, 17));
		lblCurso.setBounds(353, 517, 65, 15);
		
		perfil.add(lblCurso);
		lblLogogithub.setIcon(new ImageIcon("/home/samuel/Downloads/github.png"));
		lblLogogithub.setBounds(22, 455, 32, 42);
		
		perfil.add(lblLogogithub);
		lblLogoLinked.setIcon(new ImageIcon("/home/samuel/Downloads/linkedin.png"));
		lblLogoLinked.setBounds(23, 502, 37, 42);
		
		perfil.add(lblLogoLinked);
		lblLinkgitgub.setBounds(73, 469, 219, 15);
		
		perfil.add(lblLinkgitgub);
		lblLinkLinkend.setBounds(72, 517, 220, 15);
		
		perfil.add(lblLinkLinkend);
		btnEditar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEditar.setBorderPainted(false);
		btnEditar.setContentAreaFilled(false);
		btnEditar.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-12-01 13-52-36.png"));
		
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEditar.setVisible(false);
				btnBack_1.setVisible(false);
				
				perfil.setEnabled(false);
				if(login.list.listaUsuario[login.ID].getBio() !=null) {
					textArea_Bio.setText(login.list.listaUsuario[login.ID].getBio());
				}else textArea_BioEdit.setText("");
				if(login.list.listaUsuario[login.ID].getGitHub() !=null) {
					textField_3.setText(login.list.listaUsuario[login.ID].getGitHub());
					textField_3.setEnabled(false);
					checkBox_GitEdit.setVisible(true);
					
				}else {
					textField_3.setText("");
					textField_3.setEnabled(true);
					checkBox_GitEdit.setVisible(false);
				}
				if(login.list.listaUsuario[login.ID].getLinked() !=null) {
					textField_4.setText(login.list.listaUsuario[login.ID].getLinked());
					textField_4.setEnabled(false);
					checkBox_LindenEdit.setVisible(true);
					
				}else {
					textField_4.setText("");
					textField_4.setEnabled(true);
					checkBox_LindenEdit.setVisible(false);
					
				}if(login.list.listaUsuario[login.ID].getCurso() !=null) {
					comboBox.setSelectedItem(login.list.listaUsuario[login.ID].getCurso());
					comboBox.setEnabled(false);
					checkBox_Combo_Box.setVisible(true);
				}else {
					comboBox.setSelectedItem("...");
					checkBox_Combo_Box.setVisible(false);
					comboBox.setEnabled(true);
				}
				
				
				
				EditarPerfil.setVisible(true);
			}
		});
		btnEditar.setBounds(848, 12, 50, 45);
		perfil.add(btnEditar);
		lblEmail_Perfil.setBounds(424, 465, 312, 15);
		
		perfil.add(lblEmail_Perfil);
		lblIdade_Perfil.setBounds(424, 491, 312, 15);
		
		perfil.add(lblIdade_Perfil);
		lblCurso_Perfil.setBounds(424, 518, 312, 15);
		
		perfil.add(lblCurso_Perfil);
		
		
		JDesktopPane chatPane = new JDesktopPane();
		chatPane.setBounds(150, 72, 906, 568);
		frame.getContentPane().add(chatPane);
		chatPane.setBackground(new Color(241, 241, 241));
		chatPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		chatPane.setVisible(false);
		lblNomeusuario.setText("Chat");
		
		
		lblNomeusuario.setFont(new Font("Dialog", Font.BOLD, 38));
		lblNomeusuario.setBounds(28, 13, 210, 34);
		chatPane.add(lblNomeusuario);
		
		labelNomeAmigo.setFont(new Font("Dialog", Font.BOLD, 20));
		labelNomeAmigo.setBounds(477, 22, 314, 44);
		chatPane.add(labelNomeAmigo);
		btnAmigo_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAmigo_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnAmigo_1.setContentAreaFilled(false);
		
		
		btnAmigo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont =0;
				
				btnEnviar_1.setVisible(true);
				lblO.setVisible(true);
				textField_1.setVisible(true);
				
				identificador = nomeChat[0];
				labelNomeAmigo.setText(login.list.listaUsuario[nomeChat[0]].getNome() + " " + login.list.listaUsuario[nomeChat[0]].getSobre_nome());
				cont = login.list.EncontrarInt(login.list.listaUsuario[nomeChat[0]].getEmail());
				
		//		String h = login.list.listaUsuario[login.ID].list.chat(cont, null);
				if(login.list.listaUsuario[nomeChat[0]].Foto_Perfil !=null) {

	                try {
	                    // Carrega a imagem do arquivo
	                    BufferedImage originalImage = ImageIO.read(new File(login.list.listaUsuario[nomeChat[0]].Foto_Perfil));

	                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
	                    int newWidth = 100;
	                    int newHeight = 100;
	                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

	                    // Atribui a imagem redimensionada à JLabel
	                    lblPhotofriend.setIcon(new ImageIcon(scaledImage));
	                    
	                } catch (IOException ei) {
	                    ei.printStackTrace();
	                }
	                
										
					lblPhotofriend.setVisible(true);
					}else {
						lblPhotofriend.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
						lblPhotofriend.setVisible(true);
					}

				
				textAreaChat_1.setText("");
				textAreaChat_1.setText(login.list.listaUsuario[login.ID].list.chatRetorn(cont));
				
				
				
			}
		});
		
		perfil.setBackground(frame.getBackground());
		btnBack_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBack_1.setFocusPainted(false);
		btnBack_1.setFocusTraversalKeysEnabled(false);
		btnBack_1.setFocusable(false);
		btnBack_1.setContentAreaFilled(false);
		btnBack_1.setBorderPainted(false);
		
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Desembacar();
				panel_4.setEnabled(true);
				panel_5.setEnabled(true);				
				btnPublic.setEnabled(true);
				scrollPane.setEnabled(true);
				scrollPane_2.setEnabled(true);
				
				
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(true); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(true);
				}
				
				
				
				perfil.setVisible(false);	
			}
		});
		btnBack_1.setBounds(792, 533, 100, 25);
		perfil.add(btnBack_1);
		lblLblbackgoungcinza.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-12-01 14-01-57.png"));
		lblLblbackgoungcinza.setBounds(40, 457, 865, 114);
		
		perfil.add(lblLblbackgoungcinza);
		lblLblbackgroundcinza.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-12-01 14-05-17.png"));
		lblLblbackgroundcinza.setBounds(2, 458, 697, 116);
		
		perfil.add(lblLblbackgroundcinza);
		EditarPerfil.setBackground(perfil.getBackground());
		checkBox_Combo_Box.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		checkBox_Combo_Box.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkBox_Combo_Box.isSelected() == true) {
					comboBox.setEnabled(true);
				}else {
					comboBox.setEnabled(false);
				}
				
			}
		});
		checkBox_Combo_Box.setBounds(414, 424, 19, 19);
		
		EditarPerfil.add(checkBox_Combo_Box);
		
		JLabel lblArchlabel = new JLabel("");
		lblArchlabel.setIcon(new ImageIcon("/home/samuel/Downloads/ARCO (5).png"));
		lblArchlabel.setBounds(73, 304, 350, 43);
		EditarPerfil.add(lblArchlabel);
		
		JLabel lblLblarchlabel = new JLabel("");
		lblLblarchlabel.setIcon(new ImageIcon("/home/samuel/Downloads/ARCO (5).png"));
		lblLblarchlabel.setBounds(71, 357, 334, 39);
		EditarPerfil.add(lblLblarchlabel);
		
		
		
		lblF_1.setBounds(13, 84, 70, 59);
		chatPane.add(lblF_1);
		lblF_1.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
		lblF_1.setVisible(false);
		
		
		lblF_2.setBounds(13, 155, 71, 59);
		chatPane.add(lblF_2);
		lblF_2.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
		lblF_2.setVisible(false);
		
		
		lblF_3.setBounds(13, 226, 71, 59);
		chatPane.add(lblF_3);
		lblF_3.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
		lblF_3.setVisible(false);
		
		lblF_4.setBounds(13, 297, 71, 59);
		chatPane.add(lblF_4);
		lblF_4.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
		lblF_4.setVisible(false);
		
		lblF_5.setBounds(13, 368, 71, 59);
		chatPane.add(lblF_5);
		lblF_5.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
		lblF_5.setVisible(false);
		
		btnAmigo_1.setBounds(12, 84, 342, 59);
		chatPane.add(btnAmigo_1);
		btnAmigo_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAmigo_2.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnAmigo_2.setContentAreaFilled(false);
		
		
		btnAmigo_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cont =0;
				
				btnEnviar_1.setVisible(true);
				lblO.setVisible(true);
				textField_1.setVisible(true);
				
				identificador = nomeChat[1];
				
				labelNomeAmigo.setText(login.list.listaUsuario[nomeChat[1]].getNome() + " " + login.list.listaUsuario[nomeChat[1]].getSobre_nome());
				cont = login.list.EncontrarInt(login.list.listaUsuario[nomeChat[1]].getEmail());
				
		//		String h = login.list.listaUsuario[login.ID].list.chat(cont, null);
		//		textAreaChat_1.setText(h.toString());
				if(login.list.listaUsuario[nomeChat[1]].Foto_Perfil !=null) {

	                try {
	                    // Carrega a imagem do arquivo
	                    BufferedImage originalImage = ImageIO.read(new File(login.list.listaUsuario[nomeChat[1]].Foto_Perfil));

	                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
	                    int newWidth = 100;
	                    int newHeight = 100;
	                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

	                    // Atribui a imagem redimensionada à JLabel
	                    lblPhotofriend.setIcon(new ImageIcon(scaledImage));
	                    
	                } catch (IOException ei) {
	                    ei.printStackTrace();
	                }
	                
										
					lblPhotofriend.setVisible(true);
					}else {
						lblPhotofriend.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
						lblPhotofriend.setVisible(true);
					}

				textAreaChat_1.setText("");
				textAreaChat_1.setText(login.list.listaUsuario[login.ID].list.chatRetorn(cont));
				

			}
		});
		btnAmigo_2.setBounds(12, 155, 342, 59);
		chatPane.add(btnAmigo_2);
		btnAmigo_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAmigo_3.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnAmigo_3.setContentAreaFilled(false);
		btnAmigo_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont =0;
				
				btnEnviar_1.setVisible(true);
				lblO.setVisible(true);
				textField_1.setVisible(true);
				
				
				identificador = nomeChat[2];
				labelNomeAmigo.setText(login.list.listaUsuario[nomeChat[2]].getNome() + " " + login.list.listaUsuario[nomeChat[2]].getSobre_nome());
				cont = login.list.EncontrarInt(login.list.listaUsuario[nomeChat[2]].getEmail());
				
	//			String h = login.list.listaUsuario[login.ID].list.chat(cont, null);
		//		textAreaChat_1.setText(h.toString());
				if(login.list.listaUsuario[nomeChat[2]].Foto_Perfil !=null) {

	                try {
	                    // Carrega a imagem do arquivo
	                    BufferedImage originalImage = ImageIO.read(new File(login.list.listaUsuario[nomeChat[2]].Foto_Perfil));

	                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
	                    int newWidth = 100;
	                    int newHeight = 100;
	                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

	                    // Atribui a imagem redimensionada à JLabel
	                    lblPhotofriend.setIcon(new ImageIcon(scaledImage));
	                    
	                } catch (IOException ei) {
	                    ei.printStackTrace();
	                }
	                
										
					lblPhotofriend.setVisible(true);
					}else {
						lblPhotofriend.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
						lblPhotofriend.setVisible(true);
					}

				
				textAreaChat_1.setText("");
				textAreaChat_1.setText(login.list.listaUsuario[login.ID].list.chatRetorn(cont));
				

			}
		});
		
		
		btnAmigo_3.setBounds(12, 226, 342, 59);
		chatPane.add(btnAmigo_3);
		btnAmigo_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAmigo_4.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnAmigo_4.setContentAreaFilled(false);
		btnAmigo_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont =0;
				
				btnEnviar_1.setVisible(true);
				lblO.setVisible(true);
				textField_1.setVisible(true);
				
				
				identificador = nomeChat[3];
				labelNomeAmigo.setText(login.list.listaUsuario[nomeChat[3]].getNome() + " " + login.list.listaUsuario[nomeChat[3]].getSobre_nome());
				cont = login.list.EncontrarInt(login.list.listaUsuario[nomeChat[3]].getEmail());
				
		//		String h = login.list.listaUsuario[login.ID].list.chat(cont, null);
		//		textAreaChat_1.setText(h.toString());
				if(login.list.listaUsuario[nomeChat[3]].Foto_Perfil !=null) {

	                try {
	                    // Carrega a imagem do arquivo
	                    BufferedImage originalImage = ImageIO.read(new File(login.list.listaUsuario[nomeChat[3]].Foto_Perfil));

	                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
	                    int newWidth = 100;
	                    int newHeight = 100;
	                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

	                    // Atribui a imagem redimensionada à JLabel
	                    lblPhotofriend.setIcon(new ImageIcon(scaledImage));
	                    
	                } catch (IOException ei) {
	                    ei.printStackTrace();
	                }
	                
										
					lblPhotofriend.setVisible(true);
					}else {
						lblPhotofriend.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
						lblPhotofriend.setVisible(true);
					}

				
				textAreaChat_1.setText("");
				textAreaChat_1.setText(login.list.listaUsuario[login.ID].list.chatRetorn(cont));
				

			}
		});
		
		
		btnAmigo_4.setBounds(12, 297, 342, 59);
		chatPane.add(btnAmigo_4);
		btnAmigo_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAmigo_5.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnAmigo_5.setContentAreaFilled(false);
		btnAmigo_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cont =0;
				
				btnEnviar_1.setVisible(true);
				lblO.setVisible(true);
				textField_1.setVisible(true);
				
				identificador = nomeChat[4];
				labelNomeAmigo.setText(login.list.listaUsuario[nomeChat[4]].getNome() + " " + login.list.listaUsuario[nomeChat[4]].getSobre_nome());
				cont = login.list.EncontrarInt(login.list.listaUsuario[nomeChat[4]].getEmail());
				
	//			String h = login.list.listaUsuario[login.ID].list.chat(cont, null);
	//			textAreaChat_1.setText(h.toString());
				if(login.list.listaUsuario[nomeChat[4]].Foto_Perfil !=null) {

	                try {
	                    // Carrega a imagem do arquivo
	                    BufferedImage originalImage = ImageIO.read(new File(login.list.listaUsuario[nomeChat[4]].Foto_Perfil));

	                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
	                    int newWidth = 100;
	                    int newHeight = 100;
	                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

	                    // Atribui a imagem redimensionada à JLabel
	                    lblPhotofriend.setIcon(new ImageIcon(scaledImage));
	                    
	                } catch (IOException ei) {
	                    ei.printStackTrace();
	                }
	                
										
					lblPhotofriend.setVisible(true);
					}else {
						lblPhotofriend.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
						lblPhotofriend.setVisible(true);
					}

				textAreaChat_1.setText("");
				textAreaChat_1.setText(login.list.listaUsuario[login.ID].list.chatRetorn(cont));
				

			}
		});
		
		
		btnAmigo_5.setBounds(12, 368, 342, 59);
		chatPane.add(btnAmigo_5);
		
		textField_1 = new JTextField();
		textField_1.setBorder(null);
		textField_1.setBounds(386, 517, 354, 31);
		textField_1.setBackground(new Color(241,241,241));
		chatPane.add(textField_1);
		textField_1.setColumns(10);
		btnEnviar_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		btnEnviar_1.setContentAreaFilled(false);
		btnEnviar_1.setBorderPainted(false);
		btnEnviar_1.setBorder(null);
		btnEnviar_1.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-25 20-01-37.png"));
		btnEnviar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String post = textField_1.getText();
		//		StringBuilder build = new StringBuilder();
				
		//		build.append("---------------------------------------------------------------------------------------").append("\n").append(login.list.listaUsuario[login.ID].getNome()).append(" ").append(login.list.listaUsuario[login.ID].getEmail() + ":").append("\n\t").append(post).append("\n").append("---------------------------------------------------------------------------------------").append("\n");
				if(textField_1.getText().isEmpty() !=true &&  textField_1.getText().isBlank() !=true) {
				login.list.listaUsuario[login.ID].list.chat(cont, post, login.list.listaUsuario[login.ID].getNome(), login.list.listaUsuario[login.ID].getSobre_nome());
				login.list.listaUsuario[cont].list.chat(login.ID, post, login.list.listaUsuario[login.ID].getNome(), login.list.listaUsuario[login.ID].getSobre_nome());
				
				textAreaChat_1.setText("");
				textAreaChat_1.setText(login.list.listaUsuario[cont].list.chatRetorn(login.ID));
				}
				textField_1.setText("");
			
				
			}
		});
		btnEnviar_1.setBounds(759, 515, 108, 34);
		chatPane.add(btnEnviar_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		scrollPane_1.setBounds(366, 84, 498, 426);
		chatPane.add(scrollPane_1);
		
		
		scrollPane_1.setViewportView(textAreaChat_1);
		textAreaChat_1.setEditable(false);
		chatPane.setVisible(false);
		frame.getContentPane().add(mostrarImagem);
		
		btnAmigo_1.setVisible(false);
		btnAmigo_2.setVisible(false);
		btnAmigo_3.setVisible(false);
		btnAmigo_4.setVisible(false);
		btnAmigo_5.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBounds(46, 53, 727, 362);
		mostrarImagem.add(panel);
		panel.setLayout(null);
		//Preto no BackGround
		panel.setBackground(new Color(0,0,0));
		lblFotoPane.setIcon(new ImageIcon("/home/samuel/Pictures/perfil4.PNG"));
		
		
		lblFotoPane.setBounds(216, 11, 279, 338);
		panel.add(lblFotoPane);
		
		JLabel lblVisualizadorDeImagem = new JLabel("\n");
		lblVisualizadorDeImagem.setBackground(new Color(91, 90, 88));
		lblVisualizadorDeImagem.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-26 17-41-19.png"));
		lblVisualizadorDeImagem.setFont(new Font("Dialog", Font.BOLD, 18));
		lblVisualizadorDeImagem.setBounds(2, 1, 574, 36);
		mostrarImagem.add(lblVisualizadorDeImagem);
		
		JButton btnAplicar = new JButton("Aplicar");
		btnAplicar.setBackground(new Color(238,238,238));
		btnAplicar.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnAplicar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnProximo.setEnabled(true);
				btnAntetior.setEnabled(true);
				login.list.listaUsuario[login.ID].Foto_Perfil = selectedFilePath;
                
                btnRemoverFoto.setVisible(true);
                btnAdicionarFoto.setText("Alterar foto");
                btnVisualizarFoto.setVisible(true);
                
                try {
                    // Carrega a imagem do arquivo
                    BufferedImage originalImage = ImageIO.read(new File(selectedFilePath));

                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
                    int newWidth = 100;
                    int newHeight = 100;
                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

                    // Atribui a imagem redimensionada à JLabel
                    FotoPerfil.setIcon(new ImageIcon(scaledImage));
                    
                } catch (IOException ei) {
                    ei.printStackTrace();
                }
                Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(true); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(true);
				}
                
                mostrarImagem.setVisible(false);
                Desembacar();
			}
		});
		
		JButton btnFechar = new JButton("");
		btnFechar.setContentAreaFilled(false);
		btnFechar.setBorder(null);
		btnFechar.setBorderPainted(false);
		btnFechar.setIcon(new ImageIcon("/home/samuel/Downloads/X_vermelho-removebg-preview_resized.png"));
		btnFechar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAplicar.setVisible(true);
				btnCancelar.setVisible(true);
				mostrarImagem.setVisible(false);
				labelNomeAmigo.setText("");
				btnProximo.setEnabled(true);
				btnAntetior.setEnabled(true);
				
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(true); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(true);
				}
				
				Desembacar();
				
			}
		});
		btnFechar.setBounds(785, 7, 20, 22);
		mostrarImagem.add(btnFechar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-26 17-47-21.png"));
		label.setBackground(new Color(91, 90, 88));
		label.setBounds(563, -1, 256, 38);
		mostrarImagem.add(label);
		btnAplicar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		btnAplicar.setBounds(692, 430, 117, 25);
		mostrarImagem.add(btnAplicar);
		btnCancelar.setFont(new Font("Monospaced", Font.BOLD, 14));
		btnCancelar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		
		
		btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(true); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(true);
				}
				
				btnProximo.setVisible(true);
				btnAntetior.setVisible(true);
				mostrarImagem.setVisible(false);
				btnProximo.setEnabled(true);
				btnAntetior.setEnabled(true);
				Desembacar();
				
			}
		});
		
		btnCancelar.setBounds(563, 430, 117, 25);
		mostrarImagem.add(btnCancelar);
		this.textArea_1 = textArea_1;
		this.textArea_2 = textArea_2;
		textArea_1.setBackground(new Color(241,241,241));
		textArea_2.setBackground(new Color(241,241,241));
		textArea_1.setEditable(false);
		textArea_2.setEditable(false);
		lblL_7.setBounds(280, 531, 622, 169);
		frame.getContentPane().add(lblL_7);
		lblL_7.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		textField.setBorder(null);
		
		
		textField.setBounds(410, 711, 357, 30);
		textField.setBackground(new Color(241, 241, 241));
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textArea.setVisible(false);
		
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		
		textArea.setVisible(true);
		
		this.textArea = textArea;
		
		
		
		
		textArea.setBounds(285, 533, 613, 166); // Defina os limites após a inicialização
		//		textArea_1.setBounds(285, 533, 613, 166);
		//		textArea_2.setBounds(285, 533, 613, 166);
				
				textArea.setBackground(new Color(241,241,241));
				
				textArea.setEditable(false);
		scrollPane.setFocusable(false);
		scrollPane.setFocusTraversalKeysEnabled(false);
		
		
		//scrollPane.setBounds(12, 530, 213, 175);
		scrollPane.setBounds(new Rectangle(281, 533, 620, 166));
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		lblPhotofriend.setBounds(383, 14, 70, 59);
		chatPane.add(lblPhotofriend);
		
		JButton btnBack = new JButton("");
		btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				scrollPane.setEnabled(true);
				scrollPane_2.setEnabled(true);
				
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(true); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(true);
				}
				
				btnEnviar_1.setVisible(false);
				lblO.setVisible(false);
				textField_1.setVisible(false);
				
				textAreaChat_1.setText("");
				lblPhotofriend.setIcon(null);
				labelNomeAmigo.setText("");
				textField_1.setText("");
				
				frame.setEnabled(true);
				
				Desembacar();
				chatPane.setVisible(false);
				
			}
		});
		btnBack.setContentAreaFilled(false);
		btnBack.setBorderPainted(false);
		btnBack.setBorder(null);
		btnBack.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/voltar_botão.png"));
		btnBack.setBounds(13, 512, 136, 44);
		chatPane.add(btnBack);
		lblO.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-25 14-57-25.png"));
		lblO.setBounds(360, 512, 399, 44);
		
		chatPane.add(lblO);
		btnRemoved.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemoved.setBorderPainted(false);
		btnRemoved.setIcon(new ImageIcon("/home/samuel/Downloads/lixeira-de-reciclagem (1).png"));
		btnRemoved.setContentAreaFilled(false);
		btnRemoved.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Object[] itens = { “MAÇA”, “PERA”, “BANANA” };

//			      Object selectedValue = JOptionPane.showInputDialog(null, “Escolha um item”, “Opçao”, JOptionPane.INFORMATION_MESSAGE, null); //
				if(login.list.listaUsuario[login.ID].list.getReturn(identificador).getSize() !=0 && login.list.listaUsuario[identificador].list.getReturn(login.ID).getSize() !=0) {
		/*		String names[] = new String[login.list.listaUsuario[login.ID].list.getReturn(identificador).getRemoved(login.list.listaUsuario[login.ID].getNome(), login.list.listaUsuario[login.ID].getSobre_nome(), null)];
				
		        Object selectedValue = JOptionPane.showInputDialog(
		                null,
		                "Escolha uma mensagem para remover",
		                "Remover Item",
		                JOptionPane.INFORMATION_MESSAGE,
		                null,
		                names, names[names.length]); */
			String Mensager =	JOptionPane.showInputDialog(null, "Digite a mensagem desejada:", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
				if(Mensager!=null) {
					 login.list.listaUsuario[login.ID].list.getReturn(identificador).remover("-------------------------------------------------------------------------------" + "\n" + login.list.listaUsuario[login.ID].getNome() + " " + login.list.listaUsuario[login.ID].getSobre_nome() + ":"+"\n\t" + Mensager + "\n" + "\t\t\t" +login.list.listaUsuario[login.ID].list.horaFormatada+"\n"+"-------------------------------------------------------------------------------" +"\n");
					 login.list.listaUsuario[identificador].list.getReturn(login.ID).remover("-------------------------------------------------------------------------------" + "\n" + login.list.listaUsuario[login.ID].getNome() + " " + login.list.listaUsuario[login.ID].getSobre_nome() + ":"+"\n\t" + Mensager + "\n" + "\t\t\t" +login.list.listaUsuario[identificador].list.horaFormatada+"\n"+"-------------------------------------------------------------------------------" +"\n");
					 if(login.list.listaUsuario[login.ID].list.getReturn(identificador).getMensagem() == true) {
							JOptionPane.showMessageDialog(null, "Mensagem removida com sucesso!");

					 }else {
							JOptionPane.showMessageDialog(null,"Mensagem não encontrada","Alerta",JOptionPane.ERROR_MESSAGE);

					 }
				}
				textAreaChat_1.setText(login.list.listaUsuario[identificador].list.chatRetorn(login.ID));
				
				}else JOptionPane.showMessageDialog(null, "Ainda não há nenhuma mensagem com o Usuário");
			}
		});
		btnRemoved.setBounds(854, 19, 30, 35);
		
		chatPane.add(btnRemoved);

		
		frame.getContentPane().add(scrollPane);
		
		
		scrollPane.setViewportView(textArea_3);
		
		
		//textArea.setBounds(280, 128, 622, 570);									//	----------------------------
		frame.getContentPane().add(textArea);
		
		
	//	textArea.setEditable(false);
		
		
		
		
		textArea.setVisible(false);
		frame.getContentPane().add(textArea_1);
		frame.getContentPane().add(textArea_2);
		textArea_1.setVisible(true);
		textArea_2.setVisible(true);
		textArea_1.setText("");
		textArea_2.setText("");
		
		
		
		
		frame.getContentPane().setIgnoreRepaint(true);
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(241, 241, 241));
		frame.setBackground(new Color(119, 118, 123));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/home/samuel/Pictures/Screenshot from 2023-08-19 09-58-19.jpg"));
		frame.setBounds(350, 150, 1250, 760);
		
		
		//Para Desktop
		//frame.setBounds(100, 70, 1250, 760);
		
		// ESSA FUNÇÃO PARA DEIXAR A TELAS MAXIMIZADA
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lblName.setFont(new Font("Dialog", Font.BOLD, 13));
		lblName.setBounds(284, 715, 112, 23);
		
		frame.getContentPane().add(lblName);
		lblNome_do_usuario.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNome_do_usuario.setText("Samuel Lucas");
		
		
		lblNome_do_usuario.setBounds(997, 23, 156, 27);
		frame.getContentPane().add(lblNome_do_usuario);
		

		
		
		buttonPerfil.setBounds(12, 93, 123, 33);
		buttonPerfil.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		buttonPerfil.setContentAreaFilled(false);
		buttonPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblDesfocado.setVisible(true);
				scrollPane.setEnabled(false);
				
				btnPublic.setEnabled(false);
				scrollPane_2.setEnabled(false);
				
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(false); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(false);
				}
				
				
				if(login.list.listaUsuario[login.ID].Foto_Perfil !=null) {
				lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[login.ID].Foto_Perfil));
				}else lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
				if(login.list.listaUsuario[login.ID].bio !=null) {
					textArea_Bio.setText(login.list.listaUsuario[login.ID].getBio());
				}else textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
				if(login.list.listaUsuario[login.ID].getGitHub() !=null) {
					lblLinkgitgub.setText(login.list.listaUsuario[login.ID].getGitHub());
				}else lblLinkgitgub.setText("Não Declarado");
				if(login.list.listaUsuario[login.ID].getLinked() !=null) {
					lblLinkLinkend.setText(login.list.listaUsuario[login.ID].getLinked());
				}else lblLinkLinkend.setText("Não Declarado");
				if(login.list.listaUsuario[login.ID].getCurso() !=null) {
					lblCurso_Perfil.setText(login.list.listaUsuario[login.ID].getCurso());
				}else lblCurso_Perfil.setText("Não Declarado");
				
				lblEmail_Perfil.setText(login.list.listaUsuario[login.ID].getEmail());
				lblIdade_Perfil.setText(login.list.listaUsuario[login.ID].getIdade() + " Anos");
				
				lblNameperfil.setText(login.list.listaUsuario[login.ID].getNome() + login.vv +login.list.listaUsuario[login.ID].getSobre_nome());
				
				btnEditar.setEnabled(true);
				btnEditar.setVisible(true);
	        	perfil.setVisible(true);
	        	
	        	
			}
		});
		frame.getContentPane().setLayout(null);
				
				
		
		buttonPerfil.setFocusPainted(false);
		buttonPerfil.setFocusTraversalKeysEnabled(false);
		buttonPerfil.setFocusable(false);
		buttonPerfil.setBorder(null);
		frame.getContentPane().add(buttonPerfil);
		
		btnPublication.setBounds(12, 153, 189, 27);
		btnPublication.setBorder(null);
		btnPublication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chatPane.setVisible(false);				
			}
		});
		
		btnPublication.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPublication.setContentAreaFilled(false);
		frame.getContentPane().add(btnPublication);
		
		btnSalvos.setBounds(19, 314, 123, 33);
		btnSalvos.setBorder(null);
		btnSalvos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnTelaAmigos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTelaAmigos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Tela_amigos aam= new Tela_amigos(Home_admin.this, list, user);

				
				aam.btnamigo1_1.setVisible(false);
				aam.btnamigo1_2.setVisible(false);
				aam.btnamigo1_3.setVisible(false);
				aam.btnamigo1_4.setVisible(false);
				aam.btnamigo1_5.setVisible(false);
				
				aam.lblAdicionado.setVisible(false);
				aam.lblAdicionado_1.setVisible(false);
				aam.lblAdicionado_2.setVisible(false);
				aam.lblAdicionado_3.setVisible(false);
				aam.lblAdicionado_4.setVisible(false);
				
				aam.btnAdicionar.setVisible(false);
				aam.btnAdicionar_1.setVisible(false);
				aam.btnAdicionar_2.setVisible(false);
				aam.btnAdicionar_3.setVisible(false);
				aam.btnAdicionar_4.setVisible(false);
				
				aam.lblArch_2_1.setVisible(false);
				aam.lblPhoto_2_1.setVisible(false);
				aam.lblArch_2_2.setVisible(false);
				aam.lblPhoto_2_2.setVisible(false);
				aam.lblArch_2_3.setVisible(false);
				aam.lblPhoto_2_3.setVisible(false);
				aam.lblArch_2_4.setVisible(false);
				aam.lblPhoto_2_4.setVisible(false);
				aam.lblArch_2_5.setVisible(false);
				aam.lblPhoto_2_5.setVisible(false);
				
				aam.btnRemover_1.setVisible(false);
				aam.btnRemover_2.setVisible(false);
				aam.btnRemover_3.setVisible(false);
				aam.btnRemover_4.setVisible(false);
				aam.btnRemover_5.setVisible(false);
				
				aam.lblArch_1.setVisible(false);
				aam.lblArch_2.setVisible(false);
				aam.lblArch_3.setVisible(false);
				aam.lblArch_4.setVisible(false);
				aam.lblArch_5.setVisible(false);
				
				aam.lblPhoto_1.setVisible(false);
				aam.lblPhoto_2.setVisible(false);
				aam.lblPhoto_3.setVisible(false);
				aam.lblPhoto_4.setVisible(false);
				aam.lblPhoto_5.setVisible(false);
				
				aam.lblNome1.setVisible(false);
				aam.lblNome2.setVisible(false);
				aam.lblNome3.setVisible(false);
				aam.lblNome4.setVisible(false);
				aam.lblNome5.setVisible(false);
				
				aam.lblArch_2_1.setVisible(false);
				aam.lblPhoto_2_1.setVisible(false);
				aam.lblArch_2_2.setVisible(false);
				aam.lblPhoto_2_2.setVisible(false);
				aam.lblArch_2_3.setVisible(false);
				aam.lblPhoto_2_3.setVisible(false);
				aam.lblArch_2_4.setVisible(false);
				aam.lblPhoto_2_4.setVisible(false);
				aam.lblArch_2_5.setVisible(false);
				aam.lblPhoto_2_5.setVisible(false);
				
				int w = login.list.listaUsuario[login.ID].list.tamanho();
				int b =0;
				
				if(w == 0) {
					//aam.panel.setVisible(false);
					aam.lblVocNoContm.setVisible(true);
				}else {
					aam.panel.setVisible(true);
					aam.lblVocNoContm.setVisible(false);
				ElementosInt lost = login.list.listaUsuario[login.ID].list.primeiro;
				
				if(lost !=null) {
					while(lost!=null) {
						aam.email_name[0] = login.list.listaUsuario[lost.getValor()].email;
						
						aam.lblArch_1.setVisible(true);
						aam.lblNome1.setText(login.list.listaUsuario[lost.getValor()].getNome()+ " " + login.list.listaUsuario[lost.getValor()].getSobre_nome());
						aam.btnRemover_1.setVisible(true);
						aam.lblNome1.setVisible(true);
						aam.btnamigo1_1.setVisible(true);
						
			        	b = list.EncontrarInt(aam.email_name[0]);
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
			                    aam.lblPhoto_1.setIcon(new ImageIcon(scaledImage));
			                    aam.lblPhoto_1.setVisible(true);
			                } catch (IOException ei) {
			                    ei.printStackTrace();
			                }
				    	
				    	
				    	}else {
				    		aam.lblPhoto_1.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
				    		aam.lblPhoto_1.setVisible(true);
				    	}
						
							if(lost.getElemento() ==null) break;
								lost = lost.getElemento();
							
						
						if(lost !=null) {
							aam.email_name[1] = login.list.listaUsuario[lost.getValor()].email;
							aam.lblArch_2.setVisible(true);
							aam.lblNome2.setText(login.list.listaUsuario[lost.getValor()].getNome()+ " " + login.list.listaUsuario[lost.getValor()].getSobre_nome());
							aam.btnRemover_2.setVisible(true);
							aam.lblNome2.setVisible(true);
							
							aam.btnamigo1_2.setVisible(true);
							
				        	b = list.EncontrarInt(aam.email_name[1]);
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
				                    aam.lblPhoto_2.setIcon(new ImageIcon(scaledImage));
				                    aam.lblPhoto_2.setVisible(true);
				                } catch (IOException ei) {
				                    ei.printStackTrace();
				                }
					    	
					    	
					    	}else {
					    		aam.lblPhoto_2.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
					    		aam.lblPhoto_2.setVisible(true);
					    	}
							
							if(lost.getElemento() ==null) break;
							
						}
							lost = lost.getElemento();
						if(lost !=null) {
							aam.email_name[2] = login.list.listaUsuario[lost.getValor()].email;
							aam.lblArch_3.setVisible(true);
							aam.lblNome3.setText(login.list.listaUsuario[lost.getValor()].getNome()+ " " + login.list.listaUsuario[lost.getValor()].getSobre_nome());
							aam.btnRemover_3.setVisible(true);
							aam.lblNome3.setVisible(true);
							aam.btnamigo1_3.setVisible(true);							
							
				        	b = list.EncontrarInt(aam.email_name[2]);
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
				                    aam.lblPhoto_3.setIcon(new ImageIcon(scaledImage));
				                    aam.lblPhoto_3.setVisible(true);
				                } catch (IOException ei) {
				                    ei.printStackTrace();
				                }
					    	
					    	
					    	}else {
					    		aam.lblPhoto_3.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
					    		aam.lblPhoto_3.setVisible(true);
					    	}
							
							if(lost.getElemento() ==null) break;
						}
						lost = lost.getElemento();
						if(lost !=null) {
							aam.email_name[3] = login.list.listaUsuario[lost.getValor()].email;
							aam.lblArch_4.setVisible(true);
							aam.lblNome4.setText(login.list.listaUsuario[lost.getValor()].getNome()+ " " + login.list.listaUsuario[lost.getValor()].getSobre_nome());
							aam.btnRemover_4.setVisible(true);
							aam.lblNome4.setVisible(true);
							aam.btnamigo1_4.setVisible(true);
							
				        	b = list.EncontrarInt(aam.email_name[3]);
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
				                    aam.lblPhoto_4.setIcon(new ImageIcon(scaledImage));
				                    aam.lblPhoto_4.setVisible(true);
				                } catch (IOException ei) {
				                    ei.printStackTrace();
				                }
					    	
					    	
					    	}else {
					    		aam.lblPhoto_4.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
					    		aam.lblPhoto_4.setVisible(true);
					    	}
							
							
							if(lost.getElemento() ==null) break; 
						}
						lost = lost.getElemento();
						if(lost !=null) {
							aam.email_name[4] = login.list.listaUsuario[lost.getValor()].email;
							aam.lblArch_5.setVisible(true);
							aam.lblNome5.setText(login.list.listaUsuario[lost.getValor()].getNome()+ " " + login.list.listaUsuario[lost.getValor()].getSobre_nome());
							aam.btnRemover_5.setVisible(true);
							aam.lblNome5.setVisible(true);
							
							aam.btnamigo1_5.setVisible(true);
							
				        	b = list.EncontrarInt(aam.email_name[4]);
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
				                    aam.lblPhoto_5.setIcon(new ImageIcon(scaledImage));
				                    aam.lblPhoto_5.setVisible(true);
				                } catch (IOException ei) {
				                    ei.printStackTrace();
				                }
					    	
					    	
					    	}else {
					    		aam.lblPhoto_5.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
					    		aam.lblPhoto_5.setVisible(true);
					    	}
							
							if(lost.getElemento() ==null) break; 
						}
						lost = lost.getElemento();
						
							if(lost.getElemento() == null) {
								break;
							}
						
						}
					
					}
				}
				
				
				
				aam.frame.setVisible(true);
				
				lblDesfocado.setVisible(true);
				
				lblBorro.setVisible(true);
				textField.setVisible(false);
				frame.setEnabled(false);
				
			}
		});
		btnTelaAmigos.setContentAreaFilled(false);
		btnTelaAmigos.setBorder(null);
		btnTelaAmigos.setBounds(14, 259, 129, 33);
		frame.getContentPane().add(btnTelaAmigos);
		
		
		btnSalvos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSalvos.setContentAreaFilled(false);
		frame.getContentPane().add(btnSalvos);
		
		btnChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				scrollPane.setEnabled(false);
				scrollPane_2.setEnabled(false);
				
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(false); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(false);
				}
				
				textAreaChat_1.setText("");
				labelNomeAmigo.setText("");
				textField_1.setText("");
				lblO.setVisible(false);
				textField_1.setVisible(false);
				btnEnviar_1.setVisible(false);
				
				
				int i =0;
				int contar = 0;
				contar = login.list.listaUsuario[login.ID].list.tamanho();
				ElementosInt aux = login.list.listaUsuario[login.ID].list.primeiro;
				
				if(aux != null) {
					while(aux != null) {
					nomeChat[i] = aux.getValor();
					btnAmigo_1.setText(login.list.listaUsuario[nomeChat[i]].getNome() + " " + login.list.listaUsuario[nomeChat[i]].getSobre_nome());
					btnAmigo_1.setVisible(true);
					btnAmigo_2.setVisible(false);
					btnAmigo_3.setVisible(false);
					btnAmigo_4.setVisible(false);
					btnAmigo_5.setVisible(false);
					if(login.list.listaUsuario[nomeChat[i]].Foto_Perfil !=null) {

		                try {
		                    // Carrega a imagem do arquivo
		                    BufferedImage originalImage = ImageIO.read(new File(login.list.listaUsuario[nomeChat[i]].Foto_Perfil));

		                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
		                    int newWidth = 100;
		                    int newHeight = 100;
		                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

		                    // Atribui a imagem redimensionada à JLabel
		                    lblF_1.setIcon(new ImageIcon(scaledImage));
		                    
		                } catch (IOException ei) {
		                    ei.printStackTrace();
		                }
		                
											
						lblF_1.setVisible(true);
						}else {
							lblF_1.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
							lblF_1.setVisible(true);
						}
					
					i++;
					if(aux.getElemento() != null) {
						btnAmigo_1.setVisible(true);
						btnAmigo_2.setVisible(true);
						btnAmigo_3.setVisible(false);
						btnAmigo_4.setVisible(false);
						btnAmigo_5.setVisible(false);
						aux = aux.getElemento();
						nomeChat[i] = aux.getValor();
						btnAmigo_2.setText(login.list.listaUsuario[nomeChat[i]].getNome() + " " + login.list.listaUsuario[nomeChat[i]].getSobre_nome());
						if(login.list.listaUsuario[nomeChat[i]].Foto_Perfil !=null) {
						//lblF_2.setIcon(new ImageIcon(login.list.listaUsuario[nomeChat[i]].Foto_Perfil));
		                try {
		                    // Carrega a imagem do arquivo
		                    BufferedImage originalImage = ImageIO.read(new File(login.list.listaUsuario[nomeChat[i]].Foto_Perfil));

		                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
		                    int newWidth = 100;
		                    int newHeight = 100;
		                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

		                    // Atribui a imagem redimensionada à JLabel
		                    lblF_2.setIcon(new ImageIcon(scaledImage));
		                    
		                } catch (IOException ei) {
		                    ei.printStackTrace();
		                }
						
						lblF_2.setVisible(true);
						}else {
							lblF_2.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
							lblF_2.setVisible(true);
						}
					}
					i++;
					if(aux.getElemento() != null) {
						btnAmigo_1.setVisible(true);
						btnAmigo_2.setVisible(true);
						btnAmigo_3.setVisible(true);
						btnAmigo_4.setVisible(false);
						btnAmigo_5.setVisible(false);
						aux = aux.getElemento();
						nomeChat[i] = aux.getValor();
						btnAmigo_3.setText(login.list.listaUsuario[nomeChat[i]].getNome() + " " + login.list.listaUsuario[nomeChat[i]].getSobre_nome());
						if(login.list.listaUsuario[nomeChat[i]].Foto_Perfil !=null) {
							//lblF_3.setIcon(new ImageIcon(login.list.listaUsuario[nomeChat[i]].Foto_Perfil));
			                try {
			                    // Carrega a imagem do arquivo
			                    BufferedImage originalImage = ImageIO.read(new File(login.list.listaUsuario[nomeChat[i]].Foto_Perfil));

			                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
			                    int newWidth = 100;
			                    int newHeight = 100;
			                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

			                    // Atribui a imagem redimensionada à JLabel
			                    lblF_3.setIcon(new ImageIcon(scaledImage));
			                    
			                } catch (IOException ei) {
			                    ei.printStackTrace();
			                }
							lblF_3.setVisible(true);
							}else {
								lblF_3.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
								lblF_3.setVisible(true);
							}
					}
					i++;
					if(aux.getElemento() != null) {
						btnAmigo_1.setVisible(true);
						btnAmigo_2.setVisible(true);
						btnAmigo_3.setVisible(true);
						btnAmigo_4.setVisible(true);
						btnAmigo_5.setVisible(false);
						aux = aux.getElemento();
						nomeChat[i] = aux.getValor();
						btnAmigo_4.setText(login.list.listaUsuario[nomeChat[i]].getNome() + " " + login.list.listaUsuario[nomeChat[i]].getSobre_nome());
						if(login.list.listaUsuario[nomeChat[i]].Foto_Perfil !=null) {
							//lblF_4.setIcon(new ImageIcon(login.list.listaUsuario[nomeChat[i]].Foto_Perfil));
			                try {
			                    // Carrega a imagem do arquivo
			                    BufferedImage originalImage = ImageIO.read(new File(login.list.listaUsuario[nomeChat[i]].Foto_Perfil));

			                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
			                    int newWidth = 100;
			                    int newHeight = 100;
			                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

			                    // Atribui a imagem redimensionada à JLabel
			                    lblF_4.setIcon(new ImageIcon(scaledImage));
			                    
			                } catch (IOException ei) {
			                    ei.printStackTrace();
			                }
							lblF_4.setVisible(true);
							}else {
								lblF_4.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
								lblF_4.setVisible(true);
							}
					}
					i++;
					if(aux.getElemento() != null) {
						btnAmigo_1.setVisible(true);
						btnAmigo_2.setVisible(true);
						btnAmigo_3.setVisible(true);
						btnAmigo_4.setVisible(true);
						btnAmigo_5.setVisible(true);
						aux = aux.getElemento();
						nomeChat[i] = aux.getValor();
						btnAmigo_5.setText(login.list.listaUsuario[nomeChat[i]].getNome() + " " + login.list.listaUsuario[nomeChat[i]].getSobre_nome());
						if(login.list.listaUsuario[nomeChat[i]].Foto_Perfil !=null) {
							//lblF_5.setIcon(new ImageIcon(login.list.listaUsuario[nomeChat[i]].Foto_Perfil));
			                try {
			                    // Carrega a imagem do arquivo
			                    BufferedImage originalImage = ImageIO.read(new File(login.list.listaUsuario[nomeChat[i]].Foto_Perfil));

			                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
			                    int newWidth = 100;
			                    int newHeight = 100;
			                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

			                    // Atribui a imagem redimensionada à JLabel
			                    lblF_5.setIcon(new ImageIcon(scaledImage));
			                    
			                } catch (IOException ei) {
			                    ei.printStackTrace();
			                }
							lblF_5.setVisible(true);
							}else {
								lblF_5.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
								lblF_5.setVisible(true);
							}
					}
					if(aux.getElemento() == null) {
						break;
					}
					
					aux = aux.getElemento();
					}
				}
								
				
				if(contar == 0) {
					
					
					scrollPane.setEnabled(true);
					scrollPane_2.setEnabled(true);
					
					Component[] components4 = panel_4.getComponents(); 
					for (Component component : components4) {
					    component.setEnabled(true); 
					}
					
					Component[] components25 = panel_5.getComponents();
					for(Component component : components25) {
						component.setEnabled(true);
					}
					
					JOptionPane.showMessageDialog(null, "Você não possui amigos");
					Desembacar();
					chatPane.setVisible(false);
				}else {
					lblDesfocado.setVisible(true);
					chatPane.setVisible(true);
				}
				
				
				/*if(contar ==1) {
					
					chatPane.setVisible(true);
				}if(contar ==2) {
					btnAmigo_1.setVisible(true);
					btnAmigo_2.setVisible(true);
					btnAmigo_3.setVisible(false);
					btnAmigo_4.setVisible(false);
					btnAmigo_5.setVisible(false);
					chatPane.setVisible(true);
				}if(contar ==3) {
					btnAmigo_1.setVisible(true);
					btnAmigo_2.setVisible(true);
					btnAmigo_3.setVisible(true);
					btnAmigo_4.setVisible(false);
					btnAmigo_5.setVisible(false);
					chatPane.setVisible(true);
				}if(contar ==4) {
					btnAmigo_1.setVisible(true);
					btnAmigo_2.setVisible(true);
					btnAmigo_3.setVisible(true);
					btnAmigo_4.setVisible(true);
					btnAmigo_5.setVisible(false);
					chatPane.setVisible(true);
				}if(contar ==5) {
					btnAmigo_1.setVisible(true);
					btnAmigo_2.setVisible(true);
					btnAmigo_3.setVisible(true);
					btnAmigo_4.setVisible(true);
					btnAmigo_5.setVisible(true);
					chatPane.setVisible(true);
				}*/
				contar =0;
				
			}
		});
		btnChat.setBounds(17, 206, 99, 33);
		btnChat.setBorder(null);
		btnChat.setContentAreaFilled(false);
		btnChat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(btnChat);
		
		JButton btnSair = new JButton("");
		btnSair.setBounds(19, 370, 92, 32);
		btnSair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSair.setContentAreaFilled(false);
		btnSair.setBorder(null);
		frame.getContentPane().add(btnSair);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
		        int escolha = JOptionPane.showOptionDialog(
		                null,
		                "Deseja fazer Log Off?",
		                "Você tem Certeza?",
		                JOptionPane.OK_CANCEL_OPTION,
		                JOptionPane.WARNING_MESSAGE,
		                null,
		                new Object[]{"Sim", "Voltar para Programa"}, // Opções para o usuário
		                "Sim" // Opção padrão selecionada
		            );
				
		        	if(escolha == 0) {
		        		
		        		chatPane.setVisible(false);
//		        		contador = 0;
		        		frame.setVisible(false);
		        		
		        		//frame.dispose();
			        	JOptionPane.showMessageDialog(null,"Log Off Realizado com Sucesso!", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
			        	
			        	login.ID = 0;
			        	Tela_Login.main(null);
			        	
			        	lblF_1.setVisible(false);
			    		lblF_2.setVisible(false);
			    		lblF_3.setVisible(false);
			    		lblF_4.setVisible(false);
			    		lblF_5.setVisible(false);
			    		
			    		textAreaFriends.setText("");
			        	
	
		        	}

			}
		});
		btnPublic.setFocusPainted(false);
		btnPublic.setFocusTraversalKeysEnabled(false);
		btnPublic.setFocusable(false);
		
		
		btnPublic.setBounds(710, 87, 166, 38);
		
		btnPublic.setContentAreaFilled(false);
		btnPublic.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		frame.getContentPane().add(btnPublic);
		
		btnConfiguraes.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Engrenagem.png"));
		btnConfiguraes.setContentAreaFilled(false);
		btnConfiguraes.setBorder(null);
		btnConfiguraes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnConfiguraes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Configuracao config = new Configuracao(Home_admin.this);
				
				config.main(null);
				lblBorro.setVisible(true);
				lblDesfocado.setVisible(true);
				textField.setVisible(false);
				frame.setEnabled(false);
				
			}
		});
				
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		desktopPane.setBackground(new Color(192, 191, 188));
	 	desktopPane.setSize(123, 150);
	 	desktopPane.setLocation(1110, 71);
		desktopPane.setVisible(false);
        
		frame.getContentPane().add(desktopPane);
		desktopPane.setLayout(null);
		
		
		JInternalFrame pane = new JInternalFrame();
		pane.setVisible(false);
		
		
		btnAddfoto.setBounds(10,10, 10, 10);
		btnAddfoto.setSize(10, 5);
		
		btnTeste.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTeste.setContentAreaFilled(false);
		btnTeste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				  if (pane != null && pane.isVisible()) {
					  	btnTeste.setEnabled(true);
			            pane.dispose();
			        }
				  
				  if(desktopPane != null && desktopPane.isVisible()) {
					  
					  btnAdicionar.setEnabled(true);
			            btnRemover.setEnabled(true);
			            btnAdicionar_2.setEnabled(true);
			            btnRemover_2.setEnabled(true);
			            btnPerfil_2_1.setEnabled(true);
			            btnPerfil_2_2.setEnabled(true);
			            
					  desktopPane.setVisible(false);
				  }
				  
				  else {
			        	
			            pane.setSize(200, 150);
			            pane.setLocation(1000, 50);
			            pane.setResizable(false);
			            pane.getContentPane().add(btnAddfoto);
			            
			            frame.getContentPane().add(pane);
//			            pane.setVisible(true);
			            
			            btnAdicionar.setEnabled(false);
			            btnRemover.setEnabled(false);
			            btnAdicionar_2.setEnabled(false);
			            btnRemover_2.setEnabled(false);
			            
			            btnPerfil_2_1.setEnabled(false);
			            btnPerfil_2_2.setEnabled(false);
			            
			            desktopPane.add(pane);
			            desktopPane.setVisible(true);
			            
			            
			        }	
				
			}
		});
		
		btnTeste.setBounds(1138, 6, 64, 62);
		frame.getContentPane().add(btnTeste);
		btnVisualizarFoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
			//Visualizar foto
		btnVisualizarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(false); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(false);
				}
				btnAplicar.setVisible(false);
				btnCancelar.setVisible(false);
				mostrarImagem.setVisible(true);
				lblFotoPane.setIcon(new ImageIcon(list.listaUsuario[login.ID].Foto_Perfil));
				lblDesfocado.setVisible(true);
				textField.setVisible(false);
				lblBorro.setVisible(true);
				btnProximo.setEnabled(false);
				btnAntetior.setEnabled(false);
				
			}
		});
		
		btnVisualizarFoto.setBounds(2, 27, 117, 25);
		desktopPane.add(btnVisualizarFoto);
		btnVisualizarFoto.setVisible(false);
		
		FotoPerfil.setBounds(1138, 6, 64, 62);
		frame.getContentPane().add(FotoPerfil);
		btnRemoverFoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		btnRemoverFoto.setText("Remover");		
		btnRemoverFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.list.listaUsuario[login.ID].Foto_Perfil = null;
				FotoPerfil.setIcon(new ImageIcon());
				btnAdicionarFoto.setText("addPhoto");
				btnRemoverFoto.setVisible(false);
				btnVisualizarFoto.setVisible(false);
				desktopPane.setVisible(false);
			}
		});
		btnAdicionarFoto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		
		
		btnAdicionarFoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    try {
			        ProcessBuilder processBuilder = new ProcessBuilder("zenity", "--file-selection", "--title=Selecione um arquivo");
			        Process process = processBuilder.start();

			        // Aguarde o término do processo para obter o resultado
			        int exitCode = process.waitFor();

			        // Verifique se o processo foi concluído com sucesso
			        if (exitCode == 0) {
			            // Obtenha o caminho do arquivo selecionado
			            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			            selectedFilePath = reader.readLine(); // Apenas leia a primeira linha

			            // Verifique se o caminho não está vazio
			            if (selectedFilePath != null && !selectedFilePath.isEmpty()) {
			                // Crie um botão e defina o ícone com base no caminho selecionado
			               // btnTeste.setIcon(new ImageIcon(selectedFilePath));
			                
			            	Component[] components = panel_4.getComponents(); 
							for (Component component : components) {
							    component.setEnabled(false); 
							}
							
							Component[] components2 = panel_5.getComponents();
							for(Component component : components2) {
								component.setEnabled(false);
							}
			            	
			            	mostrarImagem.setVisible(true);
			            	lblFotoPane.setIcon(new ImageIcon(selectedFilePath));
			            	
			            	lblBorro.setVisible(true);
			            	lblDesfocado.setVisible(true);
			            	textField.setVisible(false);
//			                login.list.listaUsuario[login.ID].Foto_Perfil = selectedFilePath;
//			                FotoPerfil.setIcon(new ImageIcon(selectedFilePath));
			            	btnProximo.setEnabled(false);
			            	btnAntetior.setEnabled(false);

			                desktopPane.setVisible(false);
			                
			                
			                

			                // Agora você pode usar btnTeste com o novo ícone
			            } else {
			                System.out.println("Nenhum arquivo selecionado.");
			            }
			        } else {
			            System.out.println("O processo de seleção de arquivo não foi concluído com sucesso.");
			        }
			    } catch (IOException | InterruptedException ex) {
			        ex.printStackTrace();
			    }
			}

			
		});
		
		
		btnAdicionarFoto.setBounds(2, 2, 117, 25);
		desktopPane.add(btnAdicionarFoto);
		
		
		btnRemoverFoto.setBounds(2, 51, 117, 25);
		desktopPane.add(btnRemoverFoto);
		btnSupport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_EmailSupport email = new Tela_EmailSupport(Home_admin.this);
				
				desktopPane.setVisible(false);
				email.lblNomeusuario.setText(login.list.listaUsuario[login.ID].getEmail());
				lblDesfocado.setVisible(true);
				textField.setVisible(false);
				frame.setEnabled(false);
								
				email.frame.setVisible(true);
				
			}
		});
		btnSupport.setBounds(3, 121, 117, 25);
		
		desktopPane.add(btnSupport);
		btnRemoverFoto.setVisible(false);
		
		JButton btnComunidade = new JButton("Comunidade");
		btnComunidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	//	btnComunidade.setBounds(18, 651, 156, 25);
		frame.getContentPane().add(btnComunidade);
		
		lblBorro.setIcon(new ImageIcon("/home/samuel/Downloads/Borro2.png"));
	//	lblBorro.setBounds(937, 140, 281, 541);
		frame.getContentPane().add(lblBorro);
		lblBorro.setVisible(false);
		
		lblL_6.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-25 14-57-25.png"));
		lblL_6.setBounds(386, 701, 405, 55);
		frame.getContentPane().add(lblL_6);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Texto = textField_2.getText();
		        LocalTime horaAtual = LocalTime.now();
		        String minutosFormatados = String.format("%02d", horaAtual.getMinute());
		        String horaFormatada = String.format("%02d:%s", horaAtual.getHour(), minutosFormatados);
				int valor[] = new int[login.list.listaUsuario.length];
				JCheckBoxMenuItem[] checkBoxes = {chckbxmntmN_1, chckbxmntmN_2, chckbxmntmN_3, chckbxmntmN_4, chckbxmntmN_5};
				if(Texto.isEmpty()==false &&Texto.isBlank()==false) {
				if(chckbxmntmN.isSelected()!=true) {
					for(int i =0; i<login.list.listaUsuario.length;i++) {
					if(checkBoxes[i].isSelected() == true) {
						if(Texto.isEmpty()==false&& Texto.isBlank()==false) {
							login.list.listaUsuario[login.list.EncontrarInt(checkBoxes[i].getActionCommand())].list.ChatFatec(Texto);
						}
					}
					}
				}else {
						int o =0;
						while(o!=5) {
								if(login.list.listaUsuario[o] !=null) {	
										login.list.listaUsuario[login.list.EncontrarInt(checkBoxes[o].getActionCommand())].list.ChatFatec(Texto);
										
								}
								o++;
							}
					}
				
	    		chatFatec.append("---------------------------------------------------").append("\n").append("Diretrizes").append(" ").append("Fatec" + ":").append("\n\n").append(Texto).append("\n").append("                                      " +horaFormatada).append("\n").append("---------------------------------------------------").append("\n");
	    		textArea_4.setText(chatFatec.toString());
	    		textField_2.setText("");
				}
			}
		});
		button.setBounds(218, 728, 92, 25);
		frame.getContentPane().add(button);
		lblDesfocado.setFont(new Font("Dialog", Font.BOLD, 12));
		
		
		
		lblDesfocado.setIcon(new ImageIcon("/home/samuel/Downloads/Home_borrada_2.png"));
		lblDesfocado.setBounds(0, -11, 1248, 782);
		frame.getContentPane().add(lblDesfocado);
		lblDesfocado.setVisible(false);
		
		btnEnviar.setBorder(null);
		btnEnviar.setBorderPainted(false);
		btnEnviar.setContentAreaFilled(false);
		btnEnviar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEnviar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
		        LocalTime horaAtual = LocalTime.now();
		        String minutosFormatados = String.format("%02d", horaAtual.getMinute());
		        String horaFormatada = String.format("%02d:%s", horaAtual.getHour(), minutosFormatados);

				
				if(!textField.getText().isEmpty()) {
				
					if(contador == 0) {
	        		
						listada.adicionar("------------------------------------------------------------------------------------------------------------------------------------------------------"+ "\n" +login.nome_para_tela + " " + login.sobre_nome_tela + ":" + "\n\t" + textField.getText() + "\n "+ "\t\t\t\t\t\t"  + horaFormatada + "\n" + "------------------------------------------------------------------------------------------------------------------------------------------------------", null);		//Este null é por conta de uma foto que eu iremos adicionar em cada postagem
						exibirMensagensNaTextArea();
						textField.setText("");
	                }
	                if(contador == 1) {
//	                	listada2.adicionar(login.nome_para_tela + " " + login.sobre_nome_tela + ":" + "\n\t" + textField.getText() + "\n", null);
		                listada2.adicionar("------------------------------------------------------------------------------------------------------------------------------------------------------"+ "\n" +login.nome_para_tela + " " + login.sobre_nome_tela + ":" + "\n\t" + textField.getText() + "\n "+ "\t\t\t\t\t\t"  + horaFormatada +"\n" + "------------------------------------------------------------------------------------------------------------------------------------------------------", null);		//Este null é por conta de uma foto que eu iremos adicionar em cada postagem

	                	exibirMensagensNaTextArea_1();
	                	textField.setText("");
	                }
	                if(contador == 2) {
		                listada3.adicionar("------------------------------------------------------------------------------------------------------------------------------------------------------"+ "\n" +login.nome_para_tela + " " + login.sobre_nome_tela + ":" + "\n\t" + textField.getText() + "\n "+ "\t\t\t\t\t\t"  + horaFormatada +"\n" + "------------------------------------------------------------------------------------------------------------------------------------------------------", null);		//Este null é por conta de uma foto que eu iremos adicionar em cada postagem

//	                	listada3.adicionar(login.nome_para_tela + " " + login.sobre_nome_tela + ":" + "\n\t" + textField.getText() + "\n", null);
	                    exibirMensagensNaTextArea_2();
	                    textField.setText("");
	                }
				}
				
			}
		});
		btnEnviar.setBounds(803, 716, 91, 22);
		frame.getContentPane().add(btnEnviar);
		lblEnv.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-25 20-01-37.png"));
		lblEnv.setBounds(795, 710, 107, 34);
		frame.getContentPane().add(lblEnv);
		panel_4.setBackground(new Color(241, 241, 241));
		panel_4.setBorder(UIManager.getBorder("Menu.border"));
		
		
		panel_4.setBounds(967, 424, 277, 342);
		frame.getContentPane().add(panel_4);
		//btnFriend[1].setBounds(98, 134, 93, 25);
		
		//JButton btnFriend = new JButton("Friend_1");
		
		panel_4.setLayout(null);
		btnFriend_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFriend_2.setForeground(new Color(241, 241, 241));
		btnFriend_2.setBackground(new Color(84, 82, 82));
		//panel_4.add(btnFriend[1]);
		
		//btnFriend_1.setVisible(true);
		btnFriend_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!login.list.listaUsuario[login.ID].getEmail().equals(nomeOBJ[1])) {
					
					
					//login.list.addFriend(login.ID, nomeOBJ[1]);	
					
					int o = login.list.EncontrarInt(nomeOBJ[1]);
					
					login.list.listaUsuario[o].list_Pedidos.addPedido(login.ID);
					login.list.listaUsuario[login.ID].list_Pedidos.addPedidoRequerido(o);
					login.list.listaUsuario[login.ID].list_Pedidos.addPedido(o);
					login.list.listaUsuario[o].list_Pedidos.addPedidoRequerido(login.ID);
					
					btnFriend_2.setVisible(false);
					lblAdicionado_1.setVisible(true);
					
					
				}	

			}
		});
		btnFriend_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFriend_1.setForeground(new Color(241, 241, 241));
		btnFriend_1.setBackground(new Color(84, 82, 82));
		//btnFriend_2.setVisible(true);
		
		btnFriend_1.setBounds(172, 58, 101, 25);
		btnFriend_1.setText("Adicionar");
		//JButton btnFriend_1 = new JButton("Friend_2");
		btnFriend_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					//if(login.list.listaUsuario[login.ID].list.contains(list.fff) == false) {
						//System.out.println(nomeOBJ[0]);
					
				
					//login.list.addFriend(login.ID, nomeOBJ[0]);
					int o = login.list.EncontrarInt(nomeOBJ[0]);
					
					login.list.listaUsuario[o].list_Pedidos.addPedido(login.ID);
					login.list.listaUsuario[login.ID].list_Pedidos.addPedidoRequerido(o);
					
					btnFriend_1.setVisible(false);
					lblAdicionado.setVisible(true);
					
				
				
			}
		});
		
		
		panel_4.add(btnFriend_1);
		btnFriend_2.setBounds(172, 118, 101, 25);
		
		//JButton btnFriend_2 = new JButton("Friend_3");
		panel_4.add(btnFriend_2);
		btn_Friend_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Friend_3.setForeground(new Color(241, 241, 241));
		btn_Friend_3.setBackground(new Color(84, 82, 82));
		
		
		btn_Friend_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
					
					int o = login.list.EncontrarInt(nomeOBJ[2]);
					
					login.list.listaUsuario[o].list_Pedidos.addPedido(login.ID);
					login.list.listaUsuario[login.ID].list_Pedidos.addPedidoRequerido(o);

					
					btn_Friend_3.setVisible(false);
					lblAdicionado_2.setVisible(true);
					
				
			}
		});
		btn_Friend_3.setBounds(172, 176, 101, 25);
		panel_4.add(btn_Friend_3);
		btn_Friend_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Friend_4.setForeground(new Color(241, 241, 241));
		btn_Friend_4.setBackground(new Color(84, 82, 82));
		
		
		btn_Friend_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					

					int o = login.list.EncontrarInt(nomeOBJ[3]);
					
					
					login.list.listaUsuario[o].list_Pedidos.addPedido(login.ID);
					login.list.listaUsuario[login.ID].list_Pedidos.addPedidoRequerido(o);

					
					btn_Friend_4.setVisible(false);
					lblAdicionado_3.setVisible(true);
					
				
				
			}
		});
		btn_Friend_4.setBounds(171, 236, 101, 25);
		panel_4.add(btn_Friend_4);
		btn_Friend_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn_Friend_5.setForeground(new Color(241, 241, 241));
		btn_Friend_5.setBackground(new Color(84, 82, 82));
		
		
		btn_Friend_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						
					
					int o = login.list.EncontrarInt(nomeOBJ[4]);
					
					login.list.listaUsuario[o].list_Pedidos.addPedido(login.ID);
					login.list.listaUsuario[login.ID].list_Pedidos.addPedidoRequerido(o);

					
					btn_Friend_5.setVisible(false);
					lblAdicionado_4.setVisible(true);
					
				
				
			}
		});
		btn_Friend_5.setBounds(172, 295, 101, 25);
		panel_4.add(btn_Friend_5);
		lblSugestesDeAmizade.setFont(new Font("Norasi", Font.BOLD, 20));
		
		
		lblSugestesDeAmizade.setBounds(33, 21, 213, 23);
		panel_4.add(lblSugestesDeAmizade);
		
		
		lblAdicionado.setBounds(174, 63, 93, 15);
		panel_4.add(lblAdicionado);
		lblAdicionado.setVisible(false);
		
		//JLabel lblAdicionado_1 = new JLabel("Adicionado...");
		lblAdicionado_1.setBounds(172, 121, 93, 15);
		panel_4.add(lblAdicionado_1);
		lblAdicionado_1.setVisible(false);
		
		//JLabel lblAdicionado_2 = new JLabel("Adicionado...");
		lblAdicionado_2.setBounds(174, 177, 93, 15);
		panel_4.add(lblAdicionado_2);
		lblAdicionado_2.setVisible(false);
		
		//JLabel lblAdicionado_3 = new JLabel("Adicionado...");
		lblAdicionado_3.setBounds(172, 242, 93, 15);
		panel_4.add(lblAdicionado_3);
		lblAdicionado_3.setVisible(false);
		
		//JLabel lblAdicionado_4 = new JLabel("Adicionado...");
		lblAdicionado_4.setBounds(172, 293, 93, 15);
		panel_4.add(lblAdicionado_4);
		lblAdicionado_4.setVisible(false);
		
		lblNoHParticipantes.setFont(new Font("Dialog", Font.BOLD, 16));
		lblNoHParticipantes.setBounds(40, 165, 213, 53);
		panel_4.add(lblNoHParticipantes);
		
		JButton btnAdicionar_1 = new JButton("Adicionar");
		btnAdicionar_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar_1.setBounds(122, -170, 117, 25);
		panel_4.add(btnAdicionar_1);
		
		
		lblFff_1.setBounds(5, 49, 54, 50);
		panel_4.add(lblFff_1);
		
		lblFff_2.setBounds(5, 104, 54, 50);
		panel_4.add(lblFff_2);
		lblFff_3.setBounds(5, 163, 54, 50);
		
		panel_4.add(lblFff_3);
		lblFff_4.setBounds(4, 222, 54, 50);
		
		panel_4.add(lblFff_4);
		lblFff_5.setBounds(5, 282, 54, 50);
		
		panel_4.add(lblFff_5);
		lblNoHParticipantes.setVisible(false);
		
		panel_1.setVisible(true);
		
		
		lblPhoto.setVisible(true);
		
		
		panel_1.setVisible(true);
		
		
	//	lblPhoto.setIcon(new ImageIcon("/home/samuel/Desktop/plain-black-background.jpg"));
		//JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 191, 188));
		panel_1.setBounds(280, 128, 622, 400);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(true);
		
		
		lblPhoto.setBounds(12, 12, 294, 378);
		panel_1.add(lblPhoto);
		txtrHellow.setFont(new Font("Waree", Font.PLAIN, 16));
		
		
		txtrHellow.setBounds(325, 48, 271, 314);
		panel_1.add(txtrHellow);
		
		lblNomedopublicador_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNomedopublicador_1.setBounds(323, 19, 201, 15);
		panel_1.add(lblNomedopublicador_1);
		lblL_7_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblL_7_1.setBounds(0, 0, 622, 400);
		
		panel_1.add(lblL_7_1);
		panel_2.setVisible(false);
		lblPhoto_1.setVisible(false);
		panel_2.setVisible(false);
		//	lblPhoto_1.setIcon(new ImageIcon("/home/samuel/Desktop/plain-black-background.jpg"));
			
			//JPanel panel_2 = new JPanel();
			panel_2.setBounds(280, 128, 622, 400);
			frame.getContentPane().add(panel_2);
			panel_2.setLayout(null);
			panel_2.setBackground(new Color(192, 191, 188));
			panel_2.setVisible(false);
			
			
			lblPhoto_1.setBounds(12, 12, 294, 378);
			panel_2.add(lblPhoto_1);
			
			textArea_3_2.setBounds(325, 48, 271, 314);
			panel_2.add(textArea_3_2);
			
			lblNomedopublicador_2.setFont(new Font("Dialog", Font.BOLD, 17));
			lblNomedopublicador_2.setBounds(319, 12, 201, 15);
			panel_2.add(lblNomedopublicador_2);
			lblL_7_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
			lblL_7_1_1.setBounds(0, 0, 622, 400);
			
			panel_2.add(lblL_7_1_1);
		
		//JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(192, 191, 188));
		panel_3.setBounds(280, 128, 622, 400);
		frame.getContentPane().add(panel_3);
		panel.setVisible(true);
		
		
		lblPhoto_2.setBounds(12, 12, 294, 378);
		panel_3.add(lblPhoto_2);
		
		textArea_3_3.setBounds(325, 48, 271, 314);
		panel_3.add(textArea_3_3);
		lblNomedopublicador_3.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNomedopublicador_3.setBounds(319, 12, 201, 15);
		
		panel_3.add(lblNomedopublicador_3);
		lblL_7_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblL_7_1_2.setBounds(0, 0, 622, 400);
		
		panel_3.add(lblL_7_1_2);
		btnAntetior.setFocusable(false);
		btnAntetior.setFocusTraversalKeysEnabled(false);
		btnAntetior.setFocusPainted(false);
		btnAntetior.setBorderPainted(false);
		btnAntetior.setBorder(null);
		btnAntetior.setContentAreaFilled(false);
		btnAntetior.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAntetior.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-25 11-25-27.png"));
		
		btnAntetior.setVisible(false);
		panel_5.setBackground(new Color(241, 241, 241));
		panel_5.setBounds(966, 72, 278, 351);
		panel_5.setVisible(false);
		
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		
		lblL_1.setBounds(180, 44, 90, 25);
		panel_5.add(lblL_1);
		lblL_1.setVisible(false);
		
		
		lblL_2.setBounds(179, 108, 90, 25);
		panel_5.add(lblL_2);
		lblL_2.setVisible(false);
		
		
		lblL_3.setBounds(180, 176, 90, 25);
		panel_5.add(lblL_3);
		lblL_3.setVisible(false);
		
		
		lblL_4.setBounds(179, 241, 90, 25);
		panel_5.add(lblL_4);
		lblL_4.setVisible(false);
		
		
		lblL_5.setBounds(180, 307, 90, 25);
		panel_5.add(lblL_5);
		btnAdicionar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar.setForeground(new Color(241, 241, 241));
		btnAdicionar.setBackground(new Color(26, 95, 180));
		btnAdicionar.setBounds(174, 29, 100, 25);
		lblL_5.setVisible(false);
		
		JLabel lblPedidosDeAmizade = new JLabel("Solicitações de Amizade:");
		lblPedidosDeAmizade.setFont(new Font("Norasi", Font.BOLD, 20));
		lblPedidosDeAmizade.setBounds(29, -4, 228, 30);
		panel_5.add(lblPedidosDeAmizade);
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int o = login.list.EncontrarInt(Pedidos[0]);
				
				login.list.listaUsuario[o].list_Pedidos.removerAmigo(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.removerPedido(o);
				login.list.listaUsuario[login.ID].list_Pedidos.removerAmigo(o);
				login.list.listaUsuario[o].list_Pedidos.removerPedido(login.ID);
				
				login.list.addFriend(login.ID, Pedidos[0]);
				
				btnAdicionar.setVisible(false);
				btnRemover.setVisible(false);
				lblL_1.setText("Adicionado");
				lblL_1.setVisible(true);
			}
		});
		
		
		
		panel_5.add(btnAdicionar);
		btnRemover.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemover.setBackground(new Color(165, 29, 45));
		btnRemover.setForeground(new Color(241, 241, 241));
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
				int o = login.list.EncontrarInt(Pedidos[0]);
				
				login.list.listaUsuario[o].list_Pedidos.removerAmigo(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.removerPedido(o);
				login.list.listaUsuario[login.ID].list_Pedidos.removerAmigo(o);
				login.list.listaUsuario[o].list_Pedidos.removerPedido(login.ID);
				
				
				
				btnAdicionar.setVisible(false);
				btnRemover.setVisible(false);
				
			//	login.list.addFriend(login.ID, Pedidos[0]);
				
				btnAdicionar.setVisible(false);
				btnRemover.setVisible(false);
				lblL_1.setText("Removido");
				lblL_1.setVisible(true);
			}
		});
		btnRemover.setBounds(174, 54, 100, 25);
		
		panel_5.add(btnRemover);
		btnAdicionar_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar_2.setBackground(new Color(26, 95, 180));
		btnAdicionar_2.setForeground(new Color(241, 241, 241));
		btnAdicionar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int o = login.list.EncontrarInt(Pedidos[1]);
				
				login.list.listaUsuario[o].list_Pedidos.removerAmigo(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.removerPedido(o);
				login.list.listaUsuario[login.ID].list_Pedidos.removerAmigo(o);
				login.list.listaUsuario[o].list_Pedidos.removerPedido(login.ID);
				
				login.list.addFriend(login.ID, Pedidos[1]);
				btnAdicionar_2.setVisible(false);
				btnRemover_2.setVisible(false);
				lblL_2.setText("Adicionado");
				lblL_2.setVisible(true);
			}
		});
		btnAdicionar_2.setBounds(174, 95, 100, 25);
		
		panel_5.add(btnAdicionar_2);
		btnRemover_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemover_2.setBackground(new Color(165, 29, 45));
		btnRemover_2.setForeground(new Color(241, 241, 241));
		btnRemover_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int o = login.list.EncontrarInt(Pedidos[1]);
				
				login.list.listaUsuario[o].list_Pedidos.removerAmigo(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.removerPedido(o);
				login.list.listaUsuario[login.ID].list_Pedidos.removerAmigo(o);
				login.list.listaUsuario[o].list_Pedidos.removerPedido(login.ID);
				
				btnAdicionar_2.setVisible(false);
				btnRemover_2.setVisible(false);
				lblL_2.setText("Removido");
				lblL_2.setVisible(true);
			}
		});
		btnRemover_2.setBounds(174, 120, 100, 25);
		
		panel_5.add(btnRemover_2);
		btnAdicionar_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar_3.setBackground(new Color(26, 95, 180));
		btnAdicionar_3.setForeground(new Color(241, 241, 241));
		btnAdicionar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int o = login.list.EncontrarInt(Pedidos[2]);
				
				login.list.listaUsuario[o].list_Pedidos.removerAmigo(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.removerPedido(o);
				login.list.listaUsuario[login.ID].list_Pedidos.removerAmigo(o);
				login.list.listaUsuario[o].list_Pedidos.removerPedido(login.ID);
				
				login.list.addFriend(login.ID, Pedidos[2]);
				
				btnAdicionar_3.setVisible(false);
				btnRemover_1.setVisible(false);
				lblL_3.setText("Adicionado");
				lblL_3.setVisible(true);			}
		});
		btnAdicionar_3.setBounds(174, 162, 100, 25);
		
		panel_5.add(btnAdicionar_3);
		btnRemover_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemover_1.setBackground(new Color(165, 29, 45));
		btnRemover_1.setForeground(new Color(241, 241, 241));
		btnRemover_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int o = login.list.EncontrarInt(Pedidos[2]);
				
				login.list.listaUsuario[o].list_Pedidos.removerAmigo(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.removerPedido(o);
				login.list.listaUsuario[login.ID].list_Pedidos.removerAmigo(o);
				login.list.listaUsuario[o].list_Pedidos.removerPedido(login.ID);
				
				btnAdicionar_3.setVisible(false);
				btnRemover_1.setVisible(false);
				lblL_3.setText("Removido");
				lblL_3.setVisible(true);
				
			}
		});
		btnRemover_1.setBounds(174, 187, 100, 25);
		
		panel_5.add(btnRemover_1);
		btnAdicionar_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar_4.setBackground(new Color(26, 95, 180));
		btnAdicionar_4.setForeground(new Color(241, 241, 241));
		btnAdicionar_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int o = login.list.EncontrarInt(Pedidos[3]);
				
				login.list.listaUsuario[o].list_Pedidos.removerAmigo(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.removerPedido(o);
				login.list.listaUsuario[login.ID].list_Pedidos.removerAmigo(o);
				login.list.listaUsuario[o].list_Pedidos.removerPedido(login.ID);
				
				login.list.addFriend(login.ID, Pedidos[3]);
				
				btnAdicionar_4.setVisible(false);
				btnRemover_4.setVisible(false);
				lblL_4.setText("Adicionado");
				lblL_4.setVisible(true);
				
			}
		});
		btnAdicionar_4.setBounds(174, 228, 100, 25);
		
		panel_5.add(btnAdicionar_4);
		btnRemover_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemover_4.setBackground(new Color(165, 29, 45));
		btnRemover_4.setForeground(new Color(241, 241, 241));
		btnRemover_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int o = login.list.EncontrarInt(Pedidos[3]);
				
				login.list.listaUsuario[o].list_Pedidos.removerAmigo(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.removerPedido(o);
				login.list.listaUsuario[login.ID].list_Pedidos.removerAmigo(o);
				login.list.listaUsuario[o].list_Pedidos.removerPedido(login.ID);
				
				btnAdicionar_4.setVisible(false);
				btnRemover_4.setVisible(false);
				lblL_4.setText("Removido");
				lblL_4.setVisible(true);
			}
		});
		btnRemover_4.setBounds(174, 253, 100, 25);
		
		panel_5.add(btnRemover_4);
		btnAdicionar_4_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionar_4_1.setBackground(new Color(26, 95, 180));
		btnAdicionar_4_1.setForeground(new Color(241, 241, 241));
		btnAdicionar_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int o = login.list.EncontrarInt(Pedidos[4]);
				
				login.list.listaUsuario[o].list_Pedidos.removerAmigo(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.removerPedido(o);
				login.list.listaUsuario[login.ID].list_Pedidos.removerAmigo(o);
				login.list.listaUsuario[o].list_Pedidos.removerPedido(login.ID);
				
				login.list.addFriend(login.ID, Pedidos[4]);
				
				btnAdicionar_4_1.setVisible(false);
				btnRemover_4_1.setVisible(false);
				lblL_5.setText("Adicionado");
				lblL_5.setVisible(true);
				
			}
		});
		btnAdicionar_4_1.setBounds(174, 294, 100, 25);
		
		panel_5.add(btnAdicionar_4_1);
		btnRemover_4_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRemover_4_1.setBackground(new Color(165, 29, 45));
		btnRemover_4_1.setForeground(new Color(241, 241, 241));
		btnRemover_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int o = login.list.EncontrarInt(Pedidos[4]);
				
				login.list.listaUsuario[o].list_Pedidos.removerAmigo(login.ID);
				login.list.listaUsuario[login.ID].list_Pedidos.removerPedido(o);
				login.list.listaUsuario[login.ID].list_Pedidos.removerAmigo(o);
				login.list.listaUsuario[o].list_Pedidos.removerPedido(login.ID);
				
				btnAdicionar_4_1.setVisible(false);
				btnRemover_4_1.setVisible(false);
				lblL_5.setText("Removido");
				lblL_5.setVisible(true);
			}
		});
		btnRemover_4_1.setBounds(174, 320, 100, 25);
		
		panel_5.add(btnRemover_4_1);
		
		
		lblFf_1.setBounds(4, 29, 54, 50);
		panel_5.add(lblFf_1);
		
	//	JLabel lblFf_2 = new JLabel("FF1");
		lblFf_2.setBounds(4, 95, 54, 50);
		panel_5.add(lblFf_2);
		
//		JLabel lblFf_3 = new JLabel("FF1");
		lblFf_3.setBounds(4, 163, 54, 50);
		panel_5.add(lblFf_3);
		
//		JLabel lblFf_4 = new JLabel("FF1");
		lblFf_4.setBounds(4, 228, 54, 50);
		panel_5.add(lblFf_4);
		
//		JLabel lblFf_5 = new JLabel("FF1");
		lblFf_5.setBounds(4, 294, 54, 50);
		panel_5.add(lblFf_5);
		btnPerfil_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil_2_1.setFocusable(false);
		btnPerfil_2_1.setFocusTraversalKeysEnabled(false);
		btnPerfil_2_1.setFocusPainted(false);
		btnPerfil_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(false); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(false);
				}
				
				int o = login.list.EncontrarInt(Pedidos[0]);
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else lblCurso_Perfil.setText("Não Declarado");
					
					lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					btnEditar.setEnabled(false);
					btnEditar.setVisible(false);
					
					panel_4.setEnabled(false);
					lblDesfocado.setVisible(true);
		        	perfil.setVisible(true);
		        	
				
				
			}
		});
		
		btnPerfil_2_1.setContentAreaFilled(false);
		
		panel_5.add(btnPerfil_2_1);
		btnPerfil_2_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil_2_2.setFocusable(false);
		btnPerfil_2_2.setFocusTraversalKeysEnabled(false);
		btnPerfil_2_2.setFocusPainted(false);
		btnPerfil_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(false); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(false);
				}
				
				int o = login.list.EncontrarInt(Pedidos[1]);
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else lblCurso_Perfil.setText("Não Declarado");
					
					lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					btnEditar.setEnabled(false);
					btnEditar.setVisible(false);
					
					panel_4.setEnabled(false);
					lblDesfocado.setVisible(true);
		        	perfil.setVisible(true);
		        	
				
				
			}
		});
		btnPerfil_2_2.setContentAreaFilled(false);
		panel_5.add(btnPerfil_2_2);
		btnPerfil_2_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil_2_3.setFocusable(false);
		btnPerfil_2_3.setFocusTraversalKeysEnabled(false);
		btnPerfil_2_3.setFocusPainted(false);
		btnPerfil_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(false); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(false);
				}
				
				int o = login.list.EncontrarInt(Pedidos[2]);
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else lblCurso_Perfil.setText("Não Declarado");
					
					lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					btnEditar.setEnabled(false);
					btnEditar.setVisible(false);
					
					panel_4.setEnabled(false);
					lblDesfocado.setVisible(true);
		        	perfil.setVisible(true);
		        	
				
				
			}
		});
		btnPerfil_2_3.setContentAreaFilled(false);
		panel_5.add(btnPerfil_2_3);
		btnPerfil_2_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil_2_4.setFocusable(false);
		btnPerfil_2_4.setFocusTraversalKeysEnabled(false);
		btnPerfil_2_4.setFocusPainted(false);
		btnPerfil_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(false); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(false);
				}
				
				int o = login.list.EncontrarInt(Pedidos[3]);
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else lblCurso_Perfil.setText("Não Declarado");
					
					lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					btnEditar.setEnabled(false);
					btnEditar.setVisible(false);
					
					panel_4.setEnabled(false);
					lblDesfocado.setVisible(true);
		        	perfil.setVisible(true);
		        	
				
				
			}
		});
		btnPerfil_2_4.setContentAreaFilled(false);
		panel_5.add(btnPerfil_2_4);
		btnPerfil_2_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil_2_5.setFocusable(false);
		btnPerfil_2_5.setFocusTraversalKeysEnabled(false);
		btnPerfil_2_5.setFocusPainted(false);
		btnPerfil_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(false); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(false);
				}
				
				int o = login.list.EncontrarInt(Pedidos[4]);
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else lblCurso_Perfil.setText("Não Declarado");
					
					lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					btnEditar.setEnabled(false);
					btnEditar.setVisible(false);
					
					panel_4.setEnabled(false);
					lblDesfocado.setVisible(true);
		        	perfil.setVisible(true);
		        	
				
				
			}
		});
		btnPerfil_2_5.setContentAreaFilled(false);
		panel_5.add(btnPerfil_2_5);
		//txtrSamuelLucas.setBackground(new Color(241, 241, 241));
		txtrSamuelLucas.setBackground(new Color(0, 0, 0, 1));
		txtrSamuelLucas.setEditable(false);
		txtrSamuelLucas.setFont(new Font("Noto Mono", Font.BOLD, 14));
		txtrSamuelLucas.setBounds(60, 28, 116, 317);
		//		txtrSamuelLucas.setText("\n" + " Samuel Lucas" + "\n" + "\n" + "\n" + "\n" + " Pedro Lipe" + "\n" + "\n" + "\n" + "\n" + " Felipe Rocha");
				
				
				panel_5.add(txtrSamuelLucas);
		lblArch.setBorder(UIManager.getBorder("InternalFrame.paletteBorder"));
		lblArch.setBounds(0, 24, 278, 60);
		
		panel_5.add(lblArch);
		lblArch_1.setBorder(UIManager.getBorder("InternalFrame.paletteBorder"));
		lblArch_1.setBounds(0, 90, 278, 60);
		
		panel_5.add(lblArch_1);
		lblArch_2.setBorder(UIManager.getBorder("InternalFrame.paletteBorder"));
		lblArch_2.setBounds(0, 157, 278, 60);
		
		panel_5.add(lblArch_2);
		lblArch_3.setBorder(UIManager.getBorder("InternalFrame.paletteBorder"));
		lblArch_3.setBounds(0, 224, 278, 60);
		
		panel_5.add(lblArch_3);
		lblArch_4.setBorder(UIManager.getBorder("InternalFrame.paletteBorder"));
		lblArch_4.setBounds(0, 289, 278, 60);
		
		btnPerfil_2_1.setBounds(lblArch.getBounds());
		btnPerfil_2_2.setBounds(lblArch_1.getBounds());
		btnPerfil_2_3.setBounds(lblArch_2.getBounds());
		btnPerfil_2_4.setBounds(lblArch_3.getBounds());
		btnPerfil_2_5.setBounds(lblArch_4.getBounds());
		
		panel_5.add(lblArch_4);
		btnProximo.setContentAreaFilled(false);
		btnProximo.setBorderPainted(false);
		btnProximo.setBorder(null);
		btnProximo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProximo.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-25 11-25-11.png"));
		btnProximo.setFocusable(false);
		btnProximo.setFocusTraversalKeysEnabled(false);
		btnProximo.setFocusPainted(false);
		
		btnProximo.setBounds(915, 332, 52, 81);
		frame.getContentPane().add(btnProximo);
		btnProximo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				contador++;
				
			//	textArea.setVisible(false);
				 	
				if(contador == 1) {
					textArea.setVisible(false);
					textArea_1.setVisible(true);
					textArea_2.setVisible(false);
					btnAntetior.setVisible(true);
					lblPhoto.setVisible(false);
					lblPhoto_1.setVisible(true);
					lblPhoto_2.setVisible(false);
					panel_1.setVisible(false);
					panel_2.setVisible(true);
					
					txtrHellow.setVisible(false);
					textArea_3_2.setVisible(true);
					textArea_3_3.setVisible(false);
					
					exibirMensagensNaTextArea_1();
					
				}
				
				if(contador == 2) {
					textArea_2.setVisible(true);
					textArea_1.setVisible(false);
					textArea.setVisible(false);
					btnProximo.setVisible(false);
					lblPhoto.setVisible(false);
					lblPhoto_1.setVisible(false);
					lblPhoto_2.setVisible(true);
					panel_1.setVisible(false);
					panel_2.setVisible(false);
					panel_3.setVisible(true);
					
					txtrHellow.setVisible(false);
					textArea_3_2.setVisible(false);
					textArea_3_3.setVisible(true);
					
					exibirMensagensNaTextArea_2();
					
				}
				
				//	lblBorro.setVisible(true);
				//	lblDesfocado.setVisible(true);
				//	frame.setEnabled(false);
									
			}
		});
		

		/*textArea.setText("Area 1");
		textArea_1.setText("Area 2");
		textArea_2.setText("Area 3");*/
		
		if(contador == 0) {
			panel_1.setVisible(true);
			textArea.setVisible(true);
			panel_2.setVisible(true);
			textArea_1.setVisible(false);
			panel_3.setVisible(false);
			textArea_2.setVisible(false);
			}
		if(contador == 1){
			panel_1.setVisible(false);
			textArea.setVisible(false);
			panel_2.setVisible(false);
			textArea_1.setVisible(true);
			panel_3.setVisible(false);
			textArea_2.setVisible(false);
			
		}
		if(contador == 2){
			panel_1.setVisible(false);
			textArea.setVisible(false);
			panel_2.setVisible(false);
			textArea_1.setVisible(false);
			panel_3.setVisible(true);
			textArea_2.setVisible(true);
		}
		
		
		
		btnAntetior.setBounds(216, 332, 52, 81);
		frame.getContentPane().add(btnAntetior);
		btnAntetior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador--;
				
				//	lblBorro.setVisible(true);
				//	lblDesfocado.setVisible(true);
				//	frame.setEnabled(false);
						
				
				if(contador == 1) {
					textArea.setVisible(false);
					textArea_1.setVisible(true);
					textArea_2.setVisible(false);
					btnProximo.setVisible(true);
					lblPhoto_1.setVisible(true);
					panel_2.setVisible(true);
					panel_1.setVisible(false);
					panel_3.setVisible(false);
					lblPhoto.setVisible(true);
					lblPhoto_2.setVisible(true);
					
					txtrHellow.setVisible(false);
					textArea_3_2.setVisible(true);
					textArea_3_3.setVisible(false);
					exibirMensagensNaTextArea_1();
					
				}else{
					textArea_1.setVisible(false);
					textArea_2.setVisible(false);
					textArea.setVisible(true);
					btnAntetior.setVisible(false);
					lblPhoto.setVisible(true);
					//lblPhoto.setText();
					lblPhoto_1.setVisible(false);
					lblPhoto_2.setVisible(false);
					panel_2.setVisible(false);
					panel_1.setVisible(true);
					panel_3.setVisible(false);
					
					txtrHellow.setVisible(true);
					textArea_3_2.setVisible(false);
					textArea_3_3.setVisible(false);
					exibirMensagensNaTextArea();
				}
				
			}
		});
		
		
		btnConfiguraes.setBounds(1218, 25, 20, 23);
		frame.getContentPane().add(btnConfiguraes);
		
	
		
		btnPublic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Publicar p = new Publicar(Home_admin.this);
					p.main(null);
					
					lblBorro.setVisible(true);
					lblDesfocado.setVisible(true);
					textField.setVisible(false);
					frame.setEnabled(false);
									
			}
		});
		

		JLabel lbladdFoto = new JLabel("");
		lbladdFoto.setBounds(1138, -3, 70, 81);
		lbladdFoto.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/addFoto.png"));
		frame.getContentPane().add(lbladdFoto);
		
		lblBotes.setBounds(-3, 77, 223, 336);
		lblBotes.setBorder(null);
		lblBotes.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-10-01 21-00-43.png"));
		frame.getContentPane().add(lblBotes);
		
		JLabel lblPublic = new JLabel("");
		lblPublic.setBounds(705, 77, 196, 55);
		lblPublic.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-10-01 21-24-51.png"));
		frame.getContentPane().add(lblPublic);
		
		JLabel lblPanel = new JLabel("");
		lblPanel.setBounds(268, 61, 632, 707);
		lblPanel.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-10-01 21-02-51.png"));
		frame.getContentPane().add(lblPanel);
		
		JLabel labelAvisos = new JLabel("");
		labelAvisos.setVisible(false);
		
		labelAvisos.setEnabled(false);
		labelAvisos.setBounds(937, 140, 290, 548);
		labelAvisos.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-10-01 21-05-26.png"));
		frame.getContentPane().add(labelAvisos);
		
		JLabel lblLogofatec = new JLabel("");
		lblLogofatec.setBounds(2, 1, 1275, 75);
		lblLogofatec.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-10-01 23-25-09.png"));
		frame.getContentPane().add(lblLogofatec);
		
		
		scrollPane_2.setBounds(12, 462, 223, 239);
		frame.getContentPane().add(scrollPane_2);
		
		
		scrollPane_2.setViewportView(textArea_4);

		textField_2.setBounds(7, 732, 202, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		btnSelectPerson.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSelectPerson.setContentAreaFilled(false);
		btnSelectPerson.setBorderPainted(false);
		btnSelectPerson.setBorder(null);
		btnSelectPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			mnNewMenu.doClick();	
				
			}
		});
		btnSelectPerson.setBounds(16, 712, 162, 15);
		frame.getContentPane().add(btnSelectPerson);
		mnNewMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        mnNewMenu.doClick();

				
			}
		});
		
		mnNewMenu.setBounds(13, 709, 171, 19);
		frame.getContentPane().add(mnNewMenu);
		
		mnNewMenu.add(chckbxmntmN);
		
		mnNewMenu.add(chckbxmntmN_1);
		
		mnNewMenu.add(chckbxmntmN_2);
		
		mnNewMenu.add(chckbxmntmN_3);
		
		mnNewMenu.add(chckbxmntmN_4);
		
		mnNewMenu.add(chckbxmntmN_5);
		
		JLabel lblExit = new JLabel("");
		lblExit.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-28 19-34-13.png"));
		lblExit.setBounds(6, 369, 116, 33);
		frame.getContentPane().add(lblExit);
		lblAvisos.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-28 19-42-14.png"));
		lblAvisos.setBounds(43, 413, 155, 43);
		
		frame.getContentPane().add(lblAvisos);
		btnPerfil_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil_1.setFocusPainted(false);
		btnPerfil_1.setFocusable(false);
		btnPerfil_1.setFocusTraversalKeysEnabled(false);
		btnPerfil_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(false); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(false);
				}
				
				int o = login.list.EncontrarInt(nomeOBJ[0]);
				
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else lblCurso_Perfil.setText("Não Declarado");
					
					lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					btnEditar.setEnabled(false);
					btnEditar.setVisible(false);
					
					lblDesfocado.setVisible(true);
		        	perfil.setVisible(true);
		        	
				
			}
		});
		btnPerfil_1.setContentAreaFilled(false);
	//	btnPerfil_1.setBorderPainted(true);
	//	btnPerfil_1.setBorder(new CompoundBorder());
	
		
		panel_4.add(btnPerfil_1);
		btnPerfil_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil_2.setFocusPainted(false);
		btnPerfil_2.setFocusable(false);
		btnPerfil_2.setFocusTraversalKeysEnabled(false);
		btnPerfil_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(false); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(false);
				}
				
				int o = login.list.EncontrarInt(nomeOBJ[1]);
				
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else lblCurso_Perfil.setText("Não Declarado");
					
					lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					btnEditar.setEnabled(false);
					btnEditar.setVisible(false);
					
					panel_4.setEnabled(false);
					lblDesfocado.setVisible(true);
		        	perfil.setVisible(true);
		        	
				
				
				
			}
		});
		btnPerfil_2.setContentAreaFilled(false);
		panel_4.add(btnPerfil_2);
		btnPerfil_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil_3.setFocusPainted(false);
		btnPerfil_3.setFocusable(false);
		btnPerfil_3.setFocusTraversalKeysEnabled(false);
		btnPerfil_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(false); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(false);
				}
				
				int o = login.list.EncontrarInt(nomeOBJ[2]);
				
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else lblCurso_Perfil.setText("Não Declarado");
					
					lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					btnEditar.setEnabled(false);
					btnEditar.setVisible(false);
					
					panel_4.setEnabled(false);
					lblDesfocado.setVisible(true);
		        	perfil.setVisible(true);
		        	
				
				
			}
		});
		btnPerfil_3.setContentAreaFilled(false);
		panel_4.add(btnPerfil_3);
		btnPerfil_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil_4.setFocusPainted(false);
		btnPerfil_4.setFocusable(false);
		btnPerfil_4.setFocusTraversalKeysEnabled(false);
		btnPerfil_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(false); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(false);
				}
				
				int o = login.list.EncontrarInt(nomeOBJ[3]);
				
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else lblCurso_Perfil.setText("Não Declarado");
					
					lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					btnEditar.setEnabled(false);
					btnEditar.setVisible(false);
					
					panel_4.setEnabled(false);
					lblDesfocado.setVisible(true);
		        	perfil.setVisible(true);
		        	
				
				
			}
		});
		btnPerfil_4.setContentAreaFilled(false);
		panel_4.add(btnPerfil_4);
		btnPerfil_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPerfil_5.setFocusPainted(false);
		btnPerfil_5.setFocusable(false);
		btnPerfil_5.setFocusTraversalKeysEnabled(false);
		btnPerfil_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Component[] components = panel_4.getComponents(); 
				for (Component component : components) {
				    component.setEnabled(false); 
				}
				
				Component[] components2 = panel_5.getComponents();
				for(Component component : components2) {
					component.setEnabled(false);
				}
				
				int o = login.list.EncontrarInt(nomeOBJ[4]);
				
				if(login.list.listaUsuario[o].Foto_Perfil !=null) {
					lblFotopagperfil.setIcon(new ImageIcon(login.list.listaUsuario[o].Foto_Perfil));
					}else lblFotopagperfil.setIcon(new ImageIcon("/home/samuel/Downloads/Foto-Perfil.png"));
					if(login.list.listaUsuario[o].bio !=null) {
						textArea_Bio.setText(login.list.listaUsuario[o].getBio());
					}else textArea_Bio.setText("\n\n\n\n" + "\tNada Declarado");
					if(login.list.listaUsuario[o].getGitHub() !=null) {
						lblLinkgitgub.setText(login.list.listaUsuario[o].getGitHub());
					}else lblLinkgitgub.setText("Não Declarado");
					if(login.list.listaUsuario[o].getLinked() !=null) {
						lblLinkLinkend.setText(login.list.listaUsuario[o].getLinked());
					}else lblLinkLinkend.setText("Não Declarado");
					if(login.list.listaUsuario[o].getCurso() !=null) {
						lblCurso_Perfil.setText(login.list.listaUsuario[o].getCurso());
					}else lblCurso_Perfil.setText("Não Declarado");
					
					lblEmail_Perfil.setText(login.list.listaUsuario[o].getEmail());
					lblIdade_Perfil.setText(login.list.listaUsuario[o].getIdade() + " Anos");
					
					lblNameperfil.setText(login.list.listaUsuario[o].getNome() + login.vv +login.list.listaUsuario[o].getSobre_nome());
					
					btnEditar.setEnabled(false);
					btnEditar.setVisible(false);
					
					panel_4.setEnabled(false);
					lblDesfocado.setVisible(true);
		        	perfil.setVisible(true);
		        	
				
				
			}
		});
		btnPerfil_5.setContentAreaFilled(false);
		panel_4.add(btnPerfil_5);
		//textAreaFriends.setBackground(new Color(241, 241, 241));
		textAreaFriends.setBackground(new Color(0, 0, 0, 1));
		
		textAreaFriends.setFont(new Font("Dialog", Font.BOLD, 12));
		textAreaFriends.setEditable(false);
		textAreaFriends.setBounds(62, 63, 107, 268);
		panel_4.add(textAreaFriends);
		
		
		lblArch_2_1.setBorder(UIManager.getBorder("InternalFrame.paletteBorder"));
		lblArch_2_1.setBounds(0, 46, 278, 56);
		panel_4.add(lblArch_2_1);
		
		btnPerfil_1.setBounds(lblArch_2_1.getBounds());
		
	
		lblArch_2_2.setBorder(UIManager.getBorder("InternalFrame.paletteBorder"));
		lblArch_2_2.setBounds(0, 99, 278, 59);
		panel_4.add(lblArch_2_2);
		btnPerfil_2.setBounds(lblArch_2_2.getBounds());
		lblArch_2_3.setBorder(UIManager.getBorder("InternalFrame.paletteBorder"));
		lblArch_2_3.setBounds(0, 157, 278, 60);
		
		panel_4.add(lblArch_2_3);
		btnPerfil_3.setBounds(lblArch_2_3.getBounds());
		lblArch_2_4.setBorder(UIManager.getBorder("InternalFrame.paletteBorder"));
		lblArch_2_4.setBounds(0, 216, 278, 60);
		
		panel_4.add(lblArch_2_4);
		btnPerfil_4.setBounds(lblArch_2_4.getBounds());
		lblArch_2_5.setBorder(UIManager.getBorder("InternalFrame.paletteBorder"));
		lblArch_2_5.setBounds(0, 275, 278, 60);
		
		panel_4.add(lblArch_2_5);
		btnPerfil_5.setBounds(lblArch_2_5.getBounds());
		
		
		
		
		
		
	}
	
	
	
	public void Desembacar() {
		lblBorro.setVisible(false);
		lblDesfocado.setVisible(false);
		textField.setVisible(true);
		frame.setEnabled(true);
	}
	
	
	
    public void exibirMensagensNaTextArea() {
        Elementos aux = listada.primeiro;
        StringBuilder sb = new StringBuilder();

        while (aux != null) {
            //sb.append(aux.publication).append("\n");
            //sb.append("\n" + Tela_Login.nome_para_tela).append(":");
	        sb.append("").append(aux.publication); //O primeiro sb.append("") é para posicionar aonde o nome do Usuário vai ficar 
	        aux = aux.getProximo();
        }
        
        textArea_3.setText(sb.toString());
    }
    
    public void exibirMensagensNaTextArea_1() {
        Elementos aux1 = listada2.primeiro;
        StringBuilder sb1 = new StringBuilder();

        while (aux1 != null) {
            //sb.append(aux.publication).append("\n");
            //sb.append("\n" + Tela_Login.nome_para_tela).append(":");
	        sb1.append("").append(aux1.publication); //O primeiro sb.append("") é para posicionar aonde o nome do Usuário vai ficar 
	        aux1 = aux1.getProximo();
        }

        textArea_3.setText(sb1.toString());
    } 
    
    public void exibirMensagensNaTextArea_2() {
        Elementos aux2 = listada3.primeiro;
        StringBuilder sb2 = new StringBuilder();

        while (aux2 != null) {
            //sb.append(aux.publication).append("\n");
            //sb.append("\n" + Tela_Login.nome_para_tela).append(":");
	        sb2.append("").append(aux2.publication); //O primeiro sb.append("") é para posicionar aonde o nome do Usuário vai ficar 
	        aux2 = aux2.getProximo();
        }

        textArea_3.setText(sb2.toString());
    } 

    
    public void exibirPublicação_1() {
        Elementos aux1 = publicar1.primeiro;
        StringBuilder sb1 = new StringBuilder();

        while (aux1 != null) {
            //sb.append(aux.publication).append("\n");
            //sb.append("\n" + Tela_Login.nome_para_tela).append(":");
	        sb1.append("").append(aux1.publication); //O primeiro sb.append("") é para posicionar aonde o nome do Usuário vai ficar 
	        aux1 = aux1.getProximo();
        }

        txtrHellow.setText(sb1.toString());
    }
    
    public void exibirPublicação_2() {
        Elementos aux2 = publicar2.primeiro;
        StringBuilder sb2 = new StringBuilder();

        while (aux2 != null) {
            //sb.append(aux.publication).append("\n");
            //sb.append("\n" + Tela_Login.nome_para_tela).append(":");
	        sb2.append("").append(aux2.publication); //O primeiro sb.append("") é para posicionar aonde o nome do Usuário vai ficar 
	        aux2 = aux2.getProximo();
        }

        textArea_3_2.setText(sb2.toString());
    }
    
    public void exibirPublicação_3() {
        Elementos aux3 = publicar3.primeiro;
        StringBuilder sb3 = new StringBuilder();

        while (aux3 != null) {
            //sb.append(aux.publication).append("\n");
            //sb.append("\n" + Tela_Login.nome_para_tela).append(":");
	        sb3.append("").append(aux3.publication); //O primeiro sb.append("") é para posicionar aonde o nome do Usuário vai ficar 
	        aux3 = aux3.getProximo();
        }

        textArea_3_3.setText(sb3.toString());
    }
    
    
    
    public void remover(String novo) {
    	
    	if(listada.EncontrarPostagem(novo) == true) {
    		listada.remover(novo);
    	}else if(listada.EncontrarPostagem(novo) == false) {
    		JOptionPane.showMessageDialog(frame, "Postagem não encontrada");
    	}
    }
    


	
	/*  public void postagem() {
		  	
		    StringBuilder textoCompleto = new StringBuilder();
		   
		    for (String mensagem : mensagens) {
		    	textoCompleto.append("\n" + Tela_Login.nome_para_tela).append(":");
		        textoCompleto.append("\n\t").append(mensagem); // Adicione cada mensagem com um prefixo "\n\t"
		    }
		    textArea.setText(textoCompleto.toString());
		    
	}	*/
	
	public static void dispose() {
		// TODO Auto-generated method stub
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}

