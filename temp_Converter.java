import java.util.Scanner;
public class demo7{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double C = sc.nextInt();
    System.out.println("Enter the temperature in Celsius "+C);
    double F = (((9*C)/5) + 32);
    System.out.println("tempeature in fahrenheit is "+F);
    if(F > 98.60){
        System.out.println("Fever");
    }
    else{
        System.out.println("Normal");
    }
    
  }
}














