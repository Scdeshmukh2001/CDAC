public class Qs4f {
    public static void main(String[] args) {
        String strNumber = "Ab12Cd3";
            try {
            int number = Integer.parseInt(strNumber);
            System.out.println("The String as an int is: " + number);
        } catch (NumberFormatException e) {
          System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}
