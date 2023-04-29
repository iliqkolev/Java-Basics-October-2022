import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String name =scanner.nextLine();
        int episodeDuration=Integer.parseInt(scanner.nextLine());
        int  breakTime=Integer.parseInt(scanner.nextLine());

        double lunchTime= breakTime / 8.0;
        double timeForRest=breakTime/4.0;
        double leftTime=breakTime-lunchTime-timeForRest;

        if ( leftTime >=episodeDuration)
        {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",name, Math.ceil(leftTime-episodeDuration));
        }
        else
        {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",name,Math.ceil(episodeDuration-leftTime));
        }
    }
}
