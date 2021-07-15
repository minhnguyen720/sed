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

    // default methods
    public void execute() {
        currentState.execute(this);
    }

    public void setState(State newState) {
        currentState = newState;
    }

    // custom methods
    public boolean hasGumball() {
        if (gumAmtInMachine > 0)
            return true;
        else
            return false;
    }

    public boolean hasQuarter() {
        if (quarterInMachine > 0)
            return true;
        else
            return false;
    }

    public void insert() {
        quarterInMachine += 1;
        this.wallet -= DEFAULT_PRICE;
        System.out.println("Top up successful");
    }

    // getters and setters
    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void setGumAmt(int amt) {
        this.gumAmtInMachine = amt;
    }

    public int getWallet() {
        return this.wallet;
    }

    public int getGumAmt() {
        return gumAmtInMachine;
    }

    public int getCounter() {
        return quarterInMachine;
    }
}
