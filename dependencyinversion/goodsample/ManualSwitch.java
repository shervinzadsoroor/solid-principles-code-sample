package dependencyinversion.goodsample;

public class ManualSwitch implements Switch {

    @Override
    public void on() {
        System.out.println("the device is on!");
    }
}
