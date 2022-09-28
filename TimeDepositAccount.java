
/**
 * Created by Qursan on 22/09/22.
 */
public class TimeDepositAccount {
    private double balance,interest;
    public TimeDepositAccount(double initial_balance ,int n)
    {
        balance=initial_balance;
        interest=(balance*n)/100;
    }
    public double getBalance()
    {
        return balance;
    }
    public void earned_interest ()
    {
balance=balance+interest;
    }
    public void withdraw_balance(double withdrw)
    {
        if (balance==withdrw)
        {
            balance=balance-balance;
        }
        else System.out.println("you can't withdrw a part of balance");
    }
    public void deposite_balance(double deposite)
    {
        System.out.println("you can't deposite to your Account ");
    }





}
