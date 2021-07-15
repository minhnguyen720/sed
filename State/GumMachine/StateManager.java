package State.GumMachine;

import State.GumMachine.States.StandBy;

public class StateManager {
    private State currentState;

    private final int DEFAULT_PRICE = 1;

    private int wallet;
    private int gumAmtInMachine = 10;
    private int quarterInMachine = 0;

    public StateManager(int wallet) {
        this.wallet = wallet;
        currentState = new StandBy();
    }

    public void insert() {
        quarterInMachine += 1;
        this.wallet -= DEFAULT_PRICE;
        System.out.println("Top up successful");
    }

    public void execute() {        
        currentState.execute(this);
    }

    public void setState(State newState) {
        currentState = newState;
    }

    public int getWallet() {
        return this.wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int getGumAmt() {
        return gumAmtInMachine;
    }

    public int getCounter() {
        return quarterInMachine;
    }
}
