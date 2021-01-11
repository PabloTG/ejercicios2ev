package unidad5;

import java.util.Collection;
import java.util.Iterator;

public class Libro {

	// atributos.
	private String titulo;
	private Collection<Autor> autores;
	private float precio;
	private int stock = 10;

	// constructor con stock por defecto.
	public Libro(String titulo, Collection<Autor> autores, float precio) {
		this.titulo = titulo;
		this.autores = autores;
		this.precio = precio;
	}

	// constructor.
	public Libro(String titulo, Collection<Autor> autores, float precio, int stock) {
		this.titulo = titulo;
		this.autores = autores;
		this.precio = precio;
		this.stock = stock;
	}

	// getters.

	public String getTitulo() {
		return titulo;
	}

	public Collection<Autor> getAutores() {
		return autores;
	}

	public float getPrecio() {
		return precio;
	}

	public int getStock() {
		return stock;
	}

	// setters

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	// toString redefinido
	public String toString() {
		String imprimir = titulo + " (";
		Iterator<Autor> iterador = autores.iterator();
		for (int l = 1; l < autores.size(); l++) {
			imprimir += iterador.next().getNombre() + ", ";
		}
		imprimir += iterador.next().getNombre() + ") " + precio + "€ - " + stock + " unidades en stock";
		return imprimir;
	}

}
