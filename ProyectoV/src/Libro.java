
public class Libro {
	private String nombre;
	private Autor[] autores;
	private double precio;
	private int existentes = 0;
	
	public Libro(String nombre, Autor[] autor, double precio) {
		super();
		this.nombre = nombre;
		this.autores = autor;
		this.precio = precio;
	}

	public Libro(String nombre, Autor[] autor, double precio, int existentes) {
		this(nombre, autor, precio);
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
		for (int i = 0; i < autores.length; i++) {
			System.out.println("Nombre: "+autores[i].getNombre()+", Email: "+autores[i].getEmail()+" genero: "+autores[i].getGenero());
		}
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autores=" + autores.length + ", precio=" + precio
				+ ", existentes=" + existentes + "]";
	}
}
