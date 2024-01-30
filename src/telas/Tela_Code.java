package telas;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela_Code {

	public JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Code window = new Tela_Code();
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
	public Tela_Code() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	JLabel ll = new JLabel();
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(300, 300, 320, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ll.setIcon(new ImageIcon(Tela_Code.class.getResource("/Imagens/QrCode_2.png")));
		
		frame.getContentPane().add(ll);
		
		ll.setBounds(frame.getBounds());
		
		
	}

}
