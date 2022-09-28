/**
 * Created by Qursan on 17/09/22.
 */

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount n=new BankAccount();
       n.deposit(100);
        n.withdraw(50);
        System.out.println(n.get_remaining_Balance());
        System.out.println("expected result = "+50);
        n.addInterest(10);
        System.out.println(n.get_remaining_Balance());
        System.out.println("expected result = "+200);
//        n.mystery(50,5.7);
//        System.out.println(n.get_remaining_Balance());

    }


}
