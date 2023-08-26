import java.util.Scanner;

public class demo8{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if((a+b > c)&&(a+c > b)&&(b+c > a)){
        System.out.println("triangle is possible");
    }
    else{
        System.out.println("triangle is not possible");
    }
  }
} 
  





