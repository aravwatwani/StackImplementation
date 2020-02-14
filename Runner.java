<<<<<<< HEAD
public class Runner {
	public static void main(String[] args) {

		LinkedList<Integer> myNums = new LinkedList<Integer>();
        myNums.add(3);
        myNums.add(2);
		myNums.add(1);
        myNums.remove(2);
        System.out.println(myNums);

    }
}
=======
public class Runner {
	public static void main(String[] args) {
	
//		Stack<String> myStrs = new Stack<String>();
//		myStrs.push("hello");
//		System.out.println(myStrs.pop());
//		System.out.println(myStrs.size());
//
//		Stack<Integer> myNums = new Stack<Integer>();
//		myNums.push(777);
//
//		Stack<Dave> daves = new Stack<Dave>();
//		daves.push(new Dave());

		QueQue<Integer> myNums = new QueQue<Integer>();
		myNums.add(3);
		myNums.add(2);
		myNums.add(1);
		
 		System.out.println(myNums.remove());
 		System.out.println(myNums.remove());
 		System.out.println(myNums.remove());




	}
}
>>>>>>> b80719ed9d00e1db8f7e3fbc8022a6debd67c69f
