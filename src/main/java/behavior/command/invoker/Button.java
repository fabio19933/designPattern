package behavior.command.invoker;

import behavior.command.command.Command;

public class Button {
    private Command commad;

    public Button(Command commad) {
        this.commad = commad;
    }

    public Button() {
    }

    public void press(){
        commad.execute();
    }
    public void setCommand(Command commad){
        this.commad = commad;
    }
}
