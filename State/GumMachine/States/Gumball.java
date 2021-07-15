package State.GumMachine.States;

import State.GumMachine.State;
import State.GumMachine.StateManager;

public class Gumball implements State {
    private final int DEFAULT_CHARGE = 1;

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void execute(StateManager manager) {
        sendMessage("Checking amount of gumball in the machine...");
        if (manager.hasGumball()) {
            sendMessage("Checking done");
            manager.setGumAmt(manager.getGumAmt() - 1);
        } else {
            System.out.println("ERROR: There is no gumballs in the machine");
            sendMessage("Giving " + DEFAULT_CHARGE + " to you");
            manager.setWallet(manager.getWallet() + DEFAULT_CHARGE);
        }
    }

}
