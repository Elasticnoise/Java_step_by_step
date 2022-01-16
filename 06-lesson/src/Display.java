public class Display {
    public final float        screenSize;
    public final DisplayType  displayType;
    public final float        weight;

    public Display(float screenSize, DisplayType displayType, float weight) {
        this.screenSize = screenSize;
        this.displayType = displayType;
        this.weight = weight;
    }
    public float getScreenSize() {
        return screenSize;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public float getWeight() {
        return weight;
    }
}
