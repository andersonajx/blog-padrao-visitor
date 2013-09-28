package br.com.andersonajx;

public interface AlimentoVisitor<V> {

	V visit(Carne visitor);

	V visit(Vegetal visitor);

}
