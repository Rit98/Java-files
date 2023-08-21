import java.util.Scanner;

public class cone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        System.out.println("the button entered is "+button);
        float length = sc.nextFloat();
        System.out.println("the length is "+length);
        float breadth = sc.nextFloat();
        System.out.println("the breadth is "+breadth);
        float height = sc.nextFloat();
        System.out.println("the height is "+height);
        float radius = sc.nextFloat();
        System.out.println("the radius is "+radius);
        switch(button){
            case 1 : double volume1 = (length*breadth*height);
            System.out.println("The volume of cuboid is "+volume1);
            break;
            case 2 : double volume2 = (3.1415*radius*radius*height);
            System.out.println("the volume of cylinder is "+volume2);
            break;
            case 3 : double volume3 = ((3.1415*radius*radius*height)/3);
            System.out.println("the volume of cone is "+volume3);
            break;
            default :
            System.out.println("Invalid value entered");
        }

    }
}
