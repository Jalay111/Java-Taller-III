
public class Libro {
	private String nombre;
	private Autor autor;
	private double precio;
	private int existentes = 0;
	
	public Libro(String nombre, Autor autor, double precio) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
	}

	public Libro(String nombre, Autor autor, double precio, int existentes) {
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

	public Autor getAutor() {
		return autor;
	}
	
	public String getNombreAutor() {
		return getAutor().getNombre();
	}
	
	public String getEmailAutor() {
		return getAutor().getEmail();
	}
	
	public char getGeneroAutor() {
		return getAutor().getGenero();
	}
}
