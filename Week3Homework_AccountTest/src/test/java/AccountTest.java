import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {
    private static Account account;

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

    public void multipleAssertTest() {
        account.withdraw(20.0);
        assertEquals(80.0, account.getBalance(), 0.01);
        account.deposit(150.0);
        assertEquals(230.0, account.getBalance(), 0.01);
        account.deposit(200.0);
        assertEquals(430.0, account.getBalance(), 0.01);
    }
}
