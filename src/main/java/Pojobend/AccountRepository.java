package Pojobend;

public interface AccountRepository {
    void  ínert(Account account);
    void  update(Account account);
    Account find (long accountId);
}
