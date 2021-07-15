package State.GumMachine.States;

import State.GumMachine.State;
import State.GumMachine.StateManager;

public class Gumball implements State {
    @Override
    public void sendMessage(String message) {        
        System.out.println(message);
    }

    @Override
    public void execute(StateManager manager) {
        sendMessage("Buy gumball successful");
    }
    
}
