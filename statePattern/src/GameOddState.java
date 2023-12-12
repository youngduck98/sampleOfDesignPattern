public class GameOddState implements State{
    GambleMachine machine;

    public GameOddState(GambleMachine machine){
        this.machine = machine;
    }

    @Override
    public void getInput() {
        System.out.println("input(A(odd) or B(even)): ");
        String input = machine.sc.nextLine();
        if(input.equals("A") || input.equals("a")){
            this.buttonA();
            return;
        }
        if(input.equals("B") || input.equals("b")){
            this.buttonB();
            return;
        }
        System.out.println("only have 2 interface(A or B or I)");
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
        System.out.println("lose game!");
        System.out.println("nowCoin:" + machine.getCoins());
        if(machine.getCoins() <= 0) {
            machine.setState(machine.getNoCoin());
            return;
        }
        machine.setState(machine.getHasCoin());
    }

    @Override
    public void buttonB() {
        System.out.println("winning game!");
        machine.setCoins(machine.getCoins() + 2);
        System.out.println("nowCoin:" + machine.getCoins());
        machine.setState(machine.getHasCoin());
    }

    private int getCoin(){
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
