package unidad5;

public class PruebaMazo {

	public static void main(String[] args) {
		Mazo mazos = new Mazo(2);
		System.out.println(mazos.toString());
		Mazo mazo = new Mazo();
		mazo.print();
		System.out.println("Vamos a jugar a la carta más alta:");
		Naipe cartaOrdenador = mazo.get();
		System.out.println("La carta del ordenador es: " + cartaOrdenador);
		Naipe cartaPropia = mazo.get();
		System.out.println("Tu carta es: " + cartaPropia);
		System.out.println(mazo.cartaAlta(cartaOrdenador, cartaPropia));
		// con dos mazos hay 52 juegos retirando las cartas
		for (int i = 1; i <= 53; i++) {
			Naipe naipeOrdenador = mazos.remove();
			Naipe naipePropio = mazos.remove();
			System.out.println(naipeOrdenador + "\n" + naipePropio + "\n"+ mazos.cartaAlta(naipeOrdenador, naipePropio));
		}
		System.out.println(mazos.toString());
	}

}
