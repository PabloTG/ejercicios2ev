package unidad5;

public class ProbarAnimal {

	public static void main(String[] args) {
		
	Animal gata = new Animal("Pipo", "2000-03-28");
	Animal perra = new Animal("Bimba");
	Animal gata2 = new Animal("Gastrolito");
	gata2.setNombre("Bu");
	gata2.setFecha("2010-06-15");
	
	System.out.println(gata.toString());
	System.out.println(perra.toString());
	System.out.println(gata2.toString());
	System.out.println("Los animales creados hasta ahora se llaman " + gata.getNombre() +
			", " + perra.getNombre() + " y " + gata2.getNombre() + ".");
	
	Animal pruebaNombre = new Animal("Prueba", "2001-01-01");
	pruebaNombre.setNombre("");
	System.out.println(pruebaNombre.toString());
	System.out.println(pruebaNombre.getNombre() + " nació el día " + pruebaNombre.getFecha() + ".");
	}

}
