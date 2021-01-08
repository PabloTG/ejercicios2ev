package unidad5;

public class Hucha {
	// ATRIBUTOS
	// declaro un array de contadores para cada tipo de moneda o billete en la
	// hucha.
	private int[] totales = { 0, 0, 0, 0, 0, 0 };

	/*
	 * declaro arrays con los valores y nombres de las diferentes monedas y billetes
	 * para hacer más sencillos algunos pasos. Uso arrays diferentes en vez de una
	 * matriz de tres dimensiones por claridad.
	 */
	private final int[] valores = { 1, 2, 5, 10, 20, 50 };
	private final String[] nombres = { " moneda/s de un euro", " moneda/s de dos euros", " billete/s de cinco euros",
			" billete/s de diez euros", " billete/s de veinte euros", " billete/s de cincuenta euros" };

	// declaro un array auxiliar que servirá como contador para minimizar
	// cantidades.
	int[] contador = { 0, 0, 0, 0, 0, 0 };

	// declaro una contraseña, que empezará vacía para poder establecerla.
	private String password = null;

	// declaro el estado de la hucha, abierta o cerrada (empieza abierta).
	private boolean abierta = true;

	// MÉTODOS AUXILIARES
	// método para calcular cuánto dinero hay en la hucha.
	public int getDinero() {
		int dinero = 0;
		for (int i = 0; i <= 5; i++) {
			dinero += totales[i] * valores[i];
		} // fin for
		return dinero;
	} // fin getDinero

	// método para minimizar el número de monedas y billetes que forman una
	// cantidad.
	public void minimizarCantidad(int cantidad) {
		/*
		 * uso un bucle para contar los billetes y las monedas que componen la cantidad
		 * que se pasa como argumento, empezando por los valores más altos para
		 * minimizar su número.
		 */
		for (int i = 5; i >= 0; i--) {
			contador[i] = cantidad / valores[i];
			cantidad -= contador[i] * valores[i];
		} // fin for
	} // fin minimizarCantidad

	// método para averiguar la cantidad de monedas y billetes de cada tipo
	// y el dinero total en la hucha.
	public String verTotales() {
		String total = "En la hucha hay:\n";
		for (int i = 0; i <= 5; i++) {
			total += (totales[i] + nombres[i] + "\n");
		}
		total += "En total hay " + getDinero() + " euros en la hucha.\n";
		return total;
	} // fin verTotales

	// CONSTRUCTORES
	// constructor de hucha vacía.
	public Hucha() {
		// las variables ya están inicializadas a cero.
	}

	// constructor de hucha con números concretos de monedas y billetes.
	public Hucha(int uno, int dos, int cinco, int diez, int veinte, int cincuenta) {
		totales[0] = uno;
		totales[1] = dos;
		totales[2] = cinco;
		totales[3] = diez;
		totales[4] = veinte;
		totales[5] = cincuenta;
	}

	// constructor de hucha con una cantidad concreta minimizando monedas y
	// billetes.
	public Hucha(int cantidadConcreta) {
		// pongo el contador a cero, por si se hubiese usado antes.
		for (int i = 0; i <= 5; i++) {
			contador[i] = 0;
		}
		minimizarCantidad(cantidadConcreta);
		for (int i = 0; i <= 5; i++) {
			totales[i] += contador[i];
		}
	}

	// MÉTODOS DE RETIRAR DINERO
	// método para retirar una cantidad concreta de dinero minimizando monedas y
	// billetes.
	public void retirar(int cantidadConcreta) {
		System.out.println("Procediendo a retirar " + cantidadConcreta + " euros de la hucha.\n");
		if (abierta) {
			if (cantidadConcreta > getDinero()) {
				System.out.println("No hay tanto dinero en la hucha; se cancela la operación.\n");
			} else {
				for (int i = 0; i <= 5; i++) {
					contador[i] = 0;
				}
				minimizarCantidad(cantidadConcreta);
				for (int i = 0; i <= 5; i++) {
					if (contador[i] > totales[i]) {
						System.out.println("No hay suficientes" + nombres[i] + "; se cancela la operación.\n");
					} else
						totales[i] -= contador[i];
				} // fin for
			} // fin else
		} // fin if abierta
		else {
			System.out.println("No se puede sacar dinero, la hucha está cerrada.\n");
		}
	} // fin retirar cantidad concreta

