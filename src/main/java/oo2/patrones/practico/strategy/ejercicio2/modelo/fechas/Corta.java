package oo2.patrones.practico.strategy.ejercicio2.modelo.fechas;

import oo2.patrones.practico.strategy.ejercicio2.modelo.FormatoFecha;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Corta implements FormatoFecha {
	@Override
	public String formatear(LocalDate fecha) {
		return fecha.format(DateTimeFormatter.ofPattern("dd-MM-uuuu"));
	}
}
