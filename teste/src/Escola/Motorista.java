package Escola;

public class Motorista extends Pessoa {
	

	
	public String catHab;
	private String numHab;
	public boolean atividade = true;
	
	public Motorista(String nome, String cpf, int idade, String genero) {
		super(nome, cpf, idade, genero);
	
	}

	public String getNumHab() {
		return numHab;
	}

	public void setNumHab(String numHab) {
		this.numHab = numHab;
	}
	
	public void MotInativo() {
		this.atividade = false;
	}
	
	public int fazAniversario(int idadeAtual) {
		this.idade = idadeAtual + 1;
		this.atividade = true;
		
		return this.idade;
	}
	
}
