package exp.java.in;

import java.util.Scanner;

class BMITracker {
	private double Weight; // in kilograms
    private double Height; // in meters
    private double bmi;
    
    Scanner sc = new Scanner(System.in);
    public void acceptRecord() {
    	
    	 System.out.print("Enter weight : ");
         Weight = sc.nextDouble();
         System.out.print("Enter height : ");
         Height = sc.nextDouble();
         
    }
    public void calculateBMI() {
    	
        bmi = Weight / (Height * Height);
    }
    
    public String classifyBMI() {
       if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    	
    public void printRecord() {
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("BMI Classification: " + classifyBMI());
    }
}

  public class BMI{
	public static void main(String[] args) {
		 BMITracker tracker = new BMITracker();
	        tracker.acceptRecord();
	        tracker.calculateBMI();
	        tracker.printRecord();

	}
 }


