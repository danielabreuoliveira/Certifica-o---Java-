package br.com.cursoj.javaBasico;

public class Funcionario {
	String nome;
	int idade,cpf;
	
	Funcionario(){
		this.nome = "daniel";
		this.idade = 21;
		this.cpf = 123;
	}
	
	Funcionario(String NovoNome,int NovaIdade,int NovaCpf){
		this.nome = NovoNome;
		this.idade = NovaIdade;
		this.cpf = NovaCpf;
		
	}
	
	Funcionario(String NovoNome){
		this.nome = NovoNome;
		this.idade = 24;
		this.cpf = 4123123;
		
	}
	
	Funcionario(String NovoNome,int NovaIdade){
		this.nome = NovoNome;
		this.idade = NovaIdade;
		this.cpf = 12345;
	}
}
