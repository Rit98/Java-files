import java.util.Scanner;
import java.lang.Math;
public class demo4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double d;
        d = Math.sqrt(2)*a;
        System.out.println("The diagonal of square is = "+d); 
        double p;
        p = (4*a);
        System.out.println("Perimeter of Square = "+p);
        double area;
        area = Math.pow(a, 2);
        System.out.println("Area of square is = "+area);       
    }
}
