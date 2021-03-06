package week7Exercises.ref7Solution;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DepartmentMostPays {
    public String getDepartmentMostPay(List<Employee> employees) {
        List<Employee> employeeList = getListOFhightSalary(employees);
        Employee employee = employeeList.get(0);
        String department = employee.getDepartment();

        return department;
    }


    public List<Employee> getListOFhightSalary(List<Employee> employees) {
        employees.sort(Comparator.comparing(Employee::getSalary));
        Collections.reverse(employees);
        return employees;
    }
}
