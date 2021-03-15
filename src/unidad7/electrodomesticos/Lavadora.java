package unidad7.electrodomesticos;

public class Lavadora extends ElectrodomesticoBase {
	// atributo propio
	private int carga = 5;

	// setter
	public void setCarga(int carga) {
		if (comprobarCarga(carga))
			this.carga = carga;
	}

	// getters
	public int getCarga() {
		return carga;
	}

	@Override
	public float getPrecio() {
		float precio = super.getPrecio();
		if (carga > 8)
			precio += precio * 0.1;
		return precio;
	}

	// constructor propio con todos los atributos
	public Lavadora(float precio, colores color, consumos consumo, float peso, int carga) {
		super(precio, color, consumo, peso);
		if (comprobarCarga(carga))
			this.carga = carga;
	}

	// toString
	@Override
	public String toString() {
		String devolver = "LAVADORA. ";
		devolver += super.toString();
		devolver += " Carga: " + getCarga() + ".";
		return devolver;
	}

	// método para comprobar si la carga asignada es correcta
	public boolean comprobarCarga(int carga) {
		int[] cargas = { 4, 5, 6, 7, 8, 10, 11, 13 };
		boolean cargaCorrecta = false;
		for (int c = 1; c < cargas.length; c++) {
			if (cargas[c] == carga)
				cargaCorrecta = true;
		}
		if (!cargaCorrecta)
			System.err.println("La carga asignada a este artículo no es correcta. Por favor, corrija el error.");
		return cargaCorrecta;
	}
}
