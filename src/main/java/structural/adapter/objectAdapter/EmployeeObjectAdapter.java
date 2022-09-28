package structural.adapter.objectAdapter;

import structural.adapter.Customer;
import structural.adapter.Employee;

public class EmployeeObjectAdapter implements Customer {
    private Employee employee;

    public EmployeeObjectAdapter(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getName() {
        return employee.getFullName();
    }
}
