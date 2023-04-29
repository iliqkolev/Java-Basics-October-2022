import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());

        for (int first = firstNum; first <= secondNum; first++) {

            int currentSixthNumber=first % 10;
            int currentFifthNumber=first / 10%10;
            int currentForthNumber=first / 100%10;
            int currentThirdNumber=first / 1000%10;
            int currentSecondNumber=first / 10000%10;
            int currentFirstNumber=first / 100000 % 10;

            int sumOdds=currentFirstNumber+currentThirdNumber+currentFifthNumber;
            int sumEvens=currentSecondNumber+currentForthNumber+currentSixthNumber;

            if (sumOdds == sumEvens){
                System.out.printf("%d ",first);
            }



        }



    }
}

