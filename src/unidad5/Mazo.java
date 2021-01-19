package unidad5;

import java.util.ArrayList;
import java.lang.Math;

public class Mazo extends ArrayList<Naipe> {
	/**
	 * Añadido automáticamente por Eclipse para eliminar un aviso de error.
	 */
	private static final long serialVersionUID = 1L;
	// los atributos de un mazo son arrays que facilitan su construcción.
	private final String[] palos = { "corazones", "diamantes", "picas", "tréboles" };
	private final String[] rangos = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "jota", "reina", "rey", "as" };
	private final int[] valores = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

	// CONSTRUCTORES
	// constructor sin argumentos.
	public Mazo() {
		for (int i = 0; i <= 3; i++) {
			String palo = palos[i];
			for (int j = 0; j <= 12; j++) {
				String rango = rangos[j];
				int valor = valores[j];
				Naipe naipe = new Naipe(palo, rango, valor);
				this.add(naipe);
			} // fin for j
		} // fin for i
	} // fin constructor sin argumentos

	// constructor para varios mazos.
	public Mazo(int n) {
		for (int veces = 1; veces <= n; veces++) {
			for (int i = 0; i <= 3; i++) {
				String palo = palos[i];
				for (int j = 0; j <= 12; j++) {
					String rango = rangos[j];
					int valor = valores[j];
					Naipe naipe = new Naipe(palo, rango, valor);
					this.add(naipe);
				} // fin for j
			} // fin for i
		} // fin for n
	} // fin constructor repetido

	// MÉTODOS
	// Mazo hereda de ArrayList, con lo que ya tiene métodos add y addAll que
	// funcionan como requieren las especificaciones (el enunciado).

	// método para mostrar por pantalla el contenido de un mazo.
	public void print() {
		for (int i = 0; i <= (this.size() - 1); i++) {
			System.out.println(this.get(i));
		}
	} // fin print

	// método get que devuelve un naipe al azar
	public Naipe get() {
		// número aleatorio i entre 0 y el tamaño del mazo
		int i = (int) (Math.random() * this.size());
		Naipe aleatorio = this.get(i);
		return aleatorio;
	} // fin get sin parámetros

	// método remove que devuelve un naipe al azar y lo elimina del mazo
	public Naipe remove() {
		if (this.size() != 0) {
		int i = (int) (Math.random() * this.size());
		Naipe aleatorio = this.get(i);
		this.remove(i);
		return aleatorio;
		}
		// si no quedan cartas en el mazo devuelvo una "carta" que lo indica.
		// Tiene un aspecto un tanto raro para que forme una frase con sentido
		// al imprimirla mediante el método toString de la clase Naipe.
		else {
			Naipe fin = new Naipe("esta baraja", "Se han acabado los naipes", 0);
			return fin;
		}
	} // fin remove sin parámetros

	// método para jugar a la carta más alta
	public String cartaAlta(Naipe cartaOrdenador, Naipe cartaPropia) {
		String ganaOrdenador = "Gana la carta del ordenador.";
		String ganaPropia = "Gana tu carta.";
		String empate = "Es un empate.";
		if (cartaOrdenador.getValor() > cartaPropia.getValor())
			return ganaOrdenador;
		if (cartaOrdenador.getValor() < cartaPropia.getValor())
			return ganaPropia;
		else
			return empate;
	} // fin cartaAlta

} // fin clase Mazo
