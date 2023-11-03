package Escola;

public class ObjetoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno Matheus = new Aluno("Matheus","25 anos",1671605, "Trangênero");
	
		Matheus.altura = "1.50";
		
		Matheus.edFisica();
		Matheus.matematica();
		Matheus.portugues();
		Matheus.historia();
		Matheus.biologia();
		
		System.out.println("Nome: " +Matheus.nome +"\nIdade: " +Matheus.idade +"\nRA: " +Matheus.RA +"\nPeríodo: " +Matheus.periodo +"\nCPF: " +Matheus.cpf 
				+"\nGenero: " +Matheus.genero +"\nAltura: " +Matheus.altura );
		
		Aluno Amanda = new Aluno("Amanda","20 anos", 2581601, "Feminino");
		
		Amanda.altura = "1.90";
		
		Amanda.edFisica();
		Amanda.matematica();
		Amanda.portugues();
		Amanda.historia();
		Amanda.edFisica();
		Amanda.biologia();
		
		Amanda.mudaGen(null);
		
		System.out.println("Nome: " +Amanda.nome +"\nIdade: " +Amanda.idade +"\nRA: " +Amanda.RA +"\nPeríodo: " +Amanda.periodo +"\nCPF: " +Amanda.cpf 
				+"\nGenero: " +Amanda.genero +"\nAltura: " +Amanda.altura );
	

	Aluno Maria = new Aluno("Maria","20 Anos",65454511, "Feminino");
	Maria.altura = "1.52";
	Maria.setFone(699933479);
	Maria.setEmail("maria2023@gmail.com");
	
	Maria.edFisica();
	Maria.edFisica();
	Maria.matematica();
	Maria.portugues();
	Maria.historia();
	Maria.biologia();
	
	System.out.println("Nome: " +Maria.nome +"\nIdade: " +Maria.idade +"\nRA: " +Maria.RA +"\nPeríodo: " +Maria.periodo +"\nCPF: " +Maria.cpf 
			+"\nGenero: " +Maria.genero +"\nAltura: " +Maria.altura +"\nNumero de telefone: " +Maria.getFone() +"\nSeu Email: " +Maria.getEmail());
	
	Aluno Ana = new Aluno("Ana","21 Anos",885514, "Feminino" );
	Ana.altura = "1.70";
	Ana.setFone(699488498);
	Ana.setEmail("Anaf546@gmail.com");
	
	Ana.edFisica();
	Ana.edFisica();
	Ana.matematica();
	Ana.portugues();
	Ana.historia();
	Ana.biologia();
	Ana.biologia();
	
	System.out.println("Nome: " +Ana.nome +"\nIdade: " +Ana.idade +"\nRA: " +Ana.RA +"\nPeríodo: " +Ana.periodo +"\nCPF: " +Ana.cpf 
			+"\nGenero: " +Ana.genero +"\nAltura: " +Ana.altura +"\nNumero de telefone: " +Ana.getFone() +"\nSeu Email: " +Ana.getEmail());
	
	
	
	 
	}	
	
	
}

 
