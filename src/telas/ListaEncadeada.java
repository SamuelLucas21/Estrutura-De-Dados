package telas;

import java.time.LocalTime;

import javax.swing.JOptionPane;

public class ListaEncadeada {
        public Elementos primeiro;
        public Elementos ultimo;
        private int contador = 0;
       
        public void adicionar(String novaPublication, String foto){
        	try {
            Elementos element = new Elementos(novaPublication, foto);    
                if(this.primeiro == null){
                    this.primeiro = element;
                    this.ultimo = element;
                    
                }
                else{
                    this.ultimo.setProximo(element);
                    this.ultimo = element;
                    
                }
                
        	}catch(Exception e) {
            	   
               }
        }
        
        public void exibir(){
        	StringBuilder sb = new StringBuilder();
            if(primeiro!=null){
                Elementos aux = primeiro;
                    while(aux!=null){
                    	sb.append(aux.publication).append("\n");
                    	
                        //System.out.println(aux.getPublication());
                        aux = aux.getProximo();
                    }
                    
                    System.out.println(aux.toString());
            }
        }
        
        
        public boolean EncontrarPostagem(String post) {
        	Elementos aux = primeiro;
        	while(aux!=null) {
        		if(aux.getPublication().equals(post)) {
        			JOptionPane.showMessageDialog(null, "Postagem Encontrado");
        			contador = contador;
        			return true;
        		}
        		contador++;
        		aux= aux.getProximo();
        	}
        	return false;
        	
        }
        

        
        boolean l=false;
        public void remover(String valor) {
         Elementos anterior = primeiro;
         Elementos aux = anterior;
         
         if(primeiro!=null) {
				while(aux!=null) {

					if(aux.getPublication().equals(valor)) {
						if(primeiro.getPublication().equals(valor)) {
						primeiro = primeiro.getProximo();
						aux.setProximo(null);
						//break;
						}
						else if(ultimo.getPublication().equals(valor)) {
							ultimo = anterior;
							anterior.setProximo(null);
							//break;
						}
						else {
							anterior.setProximo(aux.getProximo());
							aux = null;
							//break;
							
						}
						l=true;
						break;
					}
					anterior = aux;
					aux = aux.getProximo();
					l=false;
				}
			}
         

         
         
        }
        
        public boolean getMensagem() {
        	
        	if(l==true) {
        		return true;
        	}        	
        	return false;
        }
        
        public int getSize() {
        	int tamanho = 0;
        	Elementos aux = this.primeiro;
        	if(aux != null) {
        		while(aux != null) {
        			tamanho++;
        			aux = aux.getProximo();
        		}
        	}
        	return tamanho;
        }
        
        public int getRemoved(String nome, String sobre_nome, String mens) {
        	Elementos aux = primeiro;
        	String nem;
        	int i=0;
        	if(aux!=null) {
        		while(aux!=null) {
        			nem = "-------------------------------------------------------------------------------" + "\n" + nome + " " + sobre_nome + ":"+"\n\t" + null + "\n" +"-------------------------------------------------------------------------------" +"\n";
        			if(aux.getPublication().equals(nem)) {
        				return i;
        			}
        			i++;
        			aux = aux.getProximo();
        		}
        	}
        	   	
        	return 0;
        }


}
