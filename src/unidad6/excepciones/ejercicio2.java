package unidad6.excepciones;
import java.util.Scanner;

public class ejercicio2 {
	// método para calcular la solución, con coeficientes
	// aportados como argumentos en la llamada
	public static String soluciones (double a, double b, double c) {
		// declaro una cadena de caracteres para dar las soluciones
		String devolver = "X = ";
		// intento resolver la ecuación
		try {
			// si el coeficiente de mayor grado es 0, lanzo una excepción
		if (a == 0) throw new IllegalArgumentException();
		// si el discriminante es negativo, una excepción diferente
		if ((b*b - 4*a*c) < 0) throw new ArithmeticException();
		// resuelvo la ecuación con la suma, y la añado a la cadena de caracteres
		double solucionPositiva = (b*(-1) + Math.sqrt(b*b - 4*a*c)) / 2*a;
		devolver += solucionPositiva + " o bien ";
		// resuelvo la ecuación con la resta y la añado a la cadena de caracteres
		double solucionNegativa = (b*(-1) - Math.sqrt(b*b - 4*a*c)) / 2*a;
		devolver += "X = " + solucionNegativa + ".";
		// devuelvo la cadena de caracteres
		return devolver;
		} // fin try
		catch (IllegalArgumentException iae) {
			// si a = 0, devuelvo una cadena de caracteres que lo indica
			return "La ecuación propuesta no es de segundo grado.";
		} // fin catch IllegalArgumentException
		catch (ArithmeticException ae) {
			// si el discriminante es negativo, devuelvo una cadena de caracteres que lo indica
			return "La ecuación propuesta no tiene solución real.";
		} // fin catch ArithmeticException
	} // fin solucion

	public static void main(String[] args) {
		double a, b, c;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Proporcione los coeficientes para la ecuación ax^2 + bx + c = 0: ");
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
