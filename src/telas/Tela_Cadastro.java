package telas;

import telas.Cadastro;
import java.util.Calendar;

import java.util.ArrayList;
import java.util.List;

import javax.swing.SwingUtilities;

import telas.Tela_Login;


import java.lang.*;
import telas.Encapsulamento;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;

import telas.List_Usuarios;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Cursor;
import javax.swing.DebugGraphics;

public class Tela_Cadastro {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField password_1;
	
	//Array para métodos do usuario
	
	public List<Usuario> List_Usuarios;
	static List_Usuarios list;
    private CadastroUsuarios cadastroUsuarios;
    
    Tela_Login login;

    
public Tela_Cadastro(List_Usuarios list) {
		
    	this.list = list;

		
		initialize();
		

	}
    

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Tela_Cadastro window = new Tela_Cadastro(list);

					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	


	void initialize() {
		
        cadastroUsuarios = new CadastroUsuarios(); // Inicialize o objeto CadastroUsuarios
        
	
		frame = new JFrame();
		frame.getContentPane().setName("1\n2\n3\n");
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(241, 241, 241));
		frame.getContentPane().setLayout(null);
		
		
		//Botões de genero
		
		JLabel lblMasc = new JLabel("");
		lblMasc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblMasc.setIcon(new ImageIcon("/home/samuel/Desktop/.masculino_selecionado.png"));
		lblMasc.setBounds(501, 334, 164, 55);
		lblMasc.setVisible(false);
		frame.getContentPane().add(lblMasc);
		
		JLabel lblmasc_desativado = new JLabel("");
		lblmasc_desativado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblmasc_desativado.setIcon(new ImageIcon("/home/samuel/Desktop/.Select_masculino.png"));
		lblmasc_desativado.setBounds(501, 336, 164, 50);
		frame.getContentPane().add(lblmasc_desativado);
		
		JLabel lblFem = new JLabel("");
		lblFem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFem.setIcon(new ImageIcon("/home/samuel/Desktop/.Feminino_selecionado.png"));
		lblFem.setBounds(669, 335, 164, 50);
		lblFem.setVisible(false);
		frame.getContentPane().add(lblFem);
		
		JLabel lblFemi = new JLabel("");
		lblFemi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblFemi.setIcon(new ImageIcon("/home/samuel/Desktop/.Select_feminino.png"));
		lblFemi.setBounds(669, 335, 164, 50);
		frame.getContentPane().add(lblFemi);
				
		
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnFeminino.setBorder(null);
		rdbtnFeminino.setContentAreaFilled(false);
		rdbtnFeminino.setBounds(682, 344, 137, 34);
		frame.getContentPane().add(rdbtnFeminino);
		
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setContentAreaFilled(false);
		rdbtnMasculino.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		rdbtnMasculino.setBorder(null);
		rdbtnMasculino.setBackground(new Color(184, 207, 229));
		rdbtnMasculino.setBounds(516, 344, 135, 32);
		frame.getContentPane().add(rdbtnMasculino);
		
		

		
		
		//DIA
		JLabel lblDay = new JLabel("");
		lblDay.setIcon(new ImageIcon("/home/samuel/Desktop/.Dia.png"));
		lblDay.setBounds(505, 244, 118, 50);
		lblDay.setVisible(true);
		frame.getContentPane().add(lblDay);
		
		

		//numero 1
		JLabel lblNum = new JLabel("");
		lblNum.setIcon(new ImageIcon("/home/samuel/Desktop/.num/1.png"));
		lblNum.setBounds(505, 244, 118, 50);
		lblNum.setVisible(false);
		frame.getContentPane().add(lblNum);
		
		//numero 2
		JLabel lblNum2 = new JLabel("");
		lblNum2.setIcon(new ImageIcon("/home/samuel/Desktop/.num/2.png"));
		lblNum2.setBounds(505, 244, 118, 50);
		lblNum2.setVisible(false);
		frame.getContentPane().add(lblNum2);
		
		//numero 3
		JLabel lblNum3 = new JLabel("");
		lblNum3.setIcon(new ImageIcon("/home/samuel/Desktop/.num/3.png"));
		lblNum3.setBounds(505, 244, 118, 50);
		lblNum3.setVisible(false);
		frame.getContentPane().add(lblNum3);
		

		//numero 4
		JLabel lblNum4 = new JLabel("");
		lblNum4.setIcon(new ImageIcon("/home/samuel/Desktop/.num/4.png"));
		lblNum4.setBounds(505, 244, 118, 50);
		lblNum4.setVisible(false);
		frame.getContentPane().add(lblNum4);
		

		//numero 5
		JLabel lblNum5 = new JLabel("");
		lblNum5.setIcon(new ImageIcon("/home/samuel/Desktop/.num/5.png"));
		lblNum5.setBounds(505, 244, 118, 50);
		lblNum5.setVisible(false);
		frame.getContentPane().add(lblNum5);
		

		//numero 6
		JLabel lblNum6 = new JLabel("");
		lblNum6.setIcon(new ImageIcon("/home/samuel/Desktop/.num/6.png"));
		lblNum6.setBounds(505, 244, 118, 50);
		lblNum6.setVisible(false);
		frame.getContentPane().add(lblNum6);

		//numero 7
		JLabel lblNum7 = new JLabel("");
		lblNum7.setIcon(new ImageIcon("/home/samuel/Desktop/.num/7.png"));
		lblNum7.setBounds(505, 244, 118, 50);
		lblNum7.setVisible(false);
		frame.getContentPane().add(lblNum7);
		

		//numero 8
		JLabel lblNum8 = new JLabel("");
		lblNum8.setIcon(new ImageIcon("/home/samuel/Desktop/.num/8.png"));
		lblNum8.setBounds(505, 244, 118, 50);
		lblNum8.setVisible(false);
		frame.getContentPane().add(lblNum8);
		

		//numero 9
		JLabel lblNum9 = new JLabel("");
		lblNum9.setIcon(new ImageIcon("/home/samuel/Desktop/.num/9.png"));
		lblNum9.setBounds(505, 244, 118, 50);
		lblNum9.setVisible(false);
		frame.getContentPane().add(lblNum9);
		
		//numero 10
		JLabel lblNum10 = new JLabel("");
		lblNum10.setIcon(new ImageIcon("/home/samuel/Desktop/.num/10.png"));
		lblNum10.setBounds(505, 244, 118, 50);
		lblNum10.setVisible(false);
		frame.getContentPane().add(lblNum10);
				
		//numero 11
		JLabel lblNum11 = new JLabel("");
		lblNum11.setIcon(new ImageIcon("/home/samuel/Desktop/.num/11.png"));
		lblNum11.setBounds(505, 244, 118, 50);
		lblNum11.setVisible(false);
		frame.getContentPane().add(lblNum11);				
		
		//numero 12
		JLabel lblNum12 = new JLabel("");
		lblNum12.setIcon(new ImageIcon("/home/samuel/Desktop/.num/12.png"));
		lblNum12.setBounds(505, 244, 118, 50);
		lblNum12.setVisible(false);
		frame.getContentPane().add(lblNum12);
		
		//numero 13
		JLabel lblNum13 = new JLabel("");
		lblNum13.setIcon(new ImageIcon("/home/samuel/Desktop/.num/13.png"));
		lblNum13.setBounds(505, 244, 118, 50);
		lblNum13.setVisible(false);
		frame.getContentPane().add(lblNum13);		

		//numero 14
		JLabel lblNum14 = new JLabel("");
		lblNum14.setIcon(new ImageIcon("/home/samuel/Desktop/.num/14.png"));
		lblNum14.setBounds(505, 244, 118, 50);
		lblNum14.setVisible(false);
		frame.getContentPane().add(lblNum14);
		
		//numero 15
		JLabel lblNum15 = new JLabel("");
		lblNum15.setIcon(new ImageIcon("/home/samuel/Desktop/.num/15.png"));
		lblNum15.setBounds(505, 244, 118, 50);
		lblNum15.setVisible(false);
		frame.getContentPane().add(lblNum15);
	
		//numero 16
		JLabel lblNum16 = new JLabel("");
		lblNum16.setIcon(new ImageIcon("/home/samuel/Desktop/.num/16.png"));
		lblNum16.setBounds(505, 244, 118, 50);
		lblNum16.setVisible(false);
		frame.getContentPane().add(lblNum16);
		
		//numero 17
		JLabel lblNum17 = new JLabel("");
		lblNum17.setIcon(new ImageIcon("/home/samuel/Desktop/.num/17.png"));
		lblNum17.setBounds(505, 244, 118, 50);
		lblNum17.setVisible(false);
		frame.getContentPane().add(lblNum17);
		
		//numero 18
		JLabel lblNum18 = new JLabel("");
		lblNum18.setIcon(new ImageIcon("/home/samuel/Desktop/.num/18.png"));
		lblNum18.setBounds(505, 244, 118, 50);
		lblNum18.setVisible(false);
		frame.getContentPane().add(lblNum18);
		
