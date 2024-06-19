package oo2.patrones.practico.strategy.ejercicio3.modelo.calculador;

import oo2.patrones.practico.strategy.ejercicio3.modelo.CalculadorDePrecios;

public class Libro implements CalculadorDePrecios {
	private static final double IMPUESTOS = 0.1;
	private static final double DESCUENTOS = 0.1;

	private static final double MINIMO_ENVIO_GRATIS = 100;

	@Override
	public double calcularPrecio(double precio) {
		return precio * (1 + IMPUESTOS) * (1 - DESCUENTOS);
	}

	@Override
	public boolean tieneEnvioGratis(double precio) {
		return precio > MINIMO_ENVIO_GRATIS;
	}
}
