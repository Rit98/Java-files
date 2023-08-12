import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int button = sc.nextInt();
        System.out.print("The result is ");

        if(button == 1){
            System.out.print(a + b);
        }
        else if(button == 2){
            System.out.print(a - b);
        }
        else if(button == 3){
            System.out.print(a * b);
        }
        else{
            System.out.print("Invalid button");
        }
         
    }
    
}

