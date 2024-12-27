import java.util.ArrayList;

public class Calculator {
	private ArrayList<Equation> equations;
	
	private static Calculator instance;
	
	private Calculator() {
		equations = new ArrayList<Equation>();
	}
	
	public static Calculator getInstance() {
		if (instance == null) {
			instance = new Calculator();
		}
		
		return instance;
	}
}
