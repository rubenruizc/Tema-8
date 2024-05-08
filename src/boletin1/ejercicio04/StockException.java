package boletin1.ejercicio04;

public class StockException extends Exception {

	@Override
	public String getMessage() {
		return "Stock negativo";
	}

}