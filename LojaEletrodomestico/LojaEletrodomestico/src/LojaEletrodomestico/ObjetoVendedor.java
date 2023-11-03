package LojaEletrodomestico;
import java.util.Scanner;

public class ObjetoVendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor:");
        String nome = scanner.nextLine();

        System.out.println("Informe a idade do vendedor:");
        int idade = scanner.nextInt();

        System.out.println("Informe o cargo do vendedor:");
        String cargo = scanner.nextLine();

        System.out.println("Informe o salário do vendedor:");
        double salario = scanner.nextDouble();

        System.out.println("Informe o bônus do vendedor:");
        double bonus = scanner.nextDouble();

        System.out.println("Informe a meta de vendas do vendedor:");
        double meta = scanner.nextDouble();

        System.out.println("O funcionário está ativo? (true/false)");
        boolean funcAtivo = scanner.nextBoolean();

        System.out.println("O funcionário tem direito a bônus de aniversário? (true/false)");
        boolean bonusAniversario = scanner.nextBoolean();
        
        //Outro jeito de instanciar um objeto depois de informar os dados:

        Vendedor vendedor1 = new Vendedor(nome, idade, cargo, salario, bonus, meta, funcAtivo, bonusAniversario);

        System.out.println("Nome: " + vendedor1.getNome());
        System.out.println("Idade: " + vendedor1.getIdade());
        System.out.println("Cargo: " + vendedor1.getCargo());
        System.out.println("Salário: R$" + vendedor1.getSalario());
        System.out.println("Bônus: R$" + vendedor1.getBonus());
        System.out.println("Meta de vendas: R$" + vendedor1.getMeta());
        System.out.println("Funcionário ativo: " + vendedor1.getFuncAtivo());
        System.out.println("Bônus de aniversário: " + vendedor1.isBonusAniversario());

        vendedor1.fazAniversário(idade);
        System.out.println("Idade após o aniversário: " + vendedor1.getIdade());
        
scanner.close();
    }
}
