import java.util.Scanner;

public class SchoolSupplies_05 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);

        Integer pens=Integer.parseInt(scanner.nextLine());
        Integer markers=Integer.parseInt(scanner.nextLine());
        Integer preparation=Integer.parseInt(scanner.nextLine());
        Integer percentage=Integer.parseInt(scanner.nextLine());
        double PricePens=pens*5.80;
        double PriceMarket=markers*7.20;
        double PricePreparation=preparation* 1.20;
        double sum=PricePens+PriceMarket+PricePreparation;
        double Discount= sum-(sum*percentage/100);
        System.out.println(Discount);


    }
}
