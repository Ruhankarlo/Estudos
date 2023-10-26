package Escola;

public class ObjetoCozinha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cozinha Maria = new Cozinha("Maria", "544859",60, "feminino");
		Maria.setSetor("Auxiliar de Cozinha");
		Maria.ativarPCD();
		Maria.FuncInativo();
		
		System.out.println("\nNome: " +Maria.nome +"\nIdade: " +Maria.idade
		+"\nCPF: " +Maria.cpf +"\nSetor em qual trabalha: " +Maria.getSetor() +"\nGenero: " +Maria.genero );
		
		Cozinha Rosineide = new Cozinha("Rosineide", "854984498894", 58, "Feminino");
		Rosineide.setSetor("Mestre de Cozinha");
		Rosineide.ativarPCD();
		
		
		System.out.println("\nNome: " +Rosineide.nome +"\nIdade: " +Rosineide.idade
		+"\nCPF: " +Rosineide.cpf +"\nSetor em qual trabalha: " +Rosineide.getSetor() +"\nGenero: " +Rosineide.genero);
		
		Cozinha Alberto = new Cozinha("Alberto", "55454458498", 40, "Masculino");
		
		Alberto.setSetor("Serviços Gerais");
		
		
		System.out.println("\nNome: " +Alberto.nome +"\nIdade: " +Alberto.idade
		+"\nCPF: " +Alberto.cpf +"\nSetor em qual trabalha: " +Alberto.getSetor() +"\nGenero: " +Alberto.genero);
		
	}

}
