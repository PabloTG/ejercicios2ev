package unidad7.biblioteca;

public class Revista extends Publicacion {
	// atributos
	private int numero;
	private int fechaM;
	private int fechaD;
	
	// constructores
	// el comentario para los constructores de la clase Publicación
	// vale también aquí: no todos los constructores que siguen son
	// realistas, pero los incluyo por completismo. A lo que no voy
	// a renunciar es a creer que un ejemplar de una revista tendrá
	// un número fácilmente localizable que se pueda incluir
	public Revista() {
		this.setTipo("Revista");
	}
	public Revista(String codigo, int numero) {
		this.setTipo("Revista");
		this.setCodigo(codigo);
		this.numero = numero;
	}
	public Revista(String codigo, String titulo, int numero) {
		super(codigo, titulo);
		this.setTipo("Revista");
		this.numero = numero;
	}
	public Revista(String codigo, String titulo, int fechaA, int numero) {
		super(codigo, titulo, fechaA);
		this.setTipo("Revista");
		this.numero = numero;
	}
	public Revista(String codigo, String titulo, int fechaA, int fechaM, int numero) {
		super(codigo, titulo, fechaA);
		this.setTipo("Revista");
		this.setFechaA(fechaA);
		this.fechaM = fechaM;
		this.numero = numero;
	}
	public Revista(String codigo, String titulo, int fechaA, int fechaM, int fechaD, int numero) {
		super(codigo, titulo, fechaA);
		this.setTipo("Revista");
		this.fechaM = fechaM;
		this.fechaD = fechaD;
		this.numero = numero;
	}
	
	// setters
	public void setFechaM(int fecha) {
		this.fechaM = fecha;
	}
	public void setFechaD(int fecha) {
		this.fechaD = fecha;
	}
	
	// getters
	public int getFechaM() {
		return fechaM;
	}
	public int getfechaD() {
		return fechaD;
	}
	
	// toString
	@Override
	public String toString() {
		String devolver = super.toString();
		if (fechaM != 0 && fechaD != 0)
			devolver += "/" + fechaM + "/" + fechaD + ", número " + numero + "]";
		if (fechaM != 0 && fechaD == 0)
			devolver += "/" + fechaM + ", número " + numero + "]";
		if (fechaM == 0 && fechaD == 0)
			devolver += ", número " + numero + "]";
		return devolver;
	}
}
