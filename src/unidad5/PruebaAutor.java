package unidad5;

public class PruebaAutor {

	public static void main(String[] args) {
		// constructor.
		Autor lBrackett = new Autor("Leigh Brackett", "lleva a�os muerta, no tiene e-mail", "mujer");
		// pruebas de getters.
		System.out.println(lBrackett.getNombre());
		System.out.println(lBrackett.getGenero());
		System.out.println(lBrackett.getEmail());
		System.out.println();
		// prueba del m�todo toString.
		System.out.println(lBrackett.toString());
		System.out.println();

		Autor cMieville = new Autor("China Mi�ville", "desconocido", "hombre");
		// prueba del setter.
		cMieville.setEmail("chinamieville@mailzone.com");
		System.out.println(cMieville.toString());
	}

}
