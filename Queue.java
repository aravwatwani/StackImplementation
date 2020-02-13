import java.util.ArrayList;

public class QueQue<T> {
	private Stack<T> data1;
	private Stack<T> data2;
	private int size;

	public QueQue() {
		data1 = new Stack<T>(); // instantiate new stacks
		data2 = new Stack<T>(); // instantiate new stacks
	}

	public int size() { // returns size
		return size;
	}

	public void add(T t) { // add method that pushes from first stack
		data1.push(t);
		size++;
	}

	public T remove() { // remove method that pops from first stack and pushes
						// to second stack
		if (data1.isEmpty()) {
			return null;
		}

		if (data2.isEmpty()) {
			while (!data1.isEmpty()) {
				data2.push(data1.pop());
				size--;
			}
		}
		return data2.pop();
	}

	public T peek() {
		for (int i = 0; i < size; i++) {
			data2.push(data1.pop());
		}
		return data2.pop();
	}

}
		                   
		        		                   
		        		                   
		        