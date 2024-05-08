package boletin1.ejercicio02;

public class NegativeHourException extends Exception{
	
	@Override
	public String getMessage() {
		String infoHoraNegativa = "Hora negativa";
		return infoHoraNegativa;
	}

}
