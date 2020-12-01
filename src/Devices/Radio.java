package Devices;

public class Radio implements Device {
    @Override
    public void on() {
        System.out.println("Radio on");
    }

    @Override
    public void off() {
        System.out.println("Radio off");
    }
}
