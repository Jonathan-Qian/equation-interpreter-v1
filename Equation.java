import java.util.ArrayList;

@SuppressWarnings({ "serial" })
public class Equation extends ArrayList<SubEquation> {
	public static final int DEPTH_UNCHANGED = 0;
	public static final int DEPTH_INCREASED = 1;
	public static final int DEPTH_DECREASED = 2;
	
	private Double solution;
	
	public Equation(String equation) {
		super(split(equation));
		solution = evaluate();
	}
	
	public double getSolution(boolean reevaluate) {
		if (reevaluate) {
			solution = evaluate();
		}
		
		return solution;
	}
	public double getSolution() {
		return getSolution(false);
	}
	
	private double evaluate() {
		return 0;
	}
	
	private static ArrayList<SubEquation> split(String formattedEquation) {
		ArrayList<SubEquation> internalEquation = new ArrayList<SubEquation>();
		
		int selector = 0, previousSelector = 0, depthChange;
		char subjectChar;
		
		internalEquation.add(new SubEquation());
		
		for (int i = 0; i < formattedEquation.length(); i++) {
			subjectChar = formattedEquation.charAt(i);
			depthChange = depthChange(subjectChar);
			
			switch (depthChange) {
				case DEPTH_INCREASED:
					previousSelector = selector;
					selector = internalEquation.size();
					
					internalEquation.add(new SubEquation());
					internalEquation.get(previousSelector)
					.add(new AnswerIndex(internalEquation.get(selector)));
					break;
					
				case DEPTH_DECREASED:
					selector = previousSelector;
					break;
					
				case DEPTH_UNCHANGED:
					internalEquation.get(selector).add(subjectChar);
			}
		}
		
		return internalEquation;
	}
	
	private static int depthChange(char c) {
		if (c == '(') {
			return DEPTH_INCREASED;
		}
		else if (c == ')') {
			return DEPTH_DECREASED;
		}
		
		return DEPTH_UNCHANGED;
	}
	
	@Override
	public String toString() {
		return get(0).toString();
	}
}
