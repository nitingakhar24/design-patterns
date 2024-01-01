package factory;

public class EmployeeClient {

    public static void main(String[] args) {
        Employee engineerEmployee = EmployeeFactory.getEmployee("Engineer");
        int engineerSalary = engineerEmployee != null ? engineerEmployee.getSalary() : 0;
        System.out.println("Salary of an Engineer is " + engineerSalary);

        Employee analystEmployee = EmployeeFactory.getEmployee("Analyst");
        int analystSalary = analystEmployee != null ? analystEmployee.getSalary() : 0;
        System.out.println("Salary of an Analyst is " + analystSalary);
    }
}
