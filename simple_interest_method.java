public class demo3{
    public static void main(String[] args) {
        double principal = 1000;  // Example principal amount
        int time = 2;  // Example time in years
        double rate = 0.05;
        
        double interest = calculateSimpleInterest(principal, time , rate);
        double amount = calculateAmount(principal, interest);
        
        System.out.println("Principal Amount: " + principal);
        System.out.println("Time (in years): " + time);
        System.out.println("Simple Interest: " + interest);
        System.out.println("Amount: " + amount);
    }
    
    public static double calculateSimpleInterest(double principal, int time , double rate) {
        return (principal * rate * time);
    }
    
    public static double calculateAmount(double principal, double interest) {
        return (principal + interest);
    }
}

