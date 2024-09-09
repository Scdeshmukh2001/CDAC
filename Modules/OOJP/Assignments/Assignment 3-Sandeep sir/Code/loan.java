package exp.java.in;
import java.util.Scanner;

class LoanAmortizationCalculator {

    private double principal;
    private double annualInterestRate;
    private int loanTerm;
    
    
    Scanner scanner = new Scanner(System.in);
    public void acceptRecord() {
        System.out.print("Enter the loan amount (₹): ");
        principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        annualInterestRate = scanner.nextDouble();

        System.out.print("Enter the loan term (in years): ");
        loanTerm = scanner.nextInt();
    }

    public double calculateMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        int numberOfMonths = loanTerm * 12; 

        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths)) /
                (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

        return monthlyPayment;
    }

   
    public void printRecord(double monthlyPayment) {
        int numberOfMonths = loanTerm * 12;
        double totalPayment = monthlyPayment * numberOfMonths;

        System.out.printf("Monthly Payment: ₹%.2f%n", monthlyPayment);
        System.out.printf("Total Payment over the life of the loan: ₹%.2f%n", totalPayment);
    }
}
public class loan {
    public static void main(String[] args) {
    	
    	LoanAmortizationCalculator cal = new LoanAmortizationCalculator();

        cal.acceptRecord();

        double monthlyPayment = cal.calculateMonthlyPayment();

        cal.printRecord(monthlyPayment);
    }
}
