import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double priceTrip=Double.parseDouble(scanner.nextLine());
        int amountPuzzles=Integer.parseInt(scanner.nextLine());
        int amountDolls=Integer.parseInt(scanner.nextLine());
        int amountTeddyBear=Integer.parseInt(scanner.nextLine());
        int amountMinions=Integer.parseInt(scanner.nextLine());
        int amountTrucks=Integer.parseInt(scanner.nextLine());

        double sum=amountPuzzles*2.60+amountDolls*3+amountTeddyBear*4.10+amountMinions*8.20+amountTrucks*2;
        int Toys=amountPuzzles+amountDolls+amountTeddyBear+amountMinions+amountTrucks;

        if (Toys >=50)
        {
            sum=sum-(sum*0.25);

        }
        sum=sum-(sum*0.10);


        if (sum >= priceTrip){
            double totalPrice=sum-priceTrip;
            System.out.print("Yes! ");
            System.out.printf("%.2f", totalPrice);
            System.out.print( " lv left.");
        }
        else  {
            double totalPrice = priceTrip - sum;
            System.out.print("Not enough money! ");
            System.out.printf("%.2f",totalPrice);
            System.out.print(" lv needed.");
        }

    }
}
