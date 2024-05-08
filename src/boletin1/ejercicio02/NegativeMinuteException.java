package boletin1.ejercicio02;

public class NegativeMinuteException extends Exception {

	@Override
	public String getMessage() {
		String infoMinutoNegativo = "Minuto negativo";
		return infoMinutoNegativo;
	}
}
