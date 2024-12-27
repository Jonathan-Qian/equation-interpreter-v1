
public class Format {
	private String equation;
	private Integer goToIndex = null;
	
	private static final FormatRule[] FORMAT_RULES = {
		new FormatRule('(') {
			@Override
			public Element format(int index) {
				return new Element();
			}
		}
	};
	
	public Format(String equation) {
		this.equation = equation;
	}
	
	@SuppressWarnings("rawtypes")
	public Element format(int index) {
		char currentChar = equation.charAt(index);
		
		for (int i = 0; i < FORMAT_RULES.length; i++) {
			if (currentChar == FORMAT_RULES[i].targetChar) {
				FORMAT_RULES[i].format(index);
			}
		}
	}
	
	private static abstract class FormatRule {
		private char targetChar;
		
		public FormatRule(char targetChar) {
			this.targetChar = targetChar;
		}
		
		@SuppressWarnings("rawtypes")
		public abstract Element format(int index);
	}
}
