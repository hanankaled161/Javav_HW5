/**
 * Created by Qursan on 22/09/22.
 */
public class EmployeeTester {
    public static void main(String[] args) {
        Employees harry = new Employees("Hacker, Harry", 50000);
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
        harry.raiseSalary(10);
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
}}
