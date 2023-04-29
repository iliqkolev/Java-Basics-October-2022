import java.util.Scanner;

public class TennisRankList_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberTournaments=Integer.parseInt(scanner.nextLine());
        int startPoints=Integer.parseInt(scanner.nextLine());

        int sumPoints=startPoints;
        int countWins=0;

        for (int i = 1; i <= numberTournaments; i++) {
            String tournamentStage= scanner.nextLine();

            if (tournamentStage.equals("W")){
                sumPoints+=2000;
                countWins++;
            }  else  if (tournamentStage.equals("F")){
                sumPoints+=1200;
            } else  if (tournamentStage.equals("SF")){
                sumPoints+=720;
            }
        }

        int tournamentPoints=sumPoints-startPoints;
        double percentWonTournament=(1.0*countWins/ numberTournaments)*100;

        System.out.printf("Final points: %d\n", sumPoints);
        System.out.printf("Average points: %d\n", tournamentPoints/numberTournaments);
        System.out.printf("%.2f%%", percentWonTournament);
    }
}

