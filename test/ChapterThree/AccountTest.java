package ChapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    Account account;
    @BeforeEach
    void setUp(){
         account = new Account("Ruth", 90_000);
    }


    @Test
    public void accountCanBeCreatedTest(){
        account.setName("Increase");
        account.setBalance(900_000);
        assertEquals("Increase", account.getName());
        assertEquals(900_000, account.getBalance());
    }

    @Test
    public void withdrawalCanBeMadeTest(){
        account.withdrawal(80_700);
        assertEquals(9300,account.getBalance());
    }

    @Test
    public void depositCanBeMadeTest(){
        account.deposit(10_000);
        assertEquals(100_000, account.getBalance());
    }

    @Test
    public void withdrawalAboveBalanceThrowsExceptionTest(){
        assertThrows(RuntimeException.class,() ->account.withdrawal(900_000));
    }
    @Test
    public void withdrawalReturnsTheCorrectBalance() {
        String message = account.withdrawal(10000);
        assertEquals(80000, account.getBalance());
        assertEquals("Withdrawal Successful",message);

    }
}
