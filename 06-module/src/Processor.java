public class Processor {
    public final float    frequency;
    public final int      cores;
    public final String   manufacturer;
    public final float    weight;

    public Processor(float frequency, int cores, String manufacturer, float weight) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
        this.weight = weight;
    }

    public float getFrequency() {
        return frequency;
    }

    public int getCores() {
        return cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public float getWeight() {
        return weight;
    }

}
