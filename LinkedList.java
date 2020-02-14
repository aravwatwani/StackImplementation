public class LinkedList<T> {
	private int size;
	private Node<T> head;

<<<<<<< HEAD
	public LinkedList() {
    
=======
	public LinkedList() { // create constructor
        head = null; // initialize variables
        size = 0;
>>>>>>> b80719ed9d00e1db8f7e3fbc8022a6debd67c69f
	}

	public int size() { // getter for size
		return size; 
	}

<<<<<<< HEAD
	public Node<T> peek() {
		return head;
	}

	public void add(T t) {
		if(head != null){
=======
	public Node<T> peek() { // peek function that returns head
		return head;
	}

	public void add(T t) { // add to linked list
		if(head != null){ // if head does not equal null, adds to list
>>>>>>> b80719ed9d00e1db8f7e3fbc8022a6debd67c69f
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
<<<<<<< HEAD
		Node<T> temp = head;
		if(head != null){
		    head = head.next;
		    size--;
		}
        return temp;
=======
		if(head != null){
		    Node<T> temp = head;
		    temp = temp.next;
		    size--;
            return temp;
		} else{
		    return null;
		}
		
>>>>>>> b80719ed9d00e1db8f7e3fbc8022a6debd67c69f
	}

	public Node<T> remove(int i) {

		if (i == 0) {
			return remove();
		} else {
            if(i + 1 <= size && i >= 0){
                int count = 0;
                Node<T> temp = head;
<<<<<<< HEAD
                while(count != i - 1){
=======
                while(count != i + 1){
>>>>>>> b80719ed9d00e1db8f7e3fbc8022a6debd67c69f
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
		                   
		        		                   
		        		                   
<<<<<<< HEAD
		        		                   
		        		                   
		        		                   
=======
>>>>>>> b80719ed9d00e1db8f7e3fbc8022a6debd67c69f
		        