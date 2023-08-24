import java.util.Scanner;
public class demo5 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int days = sc.nextInt();
      System.out.println("The number of days entered by user are " + days);
      int year = (days / 365);
      int b = (days % 365);
      int months = (b / 30);
      int c = (b % 30);
      System.out.println("the total number of years is " + year);
      System.out.println("the total number of months is " + months);
      System.out.println("the total number of days is " + c);
      System.out.println("the output is " + year + "year " + months + "months " + c + "days ");
    }
  }
