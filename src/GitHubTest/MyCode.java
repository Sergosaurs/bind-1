package GitHubTest;

import java.util.Random;
import java.util.Scanner;

public class MyCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        int randomNum = new Random().nextInt(10)+1;
        System.out.println("Добро пожаловать в игру!");
        System.out.println();
        System.out.println("Введите число от 1 до 10: ");
        int inputNum = scan.nextInt();
        num++;
        while (inputNum != randomNum){
            System.out.println();
            System.out.println("Попытайтесь еще раз... ");
            System.out.println("Введите число от 1 до 10: ");
            inputNum = scan.nextInt();
            num++;
        }
        System.out.println("Вы угадали после: "+num+", попыток.");
    }
}
