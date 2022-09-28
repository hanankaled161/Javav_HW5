/**
 * Created by Qursan on 17/09/22.
 */
public class Tally_counter {
private int value;
    public Tally_counter() {
        value= 0;
    }
    public void click() {
        value = value + 1;
    }

    public int getValue() {

       return value;
    }

    public int undo() {
        if (Math.max(value, 0) == value && value != 0) {
            value = value - 1;
            return value;
        } else return 0;
    }
}

