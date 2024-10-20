package src;

public class Vetor {
	Aluno vetor[] = new Aluno[100];
	  private int totalAlunos = 0;

	  // Adiciona aluno no inicio do vetor
	  public void adiciona(Aluno aluno) {
	    vetor[totalAlunos] = aluno;
	    totalAlunos++;
	  }

	  // Metodo para mostrar todos os alunos adicionados no vetor
	  public String mostraTodos() {
	    StringBuilder alunos = new StringBuilder();

	    for (int i = 0; i < totalAlunos; i++) {
	      if (vetor[i] != null) {
	        alunos.append(vetor[i].getNome()).append(", ");
	      }
	    }

	    return alunos.toString();
	  }

	  // Verifica se determinado aluno está no vetor
	  public boolean contemAluno(String nome) {
	    for (int i = 0; i < totalAlunos; i++) {
	      if (vetor[i].getNome().equals(nome)) {
	        return true;
	      }
	    }
	    return false;
	  }

	  // Verifica tamanho do vetor
	  public int tamanhoAtual() {
	    return totalAlunos;
	  }
	  
	  public boolean posicaoOcupada(int id) {
		  return id >= 0 && id < totalAlunos;
	  }

	  // Consulta aluno por ID
	  public String consultaPorID(int id) {
		  if(!posicaoOcupada(id)) {
			  throw new IllegalArgumentException("Posição Inválida!");
		  }
	    return vetor[id].getNome();
	  }
	  
	  public void inserePorID(int id, Aluno aluno) {
		  if(!posicaoOcupada(id)) {
			  throw new IllegalArgumentException("Posição Inválida!");
		  }
		  for (int i = (totalAlunos-1); i >= id; i--) {
			  vetor[i+1] = vetor[i];
		  }
		  vetor[id] = aluno;
		  totalAlunos++;
		  
	  }
	  
	  public void removePorID(int id) {
		  if(!posicaoOcupada(id)) {
			  throw new IllegalArgumentException("Posição Inválida!");
		  }
		  for(int i = id; i<totalAlunos; i++) {
			  vetor[i] = vetor[i+1]; 
		  }
		  totalAlunos --;
	  }

	  public void removeUltimo(){
		totalAlunos--;
	  }



}
