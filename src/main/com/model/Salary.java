package main.com.model;

public class Salary {
    //instance variables
    private double basicSalary;
    private double allowances;
    private double deductions;

    //constructor
    public Salary(double basicSalary, double allowances, double deductions){
        this.basicSalary=basicSalary;
        this.allowances=allowances;
        this.deductions=deductions;
    }

    //getters
    public double getBasicSalary() {
        return basicSalary;
    }

    public double getAllowances() {
        return allowances;
    }

    public double getDeductions() {
        return deductions;
    }

    /**
     * Calculates the net salary of an employee by subtracting deductions from the sum of the basic salary and allowances.
     * The net salary represents the amount an employee receives after accounting for necessary deductions.
     *
     * @return The net salary of the employee.
     */
    public double calculateNetSalary(){
        return basicSalary+allowances-deductions;
    }

}
