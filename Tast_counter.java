/**
 * Created by Qursan on 17/09/22.
 */
public class Tast_counter {
    public static void main(String[] args) {
        Tally_counter n=new Tally_counter();
        n.click();
        n.click();
        n.click();
        System.out.println(n.getValue());
        n.undo();
        System.out.println(n.getValue());

    }
}
