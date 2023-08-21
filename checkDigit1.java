
import java.util.Scanner;
public class checkDigit1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("The number entered is "+number);
        if(number >= 0 && number <= 9){
            System.out.println("Single digit number");
        } else if(number >= 10 && number <= 99){
            System.out.println("Two digit number");
        }else if(number >= 100 && number <= 999){
            System.out.println("Three digit number");
        }else{
            System.out.println("Invalid number entered");
        }
    }
}
