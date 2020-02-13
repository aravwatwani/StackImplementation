public class Runner {
	public static void main(String[] args) {

		QueQue<Integer> myNums = new QueQue<Integer>();
		myNums.add(3);
		myNums.add(2);
		myNums.add(1);
		
 		System.out.println(myNums.remove());
 		System.out.println(myNums.remove());
 		System.out.println(myNums.remove());




	}
}