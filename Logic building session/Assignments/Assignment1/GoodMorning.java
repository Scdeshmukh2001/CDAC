public class GoodMorning {
    public static void main(String[] args) {
        
        int hour = 22; 
        if (hour >= 5 && hour < 12) {
            System.out.println("Good Morning!");
        } else if (hour >= 12 && hour < 23) {
            System.out.println("Good Day!");
        } else {
            System.out.println("Good Evening!");
        }
    }
}