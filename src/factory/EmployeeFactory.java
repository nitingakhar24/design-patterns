package factory;

import java.util.Optional;

public class EmployeeFactory {
    public static Employee getEmployee(String type) {
        if (type.trim().equalsIgnoreCase("Engineer")) {
            return new Engineer();
        } else if (type.trim().equalsIgnoreCase("Analyst")) {
            return new Analyst();
        }
        return null;
    }
}
