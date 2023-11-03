package Escola;

public class Direcao extends Pessoa{

	
	
	public Direcao(String nome, String cpf, int idade, String genero) {
		super(nome, cpf, idade, genero);
	}
	
	private String cargo;
	private String setor;
	private String altura;
	
	
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	
		

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	

	public void pontoEntrada() {
		System.out.println("Você bateu ponto de entrada.");
			
	}
	public void organizar() {
		System.out.println("Você organizou o seu Setor");
	}
	public void analise() {
		System.out.println("Você realizou analise de uma situação escolar");
	}
	public void trabalhar() {
		System.out.println("trabalhando...");
	}
	public void pontoS() {
		System.out.println("Você Bateu o ponto de saída");
	}
	public String mudaGen (String mudar) {
		mudar = "Prefiro não informar";
		return this.genero = mudar; }

}
