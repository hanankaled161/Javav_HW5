import java.util.Scanner;
/**
 * Created by Qursan on 17/09/22.
 */
public class HW_2 {
    private int limit,click;
    public HW_2 ()
    {
        limit=0;
        click=0;
    }

    public void setLimit(int maximum)     {
        System.out.println(" enter the limit of tha value ");
        Scanner n=new Scanner(System.in);
        int m= n.nextInt();
        limit=maximum;
    }
    public void setclick()
    {
        System.out.println("please enter the value of the click");
        Scanner in=new Scanner(System.in);
        click= in.nextInt();

    }
    public int getvale()
    {
        if(Math.min(click,limit)==click)
           return click;
        else
           return limit;
    }
}



