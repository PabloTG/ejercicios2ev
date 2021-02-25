package unidad6.excepciones;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Ejercicio6 {
	Ejercicio6 e = new Ejercicio6();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String opcion;
		while (!(opcion = in.next()).equalsIgnoreCase("fin"))
			try {
				lanzarExcepcion(Integer.parseInt(opcion));
			}
			/*
			 * este intento de usar el m�nimo de cl�usulas catch posible no funciona (no
			 * informa bien de checked / unchecked), as� que uso cl�usulas catch individuales:
			 * 	catch (Exception e) { 
			 * 		String checkedUnchecked = "";
			 * 		if (e.getClass().toString() == "class java.io.FileNotFoundException" ||
			 * 			e.getClass().toString() == "class java.lang.ClassNotFoundException")
			 * 				checkedUnchecked = " (checked).";
			 * 		else checkedUnchecked = " (unchecked).";
			 *		System.out.println("Se ha producido una excepci�n: " + e.getClass() +
			 * 			checkedUnchecked);
			 * 	}
			 * 	catch (StackOverflowError soe) {
			 * 		System.out.println("Las operaciones recursivas pueden sobrecargar la M�quina Virtual de Java."
			 * 			+ "\nEsto es un error (StackOverflowError), no una excepci�n.");
			 * 	}
			 */
			// para capturar errores en la entrada para opcion
			catch (NumberFormatException nfe) {
				System.out.println("No se puede convertir esa cadena de caracteres en un n�mero."
						+ "\nEsta excepci�n es una NumberFormatException (unchecked).");
			}
			// para capturar 1 / 0
			catch (ArithmeticException ae) {
				System.out.println(
						"1 / 0 es una indeterminaci�n.\nEsta excepci�n es una ArithmeticException (unchecked).");
			}
			// para capturar a[a.length] = a.length
			catch (ArrayIndexOutOfBoundsException aioobe) {
				System.out.println("No se pueden insertar elementos en un array en un �ndice fuera del array."
						+ "\nEsta excepci�n es una ArrayIndexOutOfBoundsException (unchecked).");
			}
			// para capturar new FileInputStream("este fichero no existe")
			catch (FileNotFoundException fnfe) {
				System.out.println("No se puede abrir un flujo de datos a un fichero que no existe."
						+ "\nEsta excepci�n es una FileNotFoundException (checked).");
			}
			// para capturar null toString
			catch (NullPointerException npe) {
				System.out.println("No se puede convertir en cadena de caracteres un objeto que no existe."
						+ "\nEsta excepci�n es una NullPointerException (unchecked).");
			}
			// �Se pueden capturar errores en vez de excepciones?
			catch (StackOverflowError soe) {
				System.out.println("Las operaciones recursivas pueden sobrecargar la M�quina Virtual de Java."
						+ "\nEsto es un error (StackOverflowError), no una excepci�n.");
			}
			// para capturar Class.forName("UnaClase")
			catch (ClassNotFoundException cnfe) {
				System.out.println("No se puede encontrar una clase no definida."
						+ "\nEsta excepci�n es una ClassNotFoundException (checked).");
			}
			// para que Eclipse no se queje porque el throws de lanzarExcepcion es gen�rico
			catch (Exception e) {
				System.out.println("Se ha producido una excepci�n inesperada: " + e.toString());
			}
		in.close();
	}

	static void lanzarExcepcion(int opcion) throws Exception {
		switch (opcion) {
		case 1:
			System.out.println(1 / 0);
			break;
		case 2:
			int[] a = new int[10];
			a[a.length] = a.length;
			break;
		case 3:
			FileInputStream in = new FileInputStream("este fichero no existe");
			break;
		case 4:
			Object o = null;
			System.out.println(o.toString());
			break;
		case 5:
			Ejercicio6 e = new Ejercicio6();
			break;
		default:
			Class.forName("UnaClase");
		}
	}
}