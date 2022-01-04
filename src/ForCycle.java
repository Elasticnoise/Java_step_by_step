import java.util.Scanner;

public class ForCycle {
    public static void main(String[] args) {
        System.out.print("Введите целое число: ");
        int value = new Scanner(System.in).nextInt();
        for (int i = 0; i <= value; i++) {
            for (int j = 0; j <= value; j++) {
                if (value == i * j) {
                    System.out.println(i + "*" + j);
                }
            }
        }
    }
}
