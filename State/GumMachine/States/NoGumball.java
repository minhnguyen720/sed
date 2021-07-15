package State.GumMachine.States;

import State.GumMachine.State;
import State.GumMachine.StateManager;

public class NoGumball implements State {

    private final int DEFAULT_CHARGE = 1;

    @Override
    public void sendMessage(String message) {        
        System.out.println(message);
    }

    // send the refund to user
    @Override
    public void execute(StateManager manager) {
        sendMessage("Giving " + DEFAULT_CHARGE + " to you");
        manager.setWallet(manager.getWallet() + DEFAULT_CHARGE);
        manager.setState(new StandBy());
        manager.execute();
    }
    
}
