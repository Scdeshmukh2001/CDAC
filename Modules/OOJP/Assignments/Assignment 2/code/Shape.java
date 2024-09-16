import java.util.Scanner;
public class Shape {
 public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the Shape");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Triangle");
 int choice = scanner.nextInt();
        switch(choice){
            case 1:
            System.out.println("Enter the radius of the Circle :");
            double radius = scanner.nextDouble();
            double circlearea = 3.14 * radius * radius;
            System.out.println("The area of the Circle is" +circlearea);
            break;
             case 2:
            System.out.println("Enter the side of Square:");
            double side = scanner.nextDouble();
            double Squarearea = side * side;
            System.out.println("The Area of a Square is :" +Squarearea);
            break;
            case 3:
            System.out.println("Enter the height and width of a Rectangle :");
            double height = scanner.nextDouble();
            double width = scanner.nextDouble();
            double Rectanglearea = height * width;
            System.out.println("The area of a Rectangle is:" +Rectanglearea);
            break;
            case 4:
            System.out.println(" Enter the base and height of the Triangle: ");
            double base = scanner.nextDouble();
            double THeight = scanner.nextDouble();
            double areatriangle = 0.5 * base * THeight;
            System.out.println("The area of a triangle is: " +areatriangle);
            break;
            default:
            System.out.println("Please select a valid Shape.");
            break;
           }
          scanner.close();
    }
    }
