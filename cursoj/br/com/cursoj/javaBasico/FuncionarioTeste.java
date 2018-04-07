package br.com.cursoj.javaBasico;

public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario daniel = new Funcionario();
		System.out.println(daniel.nome);
		System.out.println(daniel.idade);
		System.out.println(daniel.cpf);
	
		Funcionario joao = new Funcionario("gabriel",11,1234);
		System.out.println(joao.nome);
		System.out.println(joao.idade);
		System.out.println(joao.cpf);

		Funcionario maria = new Funcionario("thais");
		System.out.println(maria.nome);
		System.out.println(maria.idade);
		System.out.println(maria.cpf);
		
		Funcionario micka = new Funcionario("micka",24);
		System.out.println(micka.nome);
		System.out.println(micka.idade);
		System.out.println(micka.cpf);
	}

}
