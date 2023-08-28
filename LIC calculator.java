import java.util.Scanner;
public class LIC{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("the name of customer is "+name);
        double amount = sc.nextDouble();
        System.out.println("the amount entered is Rs. "+amount);
        double discount = 0.00;
        int button = sc.nextInt();
        System.out.println("the button entered is "+button);
        switch(button){
            case 1 : 
            if(amount >= 0 && amount <= 25000){
                System.out.println("Free");
            }else if(amount >= 25001 && amount <= 57000){
                discount = (0.05*amount);
            }else if(amount >= 57001 && amount <= 100000){
                discount = (0.75*amount);
            } else{
                discount = (0.10*amount);
            }
            break;
            case 2 : 
            if(amount >= 0 && amount <= 25000){
                discount = (0.05*amount);
             } else if(amount >= 25001 && amount <= 57000){
                discount = (0.75*amount);
             } else if(amount >= 57001 && amount <= 100000){
                discount = (0.10*amount);
             }else{
                discount = (0.15*amount);
             }
             break;
             default :
             System.out.println("Invalid amount");
             
        }
    }
}



/*class LIC{
    public static void main(String[] args) {
         for loop 'for' rows and rows will be constant
         2nd for loop will be for com.sun.java.swing.plaf.motif.icons
         for(int i )

    }
}

/*   *
 *   **
 *   ***
   ****


        *
        * *
        * * * */

       /*  public class LIC{
            public static void main(String[] args){
                for(int i=1; i<=4; i++){
                    for(int j = 1; j<=4 ; j++){
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
        }*/

     /*    public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello, World!");
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4 ; j++){
                System.out.print("*");
            }
                System.out.println(" ");
        }
     }
}*/
        