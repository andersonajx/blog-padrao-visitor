package br.com.andersonajx;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.prepararAlimento(new Carne("Bife"));
		main.prepararAlimento(new Vegetal("Couve"));
	}

	public void prepararAlimento(Alimento alimento) {
		if (alimento instanceof Vegetal) {
			((Vegetal) alimento).temperar();
		} else {
			((Carne) alimento).assar();
		}
	}

}
