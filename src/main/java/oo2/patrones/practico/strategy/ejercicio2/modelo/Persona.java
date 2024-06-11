package oo2.patrones.practico.strategy.ejercicio2.modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {

	private final String nombre;
	private final LocalDate fechaNacimiento;

	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = Objects.requireNonNull(nombre);
		this.fechaNacimiento = Objects.requireNonNull(fechaNacimiento);
	}

	public String fechaNacimiento(FormatoFecha formatoFecha) {
		return formatoFecha.formatear(this.fechaNacimiento);
	}
}
