import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();
        int sumPrimeNumbers=0;
        int sumNonPrimeNumbers=0;

        while (!input.equals("stop")){
            int number=Integer.parseInt(input);

            if (number < 0){
                System.out.println("Number is negative.");
                input=scanner.nextLine();
                continue;
            }
            int count=1;
            for (int i = 2; i <= number ; i++) {
                if (number % i == 0){
                    count++;
                }

            }
            if (count > 2){
                sumNonPrimeNumbers+=number;
            }else {
                sumPrimeNumbers += number;
            }
            input=scanner.nextLine();

        }
        System.out.printf("Sum of all prime numbers is: %d\n", sumPrimeNumbers);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrimeNumbers);
    }
}
