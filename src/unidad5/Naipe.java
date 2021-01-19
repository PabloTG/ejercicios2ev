package unidad5;

public class Naipe {
	
	private String palo;
	private String rango;
	private int valor;

	public Naipe(String palo, String rango, int valor) {
		this.palo = palo;
		this.rango = rango;
		this.valor = valor;
	}

	public String getPalo() {
		return palo;
	}

	public String getRango() {
		return rango;
	}

	public int getValor() {
		return valor;
	}
	
	public String toString() {
		String carta = rango + " de " + palo;
		return carta;
	}
}
