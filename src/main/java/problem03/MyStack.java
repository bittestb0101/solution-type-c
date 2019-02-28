package problem03;

public class MyStack {

	private String[] buffer;
	private int top;
	

	public MyStack(int size) {
		
		size();
		buffer = new String[size()];
		top = -1;
	}

	public void push(String item) {
		if (!isFull())
			buffer[++top] = item;
	}

	public String pop() {
		if (!isEmpty())
			return buffer[top--];
		return null;
	}

	public boolean isEmpty() {
		return top == -1 ? true : false;
	}

	private boolean isFull() {
		return (top + 1 == size()) ? true : false;
	}

	public int size() {
		return 5;
	}

	public void display() {
		System.out.print("top : " + top + "\nstack : ");
		for (int idx = 0; idx <= top; idx++)
			System.out.print(buffer[idx] + " ");
		System.out.println();
	}
}