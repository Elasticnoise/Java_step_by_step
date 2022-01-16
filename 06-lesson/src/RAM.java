public class RAM {
    public final String   typeRAM;
    public final float    value;
    public final float    weight;

    public RAM(String typeRAM, float value, float weight) {
        this.typeRAM = typeRAM;
        this.value = value;
        this.weight = weight;
    }

    public String getTypeRAM() {
        return typeRAM;
    }

    public float getValue() {
        return value;
    }

    public float getWeight() {
        return weight;
    }

}
