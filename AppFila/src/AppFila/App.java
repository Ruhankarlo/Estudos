package AppFila;

public class App {

	public static void main(String[] args) {
		
		Fila fila = new Fila();
		
		fila.enfileirar("Pedido 1");
		fila.enfileirar("Pedido 2");
		fila.enfileirar("Pedido 3");
		fila.enfileirar("Pedido 4");
		fila.enfileirar("Pedido 5");
		
		System.out.println("Pedidos na Fila:"+ fila.ToString());

		System.out.println("Desenfileirar:"+ fila.desinfileirar());	
		System.out.println("Desenfileirar:"+ fila.desinfileirar());	

		System.out.println("Primeiro pedido da fila:"+ fila.primeiro());

		System.out.println("Pedidos na Fila:"+ fila.ToString());
		System.out.println("Tamanho da Fila:"+ fila.tamanho());
		
	}

}
