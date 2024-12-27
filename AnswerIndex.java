
public class AnswerIndex extends Element<SubEquation> {
	public AnswerIndex(SubEquation subEquation) {
		super(subEquation, Element.ANSWER_INDEX);
	}
	
	public double getReferencedAnswer() {
		return getValue().getSolution();
	}
}
