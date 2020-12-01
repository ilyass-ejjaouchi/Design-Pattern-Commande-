package Remote;

import Command.*;
import Devices.Device;
import Devices.Light;
import Devices.TV;

public class RemoteTest {
    public static void main(String[] args) {
        RemoteControll remoteControll = new RemoteControll();
        TV tv = new TV();
        Light light = new Light();
        Command tvOnCmd = new TVOnCommand(tv);
        Command tvOffCmd = new TVOffCommand(tv);
        Command lightOnCmd = new LightOnCommand(light);
        Command lightOffCmd = new LightOffCommand(light);
        remoteControll.setCommand(tvOnCmd);
        remoteControll.buttonWasPressed();
        remoteControll.CancelWasPressed();
        remoteControll.setCommand(lightOffCmd);
        remoteControll.buttonWasPressed();
        remoteControll.CancelWasPressed();
        remoteControll.setCommand(lightOnCmd);
        remoteControll.buttonWasPressed();
        remoteControll.CancelWasPressed();

        //test Light
    }
}
