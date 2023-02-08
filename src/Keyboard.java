public class Keyboard {
    private String backlight;
    private String additionalButton;

    public Keyboard(String backlight, String additionalButton) {
        this.backlight = backlight;
        this.additionalButton = additionalButton;
    }

    public String getBacklight() {
        return backlight;
    }

    public void setBacklight(String backlight) {
        this.backlight = backlight;
    }

    public String getAdditionalButton() {
        return additionalButton;
    }

    public void setAdditionalButton(String additionalButton) {
        this.additionalButton = additionalButton;
    }
}
