package unidad6.excepciones;

public class ejercicio1 {
	
	public static boolean isInt (String n) {
		// declaro un booleano para usar con el m�todo
		// (la inicializo para que Eclipse no d� problemas)
		boolean devolver = false;
		// intento comprobar si la cadena pasada como argumento es un n�mero entero
		try {
		Integer.parseInt(n);
		// si lo es, el m�todo devuelve true
		devolver = true;
		} // fin try
		catch (NumberFormatException nfe) {
			// si no lo es, devuelve false
			devolver = false;
		} // fin catch NumberFormatException
		catch (Exception exc) {
			// capturo cualquier otro problema e indico que ocurri� algo inesperado
			System.out.println("Ha ocurrido un problema: " + exc.getMessage());
		} // fin catch gen�rico
		finally {
			// devuelvo el booleano
			return devolver;
		} // fin finally
	} // fin isInt
	
	public static boolean isDouble (String n) {
		// el funcionamiento de isDouble es an�logo al de isInt
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
		} // fin catch gen�rico
		finally {
			return devolver;
		} // fin finally
	} // fin isDouble
	
	public static void mensajes (String cadena) {
		// comprueba si la cadena de caracteres pasada como argumento
		// es un entero o no, e imprime un mensaje comunic�ndolo
		if (isInt(cadena)) System.out.println("La cadena de caracteres " + cadena + " es un n�mero entero.");
		else {
			System.out.println("La cadena de caracteres " + cadena + " NO es un n�mero entero.");
			// como un n�mero entero es, por definici�n, un n�mero decimal con cero
			// cifras decimales, una cadena de caracteres que devuelva true con isInt
			// devolver� true con isDouble, as� que s�lo lo compruebo en el else
			if (isDouble(cadena)) System.out.println("La cadena de caracteres " + cadena + " es un n�mero decimal.");
			else System.out.println("La cadena de caracteres " + cadena + " tampoco es un n�mero decimal.");
		} // fin else		
	} // fin mensajes
	
	public static void mensajes2 (String cadena) {
		// este m�todo deber�a hacer lo mismo que mensajes pero complic�ndome menos la vida
		if (isInt(cadena) & isDouble(cadena)) System.out.println("La cadena de caracteres " + cadena + " es un n�mero entero.");
		if (!isInt(cadena) & isDouble(cadena)) System.out.println("La cadena de caracteres " + cadena + " es un n�mero decimal.");
		if (!isInt(cadena) & !isDouble(cadena)) System.out.println("La cadena de caracteres " + cadena + " no es ni un n�mero entero ni un n�mero decimal.");
	} // fin mensajes2

	public static void main(String[] args) {
		// cadenas de caracteres para probar los m�todos
		String letras = "abcDEF";
		String numero = "1234";
		String decimal = "1234.567";
		// comprueba los m�todos
		mensajes(letras);
		mensajes(numero);
		mensajes(decimal);
		System.out.println();
		mensajes2(letras);
		mensajes2(numero);
		mensajes2(decimal);
	} // fin main

}
