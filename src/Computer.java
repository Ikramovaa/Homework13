public class Computer {
    private String display;
    private String brand;
    private String colour;
    private String hardDisc;
    private String operatingMemory;
    private String videoCard;
    private String usbPort;
    private String keyboard;


    public Computer(String display, String brand, String colour, String hardDisc, String operatingMemory, String videoCard, String usbPort, String keyboard) {
        this.display = display;
        this.brand = brand;
        this.colour = colour;
        this.hardDisc = hardDisc;
        this.operatingMemory = operatingMemory;
        this.videoCard = videoCard;
        this.usbPort = usbPort;
        this.keyboard = keyboard;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getHardDisc() {
        return hardDisc;
    }

    public void setHardDisc(String hardDisc) {
        this.hardDisc = hardDisc;
    }

    public String getOperatingMemory() {
        return operatingMemory;
    }

    public void setOperatingMemory(String operatingMemory) {
        this.operatingMemory = operatingMemory;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getUsbPort() {
        return usbPort;
    }

    public void setUsbPort(String usbPort) {
        this.usbPort = usbPort;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
}
