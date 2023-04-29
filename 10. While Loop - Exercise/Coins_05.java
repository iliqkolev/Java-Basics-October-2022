import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //четем колко пари трябва да върнем като ресто
        //превръщаме всичко в стотинки
        //правим цикъл в който проверяваме дали са ни останали стотинки
        //трябва да проверим колко стотинки връщаме-> увеличаваме броя на стотинките
        //принтираме колко монети сме върнали

        double money=Double.parseDouble(scanner.nextLine());
        double totalCoins=Math.floor(money*100);
        int countCoins=0;

        while (totalCoins > 0){
            if (totalCoins >= 200){
                countCoins++;
                totalCoins -= 200;
            }else if(totalCoins >= 100){
                countCoins++;
                totalCoins -=100;
            }else if(totalCoins >= 50){
                countCoins++;
                totalCoins -=50;
            }else if(totalCoins >= 20){
                countCoins++;
                totalCoins -=20;
            }else if(totalCoins >= 10){
                countCoins++;
                totalCoins -=10;
            }else if(totalCoins >= 5){
                countCoins++;
                totalCoins -=5;
            }else if(totalCoins >= 2){
                countCoins++;
                totalCoins -=2;
            }else if(totalCoins >= 1){
                countCoins++;
                totalCoins -=1;
            }
        }
        System.out.print(countCoins);



    }
}
