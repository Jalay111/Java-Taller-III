
public class PuebaLibro {

	public static void main(String[] args) {
		//
		Autor[] autores = new Autor[2];
		autores[0] = new Autor("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
		autores[1] = new Autor("Paul Tan", "Paul@nowhere.com", 'm');

		Libro javaDummy = new Libro("Java for Dummy", autores, 19.99, 99);
		System.out.println(javaDummy);
		System.out.println("los autores son: ");
		javaDummy.imprimirAutores();
	}

}
