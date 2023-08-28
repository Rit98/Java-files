import java.util.Scanner;
public class rectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        System.out.println("The button entered is "+button);
        int l = sc.nextInt();
        System.out.println("length of rectangle =" + l);
        int b = sc.nextInt();
        System.out.println("breadth of rectangle= "+ b);
        System.out.println("enter button 1 for area 2 for perimeter 3 for diagonal");
        switch (button){
            case 1 : double a = (l*b);
            System.out.println("area of rectangle is "+ a);
            break;
            case 2 : double p = (2*(l+b));
            System.out.println("perimeter of rectangle is "+ p);
            break;
            case 3 : double d = Math.sqrt((l*l)+(b*b));
            System.out.println("diagonal of rectangle is "+ d);
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }
} 