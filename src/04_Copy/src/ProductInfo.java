package src.ru.skillbox;

public class ProductInfo {
    private final int     dimensions;
    private final int     mass;
    private final String  address;
    private final boolean fragile;
    private final String  regNumber;
    private final boolean turnsOver;

    public int getDimensions() {
        return dimensions;
    }

    public int getMass() {
        return mass;
    }

    public String getAddress() {
        return address;
    }

    public boolean isFragile() {
        return fragile;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isTurnsOver() {
        return turnsOver;
    }
    /*TODO В задании было не совсем понятно как именно в классе нужно инициализировать габариты*/
    Dimensions dimension = new Dimensions(30, 40, 50);

    public ProductInfo(int dimensions, int mass, String address, boolean fragile, String regNumber, boolean turnsOver) {
        this.dimensions = dimension.calculateVolume();
        this.mass = mass;
        this.address = address;
        this.fragile = fragile;
        this.regNumber = regNumber;
        this.turnsOver = turnsOver;
    }

    public ProductInfo setAddress(String address) {
        return new ProductInfo(dimensions, mass, address, fragile, regNumber, turnsOver);
    }

    public ProductInfo  setMass(int mass) {
        return new ProductInfo(dimensions, mass, address, fragile, regNumber, turnsOver);
    }

    public ProductInfo setDimensions(int dimensions) {
        return new ProductInfo(dimensions, mass, address, fragile, regNumber, turnsOver);
    }
}
