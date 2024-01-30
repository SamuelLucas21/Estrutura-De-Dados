package telas;

public class Perfil {
		private String nome;
		private int membros;
		private String Descricao;
		
		public Perfil() {
			this.nome = nome;
			this.membros = membros;
		}
		public String getNome() {
			return this.nome;
		}
		public void setNome(String novoNome) {
			this.nome = novoNome;
		}
		
		public int getMembros() {
			return membros;
		}
		public void setMembros(int novos) {
			this.membros = novos;
		}
		
		public String getDescricao() {
			return Descricao;
		}
		public void setDescricao(String newDescricao) {
			Descricao = newDescricao;
		}
		
}
