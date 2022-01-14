package src.ru.skillbox;

public class Dimensions {
    private final int width;
    private final int height;
    private final int lenghth;

    public Dimensions(int width, int height, int lenghth) {
        this.width = width;
        this.height = height;
        this.lenghth = lenghth;
    }

    public int  calculateVolume() {
        return width * height * lenghth;
    }

}
