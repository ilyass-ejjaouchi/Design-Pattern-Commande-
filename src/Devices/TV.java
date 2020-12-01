package Devices;

public class TV implements Device {
    @Override
    public void on() {
        System.out.println("TV on");
    }

    @Override
    public void off() {
        System.out.println("TV off");
    }
}

