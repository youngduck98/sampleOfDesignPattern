import java.text.ParseException;

public class NoCoin implements State{
    GambleMachine machine;

    public NoCoin(GambleMachine machine){
        this.machine = machine;
    }

    @Override
    public void getInput() {
        System.out.println("coin: " +  machine.getCoins());
        System.out.println("input(A or B or I): ");
        String input = machine.sc.nextLine();
        if(input.equals("A") || input.equals("a")){
            this.buttonA();
            return;
        }
        if(input.equals("B") || input.equals("b")){
            this.buttonB();
            return;
        }
        if(input.equals("I") || input.equals("i")){
            this.insertCoin(getCoin());
            return;
        }
        System.out.println("only have 3 interface(A or B or I)");
        getInput();
    }

    @Override
    public void insertCoin(int coin) {
        if(coin <= 0)
            throw new IllegalArgumentException("num of coin need to plus");
        System.out.println("you input coin");
        machine.setCoins(machine.getCoins() + coin);
        machine.setState(machine.getHasCoin());
    }

    @Override
    public void buttonA() {
        System.out.println("you need to insert coin");
    }

    @Override
    public void buttonB() {
        System.out.println("end game");
        machine.setState(machine.getEndState());
    }

    private int getCoin(){
        System.out.println("enter the num of coin you will put in");
        try {
            int input = Integer.parseInt(machine.sc.nextLine());
            if (input <= 0)
                throw new IllegalArgumentException();
            return input;
        }catch (IllegalArgumentException e){
            return getCoin();
        }
    }
}
