package telas;

public class ElementosInt {
	private int valor;
	private ElementosInt prox;
	
	public ElementosInt(int novoValor) {
		this.valor = novoValor;
		prox = null;
	}
	
	public int getValor() {
		return valor;
	}
	public void setValor(int novoValor) {
		valor = novoValor;
	}
	public ElementosInt getElemento() {
		return prox;
	}
	public void setProx(ElementosInt novoProx) {
		prox = novoProx;
	}

}
