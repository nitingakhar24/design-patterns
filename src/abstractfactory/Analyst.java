package abstractfactory;

public class Analyst implements Employee {
    @Override
    public int getSalary() {
        return 4000;
    }

    @Override
    public String getTeamName() {
        return "Business Analysis Team";
    }
}
