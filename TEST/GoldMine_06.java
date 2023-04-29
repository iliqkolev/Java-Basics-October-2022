import java.util.Scanner;

public class GoldMine_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int location=Integer.parseInt(scanner.nextLine());

        double sum=0;
        double avgSum=0;

        for (int i = 1; i <= location ; i++) {
            double avgProducePerDay = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            sum=0;
            for (int j = 1; j <= days; j++) {

                int minedMaterial = Integer.parseInt(scanner.nextLine());
                sum += minedMaterial;
                avgSum = sum / days;

            }

            if (avgSum >= avgProducePerDay) {
                System.out.printf("Good job! Average gold per day: %.2f.\n", avgSum);

            } else
            {
                System.out.printf("You need %.2f gold.\n", Math.abs(avgProducePerDay - avgSum));
            }

        }
    }
}
