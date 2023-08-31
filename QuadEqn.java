import java.util.Scanner;
public class QuadEqn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = ((b*b)-4*a*c);
        System.out.println("The discriminant obtained is "+d);
        if(d > 0){
            System.out.println("Roots are real and unequal");
        }else if(d == 0){
            System.out.println("Roots are real and equal");
        }else{
            System.out.println("Roots are imaginary");
        }
    }
}
