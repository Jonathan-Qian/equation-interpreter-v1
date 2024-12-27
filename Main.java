
public class Main {
	//add formatter
	//add evaluation / order of operations
	//add ability to use mathematical constants / variables
	//give error when invalid number of brackets
	
	//fix Equation-AnswerIndex data structure
	
	public static void main(String[] args) {
		String equation = "4*(3*(4+2)^2+3/(8-2^2)*2-(2-2^(2/2)))";
		
		System.out.println(new Equation(equation));
	}
	
	//Unused
	/*public static int maxDepth(String equation) {
		int depth = 0;
		int maxDepth = depth;
		
		for(int i = 0; i < equation.length(); i++) {
			depth = depth(depth, equation.charAt(i));
			
			if (depth > maxDepth) {
				maxDepth = depth;
			}
		}
		
		return maxDepth;
	}
	
	public static int depth(int depth, char c) {
		if (c == '(') depth++;
		else if (c == ')') depth--;
		
		return depth;
	}*/
}
