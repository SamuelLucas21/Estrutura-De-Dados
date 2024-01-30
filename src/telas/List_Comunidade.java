package telas;

import javax.swing.JOptionPane;

public class List_Comunidade {
	private Perfil[] listaCom;
	private int ultimo;
	
	public List_Comunidade(int getTamanho) {
		listaCom = new Perfil[getTamanho];
		ultimo = -1;
	}
	
	public void CriarComunidade(Perfil nome) {
		if(ultimo +1<listaCom.length) {
			ultimo++;
			listaCom[ultimo] = nome;
			JOptionPane.showMessageDialog(null, "Comunidade Criada!!!");
		}else {
			System.err.println("Há comunicades de mais");
		}
		
	}
	public void showComunidades() {
		for(int i =0; i<listaCom.length; i++) {
			if(listaCom[i] == null) break;
			System.out.println(i + "-"+ listaCom[i].getNome() + "-" + listaCom[i].getDescricao());
		}
	}
	

}