		//numero 19
		JLabel lblNum19 = new JLabel("");
		lblNum19.setIcon(new ImageIcon("/home/samuel/Desktop/.num/19.png"));
		lblNum19.setBounds(505, 244, 118, 50);
		lblNum19.setVisible(false);
		frame.getContentPane().add(lblNum19);
		
		//numero 20
		JLabel lblNum20 = new JLabel("");
		lblNum20.setIcon(new ImageIcon("/home/samuel/Desktop/.num/20.png"));
		lblNum20.setBounds(505, 244, 118, 50);
		lblNum20.setVisible(false);
		frame.getContentPane().add(lblNum20);
		
		//numero 21
		JLabel lblNum21 = new JLabel("");
		lblNum21.setIcon(new ImageIcon("/home/samuel/Desktop/.num/21.png"));
		lblNum21.setBounds(505, 244, 118, 50);
		lblNum21.setVisible(false);
		frame.getContentPane().add(lblNum21);
		
		//numero 22
		JLabel lblNum22 = new JLabel("");
		lblNum22.setIcon(new ImageIcon("/home/samuel/Desktop/.num/22.png"));
		lblNum22.setBounds(505, 244, 118, 50);
		lblNum22.setVisible(false);
		frame.getContentPane().add(lblNum22);
		
		//numero 23
		JLabel lblNum23 = new JLabel("");
		lblNum23.setIcon(new ImageIcon("/home/samuel/Desktop/.num/23.png"));
		lblNum23.setBounds(505, 244, 118, 50);
		lblNum23.setVisible(false);
		frame.getContentPane().add(lblNum23);
	
		//numero 24
		JLabel lblNum24 = new JLabel("");
		lblNum24.setIcon(new ImageIcon("/home/samuel/Desktop/.num/24.png"));
		lblNum24.setBounds(505, 244, 118, 50);
		lblNum24.setVisible(false);
		frame.getContentPane().add(lblNum24);
		
		//numero 25
		JLabel lblNum25 = new JLabel("");
		lblNum25.setIcon(new ImageIcon("/home/samuel/Desktop/.num/25.png"));
		lblNum25.setBounds(505, 244, 118, 50);
		lblNum25.setVisible(false);
		frame.getContentPane().add(lblNum25);
		
		//numero 26
		JLabel lblNum26 = new JLabel("");
		lblNum26.setIcon(new ImageIcon("/home/samuel/Desktop/.num/26.png"));
		lblNum26.setBounds(505, 244, 118, 50);
		lblNum26.setVisible(false);
		frame.getContentPane().add(lblNum26);
		
		//numero 27
		JLabel lblNum27 = new JLabel("");
		lblNum27.setIcon(new ImageIcon("/home/samuel/Desktop/.num/27.png"));
		lblNum27.setBounds(505, 244, 118, 50);
		lblNum27.setVisible(false);
		frame.getContentPane().add(lblNum27);
		
		//numero 28
		JLabel lblNum28 = new JLabel("");
		lblNum28.setIcon(new ImageIcon("/home/samuel/Desktop/.num/28.png"));
		lblNum28.setBounds(505, 244, 118, 50);
		lblNum28.setVisible(false);
		frame.getContentPane().add(lblNum28);
		
		//numero 29
		JLabel lblNum29 = new JLabel("");
		lblNum29.setIcon(new ImageIcon("/home/samuel/Desktop/.num/29.png"));
		lblNum29.setBounds(505, 244, 118, 50);
		lblNum29.setVisible(false);
		frame.getContentPane().add(lblNum29);
		
		//numero 30
		JLabel lblNum30 = new JLabel("");
		lblNum30.setIcon(new ImageIcon("/home/samuel/Desktop/.num/30.png"));
		lblNum30.setBounds(505, 244, 118, 50);
		lblNum30.setVisible(false);
		frame.getContentPane().add(lblNum30);
		
		//numero 31
		JLabel lblNum31 = new JLabel("");
		lblNum31.setIcon(new ImageIcon("/home/samuel/Desktop/.num/31.png"));
		lblNum31.setBounds(505, 244, 118, 50);
		lblNum31.setVisible(false);
		frame.getContentPane().add(lblNum31);
		
		
		JButton button = new JButton("");
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setContentAreaFilled(false);
		button.setBorder(null);
		button.setBounds(825, 56, 108, 34);
		frame.getContentPane().add(button);
		frame.setBackground(new Color(119, 118, 123));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				
				//login.frame.setVisible(true);
				
				Tela_Login.main(null);
				frame.dispose();
				
			//	frame.dispose();	
				
