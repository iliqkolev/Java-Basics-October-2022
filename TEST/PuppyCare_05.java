import java.util.Scanner;

public class PuppyCare_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int quantityFood=Integer.parseInt(scanner.nextLine());
        String input=scanner.nextLine();
        int grams=0;
        int sumEatenFood=0;



        while (!input.equals("Adopted")){
            int eatenFood=Integer.parseInt(input);
            grams=quantityFood*1000;
            sumEatenFood+=eatenFood;


            input=scanner.nextLine();
        }
        if (sumEatenFood <= grams){
            System.out.printf("Food is enough! Leftovers: %d grams.",grams-sumEatenFood);
        }else{
            System.out.printf("Food is not enough. You need %d grams more.",Math.abs(sumEatenFood-grams));
        }
    }
}
