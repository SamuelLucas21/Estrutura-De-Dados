package telas;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Lista_Friends {
		public ElementosInt primeiro;
		public ElementosInt ultimo;
		
		ListaEncadeada list1;
		ListaEncadeada list2;
		ListaEncadeada list3;
		ListaEncadeada list4;
		ListaEncadeada list5;
		ListaEncadeada fatec;
		
		ListaEncadeada group;
		
        LocalTime horaAtual = LocalTime.now();
        String minutosFormatados = String.format("%02d", horaAtual.getMinute());
        String horaFormatada = String.format("%02d:%s", horaAtual.getHour(), minutosFormatados);

		
		
		public Lista_Friends() {
			
			this.list1 = new ListaEncadeada();
			this.list2 = new ListaEncadeada();
			this.list3 = new ListaEncadeada();
			this.list4 = new ListaEncadeada();
			this.list5 = new ListaEncadeada();
			this.fatec = new ListaEncadeada();
		}
		
		ListaEncadeada chat;
		
		private int tamanho;
		ArrayList<Integer> friends = new ArrayList<Integer>();
		
		public void add(int novoValor) {
			ElementosInt element = new ElementosInt(novoValor);
			if(contains(novoValor) == false) {
			
				if(primeiro == null) {
					primeiro = element;
					ultimo = primeiro;
				}else {
					ultimo.setProx(element);
					ultimo = element;
					}
			}else {
    			JOptionPane.showMessageDialog(null, "Usuario já é seu amigo!", "Atenção!!!", JOptionPane.INFORMATION_MESSAGE);

			}
		}
		
		public void mostrarfrie() {
			ElementosInt aux = primeiro;
				if(aux!=null) {
					while(aux!=null) {
						System.out.println(aux.getValor());
						friends.add(aux.getValor());
						aux = aux.getElemento();
					}
				}
		}
		public boolean contains(int novoValor) {
			
			ElementosInt aux = primeiro;
				if(aux!=null) {
					while(aux!=null) {
						if(aux.getValor() == novoValor) {
							return true;
						}
						aux = aux.getElemento();
					}
				}
			
			return false;
		}
		public void removerAmigo(int ElementoProcurado) {
			ElementosInt anterior = primeiro;
			ElementosInt aux = anterior;
				if(primeiro!=null) {
					while(aux!=null) {
						if(aux.getValor() == ElementoProcurado) {
							if(primeiro.getValor() == ElementoProcurado) {
							primeiro = primeiro.getElemento();
							aux.setProx(null);
							//break;
							}
							else if(ultimo.getValor() == ElementoProcurado) {
								ultimo = anterior;
								anterior.setProx(null);
								//break;
							}
							else {
								anterior.setProx(aux.getElemento());
								aux = null;
								//break;
								
							}
							break;
						}
						anterior = aux;
						aux = aux.getElemento();
					}
				}
		}
		public int tamanho() {
			ElementosInt aux = primeiro;
				if(aux!=null) {
					while(aux!=null) {
						aux.getValor();
						aux=aux.getElemento();
						tamanho ++;
						
					}
				}
			
			
			return this.tamanho;
			
		}
		
		public void ChatFatec(String novo) {
			StringBuilder sb = new StringBuilder();
    		sb.append("---------------------------------------------------").append("\n").append("Diretrizes").append(" ").append("Fatec" + ":").append("\n\n").append(novo).append("\n").append("                                      " +horaFormatada).append("\n").append("---------------------------------------------------").append("\n");
			fatec.adicionar(sb.toString(), null);
		}
		public String getChatFatec() {
			Elementos aux = fatec.primeiro;
			StringBuilder retorno = new StringBuilder();
			if(aux !=null) {
				while(aux!=null) {
					retorno.append(aux.getPublication());
					aux = aux.getProximo();
				}
				return retorno.toString();
			}
			
			return null;
		}
		
		public ListaEncadeada getReturn(int i) {
			
			if(i==0) {
				return list1;
			}
			if(i==1) {
				return list2;
			}
			if(i==2) {
				return list3;
			}
			if(i==3) {
				return list4;
			}
			if(i==4) {
				return list5;
			}
			
			return null;
		}
		

		public void chat(int indice, String post , String nome, String sobre_nome) {
			
			
	        //StringBuilder sb = new StringBuilder();
			
			if(indice == 0) {
				StringBuilder sb1 = new StringBuilder();
	    		sb1.append("-------------------------------------------------------------------------------").append("\n").append(nome).append(" ").append(sobre_nome + ":").append("\n\t").append(post).append("\n").append("\t\t\t").append(horaFormatada).append("\n").append("-------------------------------------------------------------------------------").append("\n");
				list1.adicionar(sb1.toString(), null);
			
		        
			}
			if(indice == 1) {
				StringBuilder sb2 = new StringBuilder();
	    		sb2.append("-------------------------------------------------------------------------------").append("\n").append(nome).append(" ").append(sobre_nome + ":").append("\n\t").append(post).append("\n").append("\t\t\t").append(horaFormatada).append("\n").append("-------------------------------------------------------------------------------").append("\n");
				list2.adicionar(sb2.toString(), null);


			}
			if(indice == 2) {
				StringBuilder sb3 = new StringBuilder();
	    		sb3.append("-------------------------------------------------------------------------------").append("\n").append(nome).append(" ").append(sobre_nome + ":").append("\n\t").append(post).append("\n").append("\t\t\t").append(horaFormatada).append("\n").append("-------------------------------------------------------------------------------").append("\n");
				list3.adicionar(sb3.toString(), null);

			}
			if(indice == 3) {
				StringBuilder sb4 = new StringBuilder();
	    		sb4.append("-------------------------------------------------------------------------------").append("\n").append(nome).append(" ").append(sobre_nome + ":").append("\n\t").append(post).append("\n").append("\t\t\t").append(horaFormatada).append("\n").append("-------------------------------------------------------------------------------").append("\n");
				list4.adicionar(sb4.toString(), null);
			

			}
			if(indice == 4) {
				StringBuilder sb5 = new StringBuilder();
	    		sb5.append("-------------------------------------------------------------------------------").append("\n").append(nome).append(" ").append(sobre_nome + ":").append("\n\t").append(post).append("\n").append("\t\t\t").append(horaFormatada).append("\n").append("-------------------------------------------------------------------------------").append("\n");				
	    		list5.adicionar(sb5.toString(), null);
			
				
			}
			
		}
		
		
		
		
		
		public String chatRetorn(int indice) {
			if(indice == 0) {
				Elementos aux1 = list1.primeiro;
				StringBuilder sb1 = new StringBuilder();

		        while (aux1 != null) {
		        	//sb1.append("").append(aux1.publication);
		    //		sb1.append("-------------------------------------------------------------------------------").append("\n").append(nome).append(" ").append(sobre_nome + ":").append("\n\t").append(aux1.publication).append("\n").append("-------------------------------------------------------------------------------").append("\n");
		        	sb1.append(aux1.getPublication());
			        aux1 = aux1.getProximo();
		        }
		        return sb1.toString();
			}
			if(indice == 1) {
				Elementos aux2 = list2.primeiro;
				StringBuilder sb2 = new StringBuilder();

				while (aux2 != null) {
//		        	sb2.append("").append(aux2.publication);
		   // 		sb2.append("-------------------------------------------------------------------------------").append("\n").append(nome).append(" ").append(sobre_nome + ":").append("\n\t").append(aux2.publication).append("\n").append("-------------------------------------------------------------------------------").append("\n");
					sb2.append(aux2.getPublication());
			        aux2 = aux2.getProximo();
		        }
				
				
				return sb2.toString();
			}
			if(indice == 2) {
				Elementos aux3 = list3.primeiro;
				StringBuilder sb3 = new StringBuilder();

				while (aux3 != null) {
//		        	sb2.append("").append(aux2.publication);
		 //   		sb2.append("-------------------------------------------------------------------------------").append("\n").append(nome).append(" ").append(sobre_nome + ":").append("\n\t").append(aux2.publication).append("\n").append("-------------------------------------------------------------------------------").append("\n");
					sb3.append(aux3.getPublication());
			        aux3 = aux3.getProximo();
		        }
				
				return sb3.toString();
			}
			if(indice == 3) {
				Elementos aux4 = list4.primeiro;
				StringBuilder sb4 = new StringBuilder();

				while (aux4 != null) {
//		        	sb2.append("").append(aux2.publication);
		    	//	sb2.append("-------------------------------------------------------------------------------").append("\n").append(nome).append(" ").append(sobre_nome + ":").append("\n\t").append(aux2.publication).append("\n").append("-------------------------------------------------------------------------------").append("\n");
					sb4.append(aux4.getPublication());
			        aux4 = aux4.getProximo();
		        }
				
				return sb4.toString();
			}
			if(indice == 4) {
				Elementos aux5 = list5.primeiro;
				StringBuilder sb5 = new StringBuilder();

				while (aux5 != null) {
//		        	sb2.append("").append(aux2.publication);
		    	//	sb2.append("-------------------------------------------------------------------------------").append("\n").append(nome).append(" ").append(sobre_nome + ":").append("\n\t").append(aux2.publication).append("\n").append("-------------------------------------------------------------------------------").append("\n");
					sb5.append(aux5.getPublication());
			        aux5 = aux5.getProximo();
		        }
				
				
				
				return sb5.toString();
			}
			
			return null;
		}
		
		
}
