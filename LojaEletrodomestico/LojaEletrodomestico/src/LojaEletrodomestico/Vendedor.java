package LojaEletrodomestico;
//Crio uma terceira classe filha para a Classe pai Funcionario

// Crio seus atributos singulares, inerente da classe
class Vendedor extends Funcionario {
	private double meta;
	private boolean funcAtivo;
	private boolean bonusAniversario;
		
	// Inicio métodos construtor p/ usar com objetos
	public Vendedor(String nome, int idade, String cargo, double salario, double bonus, double meta, boolean funcAtivo,
			boolean bonusAniversario) {
		super(nome, idade, cargo, salario, bonus);
		this.meta = meta;
		this.funcAtivo = funcAtivo;
		this.bonusAniversario = bonusAniversario;
	}
	// Inicio os métodos GET e SET
	public double getMeta() {
		return meta;
	}
	public void setMeta(double meta) {
		this.meta = meta;
	}
	public boolean getFuncAtivo() {
		return funcAtivo;
	}
	public void setFuncAtivo(boolean funcAtivo) {
		this.funcAtivo = funcAtivo;
	}
	public boolean isBonusAniversario() {
		return bonusAniversario;
	}
	public void setBonusAniversario(boolean bonusAniversario) {
		this.bonusAniversario = bonusAniversario;
	}
	
	// inicio um método com Return. Quando fizer aniversário, adicionará +1 na idade (Exemplo).
	
	public int fazAniversário (int niver) {
		this.setIdade(niver + 1);
		return this.getIdade();
				
	}
	// Método sem return, estabelecendo que o bonus de aniversário está ativo
	public void bonusniver() {
		this.bonusAniversario = true;
		
	}
   

}