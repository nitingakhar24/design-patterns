package abstractfactory;

public class EngineerFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new Engineer();
    }
}
