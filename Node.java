public class Node<T> {
	private T data;
	public Node<T> next;

	public Node(T t) {
		data = t;
	}

	public Node<T> next() { // return next ref.
		return next;
	}
	
	
}