package AppFila;

public class Fila {
	
	private Pedido primeiro;
	private Pedido ultimo;
	private int totalDeElemento;
	
	public Fila() {
		this.primeiro = null;
		this.ultimo = null;
		this.totalDeElemento = 0;
	}
	
	public void enfileirar(Object elemento) {
		Pedido novoPedido = new Pedido(elemento);
		
		if(this.totalDeElemento == 0) {
			this.primeiro = novoPedido;
			this.ultimo = novoPedido;
		}else {
			this.ultimo.setProximo(novoPedido);
			this.ultimo = novoPedido;
		}
		
		totalDeElemento++;
	}
	
	public Object desinfileirar() {
		
		if(this.totalDeElemento ==0 ) {
			throw new IllegalArgumentException("A fila está vazia!");
		}
		Object elemento = this.primeiro.getElemento();
		this.primeiro = this.primeiro.getProximo();
		this.totalDeElemento--;
		
		if(this.totalDeElemento == 0) {
			this.ultimo = null;
		}
		return elemento;
	}
	
	public Object primeiro () {
		if(this.totalDeElemento == 0 ) {
			throw new IllegalArgumentException("A fila está vazia!");
		}			
		return this.primeiro.getElemento();
	}
	public int tamanho() {
		return this.totalDeElemento;
	}
	
	public String ToString() {
		StringBuilder builder = new StringBuilder("[");
		Pedido atual = this.primeiro;
		while (atual != null) {
			builder.append(atual.getElemento());
			if(atual.getProximo() != null) {
				builder.append(", ");
				
			}
			atual = atual.getProximo();
		}
		builder.append("]");
		return builder.toString();
	}

}	
