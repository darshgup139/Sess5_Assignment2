package myPack;

public class Run {
	public static void main(String[] args) {
		int value;
		System.out.println("***Fixed-size Stack***");
		Stack fs = new FixedStack(3);
		value = fs.pop();
		if (value != -1)
			System.out.println("Value popped is: " + value);
		fs.push(1);
		fs.push(2);
		fs.push(3);
		value = fs.pop();
		if (value != -1)
			System.out.println("Value popped is: " + value);
		fs.push(4);
		fs.push(5);
		System.out.println("Stack Elements are: ");
		((FixedStack) fs).display();

		System.out.println();
		System.out.println("-----------------------------------------------------");
		System.out.println("***Variable-size Stack***");
		
		Stack vs = new VariableStack(3);
		value = vs.pop();
		if (value != -1)
			System.out.println("Value popped is: " + value);
		vs.push(1);
		vs.push(2);
		vs.push(3);
		value = vs.pop();
		if (value != -1)
			System.out.println("Value popped is: " + value);
		vs.push(4);
		vs.push(5);
		vs.push(6);
		vs.push(7);
		System.out.println("Stack Elements are: ");
		((VariableStack) vs).display();
	}

}

/*
******************************************************************************
Output:
***Fixed-size Stack***
Stack Undeflow
Element Inserted: 1
Element Inserted: 2
Element Inserted: 3
Value popped is: 3
Element Inserted: 4
Stack Overflow
Stack Elements are: 
1 2 4 
-----------------------------------------------------
***Variable-size Stack***
Stack Undeflow
Element Inserted: 1
Element Inserted: 2
Element Inserted: 3
Value popped is: 3
Element Inserted: 4
Element Inserted: 5
Element Inserted: 6
Element Inserted: 7
Stack Elements are: 
1 2 4 5 6 7 
******************************************************************************
*/