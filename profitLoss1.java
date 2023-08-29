import java.util.Scanner;

public class profitLoss1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double costPrice = sc.nextDouble();
        double sellingPrice = sc.nextDouble();
        if(sellingPrice > costPrice){
            System.out.println("profit is received on item");
            double profit = sellingPrice - costPrice;
            System.out.println("Profit on item is Rs. "+profit);
            double profitpercentage = (profit*100)/costPrice;
            System.out.println("profit percentage on item is "+profitpercentage+"%");
        } else{
            System.out.println("loss is received on item");
            double loss = costPrice - sellingPrice;
            System.out.println("Loss on item is Rs. "+loss);
            double losspercentage = (loss*100)/costPrice;
            System.out.println("loss percentage on item is "+losspercentage+"%");
        }
    }
}
