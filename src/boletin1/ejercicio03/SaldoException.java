package boletin1.ejercicio03;

public class SaldoException extends Exception {

	@Override
	public String getMessage() {
		return "Saldo negativo";
	}
	
}
