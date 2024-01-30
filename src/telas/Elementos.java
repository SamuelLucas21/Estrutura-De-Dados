package telas;

public class Elementos {
			public String Fotos;
            public String publication;
            public Elementos proximo;

            public Elementos(String novaPublication, String foto){
                this.publication = novaPublication;
                this.Fotos = foto;
                proximo = null;

            }

            public String getPublication(){
                return publication;
            }

            public void setPublication(String novaPublication){
                this.publication = novaPublication;
            }
            public String getFotos() {
            	return this.Fotos;
            }
            public void setFotos(String Foto) {
            	this.Fotos = Foto;
            }
            
            public Elementos getProximo(){
                return proximo;
            }

            public void setProximo(Elementos proximo){
                this.proximo = proximo;
            }

}
