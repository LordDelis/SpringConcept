package AutoWiring.WithAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Value("1")
    private int employeeID;

    @Value("Fidelis Anosike")
    private String employeeName;

    @Value("lagos Nigeria")
    private String employeeAddress;

    @Value("30000.00")
    private double employeeSalary;

    // Setters and Getters
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeID + "\n" +
                "Employee Name: " + employeeName + "\n" +
                "Employee Address: " + employeeAddress + "\n" +
                "Employee Salary: " + employeeSalary;
    }
}
