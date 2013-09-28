package br.com.andersonajx;

public abstract class Alimento {

	private String nome;

	public Alimento(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
