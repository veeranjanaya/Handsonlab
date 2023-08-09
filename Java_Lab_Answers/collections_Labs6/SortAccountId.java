package collections_Labs6;

import java.util.Comparator;

public class SortAccountId implements Comparator<Account>{
	@Override
    public int compare(Account acc1, Account acc2) {
        return Integer.compare(acc1.getAccountId(), acc2.getAccountId());
    }

}
