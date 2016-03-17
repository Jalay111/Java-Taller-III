
public class PruebaAutor {

	public static void main(String[] args) {
		// 
		Autor autor = new Autor ("Tan ah teck", "ahteck@somewhere.com",'m'); //creamos el objeto de tipo Autor y le pasamos por parametros los valores de los atributos
		System.out.println(autor); //internamente llama al metodo "toString" e imprime el objeto que hemos creado
		autor.setEmail("paul@nowhere.com");//entramos al metodo "setEmail" y modificamos el email
		System.out.println(autor);//volvemos a imprimir el Objeto por medio del metodo "toString"
	}

}
