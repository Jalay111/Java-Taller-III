import java.util.Scanner;

public class PuebaLibro {

	public static void main(String[] args) {
		//
		Scanner teclado = new Scanner(System.in);
		Libro javaDummy = new Libro("Java for Dummy", 19.99, 99);
		
		javaDummy.agregarAutor(new Autor("Tan Ah Teck", "AhTeck@somewhere.com", 'm'));
		javaDummy.agregarAutor(new Autor("Paul Tan", "Paul@nowhere.com", 'm'));
		System.out.println(javaDummy);
		System.out.print("los autores son: ");
		javaDummy.imprimirAutores();
		
		boolean respuesta = false;
		System.out.println("ingrese el nombre del autor a eliminar");
		String nombreAutor = teclado.next();
		javaDummy.eliminarAutor(nombreAutor, respuesta);
		if (respuesta == false) {
			System.out.println("autor no encontrado");
		}else{
			System.out.println("autor eliminado con exito");
		}
	}

}
