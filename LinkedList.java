public class LinkedList<T> {
	private int size;
	private Node<T> head;

	public LinkedList() {

	}

	public int size() {
		return size;
	}

	public Node peek() {
		return head;
	}

	public void add(T t) {
		size++;

		if (head == null) {
			Node n = new Node(t); // create new node that uses data t
			head = n;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = new Node(t);
	}

	public void addFront(T t) {
		if (head == null) {
			head = new Node(t);
		} else {
			Node n = new Node(t);
			n.next = head;
			head = n;
		}
	}

	public Node remove() {
		if (head == null) {
			return null;
		}
		Node temp = head;
		head = head.next;
		return head;
	}

	public void remove(int position) {

		if (head == null) {
			return;
		}

		Node temp = head;

		if (position == 0) {
			head = temp.next;
		}

		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;
		}

		temp.next = temp.next.next;

	}
}
		                   
		        		                   
		        