package oo2.patrones.practico.strategy.ejercicio3.modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestProductos {

	@Test
	void delMainOriginal() {
		var p1 = new Producto(TipoProducto.LIBRO, 30);
		var p2 = new Producto(TipoProducto.MEDICINA, 330);
		var p3 = new Producto(TipoProducto.ALIMENTO, 130);
		var p4 = new Producto(TipoProducto.OTRO, 130);

		double delta = 1e-13;
		assertEquals(29.7, p1.precioFinal(), delta);
		assertEquals(287.0, p2.precioFinal(), delta);
		assertEquals(116.025, p3.precioFinal(), delta);
		assertEquals(142.025, p4.precioFinal(), delta);
	}
}
