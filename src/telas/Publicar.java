package telas;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;

public class Publicar extends JDialog{
	
    private JFrame frame;
    // Defina o segundo argumento como false para tornar a janela não modal

    private static Home_admin homeadmin;
    Tela_Login login;

    public String selectedFilePath;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {          	
                    Publicar window = new Publicar(homeadmin);
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
        });
    }

    JLabel lblFoto = new JLabel("");
    JLabel ppFoto = new JLabel("");
    
    public Publicar(Home_admin homeadmin) {
    	this.homeadmin = homeadmin;
		
    	this.homeadmin.contador = this.homeadmin.contador;
    	
    	initialize();
    	
    }
    
    
    private void initialize() {
    	
    	JButton btnF = new JButton("");	
    	btnF.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    	
    	//frame.toFront();

    	
        frame = new JFrame();
        frame.getContentPane().setFocusTraversalKeysEnabled(false);
        //frame.setBounds(600, 300, 699, 458);
        frame.setBounds(600, 274, 699, 458);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/home/samuel/Pictures/Screenshot from 2023-08-19 09-58-19.jpg"));

        
        JButton btnFechar = new JButton("");
        btnFechar.setBorderPainted(false);
        btnFechar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		if(homeadmin.contador == 0) {
            		homeadmin.lblPhoto.setVisible(true);
            		
            		homeadmin.lblPhoto.setIcon(new ImageIcon());
            		
                }
                if(homeadmin.contador == 1) {
                	homeadmin.lblPhoto_1.setIcon(new ImageIcon());
                	
                }
                if(homeadmin.contador == 2) {
                	homeadmin.lblPhoto_2.setIcon(new ImageIcon());
                }
                
        	     homeadmin.frame.setVisible(true);
                 homeadmin.Desembacar();
         		
                 frame.dispose(); 
        	}
        });
        
        
        btnFechar.setContentAreaFilled(false);
        btnFechar.setBorder(null);
        btnFechar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnFechar.setBounds(664, 6, 19, 20);
        frame.getContentPane().add(btnFechar);
        
        JLabel lblHhh = new JLabel("");
        lblHhh.setIcon(new ImageIcon("/home/samuel/Downloads/X_vermelho-removebg-preview_resized.png"));
        lblHhh.setBounds(661, 0, 22, 31);
        frame.getContentPane().add(lblHhh);
		
		
        
        JLabel lblPublic = new JLabel("");
        lblPublic.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-10-02 22-57-30.png"));
        lblPublic.setBounds(-7, -18, 730, 75);
        frame.getContentPane().add(lblPublic);

        JTextArea txtrEscrever = new JTextArea();
        txtrEscrever.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, new Color(0, 0, 0), null));
        txtrEscrever.setBackground(new Color(255, 255, 255));
        txtrEscrever.setFocusable(true);
        txtrEscrever.setText("Escrever...");
        txtrEscrever.setFont(new Font("Dialog", Font.PLAIN, 18));
        txtrEscrever.setBounds(12, 52, 675, 265);
        txtrEscrever.setForeground(Color.GRAY); 
        frame.getContentPane().add(txtrEscrever);
        txtrEscrever.setLineWrap(true); // Ativa a quebra de linha automática
        txtrEscrever.setWrapStyleWord(true); // Quebra a linha por palavras

        JButton btnNewButton = new JButton("Publicar");
        btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
        btnNewButton.setFont(new Font("Monospaced", Font.BOLD, 14));
        btnNewButton.setBackground(new Color(238,238,238));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {	
           		
        		String post = txtrEscrever.getText();
        		
        		
                //homeadmin.addMensagem(post);
                
           //     homeadmin.mensagens.add(post);
        		if(!post.equals("Escrever...")) {
                
                if(homeadmin.contador == 0) {
        		
                //homeadmin.listada.adicionar(login.nome_para_tela + ":" + "\n\t" + post + "\n", null);		//Este null é por conta de uma foto que eu iremos adicionar em cada postagem
                //homeadmin.exibirMensagensNaTextArea();
            /*    homeadmin.publicar1.adicionar("\n\t" + post + "\n", null);
                homeadmin.lblNomedopublicador_1.setText(homeadmin.login.nome_para_tela + " " + homeadmin.login.sobre_nome_tela);
                homeadmin.exibirPublicação_1();

                	*/
                	
                	homeadmin.txtrHellow.setText("\n    " + post);
                	homeadmin.lblNomedopublicador_1.setText(homeadmin.login.nome_para_tela + " " + homeadmin.login.sobre_nome_tela);
                	homeadmin.lblPhoto.setText("");
                }
                if(homeadmin.contador == 1) {
                	//homeadmin.listada2.adicionar(login.nome_para_tela + ":" + "\n\t" + post + "\n", null);
                	//homeadmin.exibirMensagensNaTextArea_1();
                	
                	
                /*	homeadmin.publicar2.adicionar("\n\t" + post + "\n", null);
                	homeadmin.lblNomedopublicador_2.setText(homeadmin.login.nome_para_tela + " " + homeadmin.login.sobre_nome_tela);
                	homeadmin.exibirPublicação_2();
                	
                	*/
                	homeadmin.textArea_3_2.setText("\n    " + post);
                	homeadmin.lblNomedopublicador_2.setText(homeadmin.login.nome_para_tela + " " + homeadmin.login.sobre_nome_tela);
                	homeadmin.lblPhoto_1.setText("");
                }
                if(homeadmin.contador == 2) {
                	//homeadmin.listada3.adicionar(login.nome_para_tela + ":" + "\n\t" + post + "\n", null);
                    //homeadmin.exibirMensagensNaTextArea_2();
                	
                /*	homeadmin.publicar3.adicionar("\n\t" + post + "\n", null);
                	homeadmin.lblNomedopublicador_3.setText(homeadmin.login.nome_para_tela + " " + homeadmin.login.sobre_nome_tela);
                	homeadmin.exibirPublicação_3();
                	*/
                	homeadmin.textArea_3_3.setText("\n    " + post);
                	homeadmin.lblNomedopublicador_3.setText(homeadmin.login.nome_para_tela + " " + homeadmin.login.sobre_nome_tela);
                	homeadmin.lblPhoto_2.setText("");
                }
        		}
        		if(lblFoto.isVisible() == false) {
	            	if(homeadmin.contador == 0) {
	            		homeadmin.lblPhoto.setVisible(false);
	            		homeadmin.lblNomedopublicador_1.setBounds(191,21,201,15);
	            		homeadmin.txtrHellow.setBounds(156,48,271,314);
	                }
	                if(homeadmin.contador == 1) {
	                	homeadmin.lblPhoto_1.setVisible(false);
	                	homeadmin.lblNomedopublicador_2.setBounds(191,21,201,15);
	                	homeadmin.textArea_3_2.setBounds(156,48,271,314);
	                }
	                if(homeadmin.contador == 2) {
	                	homeadmin.lblPhoto_2.setVisible(false);
	                	homeadmin.lblNomedopublicador_3.setBounds(191,21,201,15);
	                	homeadmin.textArea_3_3.setBounds(156,48,271,314);
	                }
        		}
               // homeadmin.postagem();
                
                homeadmin.frame.setVisible(true);
                homeadmin.Desembacar();
                
                ppFoto.setVisible(false);
        		
                frame.dispose(); 
        		
        	
        	}
        });
        
        
        
        JButton btnPhoto = new JButton("");
        btnPhoto.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-11-25 19-40-02.png"));
        btnPhoto.addActionListener(new ActionListener() {
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
			                
			            	if(homeadmin.contador == 0) {
			            		homeadmin.lblPhoto.setVisible(true);
			            		
			            		homeadmin.lblPhoto.setIcon(new ImageIcon(selectedFilePath));
			            		homeadmin.lblPhoto.setText("");
			            		
		                    }
		                    if(homeadmin.contador == 1) {
		                    	homeadmin.lblPhoto_1.setIcon(new ImageIcon(selectedFilePath));
		                    	homeadmin.lblPhoto_1.setText("");
		                    }
		                    if(homeadmin.contador == 2) {
		                    	homeadmin.lblPhoto_2.setIcon(new ImageIcon(selectedFilePath));
		                    	homeadmin.lblPhoto_2.setText("");
		                    }
			                try {
			                    // Carrega a imagem do arquivo
			                    BufferedImage originalImage = ImageIO.read(new File(selectedFilePath));

			                    // Redimensiona a imagem para um tamanho específico (por exemplo, 200x200)
			                    int newWidth = 100;
			                    int newHeight = 100;
			                    Image scaledImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);

			                    // Atribui a imagem redimensionada à JLabel
			                    lblFoto.setIcon(new ImageIcon(scaledImage));
			                    
			                } catch (IOException ei) {
			                    ei.printStackTrace();
			                }
		                    
		                    lblFoto.setVisible(true);
		                    //lblFoto.setIcon(new ImageIcon(selectedFilePath));
		                    btnPhoto.setVisible(false);
		                    
		                    if(lblFoto.isVisible() == true) {
		                    	ppFoto.setVisible(true);
		                    	btnF.setVisible(true);
		                    }

			                

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
        btnPhoto.setBounds(38, 411, 197, 35);
        frame.getContentPane().add(btnPhoto);
        btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnNewButton.setBounds(566, 421, 117, 25);
        frame.getContentPane().add(btnNewButton);
        		

                JButton btnCancelar = new JButton("Cancelar");
                btnCancelar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
                btnCancelar.setFont(new Font("Monospaced", Font.BOLD, 14));
                btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                btnCancelar.setBackground(new Color(238,238,238));
                btnCancelar.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {	
                		
                		if(txtrEscrever.equals(null) || txtrEscrever.equals("")) {
                        	txtrEscrever.setText("Escrever...");
                        	txtrEscrever.setForeground(Color.GRAY);
                        	
                        }
                		
                		if(homeadmin.contador == 0) {
                    		homeadmin.lblPhoto.setVisible(true);
                    		
                    		homeadmin.lblPhoto.setIcon(new ImageIcon());
                    		
                        }
                        if(homeadmin.contador == 1) {
                        	homeadmin.lblPhoto_1.setIcon(new ImageIcon());
                        	
                        }
                        if(homeadmin.contador == 2) {
                        	homeadmin.lblPhoto_2.setIcon(new ImageIcon());
                        }
                		
                		btnF.setVisible(false);
                	}
                });
                btnCancelar.setBounds(437, 421, 117, 25);
                frame.getContentPane().add(btnCancelar);
                
                
                btnF.setVisible(false);
                btnF.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		ppFoto.setVisible(false);
                		btnF.setVisible(true);
                		
                		if(homeadmin.contador == 0) {
                			homeadmin.lblPhoto.setText("Publicação Vazia");
                			homeadmin.lblPhoto.setIcon(new ImageIcon());
                		}if(homeadmin.contador ==1) {
                			homeadmin.lblPhoto_1.setText("Publicação Vazia");
                			homeadmin.lblPhoto_1.setIcon(new ImageIcon());
                		}if(homeadmin.contador ==2) {
                			homeadmin.lblPhoto_2.setText("Publicação Vazia");
                			homeadmin.lblPhoto_2.setIcon(new ImageIcon());
                		}
                		
                		lblFoto.setIcon(new ImageIcon(""));
                		lblFoto.setVisible(false);
                		btnF.setVisible(false);
                		btnPhoto.setVisible(true);
                	}
                });
                btnF.setBackground(new Color(241,241,241));
                btnF.setContentAreaFilled(false);
                btnF.setBorder(null);
                btnF.setIcon(new ImageIcon("/home/samuel/Downloads/FecharX1.png"));
                btnF.setBounds(110, 321, 23, 20);
                frame.getContentPane().add(btnF);
                lblFoto.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
                
                lblFoto.setVisible(false);
                
                
                lblFoto.setBounds(41, 329, 84, 54);
                frame.getContentPane().add(lblFoto);
                ppFoto.setBorder(null);
                ppFoto.setIcon(new ImageIcon("/home/samuel/Downloads/Simbolo_de_+2.png"));
                ppFoto.setVisible(false);
                
                
                ppFoto.setBounds(145, 338, 49, 35);
                frame.getContentPane().add(ppFoto);
                
                JButton btnFoco = new JButton("");
                btnFoco.setBorder(null);
                btnFoco.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                btnFoco.setContentAreaFilled(false);
                
                        
                        
                        btnFoco.setBounds(0, 0, 699, 458);
                        frame.getContentPane().add(btnFoco);
                
       
                btnFoco.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                        frame.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                txtrEscrever.requestFocusInWindow();
                                
                                String obj = "";
						if(txtrEscrever.equals(null) || txtrEscrever.equals(obj)) {
                                	txtrEscrever.setText("Escrever...");
                                	txtrEscrever.setForeground(Color.GRAY);
                                	
                                }
                                
                                
                            }
                        });
                		
                		
                	}
                });
        frame.setUndecorated(true);
        
        txtrEscrever.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtrEscrever.getText().equals("Escrever...")) {
                	txtrEscrever.setText("");
                	txtrEscrever.setForeground(Color.BLACK); // Altera a cor do texto para preto
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtrEscrever.getText().isEmpty()) {
                	txtrEscrever.setText("Escrever...");
                	txtrEscrever.setForeground(Color.GRAY); // Restaura a cor do texto para cinza
                }
            }
        });
        
        

        txtrEscrever.requestFocusInWindow(); 
        
        // Adicionar um ouvinte de clique à JFrame para fazer a JTextArea perder o foco
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtrEscrever.requestFocusInWindow(); // Faz a JTextArea perder o foco
            }
        });

        // Adicionar um ouvinte de foco à JTextArea para limpar o texto quando selecionado
        txtrEscrever.addFocusListener(new FocusAdapter() {
            private boolean firstFocusGained = false;
            


            @Override
            public void focusGained(FocusEvent e) {
                if (!firstFocusGained) {
                    txtrEscrever.setText("");
                    firstFocusGained = true;
                }
            }
        });
    
    
    
    }
}
