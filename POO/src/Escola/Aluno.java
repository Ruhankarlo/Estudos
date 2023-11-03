package Escola;

public class Aluno extends Pessoa{
	
	
	public Aluno(String nome, String cpf, int idade, String genero) { 
		super(nome, cpf, idade, genero);
	}
		
	public String RA;
	public String periodo;
	public String altura;
	private long fone;
	private String email;

	
	
	

	public long getFone() {
		return this.fone;
	}

	public void setFone(long fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public void edFisica() {
		System.out.println("Aula de Educação Física.");
			
	}
	
	public void matematica() {
		System.out.println("Aula de Matemática.");
	}
	public void portugues() {
		System.out.println("Aula de Português.");
	}
	public void biologia() {
		System.out.println("Aula de Biologia.");
	}
	public void historia() {
		System.out.println("Aula de Historia.");
	}
	public String mudaGen (String mudança) {
		mudança = "Transição de gênero";
		return this.genero = mudança;
	}
}
