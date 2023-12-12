import java.util.Random;

public class HasCoin implements State{
    GambleMachine machine;

    public HasCoin(GambleMachine machine){
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
    }
    @Override
    public void buttonA() {
        System.out.println("coin" + machine.getCoins() +
                "->" + (machine.getCoins() - 1));
        machine.setCoins(machine.getCoins()-1);
        Random random = new Random();
        int k = random.nextInt(100);
        switch (k % 2){
            case 0: machine.setState(machine.getGameEvenState()); break;
            case 1: machine.setState(machine.getGameOddState()); break;
        }
    }
    @Override
    public void buttonB() {
        System.out.println("return your coin: " + machine.getCoins());
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
