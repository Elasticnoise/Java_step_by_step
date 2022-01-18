public class Keyboard {
    public final String       KeyboardType;
    public final IsBacklight  isBacklight;
    public final float        weight;

    public Keyboard(String keyboardType, IsBacklight isBacklight, float weight) {
        KeyboardType = keyboardType;
        this.isBacklight = isBacklight;
        this.weight = weight;
    }

    public String getKeyboardType() {
        return KeyboardType;
    }

    public IsBacklight getIsBacklight() {
        return isBacklight;
    }

    public float getWeight() {
        return weight;
    }
}
