import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {
    private static Account account;
    private static Account account2;

    @BeforeClass
    public static void beforeClass() {
        account2 = new Account();
        account2.deposit(1000.0);

    }

    @AfterClass
    public static void afterClass() {
        System.out.println("This is how much was left in account2: " + account2.getBalance());
        account2.withdraw(account2.getBalance());
        System.out.println("This is how much was left in account2 after the robbery: " + account2.getBalance());
    }

    @Before
    public void setUp() {
        account = new Account();
        account.deposit(100.0);
    }

    @Test
    public void checkBalance() {
        assertEquals(100.0, account.getBalance(), 0.01);
    }

    @Test
    public void withdrawTest() {
        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance(), 0.01);
    }

    @Test
    public void depositTest() {
        account.deposit(150.0);
        assertEquals(250.0, account.getBalance(), 0.01);
    }

    @Test
    public void withdrawDepositTest() {
        account.withdraw(50.0);
        account.deposit(150.0);
        assertEquals(200.0, account.getBalance(), 0.01);
    }

    @Test
    public void multipleAssertTest() {
        account.withdraw(20.0);
        assertEquals(80.0, account.getBalance(), 0.01);
        account.deposit(150.0);
        assertEquals(230.0, account.getBalance(), 0.01);
        account.deposit(200.0);
        assertEquals(430.0, account.getBalance(), 0.01);
    }

    @Test
    public void account2Test() {
        account2.withdraw(50.0);
        assertEquals(950.0, account2.getBalance(), 0.01);
    }


}
