package main.com.model;

public class Employee {

    // instance variables
    private int employeeId;
    private String name;
    private String designation;
    private String department;
    private Salary salary;

    // constructor
    public Employee(int employeeId, String name, String designation, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.designation = designation;
        this.department = department;
    }

    // accessors
    public int getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    public String getDesignation() {
        return this.designation;
    }

    public String getDepartment() {
        return this.department;
    }
    public Salary getSalary(){
        return this.salary;
    }

    // mutators
    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
