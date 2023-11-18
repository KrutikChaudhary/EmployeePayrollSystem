package main.com.model;

public class Salary {
    //instance variables
    private double basicSalary;
    private double allowances;
    private double basicDeductions;


    //fixed company deduction amount in CAD$
    private final double companyDeductions = 105;

    //fixed income tax
    private final double taxRate = 13/100;


    //constructor
    public Salary(double basicSalary, double allowances, double basicDeductions){
        this.basicSalary=basicSalary;
        this.allowances=allowances;
        this.basicDeductions=basicDeductions;
    }


    //getters
    public double getBasicSalary() {
        return basicSalary;
    }

    public double getAllowances() {
        return allowances;
    }

    public double getBasicDeductions() {
        return basicDeductions;
    }


    /**
     * Calculates the net salary of an employee by subtracting deductions from the sum of the basic salary and allowances.
     * The net salary represents the amount an employee receives after accounting for necessary deductions.
     *
     * @return The net salary of the employee.
     */
    public double calculateNetSalary(){
        return basicSalary+allowances-calculateDeductions();
    }


    /**
     * Calculates the total deductions for an employee, including tax and mandatory company deductions.
     *
     * @return The total deductions, including tax and company-mandated deductions.
     */
    public double calculateDeductions(){
        //tax calculation
        double totalEarnings = basicSalary + allowances;
        double tax = totalEarnings*taxRate;

        //tax + mandatory deductions = total deductions
        return tax + companyDeductions + basicDeductions;
    }

}
