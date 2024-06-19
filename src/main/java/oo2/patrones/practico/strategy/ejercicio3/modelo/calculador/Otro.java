package oo2.patrones.practico.strategy.ejercicio3.modelo.calculador;

import oo2.patrones.practico.strategy.ejercicio3.modelo.CalculadorDePrecios;

public class Otro implements CalculadorDePrecios {
	private static final double IMPUESTOS = 0.15;
	private static final double DESCUENTOS_SI_ES_VALIDO = 0.05;

	private static final double MINIMO_PARA_DESCUENTO = 50;
	private static final double MINIMO_ENVIO_GRATIS = 200;

	@Override
	public double calcularPrecio(double precio) {
		final double descuento = precio > MINIMO_PARA_DESCUENTO ?
				DESCUENTOS_SI_ES_VALIDO : 0;
		return precio * (1 + IMPUESTOS) * (1 - descuento);
	}

	@Override
	public boolean tieneEnvioGratis(double precio) {
		return precio > MINIMO_ENVIO_GRATIS;
	}
}
