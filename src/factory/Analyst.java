package factory;

public class Analyst implements Employee {
    @Override
    public int getSalary() {
        System.out.println("Getting Analyst's salary");
        return 4000;
    }
}
