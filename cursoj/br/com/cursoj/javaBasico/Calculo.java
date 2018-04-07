package br.com.cursoj.javaBasico;

public class Calculo implements ValorDePI, Soma, Subtracao{
	
		double soma, subtracao;
		
	public static void main(String[] args) {
		
		Calculo c = new Calculo();
		c.exibeValorDePI();
		c.exibeSoma(6,1);
		c.exibeSubtracao(7, 5);
		
	}

	public void exibeValorDePI() {
		System.out.println("o valor de pi é: " + PI);
	}

	public void exibeSoma(double num1, double num2) {
		this.soma = num1+num2;
		System.out.println("o resultado da soma é: " + this.soma);
	}

	public void exibeSubtracao(double num1,double num2) {
		this.subtracao = num1-num2;
		System.out.println("o resultado da subtração é: " + this.subtracao);
		
	}
	
}
