package Devices;

public class Light implements Device {
    @Override
    public void on() {
        System.out.println("Light on");
    }

    @Override
    public void off() {
        System.out.println("Light off");
    }
}
