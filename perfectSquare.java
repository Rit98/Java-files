import java.util.Scanner;

public class perfectSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        System.out.println("The number entered is "+number);
        double num = Math.sqrt(number);
        double temp = sc.nextInt();
        System.out.println("the temporary number entered is "+temp);
        if(temp == num){
            System.out.println("It is a perfect square number");
        } else{
            System.out.println("It is not a perfect square");
        }
    }
}
