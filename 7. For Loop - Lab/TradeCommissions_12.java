import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town=scanner.nextLine();
        double sales=Double.parseDouble(scanner.nextLine());

        double tradeCom=0.0;

        if (town.equals("Sofia"))
        {
            if (sales >= 0 && sales <= 500)
            {
                tradeCom=sales*0.05;
                System.out.printf("%.2f", tradeCom);
            }
            else if (sales > 500 && sales <=1000)
            {
                tradeCom=sales*0.07;
                System.out.printf("%.2f", tradeCom);
            } else if (sales>1000 && sales<=10000)
            {
                tradeCom=sales*0.08;
                System.out.printf("%.2f", tradeCom);
            } else if (sales> 10000)
            {
                tradeCom=sales*0.12;
                System.out.printf("%.2f", tradeCom);
            }
            else
            {
                System.out.printf("error");
            }
        }
        else if (town.equals("Varna"))
        {
            if (sales >= 0 && sales <= 500)
            {
                tradeCom=sales*0.045;
                System.out.printf("%.2f", tradeCom);
            }
            else if (sales > 500 && sales <=1000)
            {
                tradeCom=sales*0.075;
                System.out.printf("%.2f", tradeCom);
            } else if (sales>1000 && sales<=10000)
            {
                tradeCom=sales*0.10;
                System.out.printf("%.2f", tradeCom);
            } else if (sales> 10000)
            {
                tradeCom=sales*0.13;
                System.out.printf("%.2f", tradeCom);
            }
            else
            {
                System.out.printf("error");
            }
        }
        else if (town.equals("Plovdiv"))
        {
            if (sales >= 0 && sales <= 500)
            {
                tradeCom=sales*0.055;
                System.out.printf("%.2f", tradeCom);
            }
            else if (sales > 500 && sales <=1000)
            {
                tradeCom=sales*0.08;
                System.out.printf("%.2f", tradeCom);
            } else if (sales>1000 && sales<=10000)
            {
                tradeCom=sales*0.12;
                System.out.printf("%.2f", tradeCom);
            } else if (sales> 10000)
            {
                tradeCom=sales*0.145;
                System.out.printf("%.2f", tradeCom);
            }
            else
            {
                System.out.printf("error");
            }
        }
        else
        {
            System.out.printf("error");
        }
    }
}
