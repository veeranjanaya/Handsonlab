package exception_Handling_Labs;

public class Stack {
	int[] arr;
	int max=-1;
	public Stack() {
		arr=new int[5];
	}
	public void push(int data) throws StackFullException {
		if(max==arr.length-1) {
			throw new StackFullException("Stack Is Full");
		}
		arr[max++]=data;
	}
	public int pop() throws StackEmptyException {
		if(max==-1) {
			throw new StackEmptyException("Stack Is Empty");
		}
		return arr[max--];
	}
	public void display() throws StackEmptyException{
		if(max==-1) {
			throw new StackEmptyException("Stack is Empty");
		}else {
			System.out.println("Stack Contains");
			for(int i=max;i<=arr.length-1;i++) {
				System.out.println(arr[i]+"");
			}
		}
	}
}
