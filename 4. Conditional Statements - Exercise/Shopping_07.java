import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        double budget=Double.parseDouble(scanner.nextLine());
        int VideoCards=Integer.parseInt(scanner.nextLine());
        int Processor=Integer.parseInt(scanner.nextLine());
        int Ram=Integer.parseInt(scanner.nextLine());


        double priceVideoCards=VideoCards*250;

        double priceProcessor=priceVideoCards*0.35;
        double sumProcessor=priceProcessor*Processor;

        double priceRam=priceVideoCards*0.10;
        double sumRam=Ram*priceRam;

        double all=priceVideoCards+sumProcessor+sumRam;

        if (VideoCards> Processor)
        {
            all=all-all*0.15;
        }
        if (budget >=all)
        {
            double x;
            x=budget-all;
            System.out.printf("You have %.2f leva left!", x);
        }
        else
        {
            double y;
            y=all-budget;
            System.out.printf("Not enough money! You need %.2f leva more!", y);
        }

    }
}
