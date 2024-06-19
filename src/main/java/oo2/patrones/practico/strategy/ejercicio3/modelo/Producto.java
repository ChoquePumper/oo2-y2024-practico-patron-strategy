package oo2.patrones.practico.strategy.ejercicio3.modelo;

public class Producto {
	public TipoProducto tipo;
	public double precio;

	public Producto(TipoProducto tipo, double precio) {
		this.tipo = tipo;
		this.precio = precio;
	}

	public double precioFinal() {
		double total = tipo.getCalculador().calcularPrecio(precio);
		if (tipo.getCalculador().tieneEnvioGratis(precio)) {
			total -= 10;
		}
		return total;
	}
}
