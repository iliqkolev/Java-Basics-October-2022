import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width=Integer.parseInt(scanner.nextLine());
        int length=Integer.parseInt(scanner.nextLine());
        int sum=width*length;
        String command=scanner.nextLine();

        while (!command.equals("STOP")){

            int number=Integer.parseInt(command);
            sum -=number;

            if (sum <=0){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(sum));
                break;
            }
            command=scanner.nextLine();
        }
        if (sum >= 0){
            System.out.printf("%d pieces are left.", sum);
        }


    }
}
