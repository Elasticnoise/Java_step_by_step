public class Arithmetic {
    private int first = 4;
    private int second = 9;

    public Arithmetic(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public static int getSum(int first, int second) {
        return first + second;
    }

    public static int getProduct(int first, int second) {
        return first * second;
    }

    public static int getMaxNum(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public static int getMinNum(int first, int second) {
        if (first < second) {
            return first;
        } else {
            return second;
        }
    }
}

