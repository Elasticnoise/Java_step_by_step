public class ArithmeticCalculator {
    public final int firstNum;
    public final int secondNum;

    public ArithmeticCalculator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;

    }

    public int calculate(Operation type) {
        if (type == Operation.ADD)
            return firstNum + secondNum;
        else if (type == Operation.SUBTRACT)
            return firstNum - secondNum;
        else if (type == Operation.MULTIPLY)
            return firstNum * secondNum;
        else
            return 0;
    }
}
