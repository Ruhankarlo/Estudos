package LojaEletrodomestico;

//Inicio os atributos da Classe Pai
class Funcionario {
    private String nome;
    private int idade;
    private String cargo;
    private double salario;
    private double bonus;

  // Como os atributos estão privados(segurança), crio os métodos Get e Set.
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	//Faço um método construtor para encapsular informação nas classes filhas posteriores.
	public Funcionario(String nome, int idade, String cargo, double salario, double bonus) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
        this.bonus = bonus;
    }
	
	//Dou entrada em um método sem return, por isso "void" (EXEMPLO)
    public void calcularSalario() {
        System.out.println("O salário do funcionário " + nome + " é R$" + salario);
    }

    public void calcularNovoSalario(double novoSalario) {
        System.out.println("O novo salário do funcionário " + nome + " é R$" + novoSalario);
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }

    public void descansar() {
        System.out.println(nome + " está descansando.");
    }
}

