import java.util.Scanner;

public class GambleMachine {
    public Scanner sc = new Scanner(System.in);
    State gameOddState;
    State gameEvenState;
    State hasCoin;
    State noCoin;
    State endState;
    State state;
    int coins = 0;

    public GambleMachine(){
        this.gameOddState = new GameOddState(this);
        this.gameEvenState = new GameEvenState(this);
        this.hasCoin = new HasCoin(this);
        this.noCoin = new NoCoin(this);
        this.endState = new EndState();
        state = noCoin;
    }

    public State getGameOddState() {
        return gameOddState;
    }

    public State getGameEvenState(){
        return gameEvenState;
    }

    public State getHasCoin() {
        return hasCoin;
    }

    public State getNoCoin() {
        return noCoin;
    }

    public State getEndState(){
        return endState;
    }

    public State getState(){
        return state;
    }

    public int getCoins(){
        return coins;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void insertCoin(int numOfCoin){
        coins += numOfCoin;
    }

    public void buttonA(){
        state.buttonA();
    }

    public void buttonB(){
        state.buttonB();
    }
}
