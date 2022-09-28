/**
 * Created by Qursan on 22/09/22.
 */
public class Employees {
    private double salary ;
    private String name;
    public Employees(String employeeName, double currentSalary)
    {
       name=employeeName;
       salary=currentSalary;
    }
    public String getName()
    {return name;}
    public double getSalary()
    {return salary;}
    public void raiseSalary(double byPercent)
    {salary=(salary/byPercent)*100;}

}
