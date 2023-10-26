package Escola;

public class Cozinha extends Pessoa {

	
	public Cozinha(String nome, String cpf, int idade, String genero){
		super(nome, cpf, idade, genero);
	}
	private String setor;
	private boolean pdc = false;
	private boolean funcAtivo = true;
	
	
	
	
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
	public boolean isPdc() {
		return pdc;
	}
	public void setPdc(boolean pdc) {
		this.pdc = pdc;
	}
	public boolean isFuncAtivo() {
		return funcAtivo;
	}
	public void setFuncAtivo(boolean funcAtivo) {
		this.funcAtivo = funcAtivo;
	}
	
	

	
	public void ativarPCD() {
		this.setPdc(true);
		System.out.println("Esse funcionário é PCD");
	}
	public void FuncInativo() {
		this.setFuncAtivo(false);
		System.out.println("Esse funcionário não está ativo na Escola");
	}
	public String mudaGen (String mudar) {
		mudar = "Sem genero";
		return this.genero = mudar; }
}
