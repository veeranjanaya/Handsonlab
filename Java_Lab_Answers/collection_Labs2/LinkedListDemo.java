package collection_Labs2;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	private LinkedList<Integer> list1;
	private LinkedList<Integer> list2;
	private LinkedList<Integer> resultList;
	public LinkedListDemo() {
		this.list1 = new LinkedList<>();
		this.list2 = new LinkedList<>();
		this.resultList = new LinkedList<>();
	}
	public void createList1() {
		list1.add(1);
		list2.add(2);
		list1.add(3);	
	}
	public void createList2() {
		list1.add(3);
		list2.add(4);
		list1.add(5);
	}
	public boolean checkEquality() {
        return list1.equals(list2);
    }
	
	public void mergeList() {
		resultList.addAll(list2);
		ListIterator<Integer> iterator = list2.listIterator();
		
		while(iterator.hasNext()){
			Integer value= iterator.next();
			if(!resultList.contains(value)) {
				resultList.add(value);
			}
		}
	}
	public void displayList(boolean flag) {
        LinkedList<Integer> displayList = flag ? list1 : resultList;
        ListIterator<Integer> iterator = displayList.listIterator();

        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
	
	
	
	
	

}
