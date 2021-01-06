package unidad5;

import java.time.LocalDate;

public class Animal {
	// variables requeridas.
	private String nombre;
	private LocalDate fecha;

	// constructor con ambos par�metros.
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
		// pongo esta condici�n por comprobar algo en uno de los setters, no porque
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
		// la l�nea entre /**/ da la edad en un formato raro, pero m�s preciso
		// que el c�digo usado; dejo el formato en a�os por ser m�s comprensible.
		/* imprimir += this.getFecha().until(LocalDate.now());*/
		imprimir += (LocalDate.now().compareTo(this.getFecha()));
		imprimir += " a�os.";
		// si se usa la l�nea alternativa para la edad, habr�a que dejar la �ltima
		// modificaci�n a la variable imprimir como un punto. sin m�s.
		return imprimir;
	}

} // fin clase Animal