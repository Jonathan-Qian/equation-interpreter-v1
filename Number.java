
public class Number extends Element<Double> {
	public Number(Double value) {
		super(value, Element.NUMBER);
	}
	
	@Override
	public String toString() {
		String number = getValue().toString();
		
		if (number.substring(number.length() - 2).equals(".0")) {
			number = number.substring(0, number.length() - 2);
		}
		
		return number;
	}
}
