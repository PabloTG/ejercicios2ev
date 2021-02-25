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
			 * este intento de usar el mínimo de cláusulas catch posible no funciona (no
			 * informa bien de checked / unchecked), así que uso cláusulas catch individuales:
			 * 	catch (Exception e) { 
			 * 		String checkedUnchecked = "";
			 * 		if (e.getClass().toString() == "class java.io.FileNotFoundException" ||
			 * 			e.getClass().toString() == "class java.lang.ClassNotFoundException")
			 * 				checkedUnchecked = " (checked).";
			 * 		else checkedUnchecked = " (unchecked).";
			 *		System.out.println("Se ha producido una excepción: " + e.getClass() +
			 * 			checkedUnchecked);
			 * 	}
			 * 	catch (StackOverflowError soe) {
			 * 		System.out.println("Las operaciones recursivas pueden sobrecargar la Máquina Virtual de Java."
			 * 			+ "\nEsto es un error (StackOverflowError), no una excepción.");
			 * 	}
			 */
			// para capturar errores en la entrada para opcion
			catch (NumberFormatException nfe) {
				System.out.println("No se puede convertir esa cadena de caracteres en un número."
						+ "\nEsta excepción es una NumberFormatException (unchecked).");
			}
			// para capturar 1 / 0
			catch (ArithmeticException ae) {
				System.out.println(
						"1 / 0 es una indeterminación.\nEsta excepción es una ArithmeticException (unchecked).");
			}
			// para capturar a[a.length] = a.length
			catch (ArrayIndexOutOfBoundsException aioobe) {
				System.out.println("No se pueden insertar elementos en un array en un índice fuera del array."
						+ "\nEsta excepción es una ArrayIndexOutOfBoundsException (unchecked).");
			}
			// para capturar new FileInputStream("este fichero no existe")
			catch (FileNotFoundException fnfe) {
				System.out.println("No se puede abrir un flujo de datos a un fichero que no existe."
						+ "\nEsta excepción es una FileNotFoundException (checked).");
			}
			// para capturar null toString
			catch (NullPointerException npe) {
				System.out.println("No se puede convertir en cadena de caracteres un objeto que no existe."
						+ "\nEsta excepción es una NullPointerException (unchecked).");
			}
			// ¿Se pueden capturar errores en vez de excepciones?
			catch (StackOverflowError soe) {
				System.out.println("Las operaciones recursivas pueden sobrecargar la Máquina Virtual de Java."
						+ "\nEsto es un error (StackOverflowError), no una excepción.");
			}
			// para capturar Class.forName("UnaClase")
			catch (ClassNotFoundException cnfe) {
				System.out.println("No se puede encontrar una clase no definida."
						+ "\nEsta excepción es una ClassNotFoundException (checked).");
			}
			// para que Eclipse no se queje porque el throws de lanzarExcepcion es genérico
			catch (Exception e) {
				System.out.println("Se ha producido una excepción inesperada: " + e.toString());
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