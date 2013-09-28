package br.com.andersonajx;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.prepararAlimento(new Carne("Bife"));
		main.prepararAlimento(new Vegetal("Couve"));
	}

	public void prepararAlimento(Alimento alimento) {
		alimento.accept(new PreparacaoAlimentoVisitor());
	}

}
