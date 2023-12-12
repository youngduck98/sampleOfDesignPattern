import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GambleMachine gambleMachine = new GambleMachine();
        System.out.println("Start");
        while(!(gambleMachine.getState() instanceof EndState)){
            gambleMachine.getState().getInput();
        }
    }
}