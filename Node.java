public class Node<T> {
	private T data;
	private Node next;

	public Node(T t) {
		data = t;
	}

	public Node next() { // return next ref.
		return next;
	}
	
	
}
