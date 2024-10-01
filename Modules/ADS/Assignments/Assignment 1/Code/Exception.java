import java.util.Scanner;
public class Exception{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("File Open()");
        System.out.println("Enter Num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Num2: ");
        int num2 = sc.nextInt();

        try{
            if(num2 == 0){
                ArithmeticException ex = new ArithmeticException("Value of Denominator should not be Zero");
                throw ex;
            
                int result = num1/num2;
                System.out.println("Result: " +result);
            
            }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    
        sc.close();
    
        System.out.println("File close()");

        }  
    }

        
    }


