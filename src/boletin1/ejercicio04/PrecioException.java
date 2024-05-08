package boletin1.ejercicio04;

public class PrecioException extends Exception {

	@Override
	public String getMessage() {
		return "Precio negativo";
	}

}