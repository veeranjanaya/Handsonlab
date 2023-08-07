package collections_Labs6;

import java.util.Comparator;

public class SortBalance implements Comparator<Account> {
	@Override
    public int compare(Account acc1, Account acc2) {
        return Double.compare(acc1.getBalance(), acc2.getBalance());
    }
}
