package abstractfactory;

import abstractfactory.Employee;

public class Engineer implements Employee {
    @Override
    public int getSalary() {
        return 5000;
    }

    @Override
    public String getTeamName() {
        return "Engineering Team";
    }
}
