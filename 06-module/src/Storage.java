public class Storage {
    public final StorageType  storageType;
    public final float        memory;
    public final float        weight;

    public Storage(StorageType storageType, float memory, float weight) {
        this.storageType = storageType;
        this.memory = memory;
        this.weight = weight;
    }

    public StorageType getStorageType() {
        return storageType;
    }

    public float getMemory() {
        return memory;
    }

    public float getWeight() {
        return weight;
    }
}
