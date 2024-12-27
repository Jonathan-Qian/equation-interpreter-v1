import java.util.ArrayList;

@SuppressWarnings({ "serial", "rawtypes" })
public class SubEquation extends ArrayList<Element> {
	public SubEquation() {
		super();
	}
	
	public int getSolution() {
		//placeholder
		int answer = 0;
		return answer;
	}
	
	public void add(char c) {
		if (Character.isDigit(c)) {
			add(new Number((double) (c - '0')));
		}
		else if (c == ' ') {
			return; //white space can be ignored;
		}
		else {
			add(new Operator(c));
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append('(');
		
		for (int i = 0; i < size(); i++) {
			builder.append(get(i).toString());
		}
		
		builder.append(')');
		
		return builder.toString();
	}
}