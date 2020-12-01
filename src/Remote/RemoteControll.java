package Remote;

import Command.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemoteControll {
    Command command;
    LinkedList<Command> commands = new LinkedList<>();
    public RemoteControll() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
        commands.add(command);
    }
    public void CancelWasPressed(){
        commands.getLast().cancel();
    }


}
