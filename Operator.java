
public class Operator extends Element<Operations> {
	private Operator(Operations operation) {
		super(operation, Element.OPERATION);
	}
	public Operator(char c) {
		this(Operations.getOperationBySymbol(c));
	}
	public Operator(int operationIndex) {
		this(Operations.getOperation(operationIndex));
	}
	
	public double operate(double[] operands) {
		return getValue().operate(operands);
	}
	
	@Override
	public String toString() {
		return getValue().symbol;
	}
}
