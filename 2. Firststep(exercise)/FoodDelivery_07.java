import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int chickenMenu= Integer.parseInt(scanner.nextLine());
        int fishMenu= Integer.parseInt(scanner.nextLine());
        int vegMenu= Integer.parseInt(scanner.nextLine());
        double deliveryPrice=2.50;

        double price1=chickenMenu*10.35;
        double price2=fishMenu*12.40;
        double price3=vegMenu*8.15;
        double allPrice=price1+price2+price3;
        double dessert=allPrice*0.20;
        double EndSum=allPrice+dessert+deliveryPrice;
        System.out.println(EndSum);
    }
}
