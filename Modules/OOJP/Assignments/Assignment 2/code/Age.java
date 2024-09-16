import java.util.Scanner;
public class Age
{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("Elligible to vote");
            
        }else{
            System.out.println("Not Elligible to vote");
        }


    }
    
}
