/**
 * Created by Qursan on 17/09/22.
 */
public class SavingsAccountTaster {
    public static void main(String[] args) {
        SavingsAccount n=new SavingsAccount(1000,10);
        n.addInterest();
        System.out.println(n.getBalance());
        System.out.println("expected balance = "+1100);
    }
}
