package structural.adapter.classAdapter;

import structural.adapter.Customer;
import structural.adapter.Employee;

public class EmployeeClassAdapter extends Employee implements Customer {
    @Override
    public String getName() {
        return getFullName();
    }
}
