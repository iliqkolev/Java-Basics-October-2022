import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroups=Integer.parseInt(scanner.nextLine());

        int p1=0;
        int p2=0;
        int p3=0;
        int p4=0;
        int p5=0;
        int sum=0;

        for (int i = 1; i <=countGroups ; i++) {
            int num=Integer.parseInt(scanner.nextLine());

            if (num <= 5){
                p1+=num;
            }
            else if(num<=12) {
                p2+=num;
            }
            else if(num<=25) {
                p3+=num;
            }
            else if(num <= 40){
                p4+=num;
            }else{
                p5+=num;
            }
        }
        sum =p1+p2+p3+p4+p5;
        double p1Percent=1.0 * p1 / sum * 100;
        double p2Percent=1.0 * p2 / sum * 100;
        double p3Percent=1.0 * p3 / sum * 100;
        double p4Percent=1.0 * p4 / sum * 100;
        double p5Percent=1.0 * p5 / sum * 100;

        System.out.printf("%.2f%%\n",p1Percent);
        System.out.printf("%.2f%%\n",p2Percent);
        System.out.printf("%.2f%%\n",p3Percent);
        System.out.printf("%.2f%%\n",p4Percent);
        System.out.printf("%.2f%%\n",p5Percent);
    }
}
