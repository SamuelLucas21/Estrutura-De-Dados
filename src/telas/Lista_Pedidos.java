package telas;

public class Lista_Pedidos {
	public ElementosInt primeiro;
	public ElementosInt ultimo;
	public ElementosInt aux = primeiro;
	public ElementosInt primeiro_int;
	public ElementosInt ultimo_int;
	private int tamanho;
	
	public void addPedido(int novoNumero) {
		ElementosInt element = new ElementosInt(novoNumero);
		if(this.primeiro == null) {
			primeiro = element;
			ultimo = primeiro;
		}else {
			ultimo.setProx(element);
			ultimo = element;
		}
	}
	
	public void addPedidoRequerido(int novoNumero) {
		ElementosInt element = new ElementosInt(novoNumero);
		if(this.primeiro_int == null) {
			primeiro_int = element;
			ultimo_int = primeiro_int;
		}else {
			ultimo_int.setProx(element);
			ultimo_int = element;
		}
	}
	
	public int tamanho() {
		ElementosInt aux = primeiro;
		if(aux!=null) {
			while(aux!=null) {
				aux.getValor();
				aux = aux.getElemento();
				tamanho++;
			}
		}
		
		
		return tamanho;
	}
	public void Elementos() {
		ElementosInt aux = primeiro;
		if(aux!=null) {
			while(aux!=null) {
				aux.getValor();
				aux = aux.getElemento();
			}
		}
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
	
	public void removerPedido(int ElementoProcurado) {
		ElementosInt anterior = primeiro_int;
		ElementosInt aux = anterior;
			if(primeiro_int!=null) {
				while(aux!=null) {
					if(aux.getValor() == ElementoProcurado) {
						if(primeiro_int.getValor() == ElementoProcurado) {
						primeiro_int = primeiro_int.getElemento();
						aux.setProx(null);
						//break;
						}
						else if(ultimo_int.getValor() == ElementoProcurado) {
							ultimo_int = anterior;
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
	
	public boolean pedidoAqui(int num) {
		ElementosInt aux = primeiro;
		if(aux!=null) {
			while(aux!=null) {
				if(num == aux.getValor()) {
					return true;	
				}
				aux = aux.getElemento();
			}
		}
		
		return false;
	}
	public boolean pedidoLa(int num) {
		ElementosInt aux = primeiro_int;
		if(aux!=null) {
			while(aux!=null) {
				if(num == aux.getValor()) {
					return true;
				}
				aux = aux.getElemento();
			}
		}
		
		return false;
	}
}
