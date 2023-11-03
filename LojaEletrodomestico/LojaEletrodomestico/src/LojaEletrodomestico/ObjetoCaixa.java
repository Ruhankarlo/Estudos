package LojaEletrodomestico;
import java.util.Scanner;
//EXEMPLO PUXANDO O OBJETO CAIXA

public class ObjetoCaixa {
		public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do caixa:");
        String nome = scanner.nextLine();

        System.out.println("Informe a idade do caixa:");
        int idade = scanner.nextInt();

        System.out.println("Informe o cargo do caixa:");
        String cargo = scanner.nextLine();

        System.out.println("Informe o salário do caixa:");
        double salario = scanner.nextDouble();

        System.out.println("Informe o bônus do caixa:");
        double bonus = scanner.nextDouble();

        System.out.println("Informe o turno do caixa:");
        String turno = scanner.nextLine();

        System.out.println("O caixa atende clientes prioritários? (true/false)");
        boolean atendimentoPrioritario = scanner.nextBoolean();

        Caixa caixa1 = new Caixa(nome, idade, cargo, salario, bonus, turno, atendimentoPrioritario);

        System.out.println("Nome: " + caixa1.getNome());
        System.out.println("Idade: " + caixa1.getIdade());
        System.out.println("Cargo: " + caixa1.getCargo());
        System.out.println("Salário: R$" + caixa1.getSalario());
        System.out.println("Bônus: R$" + caixa1.getBonus());
        System.out.println("Turno: " + caixa1.getTurno());
        System.out.println("Atendimento prioritário: " + caixa1.isAtendimentoPrioritario());

        caixa1.atenderCliente();
        
        scanner.close();
    
}
}


