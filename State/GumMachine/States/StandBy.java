package State.GumMachine.States;

import java.util.Scanner;

import State.GumMachine.State;
import State.GumMachine.StateManager;

public class StandBy implements State {
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void sendMessage(String message) {
    }

    @Override
    public void execute(StateManager manager) {
        System.out.println("---------------- COMMAND LIST ----------------");
        System.out.println("insert - insert coin\nbuy - buy gum\ncheck - check balance\nexit - exit program");

        String cmd = "";

        while (!cmd.equals("exit")) {
            System.out.print("User command: ");
            cmd = scanner.nextLine();
            
            switch (cmd) {
                case "insert":
                    manager.insert();
                    break;
                case "buy":
                    manager.setState(new NoQuarter(manager.getCounter()));
                    manager.execute();
                    break;
                case "check":
                    System.out.println("Your balance: " + manager.getWallet());
                    break;
                case "exit":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Command is unrecognizable, please try again");
            }
        }
        
    }
    
}
