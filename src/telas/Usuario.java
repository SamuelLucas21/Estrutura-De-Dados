package telas;

public class Usuario {
	
	public String nome;
	public String sobre_nome;
	public String senha;
	public String email;
	public int idade;
	public String bio;
	public String github;
	public String Linked;
	public String Curso;
	
	
	public Lista_Friends list;
	public Lista_Pedidos list_Pedidos;
	public String Foto_Perfil = null;
	
	public Usuario(String nome, String senha) {
		list = new Lista_Friends();
		list_Pedidos = new Lista_Pedidos();
	}
	public String getCurso() {
		return this.Curso;
	}
	public void setCurso(String novoCurso) {
		this.Curso = novoCurso;
	}
	
	public String getLinked() {
		return this.Linked;
	}
	public void setLinked(String novoLinked) {
		this.Linked = novoLinked;
	}
	
	public String getGitHub() {
		return this.github;
	}
	public void setGitHub(String novoGit) {
		this.github = novoGit;
	}
	
	public String getBio() {
		return this.bio;
	}
	public void setBio(String novabio) {
		this.bio = novabio;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobre_nome() {
		return this.sobre_nome;
	}
	public void setSobre_nome(String nome) {
		this.sobre_nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int novaIDade) {
		this.idade = novaIDade;
	}
	
	
	public void addFriend(int indice) {
		list.add(indice);
	}
	public void showFriend() {
		list.mostrarfrie();
	}
	
	
	
	
	// Irá retornar apenas o nome
	public String getLogin() {
		
		return nome;
	
	}



}
