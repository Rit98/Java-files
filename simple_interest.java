public class simple_interest {
    public static void main(String[] args) {
        int principal = 5000;
        int rate = 5;
        int time = 3;
        double si = 0;
        double amount = 0;
        si = ((principal * rate * time)/100);
        amount = principal + si; 
        System.out.println("Simple interest is = " +si);
        System.out.print("Amount is = "+amount); 
}
    } 
       
