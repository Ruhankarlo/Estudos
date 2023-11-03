package Escola;

public class ObjetoMotorista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motorista Pedrinho = new Motorista("Pedro", "58985989", 35, "Masculino");
			Pedrinho.catHab = "AB";
			Pedrinho.setNumHab("741852963");
			
			Pedrinho.fazAniversario(Pedrinho.idade);
			Pedrinho.MotInativo();
			Pedrinho.fazAniversario(Pedrinho.idade);
			Pedrinho.fazAniversario(Pedrinho.idade);
			Pedrinho.fazAniversario(Pedrinho.idade);
			Pedrinho.fazAniversario(Pedrinho.idade);
			
			
			
			System.out.println("Nome: " +Pedrinho.nome +"\nIdade: " +Pedrinho.idade +"\nCPF: " +Pedrinho.cpf +"\nNúmero da Habilitação: "
					+Pedrinho.getNumHab() +"\nCategoria da Habilitação: " +Pedrinho.catHab +"\nGênero: " +Pedrinho.genero);
			
		

	}

}
