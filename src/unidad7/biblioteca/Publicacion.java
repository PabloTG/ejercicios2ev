package unidad7.biblioteca;

abstract class Publicacion {
	// atributos
	private String tipo;
	private String codigo;
	private String titulo;
	private int fechaA; // para el año
	
	// constructores
		// los dos primeros constructores están ahí por completismo, porque asumo que,
		// como mínimo, se conocerán el código que se le va a dar a la publicación,
		// aunque no se tenga muy claro si es una revista o un libro (me tiene pasado,
		// y nunca se sabe cuándo podría pasar de nuevo, incluso en una biblioteca), y
		// el título de la misma
		public Publicacion() {
			this.tipo = "Publicación";
		}
		public Publicacion(String codigo) {
			this.tipo = "Publicación";
			this.codigo = codigo;
		}
		public Publicacion(String codigo, String titulo) {
			this.tipo = "Publicación";
			this.codigo = codigo;
			this.titulo = titulo;
		}
		public Publicacion(String codigo, String titulo, int fecha) {
			this.tipo = "Publicación";
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
	
	// método toString, que habrá que completar en cada tipo de publicación
	@Override
	public String toString() {
		String devolver = tipo + "[" + codigo + ", " + titulo + ", " + fechaA;
		return devolver;
	}
}
