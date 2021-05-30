package dependencyinversion.goodsample;

public class DigitalSwitch implements Switch {

    @Override
    public void on() {
        System.out.println("the device is on!");
    }
}
