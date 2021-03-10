package unidad7;

public class Libro extends Publicacion {
	private String autorxs;
	private boolean prestado = false;
	
	// constructores (lo mismo que en Publicacion y Revista)
	public Libro() {
		this.setTipo("Libro");
	}
	public Libro(String codigo) {
		this.setTipo("Libro");
		this.setCodigo(codigo);
	}
	public Libro(String codigo, String titulo) {
		super(codigo, titulo);
		this.setTipo("Libro");
		this.autorxs = "An�nimo";
	}
	public Libro(String codigo, String titulo, String autorxs) {
		super(codigo, titulo);
		this.setTipo("Libro");
		this.autorxs = autorxs;
	}
	public Libro(String codigo, String titulo, int fecha) {
		super(codigo, titulo, fecha);
		this.setTipo("Libro");
		this.autorxs = "An�nimo";
	}
	public Libro(String codigo, String titulo, int fecha, String autorxs) {
		super(codigo, titulo, fecha);
		this.setTipo("Libro");
		this.autorxs = autorxs;
	}
	
	// getters
	public String getAutorxs() {
		return autorxs;
	}
	public boolean getPrestado() {
		return prestado;
	}
	// esto no deja de ser un getter remocicado
	public String estaPrestado() {
		if (prestado)return "Este libro est� prestado.";
		else return "Este libro est� en la biblioteca.";
	}

	// setters
	public void setAutorxs(String autorxs) {
		this.autorxs = autorxs;
	}
	// me gusta m�s llamarlo "prestar" que "setPrestado" y la diferencia
	// es cosm�tica, pero entiendo que la tradici�n es la tradici�n, as� que...
	public void prestar() {
		if (this.prestado) System.out.println("Este libro ya est� prestado.");
		this.prestado = true;
	}
	// ... puedo escribir ambos
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	// toString
	@Override
	public String toString() {
		String devolver = super.toString();
		devolver += ", " + autorxs + "]";
		return devolver;
	}
}
