package exception_Handling_Labs;

public class Test_Main1 {

	public static void main(String[] args) {
		Stack s = new Stack();
		try {
			s.push(1);
			s.push(2);
			s.push(3);
		}catch(StackFullException e){
			System.out.println(e.getMessage());
		}

	}

}
