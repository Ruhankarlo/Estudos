package listaapp;



public class ListaLigada {
	private Celula primeira;
	private Celula ultima;
	private int totalDeElementos = 0;
	
	public void adicionaNoComeco(Object elemento) {
		Celula nova = new Celula(this.primeira, elemento);
		this.primeira = nova;
			if(this.totalDeElementos==0) {
				this.ultima = this.primeira;
			}
		this.totalDeElementos++;
	}
	
	public void adiciona(Object elemento) {
		if(this.totalDeElementos==0) {
			this.adicionaNoComeco(elemento);
		}
		Celula nova = new Celula(elemento);
		this.ultima.setProxima(nova);
		this.ultima = nova;
		this.totalDeElementos++;
	}
	
	public String toString() {
		if(this.totalDeElementos==0) {
			return "[ ]";
		}
		StringBuilder builder = new StringBuilder("["); 
		Celula celulaAtual= primeira;
			//Percorrendo até o penultimo elemento
		for (int i = 0; i< this.totalDeElementos - 1; i++) {
			builder.append(celulaAtual.getElemento());
			builder.append(", ");
			celulaAtual = celulaAtual.getProxima();
		}
		builder.append(celulaAtual.getElemento());
		builder.append("]");
		return builder.toString();
		}
	
	
	public void adiciona(int posicao, Object elemento) {
		if (posicao==0) {
			this.adicionaNoComeco(elemento);
		}else if(posicao==this.totalDeElementos) {
			this.adiciona(elemento);
	}else {
		Celula celulaAnterior = this.pegaCelula(posicao-1);
		Celula novaCelula = new Celula(celulaAnterior.getProxima(), elemento);
		celulaAnterior.setProxima(novaCelula);
		this.totalDeElementos++;
	}
	}
	public Celula pegaCelula(int posicao) {
		if(!posicaoOcupada(posicao)) {
		throw new IllegalArgumentException("Posicao Invalida");	
		}
		Celula celulaAtual = primeira;
		for(int i = 0; i < posicao; i++) {
		celulaAtual = celulaAtual.getProxima();
		}
		return celulaAtual;
		}
	
	
	
	private boolean posicaoOcupada(int posicao) {

	return posicao >= 0 && posicao <= this.totalDeElementos;
		
		
	}
	
	
	public Object MostraCelula(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	public Object pega(int posicao) {
		return null;
	}
	
	public void remove(int posicao) {
		if(!posicaoOcupada(0)) {
			throw new IllegalArgumentException("Posicao invalida");
			
		}
		if (posicao ==0) {
			this.removeDoComeco();
			
		}else if (posicao == totalDeElementos) {
			this.removeDoFim();
		}else {
			Celula celulaAnterior = this.pegaCelula(posicao-1);
			Celula celulaAtual = celulaAnterior.getProxima();
			Celula celulaProxima = celulaAtual.getProxima();
			celulaAnterior.setProxima(celulaProxima);
			this.totalDeElementos--;
		}
		
	}
	
	public int tamanho() { 
	    System.out.println("O tamanho da lista é " + totalDeElementos);
	    return totalDeElementos;
	}
	
	public boolean contem(Object elemento) {
		Celula celulaAtual = this.primeira;
		while(celulaAtual != null ){
			if(celulaAtual.getElemento().equals(elemento)) {
				return true;
			}
			celulaAtual = celulaAtual.getProxima();
		}
		return false;
	}
	
	public void removeDoComeco() {
		if(!posicaoOcupada(0)) {
			throw new IllegalArgumentException("Posicao invalida");
			
		}
		this.primeira = this.primeira.getProxima();
		this.totalDeElementos--;
		if(this.totalDeElementos==0) {
			this.ultima = null;
		}
	}
	
	public void removeDoFim() {
		Celula penultimaCelula = this.pegaCelula(totalDeElementos - 1);
		penultimaCelula.setProxima(null);
		this.ultima = penultimaCelula;
		this.totalDeElementos--;
		if(this.totalDeElementos==0) {
			this.primeira = null;
		}
	}
}

