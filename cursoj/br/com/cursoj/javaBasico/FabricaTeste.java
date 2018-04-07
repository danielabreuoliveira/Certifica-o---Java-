package br.com.cursoj.javaBasico;

public class FabricaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fabrica mark = new Fabrica ();
		mark.fabricarCarro();
		mark.fabricarCarro();
		mark.fabricarCarro();
		
		System.out.println("o objeto mark fabricou:" + mark.carro + "carros");
		
		Fabrica lucion = new Fabrica();
		
		lucion.fabricarCarro();
		lucion.fabricarCarro();
		
		System.out.println("o objeto lucion fabricou: " + lucion.carro + " carros");
		
		System.out.println("o total de carros fabricado é: " + Fabrica.totalCarros);
	}

}
