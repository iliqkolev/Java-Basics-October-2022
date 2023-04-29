import java.util.Scanner;

public class MultiplicationTable_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        for (int h = 1; h <=10 ; h++) {
            for (int j = 1; j <= 10; j++) {
                int result = h * j;
                System.out.printf("%d * %d = %d\n", h, j, result);
            }
        }
    }
}
