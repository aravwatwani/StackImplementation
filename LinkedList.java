public class LinkedList<T> {
	private int size;
	private Node<T> head;

	public LinkedList() {
        head = null;
        size = 0;
	}

	public int size() {
		return size;
	}

	public Node<T> peek() {
		return head;
	}

	public void add(T t) {
		if(head != null){
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node<T>(t);
        } else {
            head = new Node<T>(t); // create new node that uses data t
        }
        size++;
	}

	public void addFront(T t) {
        Node<T> temp = new Node<T>(t);
        temp.next = head;
        head = temp;
        size++;
	}

	public Node<T> remove() {
		if(head != null){
		    Node<T> temp = head;
		    temp = temp.next;
		    size--;
            return temp;
		} else{
		    return null;
		}
		
	}

	public Node<T> remove(int i) {

		if (i == 0) {
			return remove();
		} else {
            if(i + 1 <= size && i >= 0){
                int count = 0;
                Node<T> temp = head;
                while(count != i + 1){
                    temp = temp.next;
                    count++;
                }
                Node<T> newNode = temp.next;
                temp.next = newNode.next;
                size--;
                return newNode;
            }
        }
        return null;
	}
}
		                   
		        		                   
		        		                   
		        