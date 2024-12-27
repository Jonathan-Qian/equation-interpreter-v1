
public abstract class Element<T> {
	private T value;
	private final int type;
	
	public static final int NUMBER = 0, OPERATION = 1, VARIABLE = 2, ANSWER_INDEX = 3;
	
	public Element(T value, int type) {
		this.value = value;
		this.type = type;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public int getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
}
