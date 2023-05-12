package Pojobend;
import java.util.HashMap;
import java.util.Map;
public class AccountRepositoryImpl implements  AccountRepository{
    private Map<Long,Account> accountMap = new HashMap<>();
    {
        Account account1 = new Account();
        account1.setId(1l);
        account1.setName("Join");
        account1.setBalance(10.0);

        Account account2 = new Account();
        account2.setId(2l);
        account2.setName("Marry");
        account2.setBalance(20.0);

        accountMap.put(account1.getId(),account1);
        accountMap.put(account2.getId(), account2);
    }



    @Override
    public void ínert(Account account) {
    accountMap.put(account.getId(), account);
    }

    @Override
    public void update(Account account) {
        accountMap.put(account.getId(), account);
    }

    @Override
    public Account find(long accountId) {

        return accountMap.get(accountId);
    }
}
