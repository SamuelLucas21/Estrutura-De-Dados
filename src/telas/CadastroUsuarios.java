package telas;

import java.util.ArrayList;
import java.util.List;


public class CadastroUsuarios {
	
	 private List<Usuario> usuarios;

	    public CadastroUsuarios() {
	        usuarios = new ArrayList<>();
	    }

	    public void cadastrarUsuario(String nome, String senha) {
	        Usuario novoUsuario = new Usuario(nome, senha);
	        usuarios.add(novoUsuario);
	    }

	    public Usuario buscarUsuarioPorNome(String nome) {

	    	
	        for (Usuario usuario : usuarios) {
	            if (usuario != null && usuario.getNome() != null && usuario.getNome().equals(nome)) {
	                return usuario;
	                
	            }else {
	            	return null;
	            }
	        }
	        return null;
	    }


	    public List<Usuario> listarUsuarios() {
	        return usuarios;
	    	}
	    
	    // Outros métodos para gerenciar usuários, como atualizar, remover, etc.
		}
	

