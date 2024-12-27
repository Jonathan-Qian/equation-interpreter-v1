
public enum Operations {
	ADD("+", '+', new OperationBehaviour(2) {
		@Override
		public double behaviour(double[] operands) {
			return operands[0] + operands[1];
		}
	}),
	SUBTRACT("-", '-', new OperationBehaviour(2) {
		@Override
		public double behaviour(double[] operands) {
			return operands[0] - operands[1];
		}
	}),
	MULTIPLY("*", '*', new OperationBehaviour(2) {
		@Override
		public double behaviour(double[] operands) {
			return operands[0] * operands[1];
		}
	}),
	DIVIDE("/", '/', new OperationBehaviour(2) {
		@Override
		public double behaviour(double[] operands) {
			return operands[0] / operands[1];
		}
	}),
	POWER("^", '^', new OperationBehaviour(2) {
		@Override
		public double behaviour(double[] operands) {
			return Math.pow(operands[0], operands[1]);
		}
	}),
	NTHROOT("nthroot", '\\', new OperationBehaviour(2) {
		@Override
		public double behaviour(double[] operands) {
			return Math.pow(operands[1], 1/operands[0]);
		}
	}),
	ABSOLUTE("|", '|', new OperationBehaviour(1) {
		@Override
		public double behaviour(double[] operands) {
			return Math.abs(operands[0]);
		}
	}),
	SIN("sin", '$', new OperationBehaviour(1) {
		@Override
		public double behaviour(double[] operands) {
			return Math.sin(operands[0]);
		}
	}),
	COS("cos", '@', new OperationBehaviour(1) {
		@Override
		public double behaviour(double[] operands) {
			return Math.cos(operands[0]);
		}
	}),
	TAN("tan", '`', new OperationBehaviour(1) {
		@Override
		public double behaviour(double[] operands) {
			return Math.tan(operands[0]);
		}
	}),
	ARCSIN("arcsin", ':', new OperationBehaviour(1) {
		@Override
		public double behaviour(double[] operands) {
			return Math.asin(operands[0]);
		}
	}),
	ARCCOS("arccos", ';', new OperationBehaviour(1) {
		@Override
		public double behaviour(double[] operands) {
			return Math.acos(operands[0]);
		}
	}),
	ARCTAN("arctan", '\'', new OperationBehaviour(1) {
		@Override
		public double behaviour(double[] operands) {
			return Math.atan(operands[0]);
		}
	}),
	LOG("log", '?', new OperationBehaviour(1) {
		@Override
		public double behaviour(double[] operands) {
			return Math.log(operands[0]);
		}
	});
	//add factorial
	
	final String symbol;
	final char altSymbol;
	final OperationBehaviour operationBehaviour;
	
	private static final Operations[] OPERATIONS = Operations.values();
	
	private Operations(String symbol, char altSymbol, OperationBehaviour operationBehaviour) {
		this.symbol = symbol;
		this.altSymbol = altSymbol;
		this.operationBehaviour = operationBehaviour;
	}
	
	public double operate(double[] operands) {
		return operationBehaviour.operate(operands);
	}
	
	public static Operations getOperation(int index) {
		return OPERATIONS[index];
	}
	
	public static Operations getOperationBySymbol(char c) {
		for (int i = 0; i < OPERATIONS.length; i++) {
			if (c == OPERATIONS[i].altSymbol) {
				return OPERATIONS[i];
			}
		}
		
		System.out.print("Invalid operator input. '");
		System.out.println(c + "' is not a valid operator or function.");
		return OPERATIONS[0];
	}
}
