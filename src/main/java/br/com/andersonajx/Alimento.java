package br.com.andersonajx;

public abstract class Alimento {

	private String nome;

	public abstract <V> V accept(AlimentoVisitor<V> visitor);

	public Alimento(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
