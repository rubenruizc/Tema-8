package boletin1.ejercicio02;

public class NegativeSecondException extends Exception {

	@Override
	public String getMessage() {
		String infoSegundoNegativo = "Segundo negativo";
		return infoSegundoNegativo;
	}
}
