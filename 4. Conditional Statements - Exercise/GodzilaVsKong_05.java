import java.util.Scanner;

public class GodzilaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());
        int statist=Integer.parseInt(scanner.nextLine());
        double priceForClothesPerStatist=Double.parseDouble(scanner.nextLine());
        double discount=0;

        double decor=budget*0.10;
        double priceClothes=statist*priceForClothesPerStatist;

        double totalpriceforfilm = decor + priceClothes;
        double priceAfterDisc = priceClothes - discount;

        if (statist > 150) {
            discount = priceClothes * 0.10;
            priceAfterDisc = priceClothes - discount;
            totalpriceforfilm = priceAfterDisc + decor;

        }
        if (totalpriceforfilm > budget) {
            System.out.printf("Not enough money!%n" + "Wingard needs %.2f leva more.", (totalpriceforfilm - budget));

        } else {
            System.out.printf("Action!%n" +
                    "Wingard starts filming with %.2f leva left.", (Math.abs(totalpriceforfilm - budget)));

        }

    }
}
