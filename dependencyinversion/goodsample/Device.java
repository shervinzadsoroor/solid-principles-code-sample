package dependencyinversion.goodsample;

public class Device {
    private Switch deviceSwitch;

    void turnOn() {
        deviceSwitch.on();
    }
}