	// método para retirar monedas/billetes según tipo y cantidad, hasta lo
	// disponible.
	public void retirar(int uno, int dos, int cinco, int diez, int veinte, int cincuenta) {
		if (abierta) {
			int[] contadorAuxiliar = { uno, dos, cinco, diez, veinte, cincuenta };
			// declaro dos variables para calcular (y decir) cuánto se saca en total.
			int totalAux = 0, totalPrevio = getDinero();
			for (int i = 0; i <= 5; i++) {
				totalAux += contadorAuxiliar[i] * valores[i];
			}
			System.out.println("Procediendo a retirar " + totalAux + " euros de la hucha.\n");
			for (int i = 0; i <= 5; i++) {
				if (contadorAuxiliar[i] > totales[i]) {
					System.out.println(
							"Sólo hay " + totales[i] + nombres[i] + " en la hucha; se retira el máximo posible.");
					totales[i] = 0;
				} else {
					totales[i] -= contadorAuxiliar[i];
				}
			} // fin for
			System.out.println("Total retirado: " + (totalPrevio - getDinero()) + " euros.\n");
		} // fin if abierta
		else {
			System.out.println("No se puede sacar dinero, la hucha está cerrada.\n");
		}
	} // fin retirar monedas/billetes

	// MÉTODOS DE INGRESAR DINERO
	// método para ingresar una cantidad concreta de dinero, que se minimiza
	// siguiendo las reglas del resto del ejercicio.
	public void ingresar(int cantidadConcreta) {
		if (abierta) {
			for (int i = 0; i <= 5; i++) {
				contador[i] = 0;
			}
			minimizarCantidad(cantidadConcreta);
			for (int i = 0; i <= 5; i++) {
				System.out.println("Se ingresan " + contador[i] + nombres[i] + ".");
				totales[i] += contador[i];
			}
			System.out.println();
		} else
			System.out.println("La hucha está cerrada, no se puede meter dinero en ella.\n");
	} // fin ingresar cantidad concreta

	// método para ingresar monedas y billetes concretos.
	public void ingresar(int uno, int dos, int cinco, int diez, int veinte, int cincuenta) {
		if (abierta) {
			int[] contadorAuxiliar = { uno, dos, cinco, diez, veinte, cincuenta };
			for (int i = 0; i <= 5; i++) {
				System.out.println("Se ingresan " + contadorAuxiliar[i] + nombres[i] + ".");
				totales[i] += contadorAuxiliar[i];
			}
			int totalIngresado = uno * 1 + dos * 2 + cinco * 5 + diez * 10 + veinte * 20 + cincuenta * 50;
			System.out.println("Se ingresan en total " + totalIngresado + " euros.\n");
		} else
			System.out.println("La hucha está cerrada, no se puede meter dinero en ella.\n");
	}

	// MÉTODOS DE CONTRASEÑAS
	// método para abrir la hucha mediante contraseña.
	// si no se estableció previamente la contraseña, se establecerá ahora.
	public void abrir(String contrasena) {
		if (abierta)
			System.out.println("La hucha ya está abierta.\n");
		else {
			if (password == null) {
				abierta = true;
				password = contrasena;
				System.out.println("Contraseña establecida.\nHucha abierta.\n");
			} else if (contrasena == password) {
				abierta = true;
				System.out.println("Hucha abierta.\n");
			} else
				System.out.println("La contraseña no es correcta, la hucha sigue cerrada.\n");
		}
	} // fin abrir

	// método para cerrar la hucha mediante contraseña.
	// si no se estableció previamente la contraseña, se establecerá ahora.
	public void cerrar(String contrasena) {
		if (!abierta)
			System.out.println("La hucha ya está cerrada.\n");
		else {
			if (password == null) {
				abierta = false;
				password = contrasena;
				System.out.println("Contraseña establecida.\nHucha cerrada.\n");
			} else if (contrasena == password) {
				abierta = false;
				System.out.println("Hucha cerrada.\n");
			} else
				System.out.println("La contraseña no es correcta, la hucha sigue abierta.\n");
		}
	} // fin cerrar

	// método para establecer la contraseña.
	public void setPassword(String contrasena) {
		if (password == null) {
			System.out.println("Contraseña establecida.\n");
			password = contrasena;
		} else
			System.out.println("Ya hay una contraseña establecida; para cambiarla debe utilizarla.\n");
	} // fin setPassword establecer

	// método para cambiar la contraseña
	public void setPassword(String vieja, String nueva) {
		if (password == vieja) {
			password = nueva;
			System.out.println("Contraseña cambiada.\n");
		} else
			System.out.println("La contraseña introducida no es correcta, no se ha cambiado la contraseña.\n");
	}

} // fin Hucha
