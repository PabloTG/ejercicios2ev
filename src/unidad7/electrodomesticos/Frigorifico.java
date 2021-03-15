package unidad7.electrodomesticos;

public class Frigorifico extends ElectrodomesticoBase {
	// atributo propio
	private boolean noFrost = false;

	// setter
	public void setNoFrost(boolean frost) {
		noFrost = frost;
	}

	// getter
	public boolean getNoFrost() {
		return noFrost;
	}

	// constructor propio con todos los atributos
	public Frigorifico(float precio, colores color, consumos consumo, float peso, boolean noFrost) {
		super(precio, color, consumo, peso);
		this.noFrost = noFrost;
	}

	// toString
	@Override
	public String toString() {
		String devolver = "FRIGORÍFICO. ";
		devolver += super.toString();
		if (getNoFrost())
			devolver += " Con capacidad NoFrost.";
		return devolver;
	}
}
