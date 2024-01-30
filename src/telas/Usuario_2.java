package telas;

public class Usuario_2 {
    
    String[] usuario = new String[10];
    String[] senha = new String[10];
    
    public String[] getUsuario() {
        usuario[0] = "fatec";
        usuario[1] = "Pedro";
        usuario[2] = "Felipe";
        usuario[3] = "Beatriz";
        usuario[4] = "fatec";
        usuario[5] = "1";
        usuario[6] = "2";
        usuario[7] = "3";
        usuario[8] = "4";
        usuario[9] = "5";
        
        return usuario;
    }
    
    public String[] getSenha() {
    	senha[0] = "fatec";
        senha[1] = "Pedro";
        senha[2] = "Felipe";
        senha[3] = "Beatriz";
        senha[4] = "fatec";
        senha[5] = "1";
        senha[6] = "2";
        senha[7] = "3";
        senha[8] = "4";
        senha[9] = "5";
    	
    	
    	return senha;
    	
    }

	public String getLogin() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
    
    

    /*public static void main(String[] args) {
        Usuario usuarioObj = new Usuario();
        String[] usuarios = usuarioObj.getUsuario();
        
        read = new Scanner(System.in);
        
        System.out.print("Login: ");
        String buscar = read.nextLine();
        
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equals(buscar)) {
                System.out.println("Usuário encontrado no índice " + i);
                break;
            }
        }
    }*/



}


