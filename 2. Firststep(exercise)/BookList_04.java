import java.util.Scanner;

public class BookList_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Integer numPage=Integer.parseInt(scanner.nextLine());
        Integer pages=Integer.parseInt(scanner.nextLine());
        Integer days=Integer.parseInt(scanner.nextLine());
        Integer hoursOnDay= numPage/pages;
        Integer needHoursofDay=hoursOnDay/days;
        System.out.println(needHoursofDay);
    }
}
