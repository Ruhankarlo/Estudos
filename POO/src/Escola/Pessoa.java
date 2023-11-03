package Escola;

public class Pessoa {
		String nome;
		String cpf;
		int idade;
		String genero;
		
		public Pessoa (String nome, String cpf, int idade, String genero) {
			this.nome = nome;
			this.cpf = cpf;
			this.idade = idade;
			this.genero = genero;
		}
		
		public void fala() {
			System.out.println("A pessoa falou");
		}
		
		public void escreve() {
			System.out.println("A pessoa escreveu");			
		}
		
	public int fazAniversario(int idadeAtual) {
		this.idade = idadeAtual + 1;
		return this.idade;
	}
	public String mudaGen (String mudar) {
		mudar = "Transgênero";
		return this.genero = mudar;
		
	}
}
