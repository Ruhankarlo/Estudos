package listaapp;

public class App {

	public static void main(String[] args) {
	
		ListaLigada lista1 = new ListaLigada();
		
		lista1.adicionaNoComeco("Adriano");
		lista1.adicionaNoComeco("Lorhaynny");
		lista1.adiciona("david");
		
		System.out.println("Elementos: " +lista1.toString());
		lista1.tamanho();
	

	}

}
