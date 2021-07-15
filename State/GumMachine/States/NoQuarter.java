package State.GumMachine.States;

import java.util.Scanner;

import State.GumMachine.State;
import State.GumMachine.StateManager;

public class NoQuarter implements State {
    private static Scanner scanner = new Scanner(System.in);

    private int quarterInTheMachine;

    public NoQuarter(int quarterInTheMachine) {
        this.quarterInTheMachine = quarterInTheMachine;
    }

    private boolean hasQuarter() {
        if (quarterInTheMachine > 0)
            return true;
        else
            return false;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void execute(StateManager manager) {
        if (!hasQuarter()) {
            sendMessage("ERROR: There is no quarter in the machine");
            sendMessage("Do you want to insert quarter (y/n)?");
            String answer = scanner.nextLine();
            switch (answer) {
                case "y":
                    manager.insert();
                    break;
                case "n":
                    manager.setState(new StandBy());
                    manager.execute();
                    break;
            }
        } else {
            sendMessage("Checking amount of gumball in the machine...");
            manager.setState(new HasQuarter(manager.getGumAmt()));
            manager.execute();
        }
    }

}
