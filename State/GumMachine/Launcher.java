package State.GumMachine;

public class Launcher {
    public static void main(String[] args) {
        int WALLET = 100;
        var manager = new StateManager(WALLET);
        manager.execute();
    }
}
