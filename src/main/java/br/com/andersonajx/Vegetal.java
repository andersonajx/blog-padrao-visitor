package br.com.andersonajx;

public final class Vegetal extends Alimento {

	private final String sabor = "Amargo";

	public Vegetal(String nome) {
		super(nome);
	}

	public void temperar() {
		System.out.println();
		System.out.println("Temperando o " + getNome() + " de sabor " + sabor);
		System.out.println();
	}

}
