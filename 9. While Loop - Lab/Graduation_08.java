import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String name=scanner.nextLine();

        int sumGrades=0;
        int counter=1;
        int counterExc=1;

        while (counter <= 12){
            double grade=Double.parseDouble(scanner.nextLine());

            if (grade >= 4.00){
                sumGrades+=grade;
                counter++;
            }else{
                counterExc++;
            }
            if (counterExc > 2){
                System.out.printf("%s has been excluded at %d grade",name,counter);
            }
        }
        if (counter >= 12){
            double avrGrade=sumGrades/12;
            System.out.printf("%s graduated. Average grade: %.2f", name, avrGrade);
        }
    }
}
