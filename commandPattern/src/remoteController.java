public class remoteController {
    Command[] slot;

    public remoteController(int numOfButton){
        slot = new Command[numOfButton];
        for(int i=0;i<numOfButton;i++){
            slot[i] = new noCommand();
        }
    }

    public void setCommand(Command command, int buttonIndex){
        this.slot[buttonIndex] = command;
    }
    public void buttonPressed(int buttonIndex){
        slot[buttonIndex].execute();
    }
    public class noCommand implements Command{
        @Override
        public void execute() {
        }
    }
}
