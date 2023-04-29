import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double currentRecord=Double.parseDouble(scanner.nextLine());
        double meters=Double.parseDouble(scanner.nextLine());
        double timeForOneMeter=Double.parseDouble(scanner.nextLine());

        double delay=Math.floor(meters/15)*12.5;
        double result=(meters*timeForOneMeter)+delay;

        double diff=Math.abs(result-currentRecord);

        if (currentRecord > result)
        {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
        }
        else
        {

            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }

    }
}
