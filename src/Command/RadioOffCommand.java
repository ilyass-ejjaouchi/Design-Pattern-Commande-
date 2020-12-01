package Command;

import Devices.Device;
import Devices.Radio;

public class RadioOffCommand implements Command {
    Device radio;

    public RadioOffCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.off();
    }

    @Override
    public void cancel() {
        radio.on();
    }
}
