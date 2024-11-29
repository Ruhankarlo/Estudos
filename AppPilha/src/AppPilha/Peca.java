package AppPilha;

public class Peca {
	private Peca proxima;
	private Object elemento;
	
	public Peca(Peca proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}
	
	public Peca(Object elemento) {
		this.elemento = elemento;
	}
	
	public Peca getProxima() {
		return proxima;
	}
	
	public void setProxima(Peca proxima) {
		this.proxima = proxima;
	}
	
	public Object getElemento() {
		return elemento;
	}
}
