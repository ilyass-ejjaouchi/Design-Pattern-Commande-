package Command;

import Devices.Device;
import Devices.Light;

public class LightOffCommand implements Command {
    Device light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void cancel() {
        light.on();
    }
}
