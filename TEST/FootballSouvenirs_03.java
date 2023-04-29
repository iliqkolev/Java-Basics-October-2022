import java.util.Scanner;

public class FootballSouvenirs_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String country=scanner.nextLine();
        String type=scanner.nextLine();
        int countType=Integer.parseInt(scanner.nextLine());
        double sum=0;

        if (country.equals("Argentina")) {
            switch (type) {
                case "flags":
                    sum=countType*3.25;
                    break;

                case "caps":
                    sum=countType*7.20;
                    break;

                case "posters":
                    sum=countType*5.10;
                    break;

                case "stickers":
                    sum=countType*1.25;
                    break;

            }

        } else if (country.equals("Brazil")) {
            switch (type) {
                case "flags":
                    sum = countType * 4.20;
                    break;

                case "caps":
                    sum = countType * 8.50;
                    break;

                case "posters":
                    sum = countType * 5.35;
                    break;

                case "stickers":
                    sum = countType * 1.20;
                    break;

            }
        }
        else if (country.equals("Croatia")) {
            switch (type) {
                case "flags":
                    sum = countType * 2.75;
                    break;

                case "caps":
                    sum = countType * 6.90;
                    break;

                case "posters":
                    sum = countType * 4.95;
                    break;

                case "stickers":
                    sum = countType * 1.10;
                    break;

            }
        }
        else if (country.equals("Denmark")) {
            switch (type) {
                case "flags":
                    sum = countType * 3.10;
                    break;

                case "caps":
                    sum = countType * 6.50;
                    break;

                case "posters":
                    sum = countType * 4.80;
                    break;

                case "stickers":
                    sum = countType * 0.90;
                    break;

            }
        }
        if (!country.equals("Argentina") && !country.equals("Brazil") && !country.equals("Croatia") && !country.equals("Denmark")){
            System.out.println("Invalid country!");
        }else if(!type.equals("flags") && !type.equals("caps") && !type.equals("posters") && !type.equals("stickers")){
            System.out.println("Invalid stock!");

        }else if(country.equals("Argentina") || country.equals("Brazil") || country.equals("Croatia") || country.equals("Denmark") || type.equals("flags")
                || type.equals("caps") || type.equals("posters") || type.equals("stickers")){
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.",countType,type,country,sum);
        }




    }
}
