package boletin1.ejercicio04;

public class NombreException extends Exception {

	@Override
	public String getMessage() {
		return "Nombre mal formado";
	}

}