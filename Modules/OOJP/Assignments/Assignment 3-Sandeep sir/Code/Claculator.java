package exp.java.in;
import java.util.Scanner;
class CompoundInterestCalculator {
	
	 private double principal;
	 private double annualInterestRate;
	 private int numberOfCompounds;
	 private int years;
	 
	 Scanner Sc = new Scanner(System.in);
	 
	 public void acceptRecord(){
		 
	        System.out.print("Enter the initial investment amount (₹): ");
	        principal = Sc.nextDouble();

	        System.out.print("Enter the annual interest rate (%): ");
	        annualInterestRate = Sc.nextDouble();

	        System.out.print("Enter the number of times the interest is compounded per year: ");
	        numberOfCompounds = Sc.nextInt();

	        System.out.print("Enter the investment duration (in years): ");
	        years = Sc.nextInt();
	    }

	 	// formulas 
	    public double calculateFutureValue() {
	        double rate = annualInterestRate / 100; // Converting percentage to decimal
	        double futureValue = principal * Math.pow((1 + rate / numberOfCompounds), numberOfCompounds * years);
	        return futureValue;
	    }

	    public void printRecord(double futureValue) {
	        double totalInterest = futureValue - principal;

	        System.out.printf("Future Value: ₹%.2f%n", futureValue);
	        System.out.printf("Total Interest Earned: ₹%.2f%n", totalInterest);
	    }
}
public class Claculator {
	    public static void main(String[] args) {
	        CompoundInterestCalculator calculator = new CompoundInterestCalculator();

	        calculator.acceptRecord();

	        double futureValue = calculator.calculateFutureValue();

	        calculator.printRecord(futureValue);
	    }
 }	


