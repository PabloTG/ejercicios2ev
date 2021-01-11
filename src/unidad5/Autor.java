package unidad5;

public class Autor {
	// atributos
	private String nombre;
	private String email;
	private String genero;

	// constructor
	public Autor(String nombre, String email, String genero) {
		this.nombre = nombre;
		this.email = email;
		this.genero = genero;
	}

	// getters
	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public String getGenero() {
		return genero;
	}

	// setter e-mail
	public void setEmail(String email) {
		this.email = email;
	}

	// toString redefinido
	public String toString() {
		String info = nombre + " (" + genero + ") " + email;
		return info;
	}

} // fin Autor
