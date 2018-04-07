package br.com.cursoj.javaBasico;

public class ContaTeste {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		Conta b = new Conta();
		
		c.calcularSaldo();
		c.calcularSaldo();
		c.calcularSaldo();
		b.calcularSaldo();
		
		
		System.out.println("o saldo da primeira conta é: " + c.saldo);
		System.out.println("o saldo da segunda conta é: " + b.saldo);
		
		System.out.println("o saldo total da conta é: "+ c.totalSaldo);
	}

}
