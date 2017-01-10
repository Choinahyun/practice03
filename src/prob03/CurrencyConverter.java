package prob03;

public class CurrencyConverter {

	private static double rate;

	public static double toDollar(double won) {
		double result = won / rate;
		return result;
	}

	public static double toKRW(double dollar) {
		double result = dollar * rate;
		return result;
	}

	public static void setRate(double r) {
		rate = r;
	}
}
