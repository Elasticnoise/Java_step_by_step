import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число: ");
        int value = new Scanner(System.in).nextInt();
        int i;
        int res = 1;

        for (i = 1; i <= value; i++) {
            res *= i;
        }
        System.out.println("Факториал " + value + " = " + res);
    }
}
