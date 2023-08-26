/*import java.util.Scanner;

public class discount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        System.out.println("the button entered is "+button);
        switch(button){
            case 1 : 
            System.out.println("Sunday");
            break;
            case 2 : 
            System.out.println("Monday");
            break;
            case 3 :
            System.out.println("Wednesday");
            break;
            case 4 : 
            System.out.println("Thursday");
            break;
            case 5 : 
            System.out.println("Friday");
            break;
            case 6 : 
            System.out.println("Saturday");
            break;
            default : 
            System.out.println("inaalid button entered");
        }
    }
} */

import java.util.Scanner;
public class discount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long button = sc.nextLong();
        System.out.println("the button entered is "+button);
        long totalCost = sc.nextLong();
        System.out.println("the cost entered is Rs. "+totalCost);
        long dis = sc.nextLong();
        switch(button){
        case 1 : dis = (0.05)*totalCost;
            System.out.println("discount on item is Rs. "+dis);
            break;
        case 2 :
             if(totalCost >= 2001 && totalCost <= 5000){
             dis = (0.25)*totalCost;
             System.out.println("discount on item is Rs. "+dis);
             }
            break;
        case 3 :
             if(totalCost >= 5001 && totalCost <= 10000){
             dis = (0.35)*totalCost;
             System.out.println("discount on item is Rs. "+dis);
             }
             break;
        case 4 :
             if(totalCost >= 10000){
                dis = (0.50)*totalCost;
                System.out.println("discount on item is Rs. "+dis);
             }     
             break;
             default : 
             System.out.println("Invalid cost entered");
        }
      }
    }
  