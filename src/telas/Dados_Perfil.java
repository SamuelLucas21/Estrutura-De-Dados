package telas;

public class Dados_Perfil {
	
	static String nome;
	static String senha;
	
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Dados_Perfil.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		Dados_Perfil.senha = senha;
	}
	
}
