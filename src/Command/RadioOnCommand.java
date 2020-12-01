package Command;

import Devices.Device;
import Devices.TV;

public class RadioOnCommand implements Command {
    Device tv;

    public RadioOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void cancel() {
        tv.off();
    }
}
