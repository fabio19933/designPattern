package structural.adapter;

import structural.adapter.classAdapter.EmployeeClassAdapter;
import structural.adapter.objectAdapter.EmployeeObjectAdapter;

public class Main {
    public static void main(String[] args) {
        EmployeeClassAdapter employeeClassAdapter = new EmployeeClassAdapter();
        employeeClassAdapter.setName("Pino");
        printCustomerName(employeeClassAdapter);
        System.out.println("***************************");
        Employee employee = new Employee();
        employee.setName("Gino");
        EmployeeObjectAdapter employeeObjectAdapter = new EmployeeObjectAdapter(employee);
        printCustomerName(employeeObjectAdapter);
    }
    private static void printCustomerName(Customer customer){
        System.out.println(customer.getName());
    }
}
