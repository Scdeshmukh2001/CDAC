import java.util.Scanner;
public class Seasons {
      /**
     * @param args
     */
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a month : (1-12)");
        int month = scanner.nextInt();

        String season;
        switch(month){
            case 12: case 1: case 2:
            season = "Winter";
            break;
            case 3: case 4: case 5:
            season = "Spring";
            break;
            case 6: case 7: case 8:
            season = "Summer";
            break;
            case 9: case 10 :case 11:
            season = "Autumn";
            break;
            default:
            season ="Invalid month";
            break;
        }
        System.out.println("The Season is:" +season);
    }
    
}
