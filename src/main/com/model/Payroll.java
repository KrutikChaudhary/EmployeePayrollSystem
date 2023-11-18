package main.com.model;

public class Payroll {

    // private instance
    private Employee employee;
    private String payPeriod;

    // constructor
    public Payroll(Employee employee, String payPeriod) {
        this.employee = employee;
        this.payPeriod = payPeriod;
    }

    /**
     * Generates the payroll for an employee, calculating salary, deductions,
     * and other relevant financial details.
     */
    public void generatePayroll() {
        System.out.println("*******Pay Roll*******");
        System.out.println("Employee    :" + employee.getName());
        System.out.println("Designation :" + employee.getDesignation());
        System.out.println("EmployeeID  :" + employee.getEmployeeId());
        System.out.println("----------------------------");
        System.out.println("Pay Period  : " + payPeriod);
        System.out.println("Basic Salary: +" + employee.getSalary().getBasicSalary());
        System.out.println("Allowances  : +" + employee.getSalary().getAllowances());
        System.out.println("Deductions  : -" + employee.getSalary().calculateDeductions());
        System.out.println("Total pay   :  " + employee.getSalary().calculateNetSalary());
    }

}
