package br.com.cursoj.javaBasico;

import javax.swing.JOptionPane;

public class Curso {
	static float n1,n2;
	static float media;
	
	static void insiraNota() {
		n1 = Float.parseFloat(JOptionPane.showInputDialog("digite a primeira nota: "));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("digite a segunda nota: "));
		
	}
	
	static void calculaMedia() {
		media = (n1+n2)/2;
	
	}
	
	static void exibeMedia() {
		JOptionPane.showMessageDialog(null, "o valor da media �: "+ media);
	}
}
