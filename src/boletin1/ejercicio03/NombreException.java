package boletin1.ejercicio03;

public class NombreException extends Exception {

	@Override
	public String getMessage() {
		return "Nombre mal formado";
	}
	
}