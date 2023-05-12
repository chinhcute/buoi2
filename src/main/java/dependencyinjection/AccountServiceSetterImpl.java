package dependencyinjection;

import Pojobend.Account;
import Pojobend.AccountRepository;
import Pojobend.AccountService;
import org.springframework.beans.factory.annotation.Autowired;


public class AccountServiceSetterImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public void setAccountRepository(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {
        Account sourceAccount = accountRepository.find(fromAccountId);
        Account tagetAccount = accountRepository.find(toAccountId);
        sourceAccount.setBalance(sourceAccount.getBalance()-amount);
        tagetAccount.setBalance(tagetAccount.getBalance()+amount);
        accountRepository.update(sourceAccount);
        accountRepository.update(tagetAccount);
    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {
        Account account = accountRepository.find(accountId);
        account.setBalance(account.getBalance()+amount);
        accountRepository.update(account);
    }

    @Override
    public Account getAccount(long accountId) {
        return accountRepository.find(accountId);
    }
}
