public class SwimmingPool {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30; // litres per minute
        int devastationSpeed = 10; // litres per minute
        int currentValue = 0;
        int i = 0;
        while (currentValue < volume) {
            currentValue += fillingSpeed - devastationSpeed;
            i++;
        }
        System.out.println(i);
    }
}
