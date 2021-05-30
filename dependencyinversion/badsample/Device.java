package dependencyinversion.badsample;

public class Device {
    private DigitalSwitch digitalSwitch = new DigitalSwitch();

    void turnOn() {
        digitalSwitch.on();
    }
}
