public class EuclidsAlgo{
    public static void main(String[] args) {
        int num1 = 252;
        int num2 = 105;
        int temp=0;

        while(num1 != num2){
            if(num1>num2){
                temp = num1-num2;
                num1 = temp;
            }
            else{
                temp = num2 - num1;
                num2 = temp;
            }
        }
        System.out.println("Euc No is: "+num1);
    }
}
