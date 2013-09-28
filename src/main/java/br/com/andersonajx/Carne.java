package br.com.andersonajx;

public final class Carne extends Alimento {

	private final String tipo = "Bovino";

	public Carne(String nome) {
		super(nome);
	}

	public void assar() {
		System.out.println();
		System.out.println("Assando o " + getNome() + " de tipo " + tipo);
		System.out.println();
	}

}
