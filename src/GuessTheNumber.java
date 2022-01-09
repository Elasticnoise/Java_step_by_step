import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int value = new Random().nextInt(100);
        while (true) {
            int userInput = new Scanner(System.in).nextInt();
            if (userInput == value) {
                System.out.println("Вы угадали!");
                break;
            } else if (userInput < value) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
        }
    }
}
