import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Прочитаме брой табове
        int n=Integer.parseInt(scanner.nextLine());
        //Прочитаме заплата
        int salary=Integer.parseInt(scanner.nextLine());
        //Прочитаме името на сайта

        for (int tabs = 1; tabs <= n; tabs++) {
            String currentSite= scanner.nextLine();
            switch (currentSite)
            {
                case "Facebook":
                    salary-=150;
                    break;
                case "Instagram":
                    salary-=100;
                    break;
                case "Reddit":
                    salary-=50;
                    break;
            }
            if (salary <=0)
            {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary>0){
            System.out.println(salary);
        }
    }
}
