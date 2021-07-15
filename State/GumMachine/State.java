package State.GumMachine;

public interface State {
    void sendMessage(String message);

    void execute(StateManager manager);
}
