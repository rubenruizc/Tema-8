package boletin1.ejercicio02;

public class Main {

	public static void main(String[] args) {
		Hora hora;
		Hora hora2;
		Hora hora3;

		try {
			hora = new Hora(-22, 15, 30);
		} catch (NegativeMinuteException e) {
			System.out.println(e.getMessage());
		} catch (NegativeHourException e) {
			System.out.println(e.getMessage());
		} catch (NegativeSecondException e) {
			System.out.println(e.getMessage());
		}

		try {
			hora2 = new Hora(22, 15, 30);
		} catch (NegativeMinuteException e) {
			System.out.println(e.getMessage());
		} catch (NegativeHourException e) {
			System.out.println(e.getMessage());
		} catch (NegativeSecondException e) {
			System.out.println(e.getMessage());
		}

		try {
			hora3 = new Hora(22, 15, 30);
		} catch (NegativeMinuteException e) {
			System.out.println(e.getMessage());
		} catch (NegativeHourException e) {
			System.out.println(e.getMessage());
		} catch (NegativeSecondException e) {
			System.out.println(e.getMessage());
		}
	}

}
