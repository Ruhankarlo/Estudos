package LojaEletrodomestico;
import java.util.Scanner;

//Dou inicio a um objeto gerente
public class ObjetoGerente {
	public static void main (String[] args) {
	
	//Abro Scanner e inicio o objeto "Func1"
	Scanner lerDados = new Scanner(System.in);
	Gerente Func1 = new Gerente(null, 0, null, 0, 0, null, 0, 0);
	
	//Faço saída de uma solicitação ao usuario, para dar entrada em um Dado
	
	System.out.println("Digite um nome do Funcionario:");
	Func1.setNome(lerDados.next());
	
	System.out.println("Digite a idade do Funcionario:");
	Func1.setIdade(lerDados.nextInt());
	
	System.out.println("Digite o cargo do Funcionário");
	Func1.setCargo(lerDados.next());
	
	System.out.println("Digite o valor do Salário:");
	Func1.setSalario(lerDados.nextDouble());
	
	System.out.println("Digite o Valor do bônus fixo:");
	Func1.setBonus(lerDados.nextDouble());
	
	System.out.println("Digite o Departamento do Funcionário");
	Func1.setDepartamento(lerDados.next());
	
	System.out.println("Digite o número de pessaos que acrescentam a equipe");
	Func1.setNumSubordinados(lerDados.nextInt());
	
	System.out.println("Digite o valor fixo do bônus Anual");
	Func1.setBonusAnual(lerDados.nextDouble());
	
	
//Inicio os métodos inerentes da classe Gerente
Func1.gerenciar();
Func1.calcularNovoSalario(0);

// Inicio os métodos inerentes da Classe Pai Funcionario
Func1.calcularSalario();
Func1.trabalhar();
Func1.descansar();
	

//Saída das variáveis para verificar se está tudo de acordo:

System.out.println("Nome: " +Func1.getNome() +"\nIdade: " +Func1.getIdade() +"\nCargo: " +Func1.getCargo() +"\nSalário: " +Func1.getSalario()
+"\nBonus: " +Func1.getBonus() +"\nDepartamento: " +Func1.getDepartamento() +"\nEquipe: " +Func1.getNumSubordinados() +"\nBônus Anual: " +Func1.getBonusAnual());
	
lerDados.close();
	}
	
}
