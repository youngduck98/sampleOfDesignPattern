public class Main {
    public static void main(String[] args) {
        LightOnCommand command = new LightOnCommand(new Light());
        remoteController remote = new remoteController(1);
        remote.setCommand(command, 0);
        remote.buttonPressed(0);
    }
}