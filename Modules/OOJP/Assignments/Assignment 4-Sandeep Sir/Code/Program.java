package com.example.loanCalculator;

import java.util.Scanner;

class LoanAmortizationCalculator {
    private double principal;
    private double annualInterestRate;
    private int loanTerm;

    public LoanAmortizationCalculator(double principal, double annualInterestRate, int loanTerm) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public double calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12;
        return principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);
    }

    public double calculateTotalPayment() {
        return calculateMonthlyPayment() * loanTerm * 12;
    }

    @Override
    public String toString() {
        return "LoanAmortizationCalculator{" +
                "principal=" + principal +
                ", annualInterestRate=" + annualInterestRate +
                ", loanTerm=" + loanTerm +
                '}';
    }
}

class LoanAmortizationCalculatorUtil {
    private LoanAmortizationCalculator loanCalculator;

    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Annual Interest Rate (in %): ");
        double annualInterestRate = sc.nextDouble();
        System.out.print("Enter Loan Term (in years): ");
        int loanTerm = sc.nextInt();

        loanCalculator = new LoanAmortizationCalculator(principal, annualInterestRate, loanTerm);
    }

    public void printRecord() {
        double monthlyPayment = loanCalculator.calculateMonthlyPayment();
        double totalPayment = loanCalculator.calculateTotalPayment();

        System.out.printf("Monthly Payment: ₹%.2f%n", monthlyPayment);
        System.out.printf("Total Payment over the life of the loan: ₹%.2f%n", totalPayment);
    }

    public void menuList() {
        System.out.println("1. Accept Record");
        System.out.println("2. Print Record");
        System.out.println("3. Exit");
    }
}

public class Program {
    public static void main(String[] args) {
        LoanAmortizationCalculatorUtil util = new LoanAmortizationCalculatorUtil();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            util.menuList();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    util.acceptRecord();
                    break;
                case 2:
                    util.printRecord();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 3);
    }
}
