package factory;

public class Engineer implements Employee {
    @Override
    public int getSalary() {
        System.out.println("Getting Engineer's salary");
        return 5000;
    }
}
