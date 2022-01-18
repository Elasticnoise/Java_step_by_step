import java.security.Key;

public class Computer {
    public final String vendor;
    public final String name;

    Processor processor = new Processor(1.4f, 8, "Intel", 1.3f);
    /*TODO Upper keyses is okey here?*/
    RAM ram = new RAM("LPDDR3", 8, 0.1f);
    Storage storage = new Storage(StorageType.SSD, 1000, 200.0f);
    Display display = new Display(13.3f, DisplayType.IPS, 140.0f);
    Keyboard keyboard = new Keyboard("scissors", IsBacklight.YES, 120.0f);

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public float getComputerWeight() {
        return processor.getWeight() + ram.getWeight() + storage.getWeight()
                + display.getWeight() + keyboard.getWeight();
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "vendor='" + vendor + '\'' +
                ", name='" + name + '\'' +
                "\nprocessor: " + "\n    frequency=" + processor.getFrequency() +
                "\n    cores=" + processor.getCores() +
                "\n    manufacturer=" + processor.getManufacturer() +
                "\n    weight=" + processor.getWeight() +
                "\nram:" + "\n    type=" + ram.getTypeRAM() +
                "\n    value=" + ram.getValue() +
                "\n    weight=" + ram.getWeight() +
                "\nstorage: " + "\n    type=" + storage.getStorageType() +
                "\n    memory=" + storage.getMemory() +
                "\n    weight=" + storage.getWeight() +
                "\ndisplay: " + "\n    screen size=" + display.getScreenSize() +
                "\n    type=" + display.getDisplayType() +
                "\n    weight=" + display.getWeight() +
                "\nkeyboard: " + "\n    type=" + keyboard.getKeyboardType() +
                "\n    backlight=" + keyboard.getIsBacklight() +
                "\n    weight=" + keyboard.getWeight() +
                '}';
    }
}
