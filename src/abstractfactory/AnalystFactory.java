package abstractfactory;

public class AnalystFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Analyst();
    }
}
