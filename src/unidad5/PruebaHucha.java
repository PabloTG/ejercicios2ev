package unidad5;

public class PruebaHucha {

	public static void main(String[] args) {
		
		System.out.println("HUCHA VACÍA:");
		Hucha huchaVacia = new Hucha();
		System.out.println(huchaVacia.verTotales());
		huchaVacia.retirar(1000);
		huchaVacia.cerrar("123");
		huchaVacia.cerrar("1234");
		huchaVacia.setPassword("123", "1234");
		huchaVacia.cerrar("1234");
		huchaVacia.ingresar(20);
		huchaVacia.abrir("1234");
		huchaVacia.ingresar(20);
		System.out.println(huchaVacia.verTotales());
		
		System.out.println("HUCHA CON MONEDAS Y BILLETES:");
		Hucha huchaNumeros = new Hucha(1, 2, 5, 10, 20, 50);
		System.out.println(huchaNumeros.verTotales());
		huchaNumeros.retirar(3, 3, 3, 3, 3, 3);
		huchaNumeros.retirar(1000);
		System.out.println(huchaNumeros.verTotales());
		huchaNumeros.setPassword("1234");
		huchaNumeros.cerrar("1234");
		huchaNumeros.abrir("123");
		huchaNumeros.setPassword("1234", "123");
		huchaNumeros.abrir("123");
		
		System.out.println("HUCHA CON CANTIDAD CONCRETA:");
		Hucha huchaCantidad = new Hucha(37);
		System.out.println(huchaCantidad.verTotales());
		huchaCantidad.retirar(1);
		huchaCantidad.retirar(2);
		huchaCantidad.retirar(30);
		System.out.println(huchaCantidad.verTotales());
		huchaCantidad.ingresar(51);
		huchaCantidad.ingresar(1, 1, 1, 1, 1, 1);
		System.out.println(huchaCantidad.verTotales());
		huchaCantidad.setPassword("1234");
		huchaCantidad.abrir("1234");
		huchaCantidad.setPassword("1234");
		huchaCantidad.setPassword("123", "12345");

	}

}
