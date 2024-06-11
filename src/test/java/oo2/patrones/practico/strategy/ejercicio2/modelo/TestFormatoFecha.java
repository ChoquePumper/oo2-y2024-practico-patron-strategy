package oo2.patrones.practico.strategy.ejercicio2.modelo;

import oo2.patrones.practico.strategy.ejercicio2.modelo.fechas.Corta;
import oo2.patrones.practico.strategy.ejercicio2.modelo.fechas.Larga;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestFormatoFecha {
	@Test
	void formatoCorto() {
		DatosTest[] datos = {
				new DatosTest(new Persona("1", LocalDate.of(1999, 3, 2)), "02-03-1999"),
				new DatosTest(new Persona("2", LocalDate.of(2003, 7, 21)), "21-07-2003"),
				new DatosTest(new Persona("3", LocalDate.of(1981, 5, 17)), "17-05-1981"),
		};

		FormatoFecha formato = new Corta();

		for (var record : datos) {
			assertEquals(record.esperado, record.persona.fechaNacimiento(formato));
		}
	}

	@Test
	void formatoLargo() {
		DatosTest[] datos = {
				new DatosTest(new Persona("1", LocalDate.of(1995, 10, 17)), "17 de octubre de 1995"),
				new DatosTest(new Persona("2", LocalDate.of(2000, 1, 3)), "03 de enero de 2000"),
		};

		FormatoFecha formato = new Larga();

		for (var record : datos) {
			assertEquals(record.esperado, record.persona.fechaNacimiento(formato));
		}
	}

	private record DatosTest(Persona persona, String esperado) {
	}
}
