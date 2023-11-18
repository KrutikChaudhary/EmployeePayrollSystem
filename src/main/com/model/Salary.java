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

}
