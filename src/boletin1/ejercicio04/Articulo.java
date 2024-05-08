package boletin1.ejercicio04;

public class Articulo {

	/**
	 * Atributo constante que almacena el IVA
	 */
	public static final double IVA = 0.21;

	/**
	 * Atributo que almacena el nombre del artículo
	 */
	String nombre = "";

	/**
	 * Atributo que almacena el precio
	 */
	double precio = 0.0;

	/**
	 * Atributo que almacenan cuantos artículos quedan
	 */
	int cuantosQuedan = 0;

	/**
	 * Constructor con parámetros
	 * 
	 * @param nombre        Nombre del artículo
	 * @param precio        Precio del artículo
	 * @param cuantosQuedan Cantidad de artículos que quedan
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan)
			throws NombreException, PrecioException, StockException {
		// Variable que almacena si hay algún error
		// boolean error = true;

		// Comprobamos que el nombre no sea nulo ni vacío
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		} else {
			throw new NombreException();
		}

		// Comprobamos que el precio sea mayor o igual que 0
		if (precio >= 0) {
			this.precio = precio;
		} else {
			throw new PrecioException();
		}

		// Comprobamos que la cantidad de stock sea mayor o igual que 0
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			throw new StockException();
		}
	}

	/**
	 * Obtiene el nombre
	 * 
	 * @return Devuelve el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Añade el nombre
	 * 
	 * @param nombre Nombre del artículo
	 */
	public void setNombre(String nombre) throws NombreException {
		// Comprobamos que el nombre no sea nulo ni vacío
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		} else {
			throw new NombreException();
		}
	}

	/**
	 * Obtiene el precio
	 * 
	 * @return Devuelve el precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Añade el precio
	 * 
	 * @param precio Precio del artículo
	 */
	public void setPrecio(double precio) throws PrecioException {
		// Comprobamos que el precio sea mayor o igual que 0
		if (precio >= 0) {
			this.precio = precio;
		} else {
			throw new PrecioException();
		}
	}

	/**
	 * Obtiene el número de stock
	 * 
	 * @return Devuelve el número de artículos restantes
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Añade cuantos quedan
	 * 
	 * @param cuantosQuedan Cantidad que queda
	 */
	public void setCuantosQuedan(int cuantosQuedan) throws StockException {
		// Comprobamos que la cantidad de stock sea mayor o igual que 0
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		} else {
			throw new StockException();
		}
	}

	/**
	 * Obtiene el IVA
	 * 
	 * @return Devuelve el IVA
	 */
	public double getIVA() {
		return IVA;
	}

	/**
	 * Método que devuelve la información
	 * 
	 * @return Devuelve la información
	 */
	public void informacion() {
		// Mostramos la información
		System.out.println("----------------------------------------------------------------");
		System.out.println("Nombre del artículo: " + this.nombre);
		System.out.println("Precio del artículo: " + this.precio + " €");
		System.out.println("Stock del artículo: " + this.cuantosQuedan + " uds");
		System.out.println("----------------------------------------------------------------");
	}

	/**
	 * Método que devuelve el precio con IVA
	 * 
	 * @return Devuelve el precio con IVA
	 */
	public double getPVP() {
		// Variable donde se almacena el precio con iva
		double pvp = 0.0;

		// Calculamos el pvp
		pvp = (this.precio * IVA) + this.precio;

		// Devolvemos el pvp
		return pvp;
	}

	/**
	 * Método que calcula el PVP con descuento
	 * 
	 * @param descuento Descuento a aplicar
	 * @return Devolvemos el PVP con descuento
	 */
	public double getPVPDescuento(double descuento) {
		// Variable donde se almacena el precio con descuento
		double pvpDescuento = 0.0;

		// Variable donde se pasa el descuento a porcentaje
		double porcentaje = descuento / 100;

		// Calculamos el pvpDescuento
		pvpDescuento = getPVP() - (getPVP() * porcentaje);

		// Devolvemos el PVP con descuento
		return pvpDescuento;
	}

	/**
	 * Método que comprueba si se puede vender o no y en caso afirmativo, resta la
	 * cantidad al stock
	 * 
	 * @param cantidad Cantidad a vender
	 * @return Devuelve si se puede vender o no
	 */
	public boolean vender(int cantidad) {
		// Variable donde se almacena si se vende o no
		boolean vende = false;

		// Comprobamos si hay más o igual stock que cantidad
		if (cantidad <= this.cuantosQuedan) {
			// Restamos la cantidad al stock
			this.cuantosQuedan -= cantidad;

			// Cambiamos el valor del booleano a true
			vende = true;
		}

		// Devolvemos el booleano
		return vende;
	}

	/**
	 * Almacena la cantidad indicada en el stock
	 * 
	 * @param cantidad Cantidad a almacenar
	 */
	public void almacenar(int cantidad) {
		// Actualizamos el stock
		if (cantidad > 0) {
			this.cuantosQuedan += cantidad;
		}
	}

	@Override
	/**
	 * Función que devuelve la información del artículo
	 * 
	 * @return Devuelve una cadena con la información
	 */
	public String toString() {
		// Variable donde se almacenará la información
		String cadena = "";

		// Almacenamos la información
		cadena += "----------------------------------------------------------------";
		cadena += "\nNombre del artículo: " + this.nombre;
		cadena += "\nPrecio del artículo: " + this.precio + " €";
		cadena += "\nStock del artículo: " + this.cuantosQuedan + " uds";
		cadena += "\n----------------------------------------------------------------";

		// Devolvemos la información
		return cadena;
	}
}