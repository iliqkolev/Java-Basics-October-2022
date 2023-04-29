import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double depositSum= Double.parseDouble(scanner.nextLine());
        int depositTerm= Integer.parseInt(scanner.nextLine());
        double yearPercentage= Double.parseDouble(scanner.nextLine());
        double percentage=yearPercentage/100;
        double accumulatedAmount=depositSum*percentage;
        double interestOfAMonth =accumulatedAmount/12;
        double sum=depositSum+depositTerm*interestOfAMonth;
        System.out.print(sum);

    }
}
