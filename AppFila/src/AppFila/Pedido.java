package AppFila;

public class Pedido {
	private Pedido proximo;
	private Object elemento;
	
	public Pedido(Object elemento) {
		this.elemento = elemento;
	}
	
	public Pedido getProximo() {
		return proximo;
	}
	
	public void setProximo(Pedido proximo) {
		this.proximo = proximo;
	}
	
	public Object getElemento() {
		return elemento;
	}

}
