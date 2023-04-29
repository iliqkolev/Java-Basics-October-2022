import java.util.Scanner;

public class BeerAndChips_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String name=scanner.nextLine();
        double budget=Double.parseDouble(scanner.nextLine());
        int bottlesBeer=Integer.parseInt(scanner.nextLine());
        int chips=Integer.parseInt(scanner.nextLine());
        double beer=1.20;
        double discount=45;

        double priceBeer=bottlesBeer*beer;
        double pricePerOneChips=priceBeer*discount/100;
        double priceTotalChips=Math.ceil(chips*pricePerOneChips);
        double sum=priceBeer+priceTotalChips;

        if (sum <= budget){
            System.out.printf("%s bought a snack and has %.2f leva left.",name, budget-sum);
        }else{
            System.out.printf("%s needs %.2f more leva!",name, Math.abs(budget-sum));
        }

    }
}
