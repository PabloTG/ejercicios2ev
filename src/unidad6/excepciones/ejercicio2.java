package unidad6.excepciones;
import java.util.Scanner;

public class ejercicio2 {
	// m�todo para calcular la soluci�n, con coeficientes
	// aportados como argumentos en la llamada
	public static String soluciones (double a, double b, double c) {
		// declaro una cadena de caracteres para dar las soluciones
		String devolver = "X = ";
		// intento resolver la ecuaci�n
		try {
			// si el coeficiente de mayor grado es 0, lanzo una excepci�n
		if (a == 0) throw new IllegalArgumentException();
		// si el discriminante es negativo, una excepci�n diferente
		if ((b*b - 4*a*c) < 0) throw new ArithmeticException();
		// resuelvo la ecuaci�n con la suma, y la a�ado a la cadena de caracteres
		double solucionPositiva = (b*(-1) + Math.sqrt(b*b - 4*a*c)) / 2*a;
		devolver += solucionPositiva + " o bien ";
		// resuelvo la ecuaci�n con la resta y la a�ado a la cadena de caracteres
		double solucionNegativa = (b*(-1) - Math.sqrt(b*b - 4*a*c)) / 2*a;
		devolver += "X = " + solucionNegativa + ".";
		// devuelvo la cadena de caracteres
		return devolver;
		} // fin try
		catch (IllegalArgumentException iae) {
			// si a = 0, devuelvo una cadena de caracteres que lo indica
			return "La ecuaci�n propuesta no es de segundo grado.";
		} // fin catch IllegalArgumentException
		catch (ArithmeticException ae) {
			// si el discriminante es negativo, devuelvo una cadena de caracteres que lo indica
			return "La ecuaci�n propuesta no tiene soluci�n real.";
		} // fin catch ArithmeticException
	} // fin solucion

	public static void main(String[] args) {
		double a, b, c;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Proporcione los coeficientes para la ecuaci�n ax^2 + bx + c = 0: ");
		System.out.println("Introduzca a: ");
		a = entrada.nextDouble();
		System.out.println("Introduzca b: ");
		b = entrada.nextDouble();
		System.out.println("Introduzca c: ");
		c = entrada.nextDouble();
		System.out.println(soluciones(a, b, c));
		entrada.close();
	} // fin main

}
