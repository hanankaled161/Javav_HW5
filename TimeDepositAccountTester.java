/**
 * Created by Qursan on 22/09/22.
 */
public class TimeDepositAccountTester {
    public static void main(String[] args) {
        TimeDepositAccount num=new TimeDepositAccount(100,10);
        System.out.println(" the current balance is : "+num.getBalance());
        num.earned_interest();
        System.out.println(num.getBalance());
        num.withdraw_balance(110);
    }
}
