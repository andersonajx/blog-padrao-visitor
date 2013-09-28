package br.com.andersonajx;

public final class PreparacaoAlimentoVisitor implements AlimentoVisitor<String> {

	@Override
	public String visit(Carne visitor) {
		visitor.assar();
		return "Retorno sobre alguma coisa da Carne";
	}

	@Override
	public String visit(Vegetal visitor) {
		visitor.temperar();
		return "Retorno sobre alguma coisa do Vegetal";
	}

}
