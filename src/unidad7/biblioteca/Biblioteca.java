package unidad7.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

	public static void main(String[] args) {
		ArrayList<Publicacion> biblioteca = new ArrayList<Publicacion>();
		Revista revista1 = new Revista("D&D04", "Dragon", 2007, 2, 352);
		Revista revista2 = new Revista("D&D04", "Dungeon", 2012, 4, 201);
		Libro libro1 = new Libro("PND01", "Pendragón (quinta edición)", 2015, "Greg Stafford et alii");
		// estas sentencias demuestran el comportamiento polimórfico de Publicacion
		// (se pueden añadir objetos de tipo Libro y Revista a un ArrayList de Publicacion) 
		biblioteca.add(revista1);
		biblioteca.add(revista2);
		biblioteca.add(libro1);
		for (Publicacion p: biblioteca) {
			// esta sentencia también demuestra polimorfismo, al tratar
			// objetos Libro y Revista con una variable Publicacion
			System.out.println(p.toString());
		}
	}

}
