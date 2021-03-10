package unidad7.biblioteca;

abstract class Publicacion {
	// atributos
	private String tipo;
	private String codigo;
	private String titulo;
	private int fechaA; // para el a�o
	
	// constructores
		// los dos primeros constructores est�n ah� por completismo, porque asumo que,
		// como m�nimo, se conocer�n el c�digo que se le va a dar a la publicaci�n,
		// aunque no se tenga muy claro si es una revista o un libro (me tiene pasado,
		// y nunca se sabe cu�ndo podr�a pasar de nuevo, incluso en una biblioteca), y
		// el t�tulo de la misma
		public Publicacion() {
			this.tipo = "Publicaci�n";
		}
		public Publicacion(String codigo) {
			this.tipo = "Publicaci�n";
			this.codigo = codigo;
		}
		public Publicacion(String codigo, String titulo) {
			this.tipo = "Publicaci�n";
			this.codigo = codigo;
			this.titulo = titulo;
		}
		public Publicacion(String codigo, String titulo, int fecha) {
			this.tipo = "Publicaci�n";
			this.codigo = codigo;
			this.titulo = titulo;
			this.fechaA = fecha;
		}
	
	// getters
	public String getTipo() {
		return tipo;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public int getFechaA() {
		return fechaA;
	}
	
	// setters
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setFechaA(int fecha) {
		this.fechaA = fecha;
	}
	
	// m�todo toString, que habr� que completar en cada tipo de publicaci�n
	@Override
	public String toString() {
		String devolver = tipo + "[" + codigo + ", " + titulo + ", " + fechaA;
		return devolver;
	}
}
