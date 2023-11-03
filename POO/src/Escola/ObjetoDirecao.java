package Escola;

public class ObjetoDirecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Direcao Fatima = new Direcao("Fatima.","7878989489", 20, "Feminino");
		Fatima.setSetor("Escala de profesores");
		Fatima.setAltura("1.55");
		
		Fatima.pontoEntrada();
		Fatima.organizar();
		Fatima.trabalhar();
		Fatima.analise();
		Fatima.analise();
		Fatima.organizar();
		Fatima.pontoS();
		
		System.out.println("\nNome: " +Fatima.nome +"\nIdade: " +Fatima.idade +"\nCargo: " +Fatima.getCargo()
				+"\nCPF: " +Fatima.cpf +"\nSetor em qual trabalha: " +Fatima.getSetor() +"\nGenero: " +Fatima.genero +"\nAltura: " +Fatima.getAltura());
		
		Direcao Romario = new Direcao("Romario.","8494984944", 25, "Masculino");
		Romario.setSetor("Aula.");
		Romario.setAltura("1.78");
		
		Romario.pontoEntrada();
		Romario.analise();
		Romario.organizar();
		Romario.trabalhar();
		Romario.trabalhar();
		Romario.trabalhar();
		Romario.trabalhar();
		Romario.organizar();
		Romario.pontoS();
		
		System.out.println("\nNome: " +Romario.nome +"\nIdade: " +Romario.idade +"\nCargo: " +Romario.getCargo()
				+"\nCPF: " +Romario.cpf +"\nSetor em qual trabalha: " +Romario.getSetor() +"\nGenero: " +Romario.genero +"\nAltura: " +Romario.getAltura());
		
		Direcao Jose = new Direcao("Jose","55451498.", 35, "Transgenero");
		Jose.setSetor("Gestao da Escola");
		Jose.setAltura("1.75");
		
		Jose.pontoEntrada();
		Jose.analise();
		Jose.organizar();
		Jose.trabalhar();
		Jose.trabalhar();
		Jose.trabalhar();
		Jose.trabalhar();
		Jose.organizar();
		Jose.pontoS();
		
		System.out.println("\nNome: " +Jose.nome +"\nIdade: " +Jose.idade +"\nCargo: " +Jose.getCargo()
				+"\nCPF: " +Jose.cpf +"\nSetor em qual trabalha: " +Jose.getSetor() +"\nGenero: " +Jose.genero +"\nAltura: " +Jose.getAltura());
						
	}

}
