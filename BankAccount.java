/**
 * Created by Qursan on 17/09/22.
 */
public class BankAccount {
    private double balance;
    public BankAccount()
    {
        balance=0;
    }
    public void deposit(double amount)
    {
        balance=balance+amount;
    }
    public void withdraw(double balancer)
    {
        balance=balance-balancer;
    }
    public double get_remaining_Balance()
    {
        return balance;
    }
    public void addInterest(double rate)
    {
        rate = ((balance*10)/100);
        balance=balance+rate;
        }
    public void mystery(BankAccount that, double amount)
    { this.balance = this.balance - amount;
      that.balance = that.balance + amount; }
    }

