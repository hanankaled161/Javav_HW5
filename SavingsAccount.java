
/**
 * Created by Qursan on 17/09/22.
 */
public class SavingsAccount {
  private double balance , interest;
    public SavingsAccount(double initial_balance ,int n)
    {
        balance=initial_balance;
        interest=(balance*n)/100;
    }
    public void addInterest()
    {
        balance=balance+interest;
    }
    public double getBalance()
    {
        return balance;
    }
}
