package telas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JOptionPane;

public class List_Usuarios {
    public Usuario[] listaUsuario;
    private int lastUsuario;
    private int[] vetor;
//    private int[] amigo;
    
    private Set<String> loginsUsados; // Armazena logins já utilizados

    public List_Usuarios(int tamanhoMaximo) {
        listaUsuario = new Usuario[tamanhoMaximo];
        lastUsuario = -1;
        loginsUsados = new HashSet<>();
        vetor = new int[tamanhoMaximo];
        
        
    }

    public void add(Usuario novoUsuario) {
        if (lastUsuario + 1 < listaUsuario.length) {
            lastUsuario++;
            listaUsuario[lastUsuario] = novoUsuario;
        }else {
            // Aqui você pode tratar o caso de lista cheia, por exemplo, redimensionando a lista.
            // Ou lançar uma exceção ou retornar uma mensagem de erro, dependendo dos requisitos.
            System.err.println("A lista de usuários está cheia.");
        }
    }
    

    public int getIdUsuario(String login) {
        int idUsuario = -1;
        int aux = -1;
        while (aux < lastUsuario) {
            aux++;
            if (listaUsuario[aux].getLogin().equals(login)) {
                idUsuario = aux;
                break;
            }
        }
        return idUsuario;
    }

    private String gerarLoginUnico(String nome) {
        String login = nome.toLowerCase().replaceAll(" ", ""); // Gere um login a partir do nome
        int contador = 1;
        String loginOriginal = login;

        // Enquanto o login já estiver em uso, adicione um número ao final
        while (loginsUsados.contains(login)) {
            login = loginOriginal + contador;
            contador++;
        }

        // Marque o login como usado
        loginsUsados.add(login);

        return login;
    }

    public void showUsuarios() {
        for (int i = 0; i <= lastUsuario; i++) {
            System.out.println(i + " - " + listaUsuario[i].getLogin() + " - " + listaUsuario[i].getSenha() + " - " + listaUsuario[i].getEmail() + " - " + listaUsuario[i].getIdade());
        }
        
       /*if(lastUsuario < 4) {
    	   System.out.println(listaUsuario[3]);
       }*/
    
    }

    public List<Usuario> getListaUsuarios() {
        List<Usuario> lista = new ArrayList<>();
        for (int i = 0; i <= lastUsuario; i++) {
            lista.add(listaUsuario[i]);
        }
        return lista;
    }
    
    public void addFriend(int indiceSeu, String Email) {
    	for(int i =0; i<listaUsuario.length; i++) {
    		
    		if(listaUsuario[i] != null) {
    			if(listaUsuario[i].email.equals(Email)) { // == Email
        			listaUsuario[indiceSeu].addFriend(i);
        			listaUsuario[i].addFriend(indiceSeu);
        			JOptionPane.showMessageDialog(null, listaUsuario[indiceSeu].getNome() + " e " + listaUsuario[i].getNome() + " são amigos agora!");
        			break;
        		}
    			
    		}
    		if(i>=listaUsuario.length -1) {
    			JOptionPane.showMessageDialog(null, "Usuario não reconhecido: ", "Atenção!!!", JOptionPane.ERROR_MESSAGE);
    			

    		}
    	}
    }
    
	    public void mostrarAmigos(int indiceSeu) {
	        if (listaUsuario[indiceSeu].list.friends != null) {
	
	            System.out.println("Amigos de " + listaUsuario[indiceSeu].getLogin() + ":");

	            ElementosInt aux = listaUsuario[indiceSeu].list.primeiro;
	            	if(aux != null) {
	            		while(aux!=null) {
	            		
	                        System.out.println(aux.getValor() + " - " + listaUsuario[aux.getValor()].getLogin() + " - " + listaUsuario[aux.getValor()].getEmail());

	            			aux = aux.getElemento();
	            		}
	            	}

	            
	        }if(listaUsuario[indiceSeu].list.friends.isEmpty() == false){
	        	JOptionPane.showMessageDialog(null, "Este Usuario não contém amigos", null, indiceSeu, null);
	        }
	    }

    int fff;
    public boolean Encontrar(String Email) {
    	for(int i =0; i<listaUsuario.length; i++) {
    		
    		if(listaUsuario[i] != null) {
    			if(listaUsuario[i].email.equals(Email)) { // == Email
        			//System.out.println(i + listaUsuario[i].getEmail());
        			//System.out.println("Amigo encontrado!!!");
    				this.fff =i;
    				return true;
        			//break;
        		}
    			
    		}
    		if(i>=listaUsuario.length -1) {
    			JOptionPane.showMessageDialog(null, "Usuario não reconhecido: ", "Atenção!!!", JOptionPane.ERROR_MESSAGE);
    			return false;

    		}

    	}
    	return false;
    }
    public int EncontrarInt(String Email) {
    	int o = 0;
    	for(int i =0; i<listaUsuario.length; i++) {
    		
    		if(listaUsuario[i] != null) {
    			if(listaUsuario[i].email.equals(Email)) { // == Email
        			//System.out.println(i + listaUsuario[i].getEmail());
        			//System.out.println("Amigo encontrado!!!");
    				o = i;
    				
    				break;
        			//break;
        		}
    			
    		}
    	}
    	return o;
    	
    }
    
}
