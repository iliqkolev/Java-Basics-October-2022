import java.util.Scanner;

public class ProgrammingBook_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double priceOnePage=Double.parseDouble(scanner.nextLine());
        double priceOneCover=Double.parseDouble(scanner.nextLine());
        int discount=Integer.parseInt(scanner.nextLine());
        double payDesigner=Double.parseDouble(scanner.nextLine());
        int percentTeam=Integer.parseInt(scanner.nextLine());
        double pages=899;
        double covers=2;

        double startPrice=priceOnePage*pages+priceOneCover*2;
        double priceDiscount=startPrice-(startPrice*discount/100);
        double priceDesigner=payDesigner+priceDiscount;
        double totalSum=priceDesigner-(priceDesigner*percentTeam/100);

        System.out.printf("Avtonom should pay %.2f BGN.", totalSum);


    }
}
