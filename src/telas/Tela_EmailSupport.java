package telas;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Cursor;

public class Tela_EmailSupport {

	public JFrame frame;
	private JTextField textField;
	
	static Home_admin homeadmin;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_EmailSupport window = new Tela_EmailSupport(homeadmin);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tela_EmailSupport(Home_admin homeadmin) {
		this.homeadmin = homeadmin;
		
		initialize();
	}

    JLabel lblNomeusuario = new JLabel("NomeUsuario");
    
    String selectedFilePath = null;
    JLabel lblAnexo = new JLabel("");
    JButton btnRemover = new JButton("");

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        frame.getContentPane().setFocusTraversalKeysEnabled(false);
        //frame.setBounds(600, 300, 699, 458);
        frame.setBounds(600, 274, 699, 458);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(26, 140, 644, 272);
        frame.getContentPane().add(scrollPane);
        
        JTextArea textArea = new JTextArea();
        textArea.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
        scrollPane.setViewportView(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true); 
        
        
        JButton btnEnviar = new JButton("Enviar");
        btnEnviar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnEnviar.setFont(new Font("Monospaced", Font.BOLD, 14));
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String emailEnviar = textArea.getText();
        		String assuntoEmail = textField.getText();
        		
        		String meuEmail = "samukaluka2003@gmail.com";
        		String minhaSenha = "k g f w f c y r h t m k v n y n";
        		
        		MultiPartEmail email = new MultiPartEmail();
        		email.setHostName("smtp.gmail.com");
        		email.setSmtpPort(465);
        		email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));
        		email.setSSLOnConnect(true);
        		try {
        			email.setFrom(meuEmail);
        			email.setSubject(assuntoEmail);
        			email.setMsg(emailEnviar);
        			email.addTo(meuEmail);
        			
        			if(selectedFilePath !=null && selectedFilePath.isEmpty() !=true) {
        			EmailAttachment anexo = new EmailAttachment();
        			anexo.setPath(selectedFilePath);
        			
        	        Path path = Paths.get(selectedFilePath);
        	        String nomeArquivo = path.getFileName().toString();
        	        String nomeSemExtensao = nomeArquivo.substring(0, nomeArquivo.lastIndexOf('.'));
        	        String extensao = nomeArquivo.substring(nomeArquivo.lastIndexOf('.') + 1);
        	        
        			anexo.setName(nomeSemExtensao + extensao);
        			email.attach(anexo);
        			email.send();
        			}else {
        				email.send();
        			}
        			
            		JOptionPane.showMessageDialog(null, "E-mail enviado com Sucesso!");
            		homeadmin.Desembacar();
            		frame.dispose();
        		}catch(Exception ei) {
        			ei.printStackTrace();
        			JOptionPane.showMessageDialog(null, "Algo deu Errado", "Atenção", JOptionPane.ERROR_MESSAGE);
        			
        		}
        		
        		
        		
        	}
        });
        btnEnviar.setBounds(549, 424, 117, 25);
        frame.getContentPane().add(btnEnviar);
        
        JButton btnFechar = new JButton("");
        btnFechar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnFechar.setContentAreaFilled(false);
        btnFechar.setBorderPainted(false);
        btnFechar.setIcon(new ImageIcon("/home/samuel/Downloads/X_vermelho-removebg-preview_resized.png"));
        btnFechar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		homeadmin.Desembacar();
        		frame.dispose();
        	}
        });
        btnFechar.setBounds(648, 2, 25, 25);
        frame.getContentPane().add(btnFechar);
        
        JLabel lblDe = new JLabel("De: ");
        lblDe.setFont(new Font("Dialog", Font.BOLD, 17));
        lblDe.setBounds(26, 41, 45, 31);
        frame.getContentPane().add(lblDe);
        
        JLabel lblPara = new JLabel("Para:");
        lblPara.setFont(new Font("Dialog", Font.BOLD, 17));
        lblPara.setBounds(26, 75, 70, 15);
        frame.getContentPane().add(lblPara);
        
        
        JLabel lblAssunto = new JLabel("Assunto:");
        lblAssunto.setFont(new Font("Dialog", Font.BOLD, 17));
        lblAssunto.setBounds(26, 118, 88, 15);
        frame.getContentPane().add(lblAssunto);
        
        textField = new JTextField();
        textField.setBorder(null);
        textField.setBackground(new Color(241, 241, 241));
        textField.setBounds(128, 116, 304, 19);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        
        lblNomeusuario.setBounds(79, 49, 218, 15);
        frame.getContentPane().add(lblNomeusuario);
        
        JLabel lblSuportefatecfatecspgovbr = new JLabel("suportefatec@fatec.sp.gov.br");
        lblSuportefatecfatecspgovbr.setBounds(84, 76, 224, 15);
        frame.getContentPane().add(lblSuportefatecfatecspgovbr);
        
        JLabel lblL = new JLabel("");
        lblL.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-12-03 22-23-25.png"));
        lblL.setBounds(0, 0, 699, 28);
        frame.getContentPane().add(lblL);
        
        JLabel lblLo = new JLabel("");
        lblLo.setIcon(new ImageIcon("/home/samuel/Downloads/ARCO (5).png"));
        lblLo.setBounds(116, 105, 342, 40);
        frame.getContentPane().add(lblLo);
        lblAnexo.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
        
        lblAnexo.setVisible(false);
        JButton btnAnexo = new JButton("");
        btnAnexo.setBorderPainted(false);
        btnAnexo.setContentAreaFilled(false);
        btnAnexo.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-12-04 09-17-10.png"));
        btnAnexo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnAnexo.addActionListener(new ActionListener() {
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
			            
			            Path path = Paths.get(selectedFilePath);
	        	        String nomeArquivo = path.getFileName().toString();
	        	        String nomeSemExtensao = nomeArquivo.substring(0, nomeArquivo.lastIndexOf('.'));
	        	        String extensao = nomeArquivo.substring(nomeArquivo.lastIndexOf('.') + 1);
	        	        
	        	        lblAnexo.setText(nomeSemExtensao+"."+ extensao);
	        	        lblAnexo.setVisible(true);
	        	        btnRemover.setVisible(true);
	        	        btnAnexo.setVisible(false);
			        }
			    } catch (IOException | InterruptedException ex) {
			        ex.printStackTrace();
			    }
        		
        	}
        });
        btnAnexo.setBounds(26, 412, 47, 38);
        frame.getContentPane().add(btnAnexo);
        btnRemover.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRemover.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		selectedFilePath = null;
        		btnAnexo.setVisible(true);
        		lblAnexo.setText("");
        		lblAnexo.setVisible(false);
        		btnRemover.setVisible(false);
        	}
        });
        
        btnRemover.setIcon(new ImageIcon("/home/samuel/Downloads/FecharX1.png"));
        btnRemover.setContentAreaFilled(false);
        btnRemover.setBorderPainted(false);
        btnRemover.setBounds(127, 413, 25, 25);
        frame.getContentPane().add(btnRemover);
        btnRemover.setVisible(false);
        
        
        lblAnexo.setBounds(24, 426, 117, 20);
        frame.getContentPane().add(lblAnexo);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/home/samuel/Pictures/Screenshot from 2023-08-19 09-58-19.jpg"));
        
	}
}
