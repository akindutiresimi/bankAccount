package accountFolder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testThatICReateAnAccount_MyAccountBalanceIsZero_IDepositFiveHundred() {
        Account account = new Account();

        assertEquals(0 , account.checkBalance());

        account.deposit(1000);
        assertEquals(1000 , account.checkBalance());
    }

    @Test
    public void testThatICreateAnAccount_MyAccountBalanceISZero_IDepositNegativeAmount() {
        Account account = new Account();

        assertEquals(0, account.checkBalance());

        account.deposit(-1000);
        assertEquals(0, account.checkBalance());
    }

    @Test
    public void testThatICreateAnAccount_MyAccountBalanceIsZero_IDeposit1k_IWithdrawFiveHundred_MyBalanceRemainFiveHundred() {
        Account account = new Account();

        assertEquals(0, account.checkBalance());

        account.deposit(1_000);
        assertEquals(1_000, account.checkBalance());

        account.withdraw(500);
        assertEquals(500, account.checkBalance());

        account.deposit(2000);
        assertEquals(2500, account.checkBalance());

        account.withdraw(3000);
        assertEquals(2500,account.checkBalance());
    }
    @Test
    public void testThatYouCantWithdrawNegativeAmount(){

        Account account = new Account();
        account.withdraw(-5000);
        assertEquals(0, account.checkBalance());
    }
}
