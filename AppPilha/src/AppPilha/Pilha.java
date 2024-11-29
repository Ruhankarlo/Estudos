package AppPilha;

public class Pilha {
	private Peca topo;
	private int totalElemento;
	
	public Pilha() {
		this.topo = null;
		this.totalElemento = 0;
	}
	
	public void empilhar(Object elemento) {
		Peca novaPeca = new Peca(this.topo, elemento);
		this.topo = novaPeca;
		this.totalElemento++;
	}
	
	public Object desempilhar() {
		if(this.totalElemento == 0) {
			throw new IllegalArgumentException("A pilha vazia!");
		}
		Object elementoDesempilhado = this.topo.getElemento();
		this.topo = topo.getProxima();
		this.totalElemento--;
		return elementoDesempilhado;
	}
	
	public String ToString() {
		StringBuilder builder = new StringBuilder("[");
		Peca atual = this.topo;
		while (atual != null) {
			builder.append(atual.getElemento());
			if(atual.getProxima() != null) {
				builder.append(", ");
				
			}
			atual = atual.getProxima();
		}
		builder.append("]");
		return builder.toString();
	}

	public int tamanhoPilha() {
		return this.totalElemento;
	}
	
	public boolean  estaVazia() {
		return this.totalElemento == 0;
	}
	
	public Object topo() {
		if(this.totalElemento == 0) {
			throw new IllegalArgumentException("A pilha está vazia!");
			
		}
		
		return this.topo.getElemento();
		
	}
}
