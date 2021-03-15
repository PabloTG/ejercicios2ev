package unidad7.electrodomesticos;

public class ElectrodomesticoBase {
	// enumeraciones para los atributos
	public enum colores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	};

	public enum consumos {
		A, B, C, D, E, F
	};
	
	// atributos inicializados (ignoro atributos como marca y modelo por no pedirlos el enunciado)
	private float precioBase = 100;
	private colores color = colores.BLANCO;
	private consumos consumo = consumos.F;
	private float peso = 5;
	
	// getters
	public float getPrecio() {
		// porcentajes para calcular el precio final
		int porcentajeConsumo = 0;
		int porcentajePeso = 0;
		// cálculo de los porcentajes
		// aumento del precio en función del consumo
		if (consumo == consumos.A)
			porcentajeConsumo = 30;
		if (consumo == consumos.B)
			porcentajeConsumo = 25;
		if (consumo == consumos.C)
			porcentajeConsumo = 20;
		if (consumo == consumos.D)
			porcentajeConsumo = 15;
		if (consumo == consumos.E)
			porcentajeConsumo = 10;
		if (consumo == consumos.F)
			porcentajeConsumo = 5;
		// aumento del precio en función del peso
		if (peso <= 19)
			porcentajePeso = 5;
		else if (peso <= 49)
			porcentajePeso = 10;
		else if (peso <= 79)
			porcentajePeso = 15;
		else
			porcentajePeso = 20;
		
		// precio final
		float precio = precioBase + precioBase * porcentajeConsumo / 100 + precioBase * porcentajePeso / 100;

		return precio;
	}

	public colores getColor() {
		return color;
	}

	public consumos getConsumo() {
		return consumo;
	}

	public float getPeso() {
		return peso;
	}

	// setters
	public void setPrecio(float precio) {
		precioBase = precio;
	}

	public void setColor(colores color) {
		this.color = color;
	}

	public void setConsunmo(consumos consumo) {
		this.consumo = consumo;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	// constructores
	// vacío
	public ElectrodomesticoBase() {

	}

	// inicializando precio y peso
	public ElectrodomesticoBase(float precio, float peso) {
		precioBase = precio;
		this.peso = peso;
	}

	// inicializando todos los atributos
	public ElectrodomesticoBase(float precio, colores color, consumos consumo, float peso) {
		precioBase = precio;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

	// toString
	@Override
	public String toString() {
		String devolver = "";
		devolver += "Color: " + getColor() + ". ";
		devolver += "Categoría de consumo: " + getConsumo() + ". ";
		devolver += "Peso: " + getPeso() + "kg. ";
		devolver += "Precio: " + getPrecio() + "€.";
		return devolver;
	}
}
