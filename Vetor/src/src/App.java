package src;

import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
        // Estância variável scanner para capturar entradas de usuário
        Scanner scanner = new Scanner(System.in);

        // Estância uma variável com nome "vetor" do tipo Vetor definido em outra classe
        Vetor vetor = new Vetor();

        // Cria uma variávem com nome de "a1" do tipo Aluno definido em outra classe
     /**   Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno();
        Aluno a5 = new Aluno();

        // System.out.print("Entre com o nome do aluno: ");
        a1.setNome("Maria");
        a2.setNome("José");
        a3.setNome("Juca");
        a4.setNome("Francisco");
        a5.setNome("Tainara");

        // Adiciona a variável a1 no vetor.
        vetor.adiciona(a1);
        vetor.adiciona(a2);
        vetor.adiciona(a3);
        vetor.adiciona(a4);

        // Chama o método "mostraTodos()" e exibe seu retorno.
        System.out.println("vetor.mostraTodos(): " + vetor.mostraTodos());

        // Chama o método "contemAluno()" para verificar se existe determinado aluno na
        // lista.
        System.out.println("vetor.contemAluno(): " + vetor.contemAluno("Francisco"));

        // Chama o método "tamanhoAtual" para mostrar quando alunos estão inseridos na
        // lista.
        System.out.println("vetor.tamanhoAtual(): " + vetor.tamanhoAtual());

        System.out.println("vetor.consultaPorID(): " + vetor.consultaPorID(0));
        
        vetor.inserePorID(2, a5);
        System.out.println(vetor.mostraTodos());
   
        
        //remove por ID
        vetor.removePorID(2);
        
        
        // Chama o método "mostraTodos()" e exibe seu retorno
        System.out.println("vetor.mostraTodos(): " + vetor.mostraTodos());
        
        vetor.removeUltimo();
        System.out.println("vetor.mostraTodos(): " + vetor.mostraTodos());
        
        
        scanner.close(); **/
        int choice = 0;
        do {
        	System.out.println("Escolha uma opção:");
        System.out.println("1 - Adicionar aluno");
        System.out.println("2 - Adicionar aluno por ID");
        System.out.println("3 - Mostrar todos alunos");
        System.out.println("4 - Consultar por ID");
        System.out.println("5 - Remove o ultimo");
        System.out.println("6 - Remover por ID");
        System.out.println("0 - SAIR");
        
        choice = scanner.nextInt();
        scanner.nextLine();
        
        switch (choice) {
        case 0:{
        	System.out.println("Saindo do sistema...");
        	break;}
        case 1:{
			Aluno aluno1 = new Aluno();
			System.out.println("Insira o nome do Aluno");
			aluno1.setNome(scanner.nextLine());
			vetor.adiciona(aluno1);
			System.out.println("O aluno " +aluno1.getNome() +" foi inserido com sucesso!");
        
			break;
        }
        case 2:{
        	System.out.println("Há exatamente " +vetor.tamanhoAtual() +" alunos no vetor");
        	Aluno aluno2 = new Aluno();
        	System.out.println("Digite o nome do aluno");
        	aluno2.setNome(scanner.nextLine());
        	System.out.println("Digite a posição (de 0 a " +(vetor.tamanhoAtual()-1));
        	vetor.inserePorID(Integer.parseInt(scanner.nextLine()), aluno2);
        	break;
        }
        case 3:{
        	System.out.println("Todos alunos são: " +vetor.mostraTodos());
			break;
        }
        case 4:	{
        	System.out.println("Qual ID você deseja consultar?");
        	int id = scanner.nextInt();
        	scanner.nextLine();
        	System.out.println("O ID consultado é o Aluno: " +vetor.consultaPorID(id));		
        	break;
        }
        case 5:{
        	vetor.removeUltimo();
        	System.out.println("O ultimo foi removido!");
        }
        case 6:{
        	System.out.println("Qual Aluno você quer remover? (Digite o ID)");
        	int id = scanner.nextInt();
        	scanner.nextLine();
        	vetor.removePorID(id);
        	System.out.println("O aluno " +vetor.consultaPorID(id) +"foi removido");
        	break;
        }
		default:
			System.out.println("Inválido");
			break;
		}
        }while(choice!=0);
        
        scanner.close();
        
	}

}