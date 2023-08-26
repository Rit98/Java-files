import java.util.Scanner;

public class demo9{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if((a==b)&&(b==c)&&(c==a)){
        System.out.println("Equilateral triangle-");
    }
    else if((a==b)||(b==c)||(c==a)){
        System.out.println("Isosceles triangle");
    }
     else if((a!=b)&&(b!=c)&&(c!=a)){
      System.out.println("scalene triangle");
     }
    }
}
