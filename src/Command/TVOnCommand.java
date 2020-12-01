package Command;

import Devices.Device;
import Devices.TV;

public class TVOnCommand implements Command {
    Device tv;

    public TVOnCommand(TV tv) {
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

