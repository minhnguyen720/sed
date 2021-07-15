package State.GumMachine.States;

import State.GumMachine.State;
import State.GumMachine.StateManager;

public class HasQuarter implements State {

    private int gumballAmt;

    public HasQuarter(int gumballAmt) {
        this.gumballAmt = gumballAmt;
    }

    private boolean hasGumball() {
        if (gumballAmt > 0)
            return true;
        else
            return false;
    }

    @Override
    public void sendMessage(String messenger) {
        System.out.println(messenger);
    }

    @Override
    public void execute(StateManager manager) {
        if (hasGumball()) {
            sendMessage("Checking process is done");
            manager.setState(new Gumball());
            manager.execute();
        }
        else {
            sendMessage("ERROR: There is no gumballs in the machine");
            manager.setState(new NoGumball());
            manager.execute();
        }
    }

}
