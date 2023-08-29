import java.util.Scanner;
public class profitLoss{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costPrice = sc.nextDouble();
        System.out.println("the cost price of VCD is Rs. "+costPrice);
        double sellingPrice =  sc.nextDouble();
        System.out.println("the selling price of VCD is Rs. "+sellingPrice);
        if(costPrice > sellingPrice){
        double loss = costPrice - sellingPrice;
        System.out.println("The lost is Rs. "+loss);
        double lossPercentage = ((loss*100)/costPrice);
        System.out.println("the loss percentage on item is "+lossPercentage+"%");
    } else{
        System.out.println("Invalid input entered");
    }
    }
}
