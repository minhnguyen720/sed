package State.GumMachine.States;

import java.util.Scanner;

import State.GumMachine.State;
import State.GumMachine.StateManager;

public class StandBy implements State {
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void execute(StateManager manager) {
        System.out.println("---------------- COMMAND LIST ----------------");
        System.out.println("insert - insert coin\nbuy - buy gum\ncheck - check balance\ncheckAmt - check amount of gumball\nexit - exit program");

        String cmd = "";

        while (!cmd.equals("exit")) {
            System.out.print("User command: ");
            cmd = scanner.nextLine();
            
            switch (cmd) {
                case "insert":
                    manager.insert();
                    break;
                case "buy": // this step contain 2 steps
                    // check quarter in the machine
                    manager.setState(new Quarter());
                    manager.execute();
                    // check gumball in the machine then buy if true
                    manager.setState(new Gumball());
                    manager.execute();
                    sendMessage("Buy gumball successful");
                    break;
                case "check":
                    System.out.println("Your balance: " + manager.getWallet());
                    break;
                case "checkAmt":
                    System.out.println("Quantity of gumball in the machine: " + manager.getGumAmt());
                    break;
                case "exit":
                    System.exit(1);
                    break;
                default:
                    sendMessage("Command is unrecognizable, please try again");
            }
        }
        
    }
    
}
