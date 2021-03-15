package unidad7.electrodomesticos;

public class Televisor extends ElectrodomesticoBase {
	// atributos propios
	private int pulgadas = 20;
	private String sintonizador = "DVB-T";

	// getters
	public int getPulgadas() {
		return pulgadas;
	}

	public String getSintonizador() {
		return sintonizador;
	}

	// setters
	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public void setSintonizador(String sintonizador) {
		if (comprobarSintonizador(sintonizador))
			this.sintonizador = sintonizador;
	}

	// constructor propio con todos los atributos
	public Televisor(float precio, colores color, consumos consumo, float peso, int pulgadas, String sintonizador) {
		super(precio, color, consumo, peso);
		this.pulgadas = pulgadas;
		if (comprobarSintonizador(sintonizador))
			this.sintonizador = sintonizador;
	}

	// método para comprobar el sintonizador
	public boolean comprobarSintonizador(String sintonizador) {
		boolean comprobar = false;
		if (sintonizador.equalsIgnoreCase("DVB-T") | sintonizador.equalsIgnoreCase("DVB-T2"))
			comprobar = true;
		if (!comprobar)
			System.err.println("El sintonizador asignado a este artículo no es correcto. Por favor, corrija el error");
		return comprobar;
	}
}
