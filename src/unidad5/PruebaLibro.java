package unidad5;

import java.util.ArrayList;
import java.util.Collection;

public class PruebaLibro {

	public static void main(String[] args) {
		// autores para las listas.
		Autor mMearls = new Autor("Mike Mearls", "n/a", "hombre");
		Autor jCrawford = new Autor("Jeremy Crawford", "n/a", "hombre");
		Autor cPerkins = new Autor("Christopher Perkins", "n/a", "hombre");
		Autor jWyatt = new Autor("James Wyatt", "n/a", "hombre");

		// listas de autores para los libros.
		Collection<Autor> autoresMJ = new ArrayList<Autor>();
		autoresMJ.add(jCrawford);
		autoresMJ.add(mMearls);
		Collection<Autor> autoresMM = new ArrayList<Autor>();
		autoresMM.add(cPerkins);
		autoresMM.add(jCrawford);
		autoresMM.add(mMearls);
		Collection<Autor> autoresGDM = new ArrayList<Autor>();
		autoresGDM.add(jCrawford);
		autoresGDM.add(cPerkins);
		autoresGDM.add(jWyatt);
		autoresGDM.add(mMearls);

		// constructor sin stock.
		Libro manualJugador = new Libro("Manual del jugador", autoresMJ, (float) 49.99);

		// constructor con stock.
		Libro manualMonstruos = new Libro("Manual de monstruos", autoresMM, (float) 49.99, 5);
		Libro guiaDM = new Libro("Guía del Dungeon Master", autoresGDM, (float) 49.99, 5);

		// prueba de getters.
		System.out.println(manualJugador.getTitulo());
		System.out.println(manualJugador.getAutores());
		System.out.println(manualJugador.getPrecio() + "€");
		System.out.println(manualJugador.getStock() + " unidades");

		// prueba de setters.
		System.out.println("\n25% de descuento por el Día del Libro:");
		System.out.println(
				"Antes: " + manualMonstruos.getPrecio() + "€ (quedan " + manualMonstruos.getStock() + " unidades)");
		manualMonstruos.setPrecio((float) 37.5);
		manualMonstruos.setStock(3);
		System.out.println(
				"Ahora: " + manualMonstruos.getPrecio() + "€ (quedan " + manualMonstruos.getStock() + " unidades)\n");
		manualMonstruos.setStock(3);

		// prueba del método toString.
		System.out.println(guiaDM.toString());
	}

}
