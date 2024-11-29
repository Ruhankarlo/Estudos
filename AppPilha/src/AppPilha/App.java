package AppPilha;

public class App {
	public static void main(String[]args) {
		
		Pilha pilha = new Pilha();
	
		pilha.empilhar("Peça 1");
		pilha.empilhar("Peça 2");
		pilha.empilhar("Peça 3");
		pilha.empilhar("Peça 4");
		
		System.out.println("Pilha atual: " + pilha.ToString());
		System.out.println("Desempilhar: " + pilha.desempilhar());
		System.out.println("Pilha atual: " + pilha.ToString());
		System.out.println("Tamanho da pilha: " + pilha.tamanhoPilha());
		System.out.println("A pilha está vazia?: " + pilha.estaVazia());
		System.out.println("Topo da Pilha: " + pilha.topo());
		
	}

}
