package br.com.cursoj.javaBasico;

public class Fabrica {
	
	float carro = 0;
	static float totalCarros;
	
	void fabricarCarro () {
		carro++;
		totalCarros++;
	}
}
