import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age=Integer.parseInt(scanner.nextLine());
        double washingMachinePrice=Double.parseDouble(scanner.nextLine());
        int toysPrice=Integer.parseInt(scanner.nextLine());

        int countToys=0;
        double sum=0;

        for (int i = 1; i <= age; i++) {

            if (i % 2==0) {
                sum+=1.0*i*5-1;
            }else {
                countToys++;
            }
        }
        double finalSum=sum+countToys*toysPrice;
        double diff=Math.abs(finalSum-washingMachinePrice);

        if (finalSum >= washingMachinePrice){
            System.out.printf("Yes! %.2f",diff);
        }else{
            System.out.printf("No! %.2f",diff);
        }
    }
}
