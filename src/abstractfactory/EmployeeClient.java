package abstractfactory;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new EngineerFactory());
        System.out.println(e1.getSalary());
        System.out.println(e1.getTeamName());
        Employee e2 = EmployeeFactory.getEmployee(new AnalystFactory());
        System.out.println(e2.getSalary());
        System.out.println(e2.getTeamName());
    }
}
