package scopes;

import Pojobend.Account;
import Pojobend.AccountService;
import javabasedconfiguration.BeanConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scopes {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("scopes/scopes.xml");
        Account account1 = applicationContext.getBean("account1", Account.class);
        System.out.println(account1.getName());
        account1.setName("long");
        System.out.println(account1.getName());
    }
}
