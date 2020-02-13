import java.util.ArrayList;

public class Queue<T> {
	private ArrayList<T> data;
	private int size;

	public Queue() {
		data = new ArrayList<T>();
	}

	public int size() {
		return size;
	}

	public void add(T t) {
		data.add(t);
		size++;
	}

	public T remove() {
		T t = data.remove(0);
		size--;
		return t;
	}

	public T peek() { //
		return data.get(0);
	}

	public boolean isEmpty() {
		if (data.size() == 0) {
			return true;
		}
		return false;
	}

	// override so stack objects can be printed
	public String toString() {
		return data.toString();
	}

}
