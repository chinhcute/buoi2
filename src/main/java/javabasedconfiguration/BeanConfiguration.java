package javabasedconfiguration;

import Pojobend.AccountRepository;
import Pojobend.AccountRepositoryImpl;
import Pojobend.AccountService;
import Pojobend.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public AccountService accountService(){
        AccountServiceImpl bean = new AccountServiceImpl();
        bean.setAccountRepository(accountRepository());
        return  bean;
    }
    @Bean
    public AccountRepository accountRepository(){
        AccountRepository bean = new AccountRepositoryImpl();
        return bean;
    }


}
