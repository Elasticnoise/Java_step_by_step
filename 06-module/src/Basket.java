public class Basket {

    private static int countBasket = 0;
    private static int averagePrice = 0;
    private static int averageBasketPrice = 0;
    private static int countItems = 0;
    private String items = "";
    private static int totalPrice = 0;
    private int limit;
    private double totalWeight = 0.0;
    public Basket() {
        increaseCountBasket(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice, int totalWeight) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
        this.totalWeight = totalWeight;
        increaseCountItems(countItems);
        increaseTotalPrice(totalPrice);
    }

    public static int getCountBasket() {
        return countBasket;
    }

    public static void increaseCountBasket(int countBasket) {
        Basket.countBasket = Basket.countBasket + countBasket;
    }

    public static void increaseCountItems(int countItems) {
        Basket.countItems++;
    }

    public static void increaseTotalPrice(int totalPrice) {
        Basket.totalPrice = Basket.totalPrice + totalPrice;
    }

    public static int getAveragePriceItem() {
        Basket.averagePrice = totalPrice / countItems;
        return Basket.averagePrice;
    }

    public static void getAveragePrice() {
        Basket.averageBasketPrice = totalPrice / countBasket;
    }
    public void add(String name, int price) {
        add(name, price, 1, 0);
    }

    public void add(String name, int price, int weight) { add(name, price, 1, weight); }

    public void add(String name, int price, int count, int weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price;
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + count * weight;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0.0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() { return totalWeight; }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
