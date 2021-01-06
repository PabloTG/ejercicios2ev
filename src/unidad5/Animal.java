package unidad5;

import java.time.LocalDate;

public class Animal {
	// variables requeridas.
	private String nombre;
	private LocalDate fecha;

	// constructor con ambos parámetros.
	public Animal(String nombre, String fecha) {
		this.nombre = nombre;
		this.fecha = LocalDate.parse(fecha);
	}

	// constructor con nombre y fecha actual por defecto.
	public Animal(String nombre) {
		this.nombre = nombre;
		this.fecha = LocalDate.now();
	}

	// getter para el nombre.
	public String getNombre() {
		return this.nombre;
	}

	// getter para la fecha.
	public LocalDate getFecha() {
		return this.fecha;
	}

	// setter para el nombre.
	public void setNombre(String nombre) {
		// pongo esta condición por comprobar algo en uno de los setters, no porque
		// crea que sea una circunstancia realista.
		if (nombre != "") {
			this.nombre = nombre;
		} else {
			this.nombre = "Ani (nombre por defecto)";
		}
	}

	// setter para la fecha.
	public void setFecha(String fecha) {
		this.fecha = LocalDate.parse(fecha);
	}

	// toString redefinido
	public String toString() {
		String imprimir = "Nombre: ";
		imprimir += this.getNombre();
		imprimir += " - Edad: ";
		// la línea entre /**/ da la edad en un formato raro, pero más preciso
		// que el código usado; dejo el formato en años por ser más comprensible.
		/* imprimir += this.getFecha().until(LocalDate.now());*/
		imprimir += (LocalDate.now().compareTo(this.getFecha()));
		imprimir += " años.";
		// si se usa la línea alternativa para la edad, habría que dejar la última
		// modificación a la variable imprimir como un punto. sin más.
		return imprimir;
	}

} // fin clase Animal