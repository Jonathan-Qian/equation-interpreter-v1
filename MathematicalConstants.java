
public enum MathematicalConstants {
	E("e", 2.718282),
	PI("pi", 3.141593);
	
	final String symbol;
	final double value;
	
	private MathematicalConstants(String symbol, double value) {
		this.symbol = symbol;
		this.value = value;
	}
}