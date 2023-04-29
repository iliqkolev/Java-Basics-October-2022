import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Integer length= Integer.parseInt(scanner.nextLine());
        Integer width=Integer.parseInt(scanner.nextLine());
        Integer height=Integer.parseInt(scanner.nextLine());
        Double percentage=Double.parseDouble(scanner.nextLine());

        double busySpace=percentage/100;
        double volumeOfAquarium=length*width*height;
        double volumeInLiters=volumeOfAquarium*0.001;
        double needLiters= volumeInLiters*(1-busySpace);

        System.out.println(needLiters);

    }
}
