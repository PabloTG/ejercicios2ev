package unidad6.excepciones;

public class ejercicio1 {
	
	public static boolean isInt (String n) {
		// declaro un booleano para usar con el método
		// (la inicializo para que Eclipse no dé problemas)
		boolean devolver = false;
		// intento comprobar si la cadena pasada como argumento es un número entero
		try {
		Integer.parseInt(n);
		// si lo es, el método devuelve true
		devolver = true;
		} // fin try
		catch (NumberFormatException nfe) {
			// si no lo es, devuelve false
			devolver = false;
		} // fin catch NumberFormatException
		catch (Exception exc) {
			// capturo cualquier otro problema e indico que ocurrió algo inesperado
			System.out.println("Ha ocurrido un problema: " + exc.getMessage());
		} // fin catch genérico
		finally {
			// devuelvo el booleano
			return devolver;
		} // fin finally
	} // fin isInt
	
	public static boolean isDouble (String n) {
		// el funcionamiento de isDouble es análogo al de isInt
		boolean devolver = false;
		try {
		Double.parseDouble(n);
		devolver = true;
		} // fin try
		catch (NumberFormatException nfe) {
			devolver = false;
		} // fin catch NumberFormatException
		catch (Exception exc) {
			System.out.println("Ha ocurrido un problema: " + exc.getMessage());
			devolver = false;
		} // fin catch genérico
		finally {
			return devolver;
		} // fin finally
	} // fin isDouble
	
	public static void mensajes (String cadena) {
		// comprueba si la cadena de caracteres pasada como argumento
		// es un entero o no, e imprime un mensaje comunicándolo
		if (isInt(cadena)) System.out.println("La cadena de caracteres " + cadena + " es un número entero.");
		else {
			System.out.println("La cadena de caracteres " + cadena + " NO es un número entero.");
			// como un número entero es, por definición, un número decimal con cero
			// cifras decimales, una cadena de caracteres que devuelva true con isInt
			// devolverá true con isDouble, así que sólo lo compruebo en el else
			if (isDouble(cadena)) System.out.println("La cadena de caracteres " + cadena + " es un número decimal.");
			else System.out.println("La cadena de caracteres " + cadena + " tampoco es un número decimal.");
		} // fin else		
	} // fin mensajes
	
	public static void mensajes2 (String cadena) {
		// este método debería hacer lo mismo que mensajes pero complicándome menos la vida
		if (isInt(cadena) & isDouble(cadena)) System.out.println("La cadena de caracteres " + cadena + " es un número entero.");
		if (!isInt(cadena) & isDouble(cadena)) System.out.println("La cadena de caracteres " + cadena + " es un número decimal.");
		if (!isInt(cadena) & !isDouble(cadena)) System.out.println("La cadena de caracteres " + cadena + " no es ni un número entero ni un número decimal.");
	} // fin mensajes2

	public static void main(String[] args) {
		// cadenas de caracteres para probar los métodos
		String letras = "abcDEF";
		String numero = "1234";
		String decimal = "1234.567";
		// comprueba los métodos
		mensajes(letras);
		mensajes(numero);
		mensajes(decimal);
		System.out.println();
		mensajes2(letras);
		mensajes2(numero);
		mensajes2(decimal);
	} // fin main

}
