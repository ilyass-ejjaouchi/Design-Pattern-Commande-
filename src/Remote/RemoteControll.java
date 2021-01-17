package Remote;

import Command.*;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class RemoteControll {
    String lastRef;
    LinkedHashMap<String,Command> commands = new LinkedHashMap<String,Command>();

    public void ajouterNouvelleCommande(String ref, Command command){
        commands.put(ref, command);
    }
    public void buttonWasPressed(String ref){
        if (commands.get(ref)!= null) commands.get(ref).execute();
        lastRef = ref;
    }
    public void CancelWasPressed(){
        commands.get(lastRef).cancel();
    }


}
