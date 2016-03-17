
public class PuebaLibro {

	public static void main(String[] args) {
		//
		Autor unAutor = new Autor ("Tan ah teck", "ahteck@somewhere.com",'m');
		Libro unLibro = new Libro ("Java for dummy", unAutor, 19.95, 1000);
		
		Libro otroLibro = new Libro ("more Java for dummy", new Autor("Tan ah teck", "ahteck@somewhere.com",'m'), 29.95, 888);
		
		System.out.println("nombre: "+unLibro.getNombreAutor()+", email: "+unLibro.getEmailAutor());
		System.out.println("nombre: "+otroLibro.getNombreAutor()+", email: "+otroLibro.getEmailAutor());

	}

}
