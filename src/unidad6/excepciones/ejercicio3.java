package unidad6.excepciones;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ejercicio3 {

	// método para calcular la hipotenusa de un triángulo
	// rectángulo del que conocemos las longitudes de sus
	// dos catetos, que se pasan al método como parámetros
	public static String hipotenusa(double catetoA, double catetoB) {
		String hipotenusa = String.valueOf(Math.sqrt(catetoA * catetoA + catetoB * catetoB));
		return hipotenusa;
	}

	public static void main(String[] args) {
		// variables para contener las longitudes de los catetos
		double a = 0, b = 0;
		// variable para el do... while
		int ahoraQue = 1;
		// Scanner para leer la entrada estándar
		Scanner entrada = new Scanner(System.in);
		// se da el primer prompt
		System.out.println("> ");
		// con el do... while se asegura que después de cada instrucción
		// queda a la espera de nuevas instrucciones, salvo con F
		do {
			try {
				// se acepta una letra mayúscula o minúscula
				switch (entrada.next().toUpperCase()) {
				// si es la A o la B, se espera por un cateto
				case "A":
					System.out.println("> ");
					a = entrada.nextDouble();
					System.out.println("> ");
					break;
				case "B":
					System.out.println("> ");
					b = entrada.nextDouble();
					System.out.println("> ");
					break;
				// si es la C, se comprueba que ambos catetos tengan longitud asignada
				case "C":
					if (a == 0 | b == 0) {
						// si no, se lanza una excepción
						throw new IllegalArgumentException();
					} // fin if catetos = 0
						// si ambos catetos tienen longitud, se calcula la hipotenusa y se muestra
					System.out.println("La hipotenusa que corresponde a los catetos " + a + " y " + b + " mide "
							+ hipotenusa(a, b) + ".");
					// y se resetean las longitudes de los catetos
					a = 0;
					b = 0;
					break;
				// si es la F, se cambia la variable del do... while para salir del bucle
				case "F":
					ahoraQue = 0;
					break;
				// si se pulsa cualquier otra tecla, se avisa de los comandos válidos
				default:
					throw new UnsupportedOperationException();
				} // fin switch
			} // fin try
			catch (IllegalArgumentException iae) {
				System.out.println("Ambos catetos deben tener asignada longitud.");
			} // fin catch IllegalArgumentException
			catch (InputMismatchException ime) {
				System.out.println("La longitud de un cateto debe ser un número.");
			} // fin InputMismatchException
			catch (UnsupportedOperationException ioe) {
				System.out.println("Sólo los comandos A, B, C o F son válidos.");
			}
		} // fin do
		while (ahoraQue == 1);
		// si se sale del do... while se cierra el scanner para que Eclipse no se queje
		entrada.close();
	} // fin main
}