			//	frame.setEnabled(false);
				
			
				
				}
			});
		
		
		
		// icone do Programa
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/home/samuel/Pictures/Screenshot from 2023-08-19 09-58-19.jpg"));
		frame.setBounds(500, 250, 955, 586);
		
		// ESSA FUNÇÃO PARA DEIXAR A TELAS MAXIMIZADA
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
		JLabel lblYear = new JLabel("");
		lblYear.setIcon(new ImageIcon("/home/samuel/Desktop/.Ano.png"));
		lblYear.setBounds(726, 245, 108, 50);
		lblYear.setVisible(true);
		frame.getContentPane().add(lblYear);
		
		JLabel lblYear_2023 = new JLabel("");
		lblYear_2023.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2023.png"));
		lblYear_2023.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2023);

		JLabel lblYear_2022 = new JLabel("");
		lblYear_2022.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2022.png"));
		lblYear_2022.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2022);

		JLabel lblYear_2021 = new JLabel("");
		lblYear_2021.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2021.png"));
		lblYear_2021.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2021);

		JLabel lblYear_2020 = new JLabel("");
		lblYear_2020.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2020.png"));
		lblYear_2020.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2020);

		JLabel lblYear_2019 = new JLabel("");
		lblYear_2019.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2019.png"));
		lblYear_2019.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2019);

		JLabel lblYear_2018 = new JLabel("");
		lblYear_2018.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2018.png"));
		lblYear_2018.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2018);

		JLabel lblYear_2017 = new JLabel("");
		lblYear_2017.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2017.png"));
		lblYear_2017.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2017);

		JLabel lblYear_2016 = new JLabel("");
		lblYear_2016.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2016.png"));
		lblYear_2016.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2016);

		JLabel lblYear_2015 = new JLabel("");
		lblYear_2015.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2015.png"));
		lblYear_2015.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2015);

		JLabel lblYear_2014 = new JLabel("");
		lblYear_2014.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2014.png"));
		lblYear_2014.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2014);

		JLabel lblYear_2013 = new JLabel("");
		lblYear_2013.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2013.png"));
		lblYear_2013.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2013);

		JLabel lblYear_2012 = new JLabel("");
		lblYear_2012.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2012.png"));
		lblYear_2012.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2012);

		JLabel lblYear_2011 = new JLabel("");
		lblYear_2011.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2011.png"));
		lblYear_2011.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2011);

		JLabel lblYear_2010 = new JLabel("");
		lblYear_2010.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2010.png"));
		lblYear_2010.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2010);

		JLabel lblYear_2009 = new JLabel("");
		lblYear_2009.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2009.png"));
		lblYear_2009.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2009);

		JLabel lblYear_2008 = new JLabel("");
		lblYear_2008.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2008.png"));
		lblYear_2008.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2008);

		JLabel lblYear_2007 = new JLabel("");
		lblYear_2007.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2007.png"));
		lblYear_2007.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2007);

		JLabel lblYear_2006 = new JLabel("");
		lblYear_2006.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2006.png"));
		lblYear_2006.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2006);

		JLabel lblYear_2005 = new JLabel("");
		lblYear_2005.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2005.png"));
		lblYear_2005.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2005);

		JLabel lblYear_2004 = new JLabel("");
		lblYear_2004.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2004.png"));
		lblYear_2004.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2004);

		JLabel lblYear_2003 = new JLabel("");
		lblYear_2003.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2003.png"));
		lblYear_2003.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2003);

		JLabel lblYear_2002 = new JLabel("");
		lblYear_2002.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2002.png"));
		lblYear_2002.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2002);

		JLabel lblYear_2001 = new JLabel("");
		lblYear_2001.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2001.png"));
		lblYear_2001.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2001);

		JLabel lblYear_2000 = new JLabel("");
		lblYear_2000.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/2000.png"));
		lblYear_2000.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_2000);

		JLabel lblYear_1999 = new JLabel("");
		lblYear_1999.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1999.png"));
		lblYear_1999.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1999);

		JLabel lblYear_1998 = new JLabel("");
		lblYear_1998.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1998.png"));
		lblYear_1998.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1998);

		JLabel lblYear_1997 = new JLabel("");
		lblYear_1997.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1997.png"));
		lblYear_1997.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1997);

		JLabel lblYear_1996 = new JLabel("");
		lblYear_1996.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1996.png"));
		lblYear_1996.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1996);

		JLabel lblYear_1995 = new JLabel("");
		lblYear_1995.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1995.png"));
		lblYear_1995.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1995);

		JLabel lblYear_1994 = new JLabel("");
		lblYear_1994.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1994.png"));
		lblYear_1994.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1994);

		JLabel lblYear_1993 = new JLabel("");
		lblYear_1993.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1993.png"));
		lblYear_1993.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1993);

		JLabel lblYear_1992 = new JLabel("");
		lblYear_1992.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1992.png"));
		lblYear_1992.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1992);

		JLabel lblYear_1991 = new JLabel("");
		lblYear_1991.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1991.png"));
		lblYear_1991.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1991);

		JLabel lblYear_1990 = new JLabel("");
		lblYear_1990.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1990.png"));
		lblYear_1990.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1990);

		JLabel lblYear_1989 = new JLabel("");
		lblYear_1989.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1989.png"));
		lblYear_1989.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1989);

		JLabel lblYear_1988 = new JLabel("");
		lblYear_1988.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1988.png"));
		lblYear_1988.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1988);

		JLabel lblYear_1987 = new JLabel("");
		lblYear_1987.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1987.png"));
		lblYear_1987.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1987);

		JLabel lblYear_1986 = new JLabel("");
		lblYear_1986.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1986.png"));
		lblYear_1986.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1986);

		JLabel lblYear_1985 = new JLabel("");
		lblYear_1985.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1985.png"));
		lblYear_1985.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1985);

		JLabel lblYear_1984 = new JLabel("");
		lblYear_1984.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1984.png"));
		lblYear_1984.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1984);

		JLabel lblYear_1983 = new JLabel("");
		lblYear_1983.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1983.png"));
		lblYear_1983.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1983);

		JLabel lblYear_1982 = new JLabel("");
		lblYear_1982.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1982.png"));
		lblYear_1982.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1982);

		JLabel lblYear_1981 = new JLabel("");
		lblYear_1981.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1981.png"));
		lblYear_1981.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1981);

		JLabel lblYear_1980 = new JLabel("");
		lblYear_1980.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1980.png"));
		lblYear_1980.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1980);

		JLabel lblYear_1979 = new JLabel("");
		lblYear_1979.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1979.png"));
		lblYear_1979.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1979);

		JLabel lblYear_1978 = new JLabel("");
		lblYear_1978.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1978.png"));
		lblYear_1978.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1978);

		JLabel lblYear_1977 = new JLabel("");
		lblYear_1977.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1977.png"));
		lblYear_1977.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1977);

		JLabel lblYear_1976 = new JLabel("");
		lblYear_1976.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1976.png"));
		lblYear_1976.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1976);

		JLabel lblYear_1975 = new JLabel("");
		lblYear_1975.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1975.png"));
		lblYear_1975.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1975);

		JLabel lblYear_1974 = new JLabel("");
		lblYear_1974.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1974.png"));
		lblYear_1974.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1974);

		JLabel lblYear_1973 = new JLabel("");
		lblYear_1973.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1973.png"));
		lblYear_1973.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1973);

		JLabel lblYear_1972 = new JLabel("");
		lblYear_1972.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1972.png"));
		lblYear_1972.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1972);

		JLabel lblYear_1971 = new JLabel("");
		lblYear_1971.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1971.png"));
		lblYear_1971.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1971);

		JLabel lblYear_1970 = new JLabel("");
		lblYear_1970.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1970.png"));
		lblYear_1970.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1970);

		JLabel lblYear_1969 = new JLabel("");
		lblYear_1969.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1969.png"));
		lblYear_1969.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1969);

		JLabel lblYear_1968 = new JLabel("");
		lblYear_1968.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1968.png"));
		lblYear_1968.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1968);

		JLabel lblYear_1967 = new JLabel("");
		lblYear_1967.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1967.png"));
		lblYear_1967.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1967);

		JLabel lblYear_1966 = new JLabel("");
		lblYear_1966.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1966.png"));
		lblYear_1966.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1966);

		JLabel lblYear_1965 = new JLabel("");
		lblYear_1965.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1965.png"));
		lblYear_1965.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1965);

		JLabel lblYear_1964 = new JLabel("");
		lblYear_1964.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1964.png"));
		lblYear_1964.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1964);

		JLabel lblYear_1963 = new JLabel("");
		lblYear_1963.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1963.png"));
		lblYear_1963.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1963);

		JLabel lblYear_1962 = new JLabel("");
		lblYear_1962.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1962.png"));
		lblYear_1962.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1962);

		JLabel lblYear_1961 = new JLabel("");
		lblYear_1961.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1961.png"));
		lblYear_1961.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1961);

		JLabel lblYear_1960 = new JLabel("");
		lblYear_1960.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1960.png"));
		lblYear_1960.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1960);

		JLabel lblYear_1959 = new JLabel("");
		lblYear_1959.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1959.png"));
		lblYear_1959.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1959);

		JLabel lblYear_1958 = new JLabel("");
		lblYear_1958.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1958.png"));
		lblYear_1958.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1958);

		JLabel lblYear_1957 = new JLabel("");
		lblYear_1957.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1957.png"));
		lblYear_1957.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1957);

		JLabel lblYear_1956 = new JLabel("");
		lblYear_1956.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1956.png"));
		lblYear_1956.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1956);

		JLabel lblYear_1955 = new JLabel("");
		lblYear_1955.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1955.png"));
		lblYear_1955.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1955);

		JLabel lblYear_1954 = new JLabel("");
		lblYear_1954.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1954.png"));
		lblYear_1954.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1954);

		JLabel lblYear_1953 = new JLabel("");
		lblYear_1953.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1953.png"));
		lblYear_1953.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1953);

		JLabel lblYear_1952 = new JLabel("");
		lblYear_1952.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1952.png"));
		lblYear_1952.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1952);

		JLabel lblYear_1951 = new JLabel("");
		lblYear_1951.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1951.png"));
		lblYear_1951.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1951);

		JLabel lblYear_1950 = new JLabel("");
		lblYear_1950.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1950.png"));
		lblYear_1950.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1950);

		JLabel lblYear_1949 = new JLabel("");
		lblYear_1949.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1949.png"));
		lblYear_1949.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1949);

		JLabel lblYear_1948 = new JLabel("");
		lblYear_1948.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1948.png"));
		lblYear_1948.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1948);

		JLabel lblYear_1947 = new JLabel("");
		lblYear_1947.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1947.png"));
		lblYear_1947.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1947);

		JLabel lblYear_1946 = new JLabel("");
		lblYear_1946.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1946.png"));
		lblYear_1946.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1946);

		JLabel lblYear_1945 = new JLabel("");
		lblYear_1945.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1945.png"));
		lblYear_1945.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1945);

		JLabel lblYear_1944 = new JLabel("");
		lblYear_1944.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1944.png"));
		lblYear_1944.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1944);

		JLabel lblYear_1943 = new JLabel("");
		lblYear_1943.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1943.png"));
		lblYear_1943.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1943);

		JLabel lblYear_1942 = new JLabel("");
		lblYear_1942.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1942.png"));
		lblYear_1942.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1942);

		JLabel lblYear_1941 = new JLabel("");
		lblYear_1941.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1941.png"));
		lblYear_1941.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1941);

		JLabel lblYear_1940 = new JLabel("");
		lblYear_1940.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1940.png"));
		lblYear_1940.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1940);

		JLabel lblYear_1939 = new JLabel("");
		lblYear_1939.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1939.png"));
		lblYear_1939.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1939);

		JLabel lblYear_1938 = new JLabel("");
		lblYear_1938.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1938.png"));
		lblYear_1938.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1938);

		JLabel lblYear_1937 = new JLabel("");
		lblYear_1937.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1937.png"));
		lblYear_1937.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1937);

		JLabel lblYear_1936 = new JLabel("");
		lblYear_1936.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1936.png"));
		lblYear_1936.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1936);

		JLabel lblYear_1935 = new JLabel("");
		lblYear_1935.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1935.png"));
		lblYear_1935.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1935);

		JLabel lblYear_1934 = new JLabel("");
		lblYear_1934.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1934.png"));
		lblYear_1934.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1934);

		JLabel lblYear_1933 = new JLabel("");
		lblYear_1933.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1933.png"));
		lblYear_1933.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1933);

		JLabel lblYear_1932 = new JLabel("");
		lblYear_1932.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1932.png"));
		lblYear_1932.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1932);

		JLabel lblYear_1931 = new JLabel("");
		lblYear_1931.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1931.png"));
		lblYear_1931.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1931);

		JLabel lblYear_1930 = new JLabel("");
		lblYear_1930.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1930.png"));
		lblYear_1930.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1930);

		JLabel lblYear_1929 = new JLabel("");
		lblYear_1929.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1929.png"));
		lblYear_1929.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1929);

		JLabel lblYear_1928 = new JLabel("");
		lblYear_1928.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1928.png"));
		lblYear_1928.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1928);

		JLabel lblYear_1927 = new JLabel("");
		lblYear_1927.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1927.png"));
		lblYear_1927.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1927);

		JLabel lblYear_1926 = new JLabel("");
		lblYear_1926.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1926.png"));
		lblYear_1926.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1926);

		JLabel lblYear_1925 = new JLabel("");
		lblYear_1925.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1925.png"));
		lblYear_1925.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1925);

		JLabel lblYear_1924 = new JLabel("");
		lblYear_1924.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1924.png"));
		lblYear_1924.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1924);

		JLabel lblYear_1923 = new JLabel("");
		lblYear_1923.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1923.png"));
		lblYear_1923.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1923);

		JLabel lblYear_1922 = new JLabel("");
		lblYear_1922.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1922.png"));
		lblYear_1922.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1922);

		JLabel lblYear_1921 = new JLabel("");
		lblYear_1921.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1921.png"));
		lblYear_1921.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1921);

		JLabel lblYear_1920 = new JLabel("");
		lblYear_1920.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1920.png"));
		lblYear_1920.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1920);

		JLabel lblYear_1919 = new JLabel("");
		lblYear_1919.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1919.png"));
		lblYear_1919.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1919);

		JLabel lblYear_1918 = new JLabel("");
		lblYear_1918.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1918.png"));
		lblYear_1918.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1918);

		JLabel lblYear_1917 = new JLabel("");
		lblYear_1917.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1917.png"));
		lblYear_1917.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1917);

		JLabel lblYear_1916 = new JLabel("");
		lblYear_1916.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1916.png"));
		lblYear_1916.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1916);

		JLabel lblYear_1915 = new JLabel("");
		lblYear_1915.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1915.png"));
		lblYear_1915.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1915);

		JLabel lblYear_1914 = new JLabel("");
		lblYear_1914.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1914.png"));
		lblYear_1914.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1914);

		JLabel lblYear_1913 = new JLabel("");
		lblYear_1913.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1913.png"));
		lblYear_1913.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1913);

		JLabel lblYear_1912 = new JLabel("");
		lblYear_1912.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1912.png"));
		lblYear_1912.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1912);

		JLabel lblYear_1911 = new JLabel("");
		lblYear_1911.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1911.png"));
		lblYear_1911.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1911);

		JLabel lblYear_1910 = new JLabel("");
		lblYear_1910.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1910.png"));
		lblYear_1910.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1910);

		JLabel lblYear_1909 = new JLabel("");
		lblYear_1909.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1909.png"));
		lblYear_1909.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1909);

		JLabel lblYear_1908 = new JLabel("");
		lblYear_1908.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1908.png"));
		lblYear_1908.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1908);

		JLabel lblYear_1907 = new JLabel("");
		lblYear_1907.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1907.png"));
		lblYear_1907.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1907);

		JLabel lblYear_1906 = new JLabel("");
		lblYear_1906.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1906.png"));
		lblYear_1906.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1906);

		JLabel lblYear_1905 = new JLabel("");
		lblYear_1905.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1905.png"));
		lblYear_1905.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1905);

		JLabel lblYear_1904 = new JLabel("");
		lblYear_1904.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1904.png"));
		lblYear_1904.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1904);

		JLabel lblYear_1903 = new JLabel("");
		lblYear_1903.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1903.png"));
		lblYear_1903.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1903);

		JLabel lblYear_1902 = new JLabel("");
		lblYear_1902.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1902.png"));
		lblYear_1902.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1902);

		JLabel lblYear_1901 = new JLabel("");
		lblYear_1901.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1901.png"));
		lblYear_1901.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1901);

		JLabel lblYear_1900 = new JLabel("");
		lblYear_1900.setIcon(new ImageIcon("/home/samuel/Desktop/.num/anos/1900.png"));
		lblYear_1900.setBounds(726, 245, 108, 50);
		frame.getContentPane().add(lblYear_1900);
		
		
		JButton btnFecharjanela = new JButton("");
		btnFecharjanela.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFecharjanela.setBorderPainted(false);
		btnFecharjanela.setContentAreaFilled(false);
		btnFecharjanela.setFont(new Font("Dialog", Font.BOLD, 10));
		btnFecharjanela.setBounds(914, 1, 19, 25);
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
				      

				      //JOptionPane.showOptionDialog(null, “Clique OK para continuar”, “Aviso”, JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
		
				
				}
			});
		

		
		//ANO
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setRequestFocusEnabled(false);
		comboBox_2.setOpaque(false);
		comboBox_2.setFocusTraversalKeysEnabled(false);
		comboBox_2.setFocusable(false);
		comboBox_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Ano", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900"}));
		comboBox_2.setBounds(736, 252, 84, 34);
		frame.getContentPane().add(comboBox_2);
		
				
				comboBox_2.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                // Verifica se o item selecionado é "1"
		            	if (comboBox_2.getSelectedItem().equals("Ano")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(true);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	if (comboBox_2.getSelectedItem().equals("2023")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(true);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            		
		            	if (comboBox_2.getSelectedItem().equals("2022")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(true);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2021")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(true);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	if (comboBox_2.getSelectedItem().equals("2020")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(true);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            		
		            	if (comboBox_2.getSelectedItem().equals("2019")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(true);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2018")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(true);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2017")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(true);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2016")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(true);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2015")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(true);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2014")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(true);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2013")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(true);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2012")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(true);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	
		            	if (comboBox_2.getSelectedItem().equals("2011")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(true);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2010")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(true);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2009")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(true);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2008")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(true);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	
		            	if (comboBox_2.getSelectedItem().equals("2007")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(true);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2006")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(true);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2005")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(true);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2004")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(true);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2003")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(true);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		
		            	if (comboBox_2.getSelectedItem().equals("2002")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(true);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	
		            	if (comboBox_2.getSelectedItem().equals("2001")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(true);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		                    
		            		}

		            		
		            	if (comboBox_2.getSelectedItem().equals("2000")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(true);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		                    
		            		}
		            	
		            	if (comboBox_2.getSelectedItem().equals("1999")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(true);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	if (comboBox_2.getSelectedItem().equals("1998")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(true);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	

		            	if (comboBox_2.getSelectedItem().equals("1997")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(true);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	

		            	if (comboBox_2.getSelectedItem().equals("1996")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(true);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	

		            	if (comboBox_2.getSelectedItem().equals("1995")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(true);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	

		            	if (comboBox_2.getSelectedItem().equals("1994")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(true);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	

		            	if (comboBox_2.getSelectedItem().equals("1993")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(true);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	

		            	if (comboBox_2.getSelectedItem().equals("1992")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(true);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	

		            	if (comboBox_2.getSelectedItem().equals("1991")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(true);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	

		            	if (comboBox_2.getSelectedItem().equals("1990")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(true);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	

		            	if (comboBox_2.getSelectedItem().equals("1989")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(true);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	

		            	if (comboBox_2.getSelectedItem().equals("1988")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(true);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	

		            	if (comboBox_2.getSelectedItem().equals("1987")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(true);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	

		            	if (comboBox_2.getSelectedItem().equals("1986")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(true);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	

		            	if (comboBox_2.getSelectedItem().equals("1985")) {
		                    // Define o ícone correspondente para o JLabel
		            		
		
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(true);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	if (comboBox_2.getSelectedItem().equals("1984")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(true);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	
		            	if (comboBox_2.getSelectedItem().equals("1983")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(true);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	if (comboBox_2.getSelectedItem().equals("1982")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(true);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            		
		            	if (comboBox_2.getSelectedItem().equals("1981")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(true);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            		
		            	if (comboBox_2.getSelectedItem().equals("1980")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(true);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            			
		            	if (comboBox_2.getSelectedItem().equals("1979")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(true);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	if (comboBox_2.getSelectedItem().equals("1978")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(true);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            			
		            	if (comboBox_2.getSelectedItem().equals("1977")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(true);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}	
		            	
		            	if (comboBox_2.getSelectedItem().equals("1976")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(true);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            		
		            	if (comboBox_2.getSelectedItem().equals("1975")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(true);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	
		            	if (comboBox_2.getSelectedItem().equals("1974")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(true);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	if (comboBox_2.getSelectedItem().equals("1973")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(true);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	if (comboBox_2.getSelectedItem().equals("1972")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(true);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	
		            	if (comboBox_2.getSelectedItem().equals("1971")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(true);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	if (comboBox_2.getSelectedItem().equals("1970")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(true);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	if (comboBox_2.getSelectedItem().equals("1969")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(true);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	if (comboBox_2.getSelectedItem().equals("1968")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(true);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            		
		            	if (comboBox_2.getSelectedItem().equals("1967")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(true);
		                    lblYear_1966.setVisible(false);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		            	
		            	if (comboBox_2.getSelectedItem().equals("1966")) {
		                    // Define o ícone correspondente para o JLabel
		            				
		            		lblYear.setVisible(false);
		                	lblYear_2023.setVisible(false);
		                	lblYear_2022.setVisible(false);
		                	lblYear_2021.setVisible(false);
		                    lblYear_2020.setVisible(false);
		                    lblYear_2019.setVisible(false);
		                    lblYear_2018.setVisible(false);
		                    lblYear_2017.setVisible(false);
		                    lblYear_2016.setVisible(false);
		                    lblYear_2015.setVisible(false);
		                    lblYear_2014.setVisible(false);
		                    lblYear_2013.setVisible(false);
		                    lblYear_2012.setVisible(false);
		                    lblYear_2011.setVisible(false);
		                    lblYear_2010.setVisible(false);
		                    lblYear_2009.setVisible(false);
		                    lblYear_2008.setVisible(false);
		                    lblYear_2007.setVisible(false);
		                    lblYear_2006.setVisible(false);
		                    lblYear_2005.setVisible(false);
		                    lblYear_2004.setVisible(false);
		                    lblYear_2003.setVisible(false);
		                    lblYear_2002.setVisible(false);
		                    lblYear_2001.setVisible(false);
		                    lblYear_2000.setVisible(false);
		                    lblYear_1999.setVisible(false);
		                    lblYear_1998.setVisible(false);
		                    lblYear_1997.setVisible(false);
		                    lblYear_1996.setVisible(false);
		                    lblYear_1995.setVisible(false);
		                    lblYear_1994.setVisible(false);
		                    lblYear_1993.setVisible(false);
		                	lblYear_1992.setVisible(false);
		                	lblYear_1991.setVisible(false);
		                	lblYear_1990.setVisible(false);
		                    lblYear_1989.setVisible(false);
		                    lblYear_1988.setVisible(false);
		                    lblYear_1987.setVisible(false);
		                    lblYear_1986.setVisible(false);
		                    lblYear_1985.setVisible(false);
		                    lblYear_1984.setVisible(false);
		                    lblYear_1983.setVisible(false);
		                    lblYear_1982.setVisible(false);
		                    lblYear_1981.setVisible(false);
		                    lblYear_1980.setVisible(false);
		                    lblYear_1979.setVisible(false);
		                    lblYear_1978.setVisible(false);
		                    lblYear_1977.setVisible(false);
		                    lblYear_1976.setVisible(false);
		                    lblYear_1975.setVisible(false);
		                    lblYear_1974.setVisible(false);
		                    lblYear_1973.setVisible(false);
		                    lblYear_1972.setVisible(false);
		                    lblYear_1971.setVisible(false);
		                    lblYear_1970.setVisible(false);
		                    lblYear_1969.setVisible(false);
		                    lblYear_1968.setVisible(false);
		                    lblYear_1967.setVisible(false);
		                    lblYear_1966.setVisible(true);
		                    lblYear_1965.setVisible(false);
		                    lblYear_1964.setVisible(false);
		                    lblYear_1963.setVisible(false);
		                    lblYear_1962.setVisible(false);
		                	lblYear_1961.setVisible(false);
		                	lblYear_1960.setVisible(false);
		                	lblYear_1959.setVisible(false);
		                    lblYear_1958.setVisible(false);
		                    lblYear_1957.setVisible(false);
		                    lblYear_1956.setVisible(false);
		                    lblYear_1955.setVisible(false);
		                    lblYear_1954.setVisible(false);
		                    lblYear_1953.setVisible(false);
		                    lblYear_1952.setVisible(false);
		                    lblYear_1951.setVisible(false);
		                    lblYear_1950.setVisible(false);
		                    lblYear_1949.setVisible(false);
		                    lblYear_1948.setVisible(false);
		                    lblYear_1947.setVisible(false);
		                    lblYear_1946.setVisible(false);
		                    lblYear_1945.setVisible(false);
		                    lblYear_1944.setVisible(false);
		                    lblYear_1943.setVisible(false);
		                    lblYear_1942.setVisible(false);
		                    lblYear_1941.setVisible(false);
		                    lblYear_1940.setVisible(false);
		                    lblYear_1939.setVisible(false);
		                    lblYear_1938.setVisible(false);
		                    lblYear_1937.setVisible(false);
		                    lblYear_1936.setVisible(false);
		                    lblYear_1935.setVisible(false);
		                    lblYear_1934.setVisible(false);
		                    lblYear_1933.setVisible(false);
		                    lblYear_1932.setVisible(false);
		                    lblYear_1931.setVisible(false);
		                	lblYear_1930.setVisible(false);
		                	lblYear_1929.setVisible(false);
		                	lblYear_1928.setVisible(false);
		                    lblYear_1927.setVisible(false);
		                    lblYear_1926.setVisible(false);
		                    lblYear_1925.setVisible(false);
		                    lblYear_1924.setVisible(false);
		                    lblYear_1923.setVisible(false);
		                    lblYear_1922.setVisible(false);
		                    lblYear_1921.setVisible(false);
		                    lblYear_1920.setVisible(false);
		                    lblYear_1919.setVisible(false);
		                    lblYear_1918.setVisible(false);
		                    lblYear_1917.setVisible(false);
		                    lblYear_1916.setVisible(false);
		                    lblYear_1915.setVisible(false);
		                    lblYear_1914.setVisible(false);
		                    lblYear_1913.setVisible(false);
		                    lblYear_1912.setVisible(false);
		                    lblYear_1911.setVisible(false);
		                    lblYear_1910.setVisible(false);
		                    lblYear_1909.setVisible(false);
		                    lblYear_1908.setVisible(false);
		                    lblYear_1907.setVisible(false);
		                    lblYear_1906.setVisible(false);
		                    lblYear_1905.setVisible(false);
		                    lblYear_1904.setVisible(false);
		                    lblYear_1903.setVisible(false);
		                    lblYear_1902.setVisible(false);
		                    lblYear_1901.setVisible(false);
		                    lblYear_1900.setVisible(false);
		                    
		                    
		                    
		            		}
		       
		            		
		            	}
		            });
		
		
		
		//MÊS
		JLabel lblMon = new JLabel("");
		lblMon.setIcon(new ImageIcon("/home/samuel/Desktop/.Mes.png"));
		lblMon.setBounds(613, 244, 108, 50);
		frame.getContentPane().add(lblMon);
		lblMon.setVisible(true);
		
		JLabel lblMon_1 = new JLabel("");
		lblMon_1.setIcon(new ImageIcon("/home/samuel/Desktop/.num/meses/1.png"));
		lblMon_1.setBounds(613, 244, 108, 50);
		frame.getContentPane().add(lblMon_1);
		lblMon_1.setVisible(false);

		JLabel lblMon_2 = new JLabel("");
		lblMon_2.setIcon(new ImageIcon("/home/samuel/Desktop/.num/meses/2.png"));
		lblMon_2.setBounds(613, 244, 108, 50);
		frame.getContentPane().add(lblMon_2);
		

		JLabel lblMon_3 = new JLabel("");
		lblMon_3.setIcon(new ImageIcon("/home/samuel/Desktop/.num/meses/3.png"));
		lblMon_3.setBounds(613, 244, 108, 50);
		frame.getContentPane().add(lblMon_3);
		lblMon_3.setVisible(false);
		
		JLabel lblMon_4 = new JLabel("");
		lblMon_4.setIcon(new ImageIcon("/home/samuel/Desktop/.num/meses/4.png"));
		lblMon_4.setBounds(613, 244, 108, 50);
		frame.getContentPane().add(lblMon_4);
		lblMon_4.setVisible(false);
		
		JLabel lblMon_5 = new JLabel("");
		lblMon_5.setIcon(new ImageIcon("/home/samuel/Desktop/.num/meses/5.png"));
		lblMon_5.setBounds(613, 244, 108, 50);
		frame.getContentPane().add(lblMon_5);
		lblMon_5.setVisible(false);
		
		JLabel lblMon_6 = new JLabel("");
		lblMon_6.setIcon(new ImageIcon("/home/samuel/Desktop/.num/meses/6.png"));
		lblMon_6.setBounds(613, 244, 108, 50);
		frame.getContentPane().add(lblMon_6);
		lblMon_6.setVisible(false);
		
		JLabel lblMon_7 = new JLabel("");
		lblMon_7.setIcon(new ImageIcon("/home/samuel/Desktop/.num/meses/7.png"));
		lblMon_7.setBounds(613, 244, 108, 50);
		frame.getContentPane().add(lblMon_7);
		lblMon_7.setVisible(false);
		
		JLabel lblMon_8 = new JLabel("");
		lblMon_8.setIcon(new ImageIcon("/home/samuel/Desktop/.num/meses/8.png"));
		lblMon_8.setBounds(613, 244, 108, 50);
		frame.getContentPane().add(lblMon_8);
		lblMon_8.setVisible(false);
		
		JLabel lblMon_9 = new JLabel("");
		lblMon_9.setIcon(new ImageIcon("/home/samuel/Desktop/.num/meses/9.png"));
		lblMon_9.setBounds(613, 244, 108, 50);
		frame.getContentPane().add(lblMon_9);
		lblMon_9.setVisible(false);
		
		JLabel lblMon_10 = new JLabel("");
		lblMon_10.setIcon(new ImageIcon("/home/samuel/Desktop/.num/meses/10.png"));
		lblMon_10.setBounds(613, 244, 108, 50);
		frame.getContentPane().add(lblMon_10);
		lblMon_10.setVisible(false);
		
		JLabel lblMon_11 = new JLabel("");
		lblMon_11.setIcon(new ImageIcon("/home/samuel/Desktop/.num/meses/11.png"));
		lblMon_11.setBounds(613, 244, 108, 50);
		frame.getContentPane().add(lblMon_11);
		lblMon_11.setVisible(false);
		
		JLabel lblMon_12 = new JLabel("");
		lblMon_12.setIcon(new ImageIcon("/home/samuel/Desktop/.num/meses/12.png"));
		lblMon_12.setBounds(613, 244, 108, 50);
		frame.getContentPane().add(lblMon_12);
		lblMon_12.setVisible(false);
		
		
		JLabel lblHhh_3 = new JLabel("");
		lblHhh_3.setIcon(new ImageIcon("/home/samuel/Downloads/X_vermelho-removebg-preview_resized.png"));
		lblHhh_3.setBounds(911, -8, 26, 43);
		frame.getContentPane().add(lblHhh_3);
		

		
		textField = new JTextField();
		textField.setFont(new Font("FreeSans", Font.BOLD, 14));
		textField.setBorder(null);
		textField.setBackground(new Color(246, 246, 246));
		textField.setBounds(165, 161, 302, 24);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("FreeSans", Font.BOLD, 14));
		textField_1.setBorder(null);
		textField_1.setBackground(new Color(246, 246, 246));
		textField_1.setBounds(516, 161, 302, 24);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("FreeSans", Font.BOLD, 14));
		textField_2.setBorder(null);
		textField_2.setBackground(new Color(246, 246, 246));
		textField_2.setBounds(167, 231, 300, 23);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("FreeSans", Font.BOLD, 14));
		textField_3.setBorder(null);
		textField_3.setBackground(new Color(246, 246, 246));
		textField_3.setBounds(165, 302, 300, 23);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setRequestFocusEnabled(false);
		comboBox.setOpaque(false);
		comboBox.setFocusable(false);
		comboBox.setFocusTraversalKeysEnabled(false);
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setActionCommand("1\n2\n3\n");
		comboBox.setBounds(517, 251, 84, 34);
		frame.getContentPane().add(comboBox);
		

		
		
		//Para o Dia
	       comboBox.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                // Verifica se o item selecionado é "1"
	            	if (comboBox.getSelectedItem().equals("Dia")) {
	                    // Define o ícone correspondente para o JLabel
	            		
	            		lblDay.setVisible(true);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    

	                } 
	            	
	            	
	            	if (comboBox.getSelectedItem().equals("1")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(true);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("2")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(true);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	                }
	            	if (comboBox.getSelectedItem().equals("3")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(true);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	                    
	                    
	                }
	            	
	            	if (comboBox.getSelectedItem().equals("4")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(true);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("5")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(true);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("6")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(true);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("7")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(true);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("8")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(true);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                }
	            	
	            	if (comboBox.getSelectedItem().equals("9")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(true);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                }
	            	
	            	if (comboBox.getSelectedItem().equals("10")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(true);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("11")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(true);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("12")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(true);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("13")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(true);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("14")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(true);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                }
	            	
	            	if (comboBox.getSelectedItem().equals("15")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(true);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                }
	            	
	            	if (comboBox.getSelectedItem().equals("16")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(true);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                }
	            	
	            	if (comboBox.getSelectedItem().equals("17")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(true);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                }
	            	
	            	if (comboBox.getSelectedItem().equals("18")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(true);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                }
	            	if (comboBox.getSelectedItem().equals("19")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(true);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("20")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(true);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("21")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(true);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("22")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(true);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("23")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(true);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	
	            	if (comboBox.getSelectedItem().equals("24")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(true);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("25")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(true);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("26")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(true);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("27")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(true);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("28")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(true);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("29")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(true);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	if (comboBox.getSelectedItem().equals("30")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(true);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	
	            	if (comboBox.getSelectedItem().equals("31")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(true);
	                    
	            	}
	            	
	            	
	            	
	            	
	            	
	            	
	            	
	            	
	            }
	        });
		
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFocusable(false);
		comboBox_1.setFocusTraversalKeysEnabled(false);
		comboBox_1.setRequestFocusEnabled(false);
		comboBox_1.setOpaque(false);
		comboBox_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Mês", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_1.setBounds(626, 251, 84, 34);
		frame.getContentPane().add(comboBox_1);
		
		
		password_1 = new JPasswordField();
		password_1.setFont(new Font("Dialog", Font.BOLD, 14));
		password_1.setBorder(null);
		password_1.setBackground(new Color(246, 246, 246));
		password_1.setBounds(165, 367, 302, 23);
		frame.getContentPane().add(password_1);
		
		JButton btnComparao = new JButton("");
		btnComparao.setBorder(null);
		btnComparao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnComparao.setContentAreaFilled(false);
		btnComparao.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
	
				Cadastro cadas = new Cadastro();
		
				int passou = 10;
				
				String nome = textField.getText();
				String senha = new String(password_1.getPassword());
			//	String senhaTexto = new String(Campo_senha.getPassword());

				String sobre_nome = textField_1.getText();
				String email = textField_2.getText();
				String repetir_email = textField_3.getText();
				int arroba = email.indexOf("@");
				int ponto = email.indexOf(".");
					
				
				String[] nome_digitado = new String[10];
				
				String dia = (String) comboBox.getSelectedItem();
				String mes = (String) comboBox_1.getSelectedItem();
				String ano = (String) comboBox_2.getSelectedItem();
				
				

				char digito = 's';
				
				char cadas_genero = cadas.getGenero();

				
				
				int nulo = 0;
				int nulo1 = 0;
				int nulo3 = 0;
				int nulo4 = 0;
				int nulo5 = 0;
				int nulo6 = 0;

				Usuario user = new Usuario(null, null);
				
				if(arroba != -1 && ponto != -1) {
					
					nulo4 = 1;
					
				}else {
					nulo6 = nulo6 + 1;
					nulo = 0;
					digito = 'a';
				}
				
				if(senha.length() < 8) {
					nulo5 = 2;
					nulo6 = nulo6 + 1;
					
				}
				if(email.length() < 14){
					nulo4 = 0;
					digito = 'a';
					nulo6 = nulo6 + 1;
				}
									
				if((nome.trim().equals("")) || (senha.trim().equals("")) || (sobre_nome.trim().equals("")) || (email.trim().equals("")) || (repetir_email.trim().equals("")) || (dia == "Dia") || (mes == "Mês") || (ano == "Ano")){
					
					nulo = 6000;
					nulo1 = nulo1 + 7000;
					
					digito = 'a';
					nulo4 = 1;
					nulo5 = 1;
					nulo6 = 1;
		
				}

				if((nome.trim().equals("")) && (senha.trim().equals("")) && (sobre_nome.trim().equals("")) && (email.trim().equals("")) && (repetir_email.trim().equals("")) && (dia == "Dia") && (mes == "Mês") && (ano == "Ano")){

					nulo = 0;
					nulo1 = nulo1 + 7000;
					nulo3 = 20;
					
					digito = 'a';
					
					nulo4 = 1;
					nulo5 = 1;
					nulo6 = 1;
					
				}

				
				
				if(email == null || email.trim().equals("")) {
					nulo = nulo + 10;
				}
				
				if(dia == "Dia" ) {
					nulo = nulo + 30;
				}
				
				if(mes == "Mês" ) {
					nulo = nulo + 50;
				}
				
				if(ano == "Ano" ) {
					nulo = nulo + 90;
				}
				
				if(nome == null || nome.trim().equals("")) {
					
				}
				
				if(!email.equals(repetir_email)){

					JOptionPane.showMessageDialog(null,"Emails estão diferentes","Alerta",JOptionPane.WARNING_MESSAGE);
					digito = 'a';
					nulo1 = 0;
					nulo4 = 1;

				}

				if(nulo == 10) {
					JOptionPane.showMessageDialog(null,"Campo de Email vazio");
					digito = 'a';
				}
				
				if(nulo == 30 || nulo == 6030) {
					JOptionPane.showMessageDialog(null,"Campo do Dia não selecionado!","Alerta",JOptionPane.WARNING_MESSAGE);

					digito = 'a';
					nulo1 = 0;

				}

				if(nulo == 50 || nulo == 6050) {
					//JOptionPane.showMessageDialog(null,"Campo Mês não selecionado!");
					JOptionPane.showMessageDialog(null,"Campo do Mês não selecionado!","Alerta",JOptionPane.WARNING_MESSAGE);

					digito = 'a';
					nulo1 = 0;
				}
				
				if(nulo == 80 || nulo == 6080) {
					//JOptionPane.showMessageDialog(null,"Campos de Dia e Mês não selecionado!");
					JOptionPane.showMessageDialog(null,"Campos de Dia e Mês não selecionado!","Alerta",JOptionPane.WARNING_MESSAGE);

					digito = 'a';
					nulo1 = 0;
				}
				
				if(nulo == 120 || nulo == 6120) {
					
					//JOptionPane.showMessageDialog(null,"Campos de Dia e Ano não selecionado!");
					JOptionPane.showMessageDialog(null,"Campos de Dia e Ano não selecionado!","Alerta",JOptionPane.WARNING_MESSAGE);

					
					digito = 'a';
					nulo1 = 0;
				}
				
				if(nulo == 140 || nulo == 6140) {
					//JOptionPane.showMessageDialog(null,"Campos de Mês e Ano não selecionado!");
					JOptionPane.showMessageDialog(null,"Campos de Mês e Ano não selecionado!","Alerta",JOptionPane.WARNING_MESSAGE);

					digito = 'a';
					nulo1 = 0;
				}
				
				if(nulo == 90 || nulo == 6090) {
					//JOptionPane.showMessageDialog(null,"Campo Ano não selecionado!");
					JOptionPane.showMessageDialog(null,"Campo do Ano não selecionado!","Alerta",JOptionPane.WARNING_MESSAGE);

					
					digito = 'a';
					nulo1 = 0;
				}
				
				if(nulo1 == 7000 || nulo1 == 14000) {
					JOptionPane.showMessageDialog(null,"Campos Incompletos", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
					digito = 'a';
					
				}
				
				if(nulo6 == 3 || nulo6 == 2) {
					JOptionPane.showMessageDialog(null,"Email e Senha inválidos", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
					digito = 'a';
					nulo4 = 1;
					nulo5 = 1;
				}
				
				if(nulo4 == 0) {
					JOptionPane.showMessageDialog(null,"Email inválido", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
					digito = 'a';
					
				}
				
				if(nulo5 == 2) {
					JOptionPane.showMessageDialog(null,"É necessário no minimo 8 caracteres para a senha", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
					digito = 'a';
				}
				
				if(digito == 's') {
				int diaInt = Integer.parseInt(dia);
				int mesInt = Integer.parseInt(mes);
				int anoInt = Integer.parseInt(ano);
				
				
		        Calendar dataAtual = Calendar.getInstance();
		        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);
		        int mesAtual = dataAtual.get(Calendar.MONTH) + 1; // Meses começam do zero
		        int anoAtual = dataAtual.get(Calendar.YEAR);

		        // Calcula a idade
		        int idade;
		        if (mesInt > mesAtual || (mesInt == mesAtual && diaInt > diaAtual)) {
		            idade = anoAtual - anoInt - 1;
		        } else {
		            idade = anoAtual - anoInt;
		        }
				
		        
		        //System.out.println(idade);
		        
		        for (Usuario usuario : list.getListaUsuarios()) {
	            	
		            //System.out.println("TESTE EMAIL:  "+usuario.getEmail());
		            //System.out.println("TESTE SENHA:  "+usuario.getSenha());
		            if (usuario.getEmail().equals(email)){
		            	
						JOptionPane.showMessageDialog(null, "Usuário já existe no sistema", "Aviso!", JOptionPane.ERROR_MESSAGE);

		            	System.out.println("Usuários existe");         
		            	passou = 0;
		            	
		            }
		            
		        }
		        
		        
		        
		        
		        
		        if(idade >= 18 && passou == 10) {
		        	
	            
				
		        user.setNome(nome);
		        user.setSobre_nome(sobre_nome);
		        user.setSenha(senha);
				user.setEmail(repetir_email);
				user.setIdade(idade);				
				
				list.add(user);
				//list.add(user);
                cadastroUsuarios.cadastrarUsuario(nome, senha);

                
				// Limpar os campos após cadastrar
				//textField.setText("");
				
			//	list.showUsuarios();
				
                list.showUsuarios();
                

				JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso!", "Usuário Cadastrado", JOptionPane.INFORMATION_MESSAGE);

	        	//Tela_Login.main(null);
				
				
				//frame.setVisible(false);
				frame.dispose();
				//login.frame.setVisible(true);
				Tela_Login.main(null);
				
				
	        
	        	}
		        
		        if(idade < 18) {

		        	JOptionPane.showInternalMessageDialog(null,"Essa Rede é permitida somento para maiores de 18 anos", "Aviso!", JOptionPane.INFORMATION_MESSAGE);
		        	
		        	
		        }

		        
		        
		        
				}
		
			}
		});
		

		
		btnComparao.setBounds(411, 442, 158, 43);
		frame.getContentPane().add(btnComparao);
		
		JLabel lblNewLabel = new JLabel("v");
		lblNewLabel.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/voltar_botão.png"));
		lblNewLabel.setBounds(807, 47, 137, 55);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblHhh_2 = new JLabel("");
		lblHhh_2.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		lblHhh_2.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-09-30 00-03-15.png"));
		lblHhh_2.setBounds(71, 46, 884, 503);
		frame.getContentPane().add(lblHhh_2);
		
		
		//Cabeçalho 'Fatec'
		JLabel lblHhh_1 = new JLabel("hhh1");
		lblHhh_1.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-09-29 23-50-45.png"));
		lblHhh_1.setBounds(0, -7, 437, 55);
		frame.getContentPane().add(lblHhh_1);
		
		JLabel lblHhh = new JLabel("hhh2");
		lblHhh.setIcon(new ImageIcon("/home/samuel/Pictures/Screenshots/Screenshot from 2023-09-29 23-52-59.png"));
		lblHhh.setBounds(434, -4, 521, 46);
		frame.getContentPane().add(lblHhh);
		

		rdbtnFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
					
					if (comboBox.getSelectedItem().equals("Dia")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(true);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	
	            	if (comboBox.getSelectedItem().equals("1")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(true);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("2")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(true);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	                }
	            	if (comboBox.getSelectedItem().equals("3")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(true);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	                }
	            	
	            	if (comboBox.getSelectedItem().equals("4")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(true);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("5")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(true);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("6")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(true);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("7")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(true);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("8")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(true);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                }
	            	
	            	if (comboBox.getSelectedItem().equals("9")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(true);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                }
	            	
	            	if (comboBox.getSelectedItem().equals("10")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(true);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("11")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(true);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("12")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(true);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("13")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(true);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                } 
	            	
	            	if (comboBox.getSelectedItem().equals("14")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(true);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                }
	            	
	            	if (comboBox.getSelectedItem().equals("15")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(true);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                }
	            	
	            	if (comboBox.getSelectedItem().equals("16")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(true);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                }
	            	
	            	if (comboBox.getSelectedItem().equals("17")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(true);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                }
	            	
	            	if (comboBox.getSelectedItem().equals("18")) {
	                    // Define o ícone correspondente para o JLabel
	            		lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(true);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                }
	            	if (comboBox.getSelectedItem().equals("19")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(true);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("20")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(true);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("21")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(true);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("22")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(true);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("23")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(true);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	
	            	if (comboBox.getSelectedItem().equals("24")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(true);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("25")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(true);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("26")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(true);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("27")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(true);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("28")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(true);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	if (comboBox.getSelectedItem().equals("29")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(true);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	if (comboBox.getSelectedItem().equals("30")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(true);
	                    lblNum31.setVisible(false);
	                    
	            	}
	            	
	            	
	            	if (comboBox.getSelectedItem().equals("31")) {
	                    // Define o ícone correspondente para o JLabel
	                	lblDay.setVisible(false);
	                	lblNum.setVisible(false);
	                	lblNum2.setVisible(false);
	                	lblNum3.setVisible(false);
	                    lblNum4.setVisible(false);
	                    lblNum5.setVisible(false);
	                    lblNum6.setVisible(false);
	                    lblNum7.setVisible(false);
	                    lblNum8.setVisible(false);
	                    lblNum9.setVisible(false);
	                    lblNum10.setVisible(false);
	                    lblNum11.setVisible(false);
	                    lblNum12.setVisible(false);
	                    lblNum13.setVisible(false);
	                    lblNum14.setVisible(false);
	                    lblNum15.setVisible(false);
	                    lblNum16.setVisible(false);
	                    lblNum17.setVisible(false);
	                    lblNum18.setVisible(false);
	                    lblNum19.setVisible(false);
	                    lblNum20.setVisible(false);
	                    lblNum21.setVisible(false);
	                    lblNum22.setVisible(false);
	                    lblNum23.setVisible(false);
	                    lblNum24.setVisible(false);
	                    lblNum25.setVisible(false);
	                    lblNum26.setVisible(false);
	                    lblNum27.setVisible(false);
	                    lblNum28.setVisible(false);
	                    lblNum29.setVisible(false);
	                    lblNum30.setVisible(false);
	                    lblNum31.setVisible(true);
	                    
	                    
	                    
	            	}
					

					
					}
				});
		
		comboBox_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            	if(comboBox_1.getSelectedItem().equals("Mês")) {
            		
            		lblMon.setVisible(true);
            		lblMon_1.setVisible(false);
            		lblMon_2.setVisible(false);
            		lblMon_3.setVisible(false);
            		lblMon_4.setVisible(false);
            		lblMon_5.setVisible(false);
            		lblMon_6.setVisible(false);
            		lblMon_7.setVisible(false);
            		lblMon_8.setVisible(false);
            		lblMon_9.setVisible(false);
            		lblMon_10.setVisible(false);
            		lblMon_11.setVisible(false);
            		lblMon_12.setVisible(false);
            		
            		
            	}
            	
            	if (comboBox_1.getSelectedItem().equals("1")) {
            		
            		lblMon.setVisible(false);
            		lblMon_1.setVisible(true);
            		lblMon_2.setVisible(false);
            		lblMon_3.setVisible(false);
            		lblMon_4.setVisible(false);
            		lblMon_5.setVisible(false);
            		lblMon_6.setVisible(false);
            		lblMon_7.setVisible(false);
            		lblMon_8.setVisible(false);
            		lblMon_9.setVisible(false);
            		lblMon_10.setVisible(false);
            		lblMon_11.setVisible(false);
            		lblMon_12.setVisible(false);
            		
            		
            	}
            	
            	if (comboBox_1.getSelectedItem().equals("2")) {
            		
            		lblMon.setVisible(false);
            		lblMon_1.setVisible(false);
            		lblMon_2.setVisible(true);
            		lblMon_3.setVisible(false);
            		lblMon_4.setVisible(false);
            		lblMon_5.setVisible(false);
            		lblMon_6.setVisible(false);
            		lblMon_7.setVisible(false);
            		lblMon_8.setVisible(false);
            		lblMon_9.setVisible(false);
            		lblMon_10.setVisible(false);
            		lblMon_11.setVisible(false);
            		lblMon_12.setVisible(false);
            		
            	//	comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"}));

            		
            		
            		
            	}
            	
            	if (comboBox_1.getSelectedItem().equals("3")) {
            		
            		lblMon.setVisible(false);
            		lblMon_1.setVisible(false);
            		lblMon_2.setVisible(false);
            		lblMon_3.setVisible(true);
            		lblMon_4.setVisible(false);
            		lblMon_5.setVisible(false);
            		lblMon_6.setVisible(false);
            		lblMon_7.setVisible(false);
            		lblMon_8.setVisible(false);
            		lblMon_9.setVisible(false);
            		lblMon_10.setVisible(false);
            		lblMon_11.setVisible(false);
            		lblMon_12.setVisible(false);
            		
            		
            		
            	}
            	
            	if (comboBox_1.getSelectedItem().equals("4")) {
            		
            		lblMon.setVisible(false);
            		lblMon_1.setVisible(false);
            		lblMon_2.setVisible(false);
            		lblMon_3.setVisible(false);
            		lblMon_4.setVisible(true);
            		lblMon_5.setVisible(false);
            		lblMon_6.setVisible(false);
            		lblMon_7.setVisible(false);
            		lblMon_8.setVisible(false);
            		lblMon_9.setVisible(false);
            		lblMon_10.setVisible(false);
            		lblMon_11.setVisible(false);
            		lblMon_12.setVisible(false);
            		
            	//	comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));

            		
            	}
            	
            	if (comboBox_1.getSelectedItem().equals("5")) {
            		
            		lblMon.setVisible(false);
            		lblMon_1.setVisible(false);
            		lblMon_2.setVisible(false);
            		lblMon_3.setVisible(false);
            		lblMon_4.setVisible(false);
            		lblMon_5.setVisible(true);
            		lblMon_6.setVisible(false);
            		lblMon_7.setVisible(false);
            		lblMon_8.setVisible(false);
            		lblMon_9.setVisible(false);
            		lblMon_10.setVisible(false);
            		lblMon_11.setVisible(false);
            		lblMon_12.setVisible(false);
            		
            		
            		
            	}
            	
            	if (comboBox_1.getSelectedItem().equals("6")) {
            		
            		lblMon.setVisible(false);
            		lblMon_1.setVisible(false);
            		lblMon_2.setVisible(false);
            		lblMon_3.setVisible(false);
            		lblMon_4.setVisible(false);
            		lblMon_5.setVisible(false);
            		lblMon_6.setVisible(true);
            		lblMon_7.setVisible(false);
            		lblMon_8.setVisible(false);
            		lblMon_9.setVisible(false);
            		lblMon_10.setVisible(false);
            		lblMon_11.setVisible(false);
            		lblMon_12.setVisible(false);
            		
            //		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));

            		
            	}

            	if (comboBox_1.getSelectedItem().equals("7")) {
            		
            		lblMon.setVisible(false);
            		lblMon_1.setVisible(false);
            		lblMon_2.setVisible(false);
            		lblMon_3.setVisible(false);
            		lblMon_4.setVisible(false);
            		lblMon_5.setVisible(false);
            		lblMon_6.setVisible(false);
            		lblMon_7.setVisible(true);
            		lblMon_8.setVisible(false);
            		lblMon_9.setVisible(false);
            		lblMon_10.setVisible(false);
            		lblMon_11.setVisible(false);
            		lblMon_12.setVisible(false);
            		
            		
            		
            	}

            	if (comboBox_1.getSelectedItem().equals("8")) {
            		
            		lblMon.setVisible(false);
            		lblMon_1.setVisible(false);
            		lblMon_2.setVisible(false);
            		lblMon_3.setVisible(false);
            		lblMon_4.setVisible(false);
            		lblMon_5.setVisible(false);
            		lblMon_6.setVisible(false);
            		lblMon_7.setVisible(false);
            		lblMon_8.setVisible(true);
            		lblMon_9.setVisible(false);
            		lblMon_10.setVisible(false);
            		lblMon_11.setVisible(false);
            		lblMon_12.setVisible(false);
            		

            		
            	}

            	if (comboBox_1.getSelectedItem().equals("9")) {
            		
            		lblMon.setVisible(false);
            		lblMon_1.setVisible(false);
            		lblMon_2.setVisible(false);
            		lblMon_3.setVisible(false);
            		lblMon_4.setVisible(false);
            		lblMon_5.setVisible(false);
            		lblMon_6.setVisible(false);
            		lblMon_7.setVisible(false);
            		lblMon_8.setVisible(false);
            		lblMon_9.setVisible(true);
            		lblMon_10.setVisible(false);
            		lblMon_11.setVisible(false);
            		lblMon_12.setVisible(false);
            		
            	//	comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));

            		
            	}
            	
            	if (comboBox_1.getSelectedItem().equals("10")) {
            		
            		lblMon.setVisible(false);
            		lblMon_1.setVisible(false);
            		lblMon_2.setVisible(false);
            		lblMon_3.setVisible(false);
            		lblMon_4.setVisible(false);
            		lblMon_5.setVisible(false);
            		lblMon_6.setVisible(false);
            		lblMon_7.setVisible(false);
            		lblMon_8.setVisible(false);
            		lblMon_9.setVisible(false);
            		lblMon_10.setVisible(true);
            		lblMon_11.setVisible(false);
            		lblMon_12.setVisible(false);
            		
            		
            		
            	}

            	if (comboBox_1.getSelectedItem().equals("11")) {
            		
            		lblMon.setVisible(false);
            		lblMon_1.setVisible(false);
            		lblMon_2.setVisible(false);
            		lblMon_3.setVisible(false);
            		lblMon_4.setVisible(false);
            		lblMon_5.setVisible(false);
            		lblMon_6.setVisible(false);
            		lblMon_7.setVisible(false);
            		lblMon_8.setVisible(false);
            		lblMon_9.setVisible(false);
            		lblMon_10.setVisible(false);
            		lblMon_11.setVisible(true);
            		lblMon_12.setVisible(false);
            		
            	//	comboBox.setModel(new DefaultComboBoxModel(new String[] {"Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"}));

            		
            	}
            	
            	if (comboBox_1.getSelectedItem().equals("12")) {
            		
            		lblMon.setVisible(false);
            		lblMon_1.setVisible(false);
            		lblMon_2.setVisible(false);
            		lblMon_3.setVisible(false);
            		lblMon_4.setVisible(false);
            		lblMon_5.setVisible(false);
            		lblMon_6.setVisible(false);
            		lblMon_7.setVisible(false);
            		lblMon_8.setVisible(false);
            		lblMon_9.setVisible(false);
            		lblMon_10.setVisible(false);
            		lblMon_11.setVisible(false);
            		lblMon_12.setVisible(true);
            		
            	}

            	
            }
		
   });
		
		
            	
		
		rdbtnMasculino.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				
				if(rdbtnMasculino.isSelected()) {
					rdbtnFeminino.setSelected(false);
					lblMasc.setVisible(true);
					lblmasc_desativado.setVisible(true);
					lblFem.setVisible(false);
					lblFemi.setVisible(true);
					rdbtnMasculino.requestFocusInWindow();
					
					
					}
				
			}
		});
		
		rdbtnFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
					if(rdbtnFeminino.isSelected()) {
						
						rdbtnMasculino.setSelected(false);
						lblMasc.setVisible(false);
						lblFem.setVisible(true);
						lblFemi.setVisible(false);

					}
					
					}
				});
		

	
	}
	
	

	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}



