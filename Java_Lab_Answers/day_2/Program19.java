/*
 * 19. Write a program to accept name, empId, basic, special allowances, percentage of 
 * bonus and monthly tax saving investments. The gross monthly salary is basic + special allowances. Compute the annual salary. The gross annual salary also includes the bonus. 
 * Compute the annual net salary, by deducting taxes as suggested. 
a. Income upto 2.5 lakhs – exempted 
b. Income from 2.5 lakhs to 5 lakhs – 5% 
c. Income from 5 lakhs to 10 lakhs – 20% 
d. Income from 10 lakhs onwards – 30% 
However, if there is any tax saving investment, then there is further exemption of 
upto 1.5 lakhs annually. This would mean that by having tax saving investments of about 1.5 lakhs, an income of 
4 lakhs is non-taxable. Display the annual gross, annual net and tax payable. 
 */
package day_2;

import java.util.Scanner;

public class Program19 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter empId: ");
        int empId = sc.nextInt();

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter special allowances: ");
        double allowances = sc.nextDouble();

        System.out.print("Enter percentage of bonus: ");
        double bonusPercentage = sc.nextDouble();

        System.out.print("Enter monthly tax saving investments: ");
        double taxSavingInvestments = sc.nextDouble();

        // Calculate gross monthly salary
        double grossMonthlySalary = basic + allowances;

        // Calculate annual salary
        double annualSalary = grossMonthlySalary * 12;

        // Calculate taxable income
        double taxableIncome = annualSalary - taxSavingInvestments;

        // Calculate tax payable
        double taxPayable = 0.0;
        if (taxableIncome <= 250000) {
            taxPayable = 0.0;  // No tax
        } else if (taxableIncome <= 500000) {
            taxPayable = (taxableIncome - 250000) * 0.05;
        } else if (taxableIncome <= 1000000) {
            taxPayable = 12500 + (taxableIncome - 500000) * 0.2;
        } else {
            taxPayable = 112500 + (taxableIncome - 1000000) * 0.3;
        }

        // Calculate annual gross salary including bonus
        double bonus = annualSalary * (bonusPercentage / 100);
        double annualGrossSalary = annualSalary + bonus;

        // Calculate annual net salary
        double annualNetSalary = annualGrossSalary - taxPayable;

        // Display results
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Annual Gross Salary: " + annualGrossSalary);
        System.out.println("Annual Net Salary: " + annualNetSalary);
        System.out.println("Tax Payable: " + taxPayable);
        sc.close();
    }

}
