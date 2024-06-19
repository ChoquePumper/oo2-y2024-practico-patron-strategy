package oo2.patrones.practico.strategy.ejercicio3.modelo;

public interface CalculadorDePrecios {
	double calcularPrecio(double precio);

	boolean tieneEnvioGratis(double precio);
}
