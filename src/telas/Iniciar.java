package telas;

import java.awt.EventQueue;

import telas.Tela_Login;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

	
public class Iniciar {

	JFrame frame;
	static List_Usuarios list = new List_Usuarios(5);
	static Usuario user;

	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ListaEncadeada listada = new ListaEncadeada();	
					
					Home_admin home = new Home_admin(listada, list, user);
					
					Tela_Login log = new Tela_Login(list, user, home);
					
					log.main(null);
							
					Iniciar window = new Iniciar();
					window.frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public Iniciar() {
		

		initialize();
	}

	
	public void initialize() {
		frame = new JFrame();
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.setBounds(0, 0, 440, 270);
		btnNewButton.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {

				
			
			
			}
		});
		
		
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);
	}

}
