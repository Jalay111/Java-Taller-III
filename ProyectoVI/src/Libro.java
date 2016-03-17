
public class Libro {
	private String nombre;
	private Autor[] autores = new Autor[5];
	private int numAutores = 0;
	private double precio;
	private int existentes = 0;
	
	public Libro(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public Libro(String nombre, double precio, int existentes) {
		this(nombre, precio);
		this.existentes = existentes;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getExistentes() {
		return existentes;
	}

	public void setExistentes(int existentes) {
		this.existentes = existentes;
	}

	public String getNombre() {
		return nombre;
	}

	public Autor[] getAutores() {
		return autores;
	}
	
	public void imprimirAutores() {
		for (int i = 0; i < numAutores; i++) {
			System.out.println("Nombre: "+autores[i].getNombre()+", Email: "+autores[i].getEmail()+" genero: "+autores[i].getGenero());
		}
	}
	
	public void agregarAutor(Autor autor) {
		autores[numAutores] = autor;
		numAutores++;
	}

	public boolean eliminarAutor(String nombreAutor, boolean respuesta) {
		for (int i = 0; i < numAutores; i++) {
			if (nombreAutor != autores[i].getNombre()) {
			}else{
				respuesta = true;
				System.out.println("si");
				numAutores--;
			}
		}
		return respuesta;
	}
	
	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autores=" + autores.length + ", precio=" + precio
				+ ", existentes=" + existentes + "]";
	}
}
