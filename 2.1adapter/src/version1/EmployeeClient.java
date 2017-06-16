package version1;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDb = new EmployeeDb("1234", "John", "Wick", "John@Wick.com");

        employees.add(employeeFromDb);

        //Employee employeeFromLdap = new EmployeeLdap("Chewie", "Solo", "Han", "han@solo.com");

        EmployeeLdap employeeFromLdap = new EmployeeLdap("Chewie", "Solo", "Han", "han@solo.com");

        EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");

        // adapt EmployeeLdap and EmployeeCSV classes to Employee
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));
        //employees.add(employeeFromCSV);
        
        return employees;
    }
    public static void main(String args[])
    {
    	System.out.println(new EmployeeClient().getEmployeeList());
    }
}
