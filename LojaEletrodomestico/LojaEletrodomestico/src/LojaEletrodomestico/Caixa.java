package LojaEletrodomestico;
//Da classe Funcionario faço uma classe filha para manusear, essa é um exemplo "Caixa"

//Inicio os atributos inerente da Classe Caixa
class Caixa extends Funcionario {
    private String turno;
    private boolean atendimentoPrioritario;
    
    // Dou inicio ao Get e Set do ATENDIMENTO PRIORITARIO

    public boolean isAtendimentoPrioritario() {
		return atendimentoPrioritario;
	}

	public void setAtendimentoPrioritario(boolean atendimentoPrioritario) {
		this.atendimentoPrioritario = atendimentoPrioritario;
	}
	
	// Com o métodos contrutor, faço o ecapsulamento dos atributos geral e atributos unicos da classe para usar no objeto
	public Caixa(String nome, int idade, String cargo, double salario, double bonus, String turno, boolean atendimentoPrioritario) {
        super(nome, idade, cargo, salario, bonus);
        this.turno = turno;
        this.atendimentoPrioritario = atendimentoPrioritario;
    }

	// Faço dois métodos sem Return, usando Public void (Exemplos)
    public void atenderCliente() {
        if (atendimentoPrioritario) {
            System.out.println(getNome() + " está atendendo um cliente prioritário.");
        } else {
            System.out.println(getNome() + " está atendendo um cliente.");
        }
        
    }

    public void calcularBonusMensal() {
        System.out.println("O bônus mensal do caixa " + getNome() + " é R$" + getBonus());
    }

    // Inicio  Get e Set do Turno
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

}
