public class OperatingMemory {
    private int memory;
    private String manufacturer;

    public OperatingMemory(int memory, String manufacturer) {
        this.memory = memory;
        this.manufacturer = manufacturer;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
