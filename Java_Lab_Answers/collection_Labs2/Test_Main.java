package collection_Labs2;

public class Test_Main {

	public static void main(String[] args) {
		LinkedListDemo demo = new LinkedListDemo();
        demo.createList1();
        demo.createList2();

        System.out.println("List1:");
        demo.displayList(true);

        System.out.println("List2:");
        demo.displayList(false);

        boolean isEqual = demo.checkEquality();
        System.out.println("Lists are equal: " + isEqual);

        demo.mergeList();
        System.out.println("Merged List:");
        demo.displayList(false);

	}

}
