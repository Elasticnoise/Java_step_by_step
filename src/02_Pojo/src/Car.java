package src.ru.skillbox;

public class Car {
    private String  carBrand;
    private String  country;
    private String  color;
    private int     maxSpeed;
    private int     seatsQuantity;
    private int     price;
    private boolean serviceable;

    public Car(String carBrand, String country) {
        this.carBrand = carBrand;
        this.country = country;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getSeatsQuantity() {
        return seatsQuantity;
    }

    public void setSeatsQuantity(int seatsQuantity) {
        this.seatsQuantity = seatsQuantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isServiceable() {
        return serviceable;
    }

    public void setServiceable(boolean serviceable) {
        this.serviceable = serviceable;
    }
}
