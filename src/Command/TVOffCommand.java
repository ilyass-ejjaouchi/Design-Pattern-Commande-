package Command;

import Devices.Device;
import Devices.TV;

public class TVOffCommand implements Command {
    Device tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void cancel() {
        tv.on();
    }
}
