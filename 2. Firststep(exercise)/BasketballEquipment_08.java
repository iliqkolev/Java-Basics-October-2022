import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Integer PricePerYear=Integer.parseInt(scanner.nextLine());
        double shoes=PricePerYear-(PricePerYear*40/100);
        double outfit=shoes-(shoes*20/100);
        double ball=0.25*outfit;
        double accessories=0.20*ball;
        double allEquipment=PricePerYear+shoes+outfit+ball+accessories;

        System.out.println(allEquipment);

    }
}
