import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Integer quantityNylon=Integer.parseInt(scanner.nextLine());
        Double quantityPaint=Double.parseDouble(scanner.nextLine());
        Integer quantityThinner=Integer.parseInt(scanner.nextLine());
        Integer hours=Integer.parseInt(scanner.nextLine());
        double sumNylon=(quantityNylon + 2) * 1.50;
        double sumPaint=(quantityPaint+(quantityPaint*0.10))*14.50;
        double sumThinner=quantityThinner*5.00;
        double bag=0.40;
        double sumMaterials= sumNylon+sumPaint+sumThinner+bag;
        double sumWorkers=(sumMaterials*30/100)*hours;
        double EndSum=sumMaterials+sumWorkers;
        System.out.println(EndSum);
    }
}
