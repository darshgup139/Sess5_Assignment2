package myPack;

public class VariableStack implements Stack {
	int top;
	int size;
	int[] intContainer;
	int[] newIntContainer;

	public VariableStack(int size) {
		super();
		this.top = -1;
		this.size = size;
		this.intContainer = new int[size];
	}

	@Override
	public void push(int I) {
		// TODO Auto-generated method stub
		if (top == size - 1) {
			expandArray();
		}
		top = top + 1;
		intContainer[top] = I;
		System.out.println("Element Inserted: " + I);
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		int topValue;
		if (top != -1) {
			topValue = intContainer[top];
			top = top - 1;
			return topValue;
		} else {
			System.out.println("Stack Undeflow");
			return -1;
		}
	}

	public void expandArray() {
		newIntContainer = new int[intContainer.length + 1];
		for (int i = 0; i < intContainer.length; i++)
			newIntContainer[i] = intContainer[i];
		intContainer = newIntContainer;
		size = size + 1;
	}

	public void display() {
		for (int i = 0; i < intContainer.length; i++)
			System.out.print(intContainer[i]+" ");
	}

}
