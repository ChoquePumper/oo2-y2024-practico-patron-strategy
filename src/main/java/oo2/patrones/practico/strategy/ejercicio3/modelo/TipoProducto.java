package oo2.patrones.practico.strategy.ejercicio3.modelo;

import oo2.patrones.practico.strategy.ejercicio3.modelo.calculador.Alimento;
import oo2.patrones.practico.strategy.ejercicio3.modelo.calculador.Libro;
import oo2.patrones.practico.strategy.ejercicio3.modelo.calculador.Medicina;
import oo2.patrones.practico.strategy.ejercicio3.modelo.calculador.Otro;

public enum TipoProducto {
	LIBRO(new Libro()),
	ALIMENTO(new Alimento()),
	MEDICINA(new Medicina()),
	OTRO(new Otro());

	private final CalculadorDePrecios calculador;

	TipoProducto(CalculadorDePrecios calculador) {
		this.calculador = calculador;
	}

	CalculadorDePrecios getCalculador() {
		return calculador;
	}
}
