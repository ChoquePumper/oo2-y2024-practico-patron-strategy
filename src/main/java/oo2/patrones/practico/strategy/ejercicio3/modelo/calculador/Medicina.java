package oo2.patrones.practico.strategy.ejercicio3.modelo.calculador;

import oo2.patrones.practico.strategy.ejercicio3.modelo.CalculadorDePrecios;

public class Medicina implements CalculadorDePrecios {
	private static final double DESCUENTOS_SI_ES_VALIDO = 0.1;

	private static final double MINIMO_PARA_DESCUENTO = 50;
	private static final double MINIMO_ENVIO_GRATIS = 100;

	@Override
	public double calcularPrecio(double precio) {
		final double descuento = precio > MINIMO_PARA_DESCUENTO ?
				DESCUENTOS_SI_ES_VALIDO : 0;
		return precio * (1 - descuento);
	}

	@Override
	public boolean tieneEnvioGratis(double precio) {
		return precio > MINIMO_ENVIO_GRATIS;
	}
}
