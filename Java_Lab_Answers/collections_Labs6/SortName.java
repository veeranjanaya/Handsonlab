package collections_Labs6;

import java.util.Comparator;

public class SortName implements Comparator<Account>{
	@Override
    public int compare(Account acc1, Account acc2) {
        return acc1.getName().compareTo(acc2.getName());
    }
}
